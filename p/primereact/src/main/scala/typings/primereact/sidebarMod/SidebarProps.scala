package typings.primereact.sidebarMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SidebarProps extends js.Object {
  
  var ariaCloseLabel: js.UndefOr[String] = js.native
  
  var baseZIndex: js.UndefOr[Double] = js.native
  
  var blockScroll: js.UndefOr[Boolean] = js.native
  
  var className: js.UndefOr[String] = js.native
  
  var closeOnEscape: js.UndefOr[Boolean] = js.native
  
  var dismissable: js.UndefOr[Boolean] = js.native
  
  var fullScreen: js.UndefOr[Boolean] = js.native
  
  var icons: js.UndefOr[js.Function1[/* props */ js.Object, _]] = js.native
  
  var id: js.UndefOr[String] = js.native
  
  var modal: js.UndefOr[Boolean] = js.native
  
  def onHide(): Unit = js.native
  
  var onShow: js.UndefOr[js.Function0[Unit]] = js.native
  
  var position: js.UndefOr[String] = js.native
  
  var showCloseIcon: js.UndefOr[Boolean] = js.native
  
  var style: js.UndefOr[js.Object] = js.native
  
  var visible: js.UndefOr[Boolean] = js.native
}
object SidebarProps {
  
  @scala.inline
  def apply(onHide: () => Unit): SidebarProps = {
    val __obj = js.Dynamic.literal(onHide = js.Any.fromFunction0(onHide))
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
    def setOnHide(value: () => Unit): Self = this.set("onHide", js.Any.fromFunction0(value))
    
    @scala.inline
    def setAriaCloseLabel(value: String): Self = this.set("ariaCloseLabel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAriaCloseLabel: Self = this.set("ariaCloseLabel", js.undefined)
    
    @scala.inline
    def setBaseZIndex(value: Double): Self = this.set("baseZIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBaseZIndex: Self = this.set("baseZIndex", js.undefined)
    
    @scala.inline
    def setBlockScroll(value: Boolean): Self = this.set("blockScroll", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBlockScroll: Self = this.set("blockScroll", js.undefined)
    
    @scala.inline
    def setClassName(value: String): Self = this.set("className", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClassName: Self = this.set("className", js.undefined)
    
    @scala.inline
    def setCloseOnEscape(value: Boolean): Self = this.set("closeOnEscape", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCloseOnEscape: Self = this.set("closeOnEscape", js.undefined)
    
    @scala.inline
    def setDismissable(value: Boolean): Self = this.set("dismissable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDismissable: Self = this.set("dismissable", js.undefined)
    
    @scala.inline
    def setFullScreen(value: Boolean): Self = this.set("fullScreen", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFullScreen: Self = this.set("fullScreen", js.undefined)
    
    @scala.inline
    def setIcons(value: /* props */ js.Object => _): Self = this.set("icons", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteIcons: Self = this.set("icons", js.undefined)
    
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteId: Self = this.set("id", js.undefined)
    
    @scala.inline
    def setModal(value: Boolean): Self = this.set("modal", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteModal: Self = this.set("modal", js.undefined)
    
    @scala.inline
    def setOnShow(value: () => Unit): Self = this.set("onShow", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteOnShow: Self = this.set("onShow", js.undefined)
    
    @scala.inline
    def setPosition(value: String): Self = this.set("position", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePosition: Self = this.set("position", js.undefined)
    
    @scala.inline
    def setShowCloseIcon(value: Boolean): Self = this.set("showCloseIcon", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShowCloseIcon: Self = this.set("showCloseIcon", js.undefined)
    
    @scala.inline
    def setStyle(value: js.Object): Self = this.set("style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStyle: Self = this.set("style", js.undefined)
    
    @scala.inline
    def setVisible(value: Boolean): Self = this.set("visible", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVisible: Self = this.set("visible", js.undefined)
  }
}
