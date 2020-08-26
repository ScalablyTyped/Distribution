package typings.rxLiteJoinpatterns.Rx

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Observable[T] extends js.Object {
  def and[T2](other: Observable[T2]): Pattern2[T, T2] = js.native
  def thenDo[TR](selector: js.Function1[/* item1 */ T, TR]): Plan[TR] = js.native
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
  @scala.inline
  implicit class ObservableOps[Self <: Observable[_], T] (val x: Self with Observable[T]) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAnd(value: Observable[js.Any] => Pattern2[T, js.Any]): Self = this.set("and", js.Any.fromFunction1(value))
    @scala.inline
    def setThenDo(value: js.Function1[/* item1 */ T, js.Any] => Plan[js.Any]): Self = this.set("thenDo", js.Any.fromFunction1(value))
  }
  
}

