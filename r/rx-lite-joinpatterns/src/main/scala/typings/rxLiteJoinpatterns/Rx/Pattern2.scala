package typings.rxLiteJoinpatterns.Rx

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Pattern2[T1, T2] extends js.Object {
  def and[T3](other: Observable[T3]): Pattern3[T1, T2, T3] = js.native
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
  implicit class Pattern2Ops[Self <: Pattern2[_, _], T1, T2] (val x: Self with (Pattern2[T1, T2])) extends AnyVal {
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
    def setAnd(value: Observable[js.Any] => Pattern3[T1, T2, js.Any]): Self = this.set("and", js.Any.fromFunction1(value))
    @scala.inline
    def setThenDo(value: js.Function2[/* item1 */ T1, /* item2 */ T2, js.Any] => Plan[js.Any]): Self = this.set("thenDo", js.Any.fromFunction1(value))
  }
  
}

