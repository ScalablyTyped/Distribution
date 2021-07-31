package typings.rx.Rx

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Pattern6[T1, T2, T3, T4, T5, T6] extends StObject {
  
  /**
    *  Creates a pattern that matches the current plan matches and when the specified observable sequences has an available value.
    *  @param other Observable sequence to match in addition to the current pattern.
    *  @return {Pattern} Pattern object that matches when all observable sequences in the pattern have an available value.
    */
  def and[T7](other: Observable[T7]): Pattern7[T1, T2, T3, T4, T5, T6, T7]
  
  /**
    *  Matches when all observable sequences in the pattern (specified using a chain of and operators) have an available value and projects the values.
    *  @param {Function} selector Selector that will be invoked with available values from the source sequences, in the same order of the sequences in the pattern.
    *  @return {Plan} Plan that produces the projected values, to be fed (with other plans) to the when operator.
    */
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
  implicit class Pattern6MutableBuilder[Self <: Pattern6[?, ?, ?, ?, ?, ?], T1, T2, T3, T4, T5, T6] (val x: Self & (Pattern6[T1, T2, T3, T4, T5, T6])) extends AnyVal {
    
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
