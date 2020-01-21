package typings.rxLiteJoinpatterns.Rx

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Pattern2[T1, T2] extends js.Object {
  def and[T3](other: Observable[T3]): Pattern3[T1, T2, T3]
  def thenDo[TR](selector: js.Function2[/* item1 */ T1, /* item2 */ T2, TR]): Plan[TR]
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
}

