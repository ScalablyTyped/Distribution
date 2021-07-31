package typings.rx.Rx

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Pattern3[T1, T2, T3] extends StObject {
  
  /**
    *  Creates a pattern that matches the current plan matches and when the specified observable sequences has an available value.
    *  @param other Observable sequence to match in addition to the current pattern.
    *  @return {Pattern} Pattern object that matches when all observable sequences in the pattern have an available value.
    */
  def and[T4](other: Observable[T4]): Pattern4[T1, T2, T3, T4]
  
  /**
    *  Matches when all observable sequences in the pattern (specified using a chain of and operators) have an available value and projects the values.
    *  @param {Function} selector Selector that will be invoked with available values from the source sequences, in the same order of the sequences in the pattern.
    *  @return {Plan} Plan that produces the projected values, to be fed (with other plans) to the when operator.
    */
  def thenDo[TR](selector: js.Function3[/* item1 */ T1, /* item2 */ T2, /* item3 */ T3, TR]): Plan[TR]
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
  implicit class Pattern3MutableBuilder[Self <: Pattern3[?, ?, ?], T1, T2, T3] (val x: Self & (Pattern3[T1, T2, T3])) extends AnyVal {
    
    @scala.inline
    def setAnd(value: Observable[js.Any] => Pattern4[T1, T2, T3, js.Any]): Self = StObject.set(x, "and", js.Any.fromFunction1(value))
    
    @scala.inline
    def setThenDo(value: js.Function3[/* item1 */ T1, /* item2 */ T2, /* item3 */ T3, js.Any] => Plan[js.Any]): Self = StObject.set(x, "thenDo", js.Any.fromFunction1(value))
  }
}
