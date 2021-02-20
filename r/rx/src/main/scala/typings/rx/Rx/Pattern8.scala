package typings.rx.Rx

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Pattern8[T1, T2, T3, T4, T5, T6, T7, T8] extends StObject {
  
  /**
    *  Creates a pattern that matches the current plan matches and when the specified observable sequences has an available value.
    *  @param other Observable sequence to match in addition to the current pattern.
    *  @return {Pattern} Pattern object that matches when all observable sequences in the pattern have an available value.
    */
  def and[T9](other: Observable[T9]): Pattern9[T1, T2, T3, T4, T5, T6, T7, T8, T9] = js.native
  
  /**
    *  Matches when all observable sequences in the pattern (specified using a chain of and operators) have an available value and projects the values.
    *  @param {Function} selector Selector that will be invoked with available values from the source sequences, in the same order of the sequences in the pattern.
    *  @return {Plan} Plan that produces the projected values, to be fed (with other plans) to the when operator.
    */
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
