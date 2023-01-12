package typings.rxLiteJoinpatterns

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Rx {
  
  trait Observable[T] extends StObject {
    
    def and[T2](other: Observable[T2]): Pattern2[T, T2]
    
    def thenDo[TR](selector: js.Function1[/* item1 */ T, TR]): Plan[TR]
  }
  object Observable {
    
    inline def apply[T](and: Observable[Any] => Pattern2[T, Any], thenDo: js.Function1[/* item1 */ T, Any] => Plan[Any]): Observable[T] = {
      val __obj = js.Dynamic.literal(and = js.Any.fromFunction1(and), thenDo = js.Any.fromFunction1(thenDo))
      __obj.asInstanceOf[Observable[T]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Observable[?], T] (val x: Self & Observable[T]) extends AnyVal {
      
      inline def setAnd(value: Observable[Any] => Pattern2[T, Any]): Self = StObject.set(x, "and", js.Any.fromFunction1(value))
      
      inline def setThenDo(value: js.Function1[/* item1 */ T, Any] => Plan[Any]): Self = StObject.set(x, "thenDo", js.Any.fromFunction1(value))
    }
  }
  
  trait ObservableStatic extends StObject {
    
    def when[TR](plan: Plan[TR]): Observable[TR]
  }
  object ObservableStatic {
    
    inline def apply(when: Plan[Any] => Observable[Any]): ObservableStatic = {
      val __obj = js.Dynamic.literal(when = js.Any.fromFunction1(when))
      __obj.asInstanceOf[ObservableStatic]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ObservableStatic] (val x: Self) extends AnyVal {
      
      inline def setWhen(value: Plan[Any] => Observable[Any]): Self = StObject.set(x, "when", js.Any.fromFunction1(value))
    }
  }
  
  trait Pattern1[T1] extends StObject {
    
    def and[T2](other: Observable[T2]): Pattern2[T1, T2]
    
    def thenDo[TR](selector: js.Function1[/* item1 */ T1, TR]): Plan[TR]
  }
  object Pattern1 {
    
    inline def apply[T1](and: Observable[Any] => Pattern2[T1, Any], thenDo: js.Function1[/* item1 */ T1, Any] => Plan[Any]): Pattern1[T1] = {
      val __obj = js.Dynamic.literal(and = js.Any.fromFunction1(and), thenDo = js.Any.fromFunction1(thenDo))
      __obj.asInstanceOf[Pattern1[T1]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Pattern1[?], T1] (val x: Self & Pattern1[T1]) extends AnyVal {
      
      inline def setAnd(value: Observable[Any] => Pattern2[T1, Any]): Self = StObject.set(x, "and", js.Any.fromFunction1(value))
      
      inline def setThenDo(value: js.Function1[/* item1 */ T1, Any] => Plan[Any]): Self = StObject.set(x, "thenDo", js.Any.fromFunction1(value))
    }
  }
  
  trait Pattern2[T1, T2] extends StObject {
    
    def and[T3](other: Observable[T3]): Pattern3[T1, T2, T3]
    
    def thenDo[TR](selector: js.Function2[/* item1 */ T1, /* item2 */ T2, TR]): Plan[TR]
  }
  object Pattern2 {
    
    inline def apply[T1, T2](
      and: Observable[Any] => Pattern3[T1, T2, Any],
      thenDo: js.Function2[/* item1 */ T1, /* item2 */ T2, Any] => Plan[Any]
    ): Pattern2[T1, T2] = {
      val __obj = js.Dynamic.literal(and = js.Any.fromFunction1(and), thenDo = js.Any.fromFunction1(thenDo))
      __obj.asInstanceOf[Pattern2[T1, T2]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Pattern2[?, ?], T1, T2] (val x: Self & (Pattern2[T1, T2])) extends AnyVal {
      
      inline def setAnd(value: Observable[Any] => Pattern3[T1, T2, Any]): Self = StObject.set(x, "and", js.Any.fromFunction1(value))
      
      inline def setThenDo(value: js.Function2[/* item1 */ T1, /* item2 */ T2, Any] => Plan[Any]): Self = StObject.set(x, "thenDo", js.Any.fromFunction1(value))
    }
  }
  
  trait Pattern3[T1, T2, T3] extends StObject {
    
    def and[T4](other: Observable[T4]): Pattern4[T1, T2, T3, T4]
    
    def thenDo[TR](selector: js.Function3[/* item1 */ T1, /* item2 */ T2, /* item3 */ T3, TR]): Plan[TR]
  }
  object Pattern3 {
    
    inline def apply[T1, T2, T3](
      and: Observable[Any] => Pattern4[T1, T2, T3, Any],
      thenDo: js.Function3[/* item1 */ T1, /* item2 */ T2, /* item3 */ T3, Any] => Plan[Any]
    ): Pattern3[T1, T2, T3] = {
      val __obj = js.Dynamic.literal(and = js.Any.fromFunction1(and), thenDo = js.Any.fromFunction1(thenDo))
      __obj.asInstanceOf[Pattern3[T1, T2, T3]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Pattern3[?, ?, ?], T1, T2, T3] (val x: Self & (Pattern3[T1, T2, T3])) extends AnyVal {
      
      inline def setAnd(value: Observable[Any] => Pattern4[T1, T2, T3, Any]): Self = StObject.set(x, "and", js.Any.fromFunction1(value))
      
      inline def setThenDo(value: js.Function3[/* item1 */ T1, /* item2 */ T2, /* item3 */ T3, Any] => Plan[Any]): Self = StObject.set(x, "thenDo", js.Any.fromFunction1(value))
    }
  }
  
  trait Pattern4[T1, T2, T3, T4] extends StObject {
    
    def and[T5](other: Observable[T5]): Pattern5[T1, T2, T3, T4, T5]
    
    def thenDo[TR](selector: js.Function4[/* item1 */ T1, /* item2 */ T2, /* item3 */ T3, /* item4 */ T4, TR]): Plan[TR]
  }
  object Pattern4 {
    
    inline def apply[T1, T2, T3, T4](
      and: Observable[Any] => Pattern5[T1, T2, T3, T4, Any],
      thenDo: js.Function4[/* item1 */ T1, /* item2 */ T2, /* item3 */ T3, /* item4 */ T4, Any] => Plan[Any]
    ): Pattern4[T1, T2, T3, T4] = {
      val __obj = js.Dynamic.literal(and = js.Any.fromFunction1(and), thenDo = js.Any.fromFunction1(thenDo))
      __obj.asInstanceOf[Pattern4[T1, T2, T3, T4]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Pattern4[?, ?, ?, ?], T1, T2, T3, T4] (val x: Self & (Pattern4[T1, T2, T3, T4])) extends AnyVal {
      
      inline def setAnd(value: Observable[Any] => Pattern5[T1, T2, T3, T4, Any]): Self = StObject.set(x, "and", js.Any.fromFunction1(value))
      
      inline def setThenDo(
        value: js.Function4[/* item1 */ T1, /* item2 */ T2, /* item3 */ T3, /* item4 */ T4, Any] => Plan[Any]
      ): Self = StObject.set(x, "thenDo", js.Any.fromFunction1(value))
    }
  }
  
  trait Pattern5[T1, T2, T3, T4, T5] extends StObject {
    
    def and[T6](other: Observable[T6]): Pattern6[T1, T2, T3, T4, T5, T6]
    
    def thenDo[TR](
      selector: js.Function5[/* item1 */ T1, /* item2 */ T2, /* item3 */ T3, /* item4 */ T4, /* item5 */ T5, TR]
    ): Plan[TR]
  }
  object Pattern5 {
    
    inline def apply[T1, T2, T3, T4, T5](
      and: Observable[Any] => Pattern6[T1, T2, T3, T4, T5, Any],
      thenDo: js.Function5[/* item1 */ T1, /* item2 */ T2, /* item3 */ T3, /* item4 */ T4, /* item5 */ T5, Any] => Plan[Any]
    ): Pattern5[T1, T2, T3, T4, T5] = {
      val __obj = js.Dynamic.literal(and = js.Any.fromFunction1(and), thenDo = js.Any.fromFunction1(thenDo))
      __obj.asInstanceOf[Pattern5[T1, T2, T3, T4, T5]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Pattern5[?, ?, ?, ?, ?], T1, T2, T3, T4, T5] (val x: Self & (Pattern5[T1, T2, T3, T4, T5])) extends AnyVal {
      
      inline def setAnd(value: Observable[Any] => Pattern6[T1, T2, T3, T4, T5, Any]): Self = StObject.set(x, "and", js.Any.fromFunction1(value))
      
      inline def setThenDo(
        value: js.Function5[/* item1 */ T1, /* item2 */ T2, /* item3 */ T3, /* item4 */ T4, /* item5 */ T5, Any] => Plan[Any]
      ): Self = StObject.set(x, "thenDo", js.Any.fromFunction1(value))
    }
  }
  
  trait Pattern6[T1, T2, T3, T4, T5, T6] extends StObject {
    
    def and[T7](other: Observable[T7]): Pattern7[T1, T2, T3, T4, T5, T6, T7]
    
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
    ): Plan[TR]
  }
  object Pattern6 {
    
    inline def apply[T1, T2, T3, T4, T5, T6](
      and: Observable[Any] => Pattern7[T1, T2, T3, T4, T5, T6, Any],
      thenDo: js.Function6[
          /* item1 */ T1, 
          /* item2 */ T2, 
          /* item3 */ T3, 
          /* item4 */ T4, 
          /* item5 */ T5, 
          /* item6 */ T6, 
          Any
        ] => Plan[Any]
    ): Pattern6[T1, T2, T3, T4, T5, T6] = {
      val __obj = js.Dynamic.literal(and = js.Any.fromFunction1(and), thenDo = js.Any.fromFunction1(thenDo))
      __obj.asInstanceOf[Pattern6[T1, T2, T3, T4, T5, T6]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Pattern6[?, ?, ?, ?, ?, ?], T1, T2, T3, T4, T5, T6] (val x: Self & (Pattern6[T1, T2, T3, T4, T5, T6])) extends AnyVal {
      
      inline def setAnd(value: Observable[Any] => Pattern7[T1, T2, T3, T4, T5, T6, Any]): Self = StObject.set(x, "and", js.Any.fromFunction1(value))
      
      inline def setThenDo(
        value: js.Function6[
              /* item1 */ T1, 
              /* item2 */ T2, 
              /* item3 */ T3, 
              /* item4 */ T4, 
              /* item5 */ T5, 
              /* item6 */ T6, 
              Any
            ] => Plan[Any]
      ): Self = StObject.set(x, "thenDo", js.Any.fromFunction1(value))
    }
  }
  
  trait Pattern7[T1, T2, T3, T4, T5, T6, T7] extends StObject {
    
    def and[T8](other: Observable[T8]): Pattern8[T1, T2, T3, T4, T5, T6, T7, T8]
    
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
    ): Plan[TR]
  }
  object Pattern7 {
    
    inline def apply[T1, T2, T3, T4, T5, T6, T7](
      and: Observable[Any] => Pattern8[T1, T2, T3, T4, T5, T6, T7, Any],
      thenDo: js.Function7[
          /* item1 */ T1, 
          /* item2 */ T2, 
          /* item3 */ T3, 
          /* item4 */ T4, 
          /* item5 */ T5, 
          /* item6 */ T6, 
          /* item7 */ T7, 
          Any
        ] => Plan[Any]
    ): Pattern7[T1, T2, T3, T4, T5, T6, T7] = {
      val __obj = js.Dynamic.literal(and = js.Any.fromFunction1(and), thenDo = js.Any.fromFunction1(thenDo))
      __obj.asInstanceOf[Pattern7[T1, T2, T3, T4, T5, T6, T7]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Pattern7[?, ?, ?, ?, ?, ?, ?], T1, T2, T3, T4, T5, T6, T7] (val x: Self & (Pattern7[T1, T2, T3, T4, T5, T6, T7])) extends AnyVal {
      
      inline def setAnd(value: Observable[Any] => Pattern8[T1, T2, T3, T4, T5, T6, T7, Any]): Self = StObject.set(x, "and", js.Any.fromFunction1(value))
      
      inline def setThenDo(
        value: js.Function7[
              /* item1 */ T1, 
              /* item2 */ T2, 
              /* item3 */ T3, 
              /* item4 */ T4, 
              /* item5 */ T5, 
              /* item6 */ T6, 
              /* item7 */ T7, 
              Any
            ] => Plan[Any]
      ): Self = StObject.set(x, "thenDo", js.Any.fromFunction1(value))
    }
  }
  
  trait Pattern8[T1, T2, T3, T4, T5, T6, T7, T8] extends StObject {
    
    def and[T9](other: Observable[T9]): Pattern9[T1, T2, T3, T4, T5, T6, T7, T8, T9]
    
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
    ): Plan[TR]
  }
  object Pattern8 {
    
    inline def apply[T1, T2, T3, T4, T5, T6, T7, T8](
      and: Observable[Any] => Pattern9[T1, T2, T3, T4, T5, T6, T7, T8, Any],
      thenDo: js.Function8[
          /* item1 */ T1, 
          /* item2 */ T2, 
          /* item3 */ T3, 
          /* item4 */ T4, 
          /* item5 */ T5, 
          /* item6 */ T6, 
          /* item7 */ T7, 
          /* item8 */ T8, 
          Any
        ] => Plan[Any]
    ): Pattern8[T1, T2, T3, T4, T5, T6, T7, T8] = {
      val __obj = js.Dynamic.literal(and = js.Any.fromFunction1(and), thenDo = js.Any.fromFunction1(thenDo))
      __obj.asInstanceOf[Pattern8[T1, T2, T3, T4, T5, T6, T7, T8]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Pattern8[?, ?, ?, ?, ?, ?, ?, ?], T1, T2, T3, T4, T5, T6, T7, T8] (val x: Self & (Pattern8[T1, T2, T3, T4, T5, T6, T7, T8])) extends AnyVal {
      
      inline def setAnd(value: Observable[Any] => Pattern9[T1, T2, T3, T4, T5, T6, T7, T8, Any]): Self = StObject.set(x, "and", js.Any.fromFunction1(value))
      
      inline def setThenDo(
        value: js.Function8[
              /* item1 */ T1, 
              /* item2 */ T2, 
              /* item3 */ T3, 
              /* item4 */ T4, 
              /* item5 */ T5, 
              /* item6 */ T6, 
              /* item7 */ T7, 
              /* item8 */ T8, 
              Any
            ] => Plan[Any]
      ): Self = StObject.set(x, "thenDo", js.Any.fromFunction1(value))
    }
  }
  
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
    ): Plan[TR]
  }
  object Pattern9 {
    
    inline def apply[T1, T2, T3, T4, T5, T6, T7, T8, T9](
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
          Any
        ] => Plan[Any]
    ): Pattern9[T1, T2, T3, T4, T5, T6, T7, T8, T9] = {
      val __obj = js.Dynamic.literal(thenDo = js.Any.fromFunction1(thenDo))
      __obj.asInstanceOf[Pattern9[T1, T2, T3, T4, T5, T6, T7, T8, T9]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Pattern9[?, ?, ?, ?, ?, ?, ?, ?, ?], T1, T2, T3, T4, T5, T6, T7, T8, T9] (val x: Self & (Pattern9[T1, T2, T3, T4, T5, T6, T7, T8, T9])) extends AnyVal {
      
      inline def setThenDo(
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
              Any
            ] => Plan[Any]
      ): Self = StObject.set(x, "thenDo", js.Any.fromFunction1(value))
    }
  }
  
  trait Plan[T] extends StObject
}
