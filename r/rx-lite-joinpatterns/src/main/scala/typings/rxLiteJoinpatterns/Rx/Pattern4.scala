package typings.rxLiteJoinpatterns.Rx

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Pattern4[T1, T2, T3, T4] extends js.Object {
  def and[T5](other: Observable[T5]): Pattern5[T1, T2, T3, T4, T5]
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
}

