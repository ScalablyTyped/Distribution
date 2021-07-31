package typings.rx.Rx

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Pattern4[T1, T2, T3, T4] extends StObject {
  
  /**
    *  Creates a pattern that matches the current plan matches and when the specified observable sequences has an available value.
    *  @param other Observable sequence to match in addition to the current pattern.
    *  @return {Pattern} Pattern object that matches when all observable sequences in the pattern have an available value.
    */
  def and[T5](other: Observable[T5]): Pattern5[T1, T2, T3, T4, T5]
  
  /**
    *  Matches when all observable sequences in the pattern (specified using a chain of and operators) have an available value and projects the values.
    *  @param {Function} selector Selector that will be invoked with available values from the source sequences, in the same order of the sequences in the pattern.
    *  @return {Plan} Plan that produces the projected values, to be fed (with other plans) to the when operator.
    */
  def thenDo[TR](selector: js.Function4[/* item1 */ T1, /* item2 */ T2, /* item3 */ T3, /* item4 */ T4, TR]): Plan[TR]
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
  implicit class Pattern4MutableBuilder[Self <: Pattern4[?, ?, ?, ?], T1, T2, T3, T4] (val x: Self & (Pattern4[T1, T2, T3, T4])) extends AnyVal {
    
    @scala.inline
    def setAnd(value: Observable[js.Any] => Pattern5[T1, T2, T3, T4, js.Any]): Self = StObject.set(x, "and", js.Any.fromFunction1(value))
    
    @scala.inline
    def setThenDo(
      value: js.Function4[/* item1 */ T1, /* item2 */ T2, /* item3 */ T3, /* item4 */ T4, js.Any] => Plan[js.Any]
    ): Self = StObject.set(x, "thenDo", js.Any.fromFunction1(value))
  }
}
