package typings.reactAriaMenubutton.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FocusButton extends js.Object {
  /**
    * If `true`, the widget's button will receive focus when the
    * menu closes. Default: `false`.
    */
  var focusButton: Boolean = js.native
}

object FocusButton {
  @scala.inline
  def apply(focusButton: Boolean): FocusButton = {
    val __obj = js.Dynamic.literal(focusButton = focusButton.asInstanceOf[js.Any])
    __obj.asInstanceOf[FocusButton]
  }
  @scala.inline
  implicit class FocusButtonOps[Self <: FocusButton] (val x: Self) extends AnyVal {
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
    def setFocusButton(value: Boolean): Self = this.set("focusButton", value.asInstanceOf[js.Any])
  }
  
}

