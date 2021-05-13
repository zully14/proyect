package cittadino;

public class IdVaccino {
    String id;

    public IdVaccino() {
        String s = "";
        double d;
        for (int i = 0; i <= 16; i++) {
            d = Math.random() * 10;
            s = s + ((int)d);
            if (i % 4 == 0 && i != 16) {
                s = s + "-"; }
        }
        id=s;
    }




}

