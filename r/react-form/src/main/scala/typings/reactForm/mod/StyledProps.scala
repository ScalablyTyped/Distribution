package typings.reactForm.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StyledProps extends FieldProps {
  var messageBefore: js.UndefOr[Boolean] = js.native
  var noMessage: js.UndefOr[Boolean] = js.native
  var touchValidation: js.UndefOr[Boolean] = js.native
}

object StyledProps {
  @scala.inline
  def apply(): StyledProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StyledProps]
  }
  @scala.inline
  implicit class StyledPropsOps[Self <: StyledProps] (val x: Self) extends AnyVal {
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
    def setMessageBefore(value: Boolean): Self = this.set("messageBefore", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMessageBefore: Self = this.set("messageBefore", js.undefined)
    @scala.inline
    def setNoMessage(value: Boolean): Self = this.set("noMessage", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNoMessage: Self = this.set("noMessage", js.undefined)
    @scala.inline
    def setTouchValidation(value: Boolean): Self = this.set("touchValidation", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTouchValidation: Self = this.set("touchValidation", js.undefined)
  }
  
}

