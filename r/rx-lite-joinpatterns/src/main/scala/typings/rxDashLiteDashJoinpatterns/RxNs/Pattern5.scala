package typings.rxDashLiteDashJoinpatterns.RxNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Pattern5[T1, T2, T3, T4, T5] extends js.Object {
  def and[T6](other: Observable[T6]): Pattern6[T1, T2, T3, T4, T5, T6]
  def thenDo[TR](
    selector: js.Function5[/* item1 */ T1, /* item2 */ T2, /* item3 */ T3, /* item4 */ T4, /* item5 */ T5, TR]
  ): Plan[TR]
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
}

