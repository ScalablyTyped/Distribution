package typings.reactNativeModalPopover.popoverControllerMod

import typings.reactNativeModalPopover.popoverGeometryMod.Rect
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait State extends js.Object {
  var popoverAnchor: Rect = js.native
  var showPopover: Boolean = js.native
}

object State {
  @scala.inline
  def apply(popoverAnchor: Rect, showPopover: Boolean): State = {
    val __obj = js.Dynamic.literal(popoverAnchor = popoverAnchor.asInstanceOf[js.Any], showPopover = showPopover.asInstanceOf[js.Any])
    __obj.asInstanceOf[State]
  }
  @scala.inline
  implicit class StateOps[Self <: State] (val x: Self) extends AnyVal {
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
    def setPopoverAnchor(value: Rect): Self = this.set("popoverAnchor", value.asInstanceOf[js.Any])
    @scala.inline
    def setShowPopover(value: Boolean): Self = this.set("showPopover", value.asInstanceOf[js.Any])
  }
  
}

