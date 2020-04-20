package typings.reactAriaMenubutton

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonFocusButton extends js.Object {
  /**
  		 * If `true`, the widget's button will receive focus when the
  		 * menu closes. Default: `false`.
  		 */
  var focusButton: Boolean
}

object AnonFocusButton {
  @scala.inline
  def apply(focusButton: Boolean): AnonFocusButton = {
    val __obj = js.Dynamic.literal(focusButton = focusButton.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonFocusButton]
  }
}

