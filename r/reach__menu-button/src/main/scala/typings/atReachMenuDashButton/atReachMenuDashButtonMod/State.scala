package typings.atReachMenuDashButton.atReachMenuDashButtonMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait State extends js.Object {
  var buttonId: String
  var buttonRect: js.UndefOr[ButtonRect] = js.undefined
  var closingWithClick: Boolean
  var isOpen: Boolean
  var selectionIndex: Double
}

object State {
  @scala.inline
  def apply(
    buttonId: String,
    closingWithClick: Boolean,
    isOpen: Boolean,
    selectionIndex: Double,
    buttonRect: ButtonRect = null
  ): State = {
    val __obj = js.Dynamic.literal(buttonId = buttonId, closingWithClick = closingWithClick, isOpen = isOpen, selectionIndex = selectionIndex)
    if (buttonRect != null) __obj.updateDynamic("buttonRect")(buttonRect)
    __obj.asInstanceOf[State]
  }
}

