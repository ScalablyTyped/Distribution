package typings.rxLiteJoinpatterns.Rx

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Pattern4[T1, T2, T3, T4] extends js.Object {
  def and[T5](other: Observable[T5]): Pattern5[T1, T2, T3, T4, T5] = js.native
  def thenDo[TR](selector: js.Function4[/* item1 */ T1, /* item2 */ T2, /* item3 */ T3, /* item4 */ T4, TR]): Plan[TR] = js.native
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
  implicit class Pattern4Ops[Self <: Pattern4[_, _, _, _], T1, T2, T3, T4] (val x: Self with (Pattern4[T1, T2, T3, T4])) extends AnyVal {
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
    def setAnd(value: Observable[js.Any] => Pattern5[T1, T2, T3, T4, js.Any]): Self = this.set("and", js.Any.fromFunction1(value))
    @scala.inline
    def setThenDo(
      value: js.Function4[/* item1 */ T1, /* item2 */ T2, /* item3 */ T3, /* item4 */ T4, js.Any] => Plan[js.Any]
    ): Self = this.set("thenDo", js.Any.fromFunction1(value))
  }
  
}

