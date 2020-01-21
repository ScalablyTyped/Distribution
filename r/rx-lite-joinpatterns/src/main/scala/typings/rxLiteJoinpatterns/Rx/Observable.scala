package typings.rxLiteJoinpatterns.Rx

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Observable[T] extends js.Object {
  def and[T2](other: Observable[T2]): Pattern2[T, T2]
  def thenDo[TR](selector: js.Function1[/* item1 */ T, TR]): Plan[TR]
}

object Observable {
  @scala.inline
  def apply[T](
    and: Observable[js.Any] => Pattern2[T, js.Any],
    thenDo: js.Function1[/* item1 */ T, js.Any] => Plan[js.Any]
  ): Observable[T] = {
    val __obj = js.Dynamic.literal(and = js.Any.fromFunction1(and), thenDo = js.Any.fromFunction1(thenDo))
  
    __obj.asInstanceOf[Observable[T]]
  }
}

