package typings
package atReachMenuDashButtonLib.atReachMenuDashButtonMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait State extends js.Object {
  var buttonId: java.lang.String
  var buttonRect: js.UndefOr[ButtonRect] = js.undefined
  var closingWithClick: scala.Boolean
  var isOpen: scala.Boolean
  var selectionIndex: scala.Double
}

object State {
  @scala.inline
  def apply(
    buttonId: java.lang.String,
    closingWithClick: scala.Boolean,
    isOpen: scala.Boolean,
    selectionIndex: scala.Double,
    buttonRect: ButtonRect = null
  ): State = {
    val __obj = js.Dynamic.literal(buttonId = buttonId, closingWithClick = closingWithClick, isOpen = isOpen, selectionIndex = selectionIndex)
    if (buttonRect != null) __obj.updateDynamic("buttonRect")(buttonRect)
    __obj.asInstanceOf[State]
  }
}

