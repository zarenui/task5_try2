package task5_try2;

import java.util.ArrayList;
import java.util.HashMap;

class Main{
    public static void main(String[] args) {
        System.out.print("Это добавлено в ветке main");
        for (int i = 0; i<10; i++){
            System.out.println(i);
        }
        HashMap<Integer, String> romenum = new HashMap<>();
        romenum.put(1, "I");
        romenum.put(2,"II");
        ArrayList<Integer> array = new ArrayList<>();
        array.add(1);
        array.add(2);
    }
}