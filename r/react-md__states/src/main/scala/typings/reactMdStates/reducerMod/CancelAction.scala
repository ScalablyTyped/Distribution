package typings.reactMdStates.reducerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CancelAction
  extends RippleStateAction[js.Any] {
  var ease: Boolean = js.native
  var `type`: /* "CANCEL" */ String = js.native
}

object CancelAction {
  @scala.inline
  def apply(ease: Boolean, `type`: /* "CANCEL" */ String): CancelAction = {
    val __obj = js.Dynamic.literal(ease = ease.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[CancelAction]
  }
  @scala.inline
  implicit class CancelActionOps[Self <: CancelAction] (val x: Self) extends AnyVal {
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
    def setEase(value: Boolean): Self = this.set("ease", value.asInstanceOf[js.Any])
    @scala.inline
    def setType(value: /* "CANCEL" */ String): Self = this.set("type", value.asInstanceOf[js.Any])
  }
  
}

