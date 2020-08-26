package typings.reactNativeModalPopover.popoverControllerMod

import typings.reactNativeModalPopover.popoverGeometryMod.Rect
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PopoverControllerRenderProps extends js.Object {
  var popoverAnchorRect: Rect = js.native
  var popoverVisible: Boolean = js.native
  def closePopover(): Unit = js.native
  def openPopover(): Unit = js.native
  def setPopoverAnchor(ref: js.Any): Unit = js.native
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
  @scala.inline
  implicit class PopoverControllerRenderPropsOps[Self <: PopoverControllerRenderProps] (val x: Self) extends AnyVal {
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
    def setClosePopover(value: () => Unit): Self = this.set("closePopover", js.Any.fromFunction0(value))
    @scala.inline
    def setOpenPopover(value: () => Unit): Self = this.set("openPopover", js.Any.fromFunction0(value))
    @scala.inline
    def setPopoverAnchorRect(value: Rect): Self = this.set("popoverAnchorRect", value.asInstanceOf[js.Any])
    @scala.inline
    def setPopoverVisible(value: Boolean): Self = this.set("popoverVisible", value.asInstanceOf[js.Any])
    @scala.inline
    def setSetPopoverAnchor(value: js.Any => Unit): Self = this.set("setPopoverAnchor", js.Any.fromFunction1(value))
  }
  
}

