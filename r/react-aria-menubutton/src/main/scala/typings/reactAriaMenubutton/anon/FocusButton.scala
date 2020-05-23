package typings.reactAriaMenubutton.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FocusButton extends js.Object {
  /**
    * If `true`, the widget's button will receive focus when the
    * menu closes. Default: `false`.
    */
  var focusButton: Boolean
}

object FocusButton {
  @scala.inline
  def apply(focusButton: Boolean): FocusButton = {
    val __obj = js.Dynamic.literal(focusButton = focusButton.asInstanceOf[js.Any])
    __obj.asInstanceOf[FocusButton]
  }
}

