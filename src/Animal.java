public class Animal {
    void eat() {

    }

    void drink() {

    }

    void sleep() {

    }

    void workout() {

    }
}

    // Implementing the Animal interface in the Lion class
    class Lion extends Animal {
        @Override
        public void eat() {
            System.out.println("Lion is eating.");
        }

        @Override
        public void drink() {
            System.out.println("Lion is drinking water.");
        }

        @Override
        public void sleep() {
            System.out.println("Lion is sleeping.");
        }

        @Override
        public void workout() {
            System.out.println("Lion is hunting as a workout.");
        }
    }

    // Implementing the Animal interface in the Dog class
    class Dog extends Animal {
        @Override
        public void eat() {
            System.out.println("Dog is eating.");
        }

        @Override
        public void drink() {
            System.out.println("Dog is drinking water.");
        }

        @Override
        public void sleep() {
            System.out.println("Dog is sleeping.");
        }

        @Override
        public void workout() {
            System.out.println("Dog is playing fetch as a workout.");
        }
    }

    // Implementing the Animal interface in the Cat class
    class Cat extends Animal {
        @Override
        public void eat() {
            System.out.println("Cat is eating.");
        }

        @Override
        public void drink() {
            System.out.println("Cat is drinking water.");
        }

        @Override
        public void sleep() {
            System.out.println("Cat is sleeping.");
        }

        @Override
        public void workout() {
            System.out.println("Cat is chasing a toy as a workout.");
        }

        public static void main(String[] args) {
            Animal lion = new Lion();
            Animal dog = new Dog();
            Animal cat = new Cat();

            lion.eat();
            lion.drink();
            lion.sleep();
            lion.workout();

            dog.eat();
            dog.drink();
            dog.sleep();
            dog.workout();

            cat.eat();
            cat.drink();
            cat.sleep();
            cat.workout();
        }
    }

