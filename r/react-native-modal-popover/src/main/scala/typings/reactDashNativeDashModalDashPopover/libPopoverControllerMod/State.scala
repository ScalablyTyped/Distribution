package typings.reactDashNativeDashModalDashPopover.libPopoverControllerMod

import typings.reactDashNativeDashModalDashPopover.libPopoverGeometryMod.Rect
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait State extends js.Object {
  var popoverAnchor: Rect
  var showPopover: Boolean
}

object State {
  @scala.inline
  def apply(popoverAnchor: Rect, showPopover: Boolean): State = {
    val __obj = js.Dynamic.literal(popoverAnchor = popoverAnchor, showPopover = showPopover)
  
    __obj.asInstanceOf[State]
  }
}

