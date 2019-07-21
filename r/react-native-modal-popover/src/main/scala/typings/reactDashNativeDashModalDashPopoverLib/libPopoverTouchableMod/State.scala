package typings
package reactDashNativeDashModalDashPopoverLib.libPopoverTouchableMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait State extends js.Object {
  var popoverAnchor: reactDashNativeDashModalDashPopoverLib.libPopoverGeometryMod.Rect
  var showPopover: scala.Boolean
}

object State {
  @scala.inline
  def apply(
    popoverAnchor: reactDashNativeDashModalDashPopoverLib.libPopoverGeometryMod.Rect,
    showPopover: scala.Boolean
  ): State = {
    val __obj = js.Dynamic.literal(popoverAnchor = popoverAnchor, showPopover = showPopover)
  
    __obj.asInstanceOf[State]
  }
}

