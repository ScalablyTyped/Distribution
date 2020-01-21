package typings.reachMenuButton.mod

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
    val __obj = js.Dynamic.literal(buttonId = buttonId.asInstanceOf[js.Any], closingWithClick = closingWithClick.asInstanceOf[js.Any], isOpen = isOpen.asInstanceOf[js.Any], selectionIndex = selectionIndex.asInstanceOf[js.Any])
    if (buttonRect != null) __obj.updateDynamic("buttonRect")(buttonRect.asInstanceOf[js.Any])
    __obj.asInstanceOf[State]
  }
}

