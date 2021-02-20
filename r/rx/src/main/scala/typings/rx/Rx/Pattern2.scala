package typings.rx.Rx

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Pattern2[T1, T2] extends StObject {
  
  /**
    *  Creates a pattern that matches the current plan matches and when the specified observable sequences has an available value.
    *  @param other Observable sequence to match in addition to the current pattern.
    *  @return {Pattern} Pattern object that matches when all observable sequences in the pattern have an available value.
    */
  def and[T3](other: Observable[T3]): Pattern3[T1, T2, T3] = js.native
  
  /**
    *  Matches when all observable sequences in the pattern (specified using a chain of and operators) have an available value and projects the values.
    *  @param {Function} selector Selector that will be invoked with available values from the source sequences, in the same order of the sequences in the pattern.
    *  @return {Plan} Plan that produces the projected values, to be fed (with other plans) to the when operator.
    */
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
