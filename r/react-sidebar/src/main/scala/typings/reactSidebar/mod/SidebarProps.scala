package typings.reactSidebar.mod

import typings.react.mod.ReactNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SidebarProps extends js.Object {
  var contentClassName: js.UndefOr[String] = js.native
  var contentId: js.UndefOr[String] = js.native
  var defaultSidebarWidth: js.UndefOr[Double] = js.native
  var docked: js.UndefOr[Boolean] = js.native
  var dragToggleDistance: js.UndefOr[Double] = js.native
  var onSetOpen: js.UndefOr[js.Function1[/* open */ Boolean, Unit]] = js.native
  var open: js.UndefOr[Boolean] = js.native
  var overlayClassName: js.UndefOr[String] = js.native
  var overlayId: js.UndefOr[String] = js.native
  var pullRight: js.UndefOr[Boolean] = js.native
  var rootClassName: js.UndefOr[String] = js.native
  var rootId: js.UndefOr[String] = js.native
  var shadow: js.UndefOr[Boolean] = js.native
  var sidebar: js.UndefOr[ReactNode] = js.native
  var sidebarClassName: js.UndefOr[String] = js.native
  var sidebarId: js.UndefOr[String] = js.native
  var styles: js.UndefOr[SidebarStyles] = js.native
  var touch: js.UndefOr[Boolean] = js.native
  var touchHandleWidth: js.UndefOr[Double] = js.native
  var transitions: js.UndefOr[Boolean] = js.native
}

object SidebarProps {
  @scala.inline
  def apply(): SidebarProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SidebarProps]
  }
  @scala.inline
  implicit class SidebarPropsOps[Self <: SidebarProps] (val x: Self) extends AnyVal {
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
    def setContentClassName(value: String): Self = this.set("contentClassName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteContentClassName: Self = this.set("contentClassName", js.undefined)
    @scala.inline
    def setContentId(value: String): Self = this.set("contentId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteContentId: Self = this.set("contentId", js.undefined)
    @scala.inline
    def setDefaultSidebarWidth(value: Double): Self = this.set("defaultSidebarWidth", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDefaultSidebarWidth: Self = this.set("defaultSidebarWidth", js.undefined)
    @scala.inline
    def setDocked(value: Boolean): Self = this.set("docked", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDocked: Self = this.set("docked", js.undefined)
    @scala.inline
    def setDragToggleDistance(value: Double): Self = this.set("dragToggleDistance", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDragToggleDistance: Self = this.set("dragToggleDistance", js.undefined)
    @scala.inline
    def setOnSetOpen(value: /* open */ Boolean => Unit): Self = this.set("onSetOpen", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnSetOpen: Self = this.set("onSetOpen", js.undefined)
    @scala.inline
    def setOpen(value: Boolean): Self = this.set("open", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOpen: Self = this.set("open", js.undefined)
    @scala.inline
    def setOverlayClassName(value: String): Self = this.set("overlayClassName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOverlayClassName: Self = this.set("overlayClassName", js.undefined)
    @scala.inline
    def setOverlayId(value: String): Self = this.set("overlayId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOverlayId: Self = this.set("overlayId", js.undefined)
    @scala.inline
    def setPullRight(value: Boolean): Self = this.set("pullRight", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePullRight: Self = this.set("pullRight", js.undefined)
    @scala.inline
    def setRootClassName(value: String): Self = this.set("rootClassName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRootClassName: Self = this.set("rootClassName", js.undefined)
    @scala.inline
    def setRootId(value: String): Self = this.set("rootId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRootId: Self = this.set("rootId", js.undefined)
    @scala.inline
    def setShadow(value: Boolean): Self = this.set("shadow", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShadow: Self = this.set("shadow", js.undefined)
    @scala.inline
    def setSidebar(value: ReactNode): Self = this.set("sidebar", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSidebar: Self = this.set("sidebar", js.undefined)
    @scala.inline
    def setSidebarClassName(value: String): Self = this.set("sidebarClassName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSidebarClassName: Self = this.set("sidebarClassName", js.undefined)
    @scala.inline
    def setSidebarId(value: String): Self = this.set("sidebarId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSidebarId: Self = this.set("sidebarId", js.undefined)
    @scala.inline
    def setStyles(value: SidebarStyles): Self = this.set("styles", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStyles: Self = this.set("styles", js.undefined)
    @scala.inline
    def setTouch(value: Boolean): Self = this.set("touch", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTouch: Self = this.set("touch", js.undefined)
    @scala.inline
    def setTouchHandleWidth(value: Double): Self = this.set("touchHandleWidth", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTouchHandleWidth: Self = this.set("touchHandleWidth", js.undefined)
    @scala.inline
    def setTransitions(value: Boolean): Self = this.set("transitions", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTransitions: Self = this.set("transitions", js.undefined)
  }
  
}

