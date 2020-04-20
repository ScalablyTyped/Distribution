package typings.reactNativeModalPopover.popoverControllerMod

import typings.reactNativeModalPopover.popoverGeometryMod.Rect
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PopoverControllerRenderProps extends js.Object {
  var popoverAnchorRect: Rect
  var popoverVisible: Boolean
  def closePopover(): Unit
  def openPopover(): Unit
  def setPopoverAnchor(ref: js.Any): Unit
}

object PopoverControllerRenderProps {
  @scala.inline
  def apply(
    closePopover: () => Unit,
    openPopover: () => Unit,
    popoverAnchorRect: Rect,
    popoverVisible: Boolean,
    setPopoverAnchor: js.Any => Unit
  ): PopoverControllerRenderProps = {
    val __obj = js.Dynamic.literal(closePopover = js.Any.fromFunction0(closePopover), openPopover = js.Any.fromFunction0(openPopover), popoverAnchorRect = popoverAnchorRect.asInstanceOf[js.Any], popoverVisible = popoverVisible.asInstanceOf[js.Any], setPopoverAnchor = js.Any.fromFunction1(setPopoverAnchor))
    __obj.asInstanceOf[PopoverControllerRenderProps]
  }
}

