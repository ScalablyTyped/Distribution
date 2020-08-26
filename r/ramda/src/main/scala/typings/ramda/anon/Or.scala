package typings.ramda.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Or extends js.Object {
  var or: js.UndefOr[js.Function1[/* repeated */ js.Any, _]] = js.native
}

object Or {
  @scala.inline
  def apply(): Or = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Or]
  }
  @scala.inline
  implicit class OrOps[Self <: Or] (val x: Self) extends AnyVal {
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
    def setOr(value: /* repeated */ js.Any => _): Self = this.set("or", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOr: Self = this.set("or", js.undefined)
  }
  
}

