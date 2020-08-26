package typings.reactSidebar.mod

import typings.reactSidebar.anon.PartialCSSStyleDeclaratio
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SidebarStyles extends js.Object {
  var content: js.UndefOr[PartialCSSStyleDeclaratio] = js.native
  var dragHandle: js.UndefOr[PartialCSSStyleDeclaratio] = js.native
  var overlay: js.UndefOr[PartialCSSStyleDeclaratio] = js.native
  var root: js.UndefOr[PartialCSSStyleDeclaratio] = js.native
  var sidebar: js.UndefOr[PartialCSSStyleDeclaratio] = js.native
}

object SidebarStyles {
  @scala.inline
  def apply(): SidebarStyles = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SidebarStyles]
  }
  @scala.inline
  implicit class SidebarStylesOps[Self <: SidebarStyles] (val x: Self) extends AnyVal {
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
    def setContent(value: PartialCSSStyleDeclaratio): Self = this.set("content", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteContent: Self = this.set("content", js.undefined)
    @scala.inline
    def setDragHandle(value: PartialCSSStyleDeclaratio): Self = this.set("dragHandle", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDragHandle: Self = this.set("dragHandle", js.undefined)
    @scala.inline
    def setOverlay(value: PartialCSSStyleDeclaratio): Self = this.set("overlay", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOverlay: Self = this.set("overlay", js.undefined)
    @scala.inline
    def setRoot(value: PartialCSSStyleDeclaratio): Self = this.set("root", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRoot: Self = this.set("root", js.undefined)
    @scala.inline
    def setSidebar(value: PartialCSSStyleDeclaratio): Self = this.set("sidebar", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSidebar: Self = this.set("sidebar", js.undefined)
  }
  
}

