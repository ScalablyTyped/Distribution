package typings
package reactDashNativeDashModalDashPopoverLib.libPopoverControllerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PopoverControllerRenderProps extends js.Object {
  var popoverAnchorRect: reactDashNativeDashModalDashPopoverLib.libPopoverGeometryMod.Rect
  var popoverVisible: scala.Boolean
  def closePopover(): scala.Unit
  def openPopover(): scala.Unit
  def setPopoverAnchor(ref: js.Any): scala.Unit
}

object PopoverControllerRenderProps {
  @scala.inline
  def apply(
    closePopover: () => scala.Unit,
    openPopover: () => scala.Unit,
    popoverAnchorRect: reactDashNativeDashModalDashPopoverLib.libPopoverGeometryMod.Rect,
    popoverVisible: scala.Boolean,
    setPopoverAnchor: js.Any => scala.Unit
  ): PopoverControllerRenderProps = {
    val __obj = js.Dynamic.literal(closePopover = js.Any.fromFunction0(closePopover), openPopover = js.Any.fromFunction0(openPopover), popoverAnchorRect = popoverAnchorRect, popoverVisible = popoverVisible, setPopoverAnchor = js.Any.fromFunction1(setPopoverAnchor))
  
    __obj.asInstanceOf[PopoverControllerRenderProps]
  }
}

