package typings.rxLiteJoinpatterns

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Rx {
  
  @js.native
  trait Observable[T] extends StObject {
    
    def and[T2](other: Observable[T2]): Pattern2[T, T2] = js.native
    
    def thenDo[TR](selector: js.Function1[/* item1 */ T, TR]): Plan[TR] = js.native
  }
  object Observable {
    
    @scala.inline
    def apply[T](
      and: Observable[js.Any] => Pattern2[T, js.Any],
      thenDo: js.Function1[/* item1 */ T, js.Any] => Plan[js.Any]
    ): Observable[T] = {
      val __obj = js.Dynamic.literal(and = js.Any.fromFunction1(and), thenDo = js.Any.fromFunction1(thenDo))
      __obj.asInstanceOf[Observable[T]]
    }
    
    @scala.inline
    implicit class ObservableMutableBuilder[Self <: Observable[_], T] (val x: Self with Observable[T]) extends AnyVal {
      
      @scala.inline
      def setAnd(value: Observable[js.Any] => Pattern2[T, js.Any]): Self = StObject.set(x, "and", js.Any.fromFunction1(value))
      
      @scala.inline
      def setThenDo(value: js.Function1[/* item1 */ T, js.Any] => Plan[js.Any]): Self = StObject.set(x, "thenDo", js.Any.fromFunction1(value))
    }
  }
  
  @js.native
  trait ObservableStatic extends StObject {
    
    def when[TR](plan: Plan[TR]): Observable[TR] = js.native
  }
  object ObservableStatic {
    
    @scala.inline
    def apply(when: Plan[js.Any] => Observable[js.Any]): ObservableStatic = {
      val __obj = js.Dynamic.literal(when = js.Any.fromFunction1(when))
      __obj.asInstanceOf[ObservableStatic]
    }
    
    @scala.inline
    implicit class ObservableStaticMutableBuilder[Self <: ObservableStatic] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setWhen(value: Plan[js.Any] => Observable[js.Any]): Self = StObject.set(x, "when", js.Any.fromFunction1(value))
    }
  }
  
  @js.native
  trait Pattern1[T1] extends StObject {
    
    def and[T2](other: Observable[T2]): Pattern2[T1, T2] = js.native
    
    def thenDo[TR](selector: js.Function1[/* item1 */ T1, TR]): Plan[TR] = js.native
  }
  object Pattern1 {
    
    @scala.inline
    def apply[T1](
      and: Observable[js.Any] => Pattern2[T1, js.Any],
      thenDo: js.Function1[/* item1 */ T1, js.Any] => Plan[js.Any]
    ): Pattern1[T1] = {
      val __obj = js.Dynamic.literal(and = js.Any.fromFunction1(and), thenDo = js.Any.fromFunction1(thenDo))
      __obj.asInstanceOf[Pattern1[T1]]
    }
    
    @scala.inline
    implicit class Pattern1MutableBuilder[Self <: Pattern1[_], T1] (val x: Self with Pattern1[T1]) extends AnyVal {
      
      @scala.inline
      def setAnd(value: Observable[js.Any] => Pattern2[T1, js.Any]): Self = StObject.set(x, "and", js.Any.fromFunction1(value))
      
      @scala.inline
      def setThenDo(value: js.Function1[/* item1 */ T1, js.Any] => Plan[js.Any]): Self = StObject.set(x, "thenDo", js.Any.fromFunction1(value))
    }
  }
  
  @js.native
  trait Pattern2[T1, T2] extends StObject {
    
    def and[T3](other: Observable[T3]): Pattern3[T1, T2, T3] = js.native
    
    def thenDo[TR](selector: js.Function2[/* item1 */ T1, /* item2 */ T2, TR]): Plan[TR] = js.native
  }
  object Pattern2 {
    
    @scala.inline
    def apply[T1, T2](
      and: Observable[js.Any] => Pattern3[T1, T2, js.Any],
      thenDo: js.Function2[/* item1 */ T1, /* item2 */ T2, js.Any] => Plan[js.Any]
    ): Pattern2[T1, T2] = {
      val __obj = js.Dynamic.literal(and = js.Any.fromFunction1(and), thenDo = js.Any.fromFunction1(thenDo))
      __obj.asInstanceOf[Pattern2[T1, T2]]
    }
    
    @scala.inline
    implicit class Pattern2MutableBuilder[Self <: Pattern2[_, _], T1, T2] (val x: Self with (Pattern2[T1, T2])) extends AnyVal {
      
      @scala.inline
      def setAnd(value: Observable[js.Any] => Pattern3[T1, T2, js.Any]): Self = StObject.set(x, "and", js.Any.fromFunction1(value))
      
      @scala.inline
      def setThenDo(value: js.Function2[/* item1 */ T1, /* item2 */ T2, js.Any] => Plan[js.Any]): Self = StObject.set(x, "thenDo", js.Any.fromFunction1(value))
    }
  }
  
  @js.native
  trait Pattern3[T1, T2, T3] extends StObject {
    
    def and[T4](other: Observable[T4]): Pattern4[T1, T2, T3, T4] = js.native
    
    def thenDo[TR](selector: js.Function3[/* item1 */ T1, /* item2 */ T2, /* item3 */ T3, TR]): Plan[TR] = js.native
  }
  object Pattern3 {
    
    @scala.inline
    def apply[T1, T2, T3](
      and: Observable[js.Any] => Pattern4[T1, T2, T3, js.Any],
      thenDo: js.Function3[/* item1 */ T1, /* item2 */ T2, /* item3 */ T3, js.Any] => Plan[js.Any]
    ): Pattern3[T1, T2, T3] = {
      val __obj = js.Dynamic.literal(and = js.Any.fromFunction1(and), thenDo = js.Any.fromFunction1(thenDo))
      __obj.asInstanceOf[Pattern3[T1, T2, T3]]
    }
    
    @scala.inline
    implicit class Pattern3MutableBuilder[Self <: Pattern3[_, _, _], T1, T2, T3] (val x: Self with (Pattern3[T1, T2, T3])) extends AnyVal {
      
      @scala.inline
      def setAnd(value: Observable[js.Any] => Pattern4[T1, T2, T3, js.Any]): Self = StObject.set(x, "and", js.Any.fromFunction1(value))
      
      @scala.inline
      def setThenDo(value: js.Function3[/* item1 */ T1, /* item2 */ T2, /* item3 */ T3, js.Any] => Plan[js.Any]): Self = StObject.set(x, "thenDo", js.Any.fromFunction1(value))
    }
  }
  
  @js.native
  trait Pattern4[T1, T2, T3, T4] extends StObject {
    
    def and[T5](other: Observable[T5]): Pattern5[T1, T2, T3, T4, T5] = js.native
    
    def thenDo[TR](selector: js.Function4[/* item1 */ T1, /* item2 */ T2, /* item3 */ T3, /* item4 */ T4, TR]): Plan[TR] = js.native
  }
  object Pattern4 {
    
    @scala.inline
    def apply[T1, T2, T3, T4](
      and: Observable[js.Any] => Pattern5[T1, T2, T3, T4, js.Any],
      thenDo: js.Function4[/* item1 */ T1, /* item2 */ T2, /* item3 */ T3, /* item4 */ T4, js.Any] => Plan[js.Any]
    ): Pattern4[T1, T2, T3, T4] = {
      val __obj = js.Dynamic.literal(and = js.Any.fromFunction1(and), thenDo = js.Any.fromFunction1(thenDo))
      __obj.asInstanceOf[Pattern4[T1, T2, T3, T4]]
    }
    
    @scala.inline
    implicit class Pattern4MutableBuilder[Self <: Pattern4[_, _, _, _], T1, T2, T3, T4] (val x: Self with (Pattern4[T1, T2, T3, T4])) extends AnyVal {
      
      @scala.inline
      def setAnd(value: Observable[js.Any] => Pattern5[T1, T2, T3, T4, js.Any]): Self = StObject.set(x, "and", js.Any.fromFunction1(value))
      
      @scala.inline
      def setThenDo(
        value: js.Function4[/* item1 */ T1, /* item2 */ T2, /* item3 */ T3, /* item4 */ T4, js.Any] => Plan[js.Any]
      ): Self = StObject.set(x, "thenDo", js.Any.fromFunction1(value))
    }
  }
  
  @js.native
  trait Pattern5[T1, T2, T3, T4, T5] extends StObject {
    
    def and[T6](other: Observable[T6]): Pattern6[T1, T2, T3, T4, T5, T6] = js.native
    
    def thenDo[TR](
      selector: js.Function5[/* item1 */ T1, /* item2 */ T2, /* item3 */ T3, /* item4 */ T4, /* item5 */ T5, TR]
    ): Plan[TR] = js.native
  }
  object Pattern5 {
    
    @scala.inline
    def apply[T1, T2, T3, T4, T5](
      and: Observable[js.Any] => Pattern6[T1, T2, T3, T4, T5, js.Any],
      thenDo: js.Function5[/* item1 */ T1, /* item2 */ T2, /* item3 */ T3, /* item4 */ T4, /* item5 */ T5, js.Any] => Plan[js.Any]
    ): Pattern5[T1, T2, T3, T4, T5] = {
      val __obj = js.Dynamic.literal(and = js.Any.fromFunction1(and), thenDo = js.Any.fromFunction1(thenDo))
      __obj.asInstanceOf[Pattern5[T1, T2, T3, T4, T5]]
    }
    
    @scala.inline
    implicit class Pattern5MutableBuilder[Self <: Pattern5[_, _, _, _, _], T1, T2, T3, T4, T5] (val x: Self with (Pattern5[T1, T2, T3, T4, T5])) extends AnyVal {
      
      @scala.inline
      def setAnd(value: Observable[js.Any] => Pattern6[T1, T2, T3, T4, T5, js.Any]): Self = StObject.set(x, "and", js.Any.fromFunction1(value))
      
      @scala.inline
      def setThenDo(
        value: js.Function5[/* item1 */ T1, /* item2 */ T2, /* item3 */ T3, /* item4 */ T4, /* item5 */ T5, js.Any] => Plan[js.Any]
      ): Self = StObject.set(x, "thenDo", js.Any.fromFunction1(value))
    }
  }
  
  @js.native
  trait Pattern6[T1, T2, T3, T4, T5, T6] extends StObject {
    
    def and[T7](other: Observable[T7]): Pattern7[T1, T2, T3, T4, T5, T6, T7] = js.native
    
    def thenDo[TR](
      selector: js.Function6[
          /* item1 */ T1, 
          /* item2 */ T2, 
          /* item3 */ T3, 
          /* item4 */ T4, 
          /* item5 */ T5, 
          /* item6 */ T6, 
          TR
        ]
    ): Plan[TR] = js.native
  }
  object Pattern6 {
    
    @scala.inline
    def apply[T1, T2, T3, T4, T5, T6](
      and: Observable[js.Any] => Pattern7[T1, T2, T3, T4, T5, T6, js.Any],
      thenDo: js.Function6[
          /* item1 */ T1, 
          /* item2 */ T2, 
          /* item3 */ T3, 
          /* item4 */ T4, 
          /* item5 */ T5, 
          /* item6 */ T6, 
          js.Any
        ] => Plan[js.Any]
    ): Pattern6[T1, T2, T3, T4, T5, T6] = {
      val __obj = js.Dynamic.literal(and = js.Any.fromFunction1(and), thenDo = js.Any.fromFunction1(thenDo))
      __obj.asInstanceOf[Pattern6[T1, T2, T3, T4, T5, T6]]
    }
    
    @scala.inline
    implicit class Pattern6MutableBuilder[Self <: Pattern6[_, _, _, _, _, _], T1, T2, T3, T4, T5, T6] (val x: Self with (Pattern6[T1, T2, T3, T4, T5, T6])) extends AnyVal {
      
      @scala.inline
      def setAnd(value: Observable[js.Any] => Pattern7[T1, T2, T3, T4, T5, T6, js.Any]): Self = StObject.set(x, "and", js.Any.fromFunction1(value))
      
      @scala.inline
      def setThenDo(
        value: js.Function6[
              /* item1 */ T1, 
              /* item2 */ T2, 
              /* item3 */ T3, 
              /* item4 */ T4, 
              /* item5 */ T5, 
              /* item6 */ T6, 
              js.Any
            ] => Plan[js.Any]
      ): Self = StObject.set(x, "thenDo", js.Any.fromFunction1(value))
    }
  }
  
  @js.native
  trait Pattern7[T1, T2, T3, T4, T5, T6, T7] extends StObject {
    
    def and[T8](other: Observable[T8]): Pattern8[T1, T2, T3, T4, T5, T6, T7, T8] = js.native
    
    def thenDo[TR](
      selector: js.Function7[
          /* item1 */ T1, 
          /* item2 */ T2, 
          /* item3 */ T3, 
          /* item4 */ T4, 
          /* item5 */ T5, 
          /* item6 */ T6, 
          /* item7 */ T7, 
          TR
        ]
    ): Plan[TR] = js.native
  }
  object Pattern7 {
    
    @scala.inline
    def apply[T1, T2, T3, T4, T5, T6, T7](
      and: Observable[js.Any] => Pattern8[T1, T2, T3, T4, T5, T6, T7, js.Any],
      thenDo: js.Function7[
          /* item1 */ T1, 
          /* item2 */ T2, 
          /* item3 */ T3, 
          /* item4 */ T4, 
          /* item5 */ T5, 
          /* item6 */ T6, 
          /* item7 */ T7, 
          js.Any
        ] => Plan[js.Any]
    ): Pattern7[T1, T2, T3, T4, T5, T6, T7] = {
      val __obj = js.Dynamic.literal(and = js.Any.fromFunction1(and), thenDo = js.Any.fromFunction1(thenDo))
      __obj.asInstanceOf[Pattern7[T1, T2, T3, T4, T5, T6, T7]]
    }
    
    @scala.inline
    implicit class Pattern7MutableBuilder[Self <: Pattern7[_, _, _, _, _, _, _], T1, T2, T3, T4, T5, T6, T7] (val x: Self with (Pattern7[T1, T2, T3, T4, T5, T6, T7])) extends AnyVal {
      
      @scala.inline
      def setAnd(value: Observable[js.Any] => Pattern8[T1, T2, T3, T4, T5, T6, T7, js.Any]): Self = StObject.set(x, "and", js.Any.fromFunction1(value))
      
      @scala.inline
      def setThenDo(
        value: js.Function7[
              /* item1 */ T1, 
              /* item2 */ T2, 
              /* item3 */ T3, 
              /* item4 */ T4, 
              /* item5 */ T5, 
              /* item6 */ T6, 
              /* item7 */ T7, 
              js.Any
            ] => Plan[js.Any]
      ): Self = StObject.set(x, "thenDo", js.Any.fromFunction1(value))
    }
  }
  
  @js.native
  trait Pattern8[T1, T2, T3, T4, T5, T6, T7, T8] extends StObject {
    
    def and[T9](other: Observable[T9]): Pattern9[T1, T2, T3, T4, T5, T6, T7, T8, T9] = js.native
    
    def thenDo[TR](
      selector: js.Function8[
          /* item1 */ T1, 
          /* item2 */ T2, 
          /* item3 */ T3, 
          /* item4 */ T4, 
          /* item5 */ T5, 
          /* item6 */ T6, 
          /* item7 */ T7, 
          /* item8 */ T8, 
          TR
        ]
    ): Plan[TR] = js.native
  }
  object Pattern8 {
    
    @scala.inline
    def apply[T1, T2, T3, T4, T5, T6, T7, T8](
      and: Observable[js.Any] => Pattern9[T1, T2, T3, T4, T5, T6, T7, T8, js.Any],
      thenDo: js.Function8[
          /* item1 */ T1, 
          /* item2 */ T2, 
          /* item3 */ T3, 
          /* item4 */ T4, 
          /* item5 */ T5, 
          /* item6 */ T6, 
          /* item7 */ T7, 
          /* item8 */ T8, 
          js.Any
        ] => Plan[js.Any]
    ): Pattern8[T1, T2, T3, T4, T5, T6, T7, T8] = {
      val __obj = js.Dynamic.literal(and = js.Any.fromFunction1(and), thenDo = js.Any.fromFunction1(thenDo))
      __obj.asInstanceOf[Pattern8[T1, T2, T3, T4, T5, T6, T7, T8]]
    }
    
    @scala.inline
    implicit class Pattern8MutableBuilder[Self <: Pattern8[_, _, _, _, _, _, _, _], T1, T2, T3, T4, T5, T6, T7, T8] (val x: Self with (Pattern8[T1, T2, T3, T4, T5, T6, T7, T8])) extends AnyVal {
      
      @scala.inline
      def setAnd(value: Observable[js.Any] => Pattern9[T1, T2, T3, T4, T5, T6, T7, T8, js.Any]): Self = StObject.set(x, "and", js.Any.fromFunction1(value))
      
      @scala.inline
      def setThenDo(
        value: js.Function8[
              /* item1 */ T1, 
              /* item2 */ T2, 
              /* item3 */ T3, 
              /* item4 */ T4, 
              /* item5 */ T5, 
              /* item6 */ T6, 
              /* item7 */ T7, 
              /* item8 */ T8, 
              js.Any
            ] => Plan[js.Any]
      ): Self = StObject.set(x, "thenDo", js.Any.fromFunction1(value))
    }
  }
  
  @js.native
  trait Pattern9[T1, T2, T3, T4, T5, T6, T7, T8, T9] extends StObject {
    
    def thenDo[TR](
      selector: js.Function9[
          /* item1 */ T1, 
          /* item2 */ T2, 
          /* item3 */ T3, 
          /* item4 */ T4, 
          /* item5 */ T5, 
          /* item6 */ T6, 
          /* item7 */ T7, 
          /* item8 */ T8, 
          /* item9 */ T9, 
          TR
        ]
    ): Plan[TR] = js.native
  }
  object Pattern9 {
    
    @scala.inline
    def apply[T1, T2, T3, T4, T5, T6, T7, T8, T9](
      thenDo: js.Function9[
          /* item1 */ T1, 
          /* item2 */ T2, 
          /* item3 */ T3, 
          /* item4 */ T4, 
          /* item5 */ T5, 
          /* item6 */ T6, 
          /* item7 */ T7, 
          /* item8 */ T8, 
          /* item9 */ T9, 
          js.Any
        ] => Plan[js.Any]
    ): Pattern9[T1, T2, T3, T4, T5, T6, T7, T8, T9] = {
      val __obj = js.Dynamic.literal(thenDo = js.Any.fromFunction1(thenDo))
      __obj.asInstanceOf[Pattern9[T1, T2, T3, T4, T5, T6, T7, T8, T9]]
    }
    
    @scala.inline
    implicit class Pattern9MutableBuilder[Self <: Pattern9[_, _, _, _, _, _, _, _, _], T1, T2, T3, T4, T5, T6, T7, T8, T9] (val x: Self with (Pattern9[T1, T2, T3, T4, T5, T6, T7, T8, T9])) extends AnyVal {
      
      @scala.inline
      def setThenDo(
        value: js.Function9[
              /* item1 */ T1, 
              /* item2 */ T2, 
              /* item3 */ T3, 
              /* item4 */ T4, 
              /* item5 */ T5, 
              /* item6 */ T6, 
              /* item7 */ T7, 
              /* item8 */ T8, 
              /* item9 */ T9, 
              js.Any
            ] => Plan[js.Any]
      ): Self = StObject.set(x, "thenDo", js.Any.fromFunction1(value))
    }
  }
  
  @js.native
  trait Plan[T] extends StObject
}
