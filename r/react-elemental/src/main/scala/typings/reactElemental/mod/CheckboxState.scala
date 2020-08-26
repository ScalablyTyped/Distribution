package typings.reactElemental.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CheckboxState extends js.Object {
  val isFocus: Boolean = js.native
  val isHover: Boolean = js.native
}

object CheckboxState {
  @scala.inline
  def apply(isFocus: Boolean, isHover: Boolean): CheckboxState = {
    val __obj = js.Dynamic.literal(isFocus = isFocus.asInstanceOf[js.Any], isHover = isHover.asInstanceOf[js.Any])
    __obj.asInstanceOf[CheckboxState]
  }
  @scala.inline
  implicit class CheckboxStateOps[Self <: CheckboxState] (val x: Self) extends AnyVal {
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
    def setIsFocus(value: Boolean): Self = this.set("isFocus", value.asInstanceOf[js.Any])
    @scala.inline
    def setIsHover(value: Boolean): Self = this.set("isHover", value.asInstanceOf[js.Any])
  }
  
}

