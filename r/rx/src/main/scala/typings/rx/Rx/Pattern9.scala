package typings.rx.Rx

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Pattern9[T1, T2, T3, T4, T5, T6, T7, T8, T9] extends StObject {
  
  /**
    *  Matches when all observable sequences in the pattern (specified using a chain of and operators) have an available value and projects the values.
    *  @param {Function} selector Selector that will be invoked with available values from the source sequences, in the same order of the sequences in the pattern.
    *  @return {Plan} Plan that produces the projected values, to be fed (with other plans) to the when operator.
    */
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
      js.Any
    ] => Plan[js.Any]
  ): Pattern9[T1, T2, T3, T4, T5, T6, T7, T8, T9] = {
    val __obj = js.Dynamic.literal(thenDo = js.Any.fromFunction1(thenDo))
    __obj.asInstanceOf[Pattern9[T1, T2, T3, T4, T5, T6, T7, T8, T9]]
  }
  
  extension [Self <: Pattern9[?, ?, ?, ?, ?, ?, ?, ?, ?], T1, T2, T3, T4, T5, T6, T7, T8, T9](x: Self & (Pattern9[T1, T2, T3, T4, T5, T6, T7, T8, T9])) {
    
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
          js.Any
        ] => Plan[js.Any]
    ): Self = StObject.set(x, "thenDo", js.Any.fromFunction1(value))
  }
}
