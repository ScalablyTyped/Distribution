package typings.rcCollapse.interfaceMod

import typings.rcMotion.cssmotionMod.CSSMotionProps
import typings.react.mod.ReactNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CollapsePanelProps extends js.Object {
  
  var accordion: js.UndefOr[Boolean] = js.native
  
  var className: js.UndefOr[String] = js.native
  
  var collapsible: js.UndefOr[CollapsibleType] = js.native
  
  var destroyInactivePanel: js.UndefOr[Boolean] = js.native
  
  var expandIcon: js.UndefOr[js.Function1[/* props */ js.Object, ReactNode]] = js.native
  
  var extra: js.UndefOr[String | ReactNode] = js.native
  
  var forceRender: js.UndefOr[Boolean] = js.native
  
  var header: js.UndefOr[String | ReactNode] = js.native
  
  var headerClass: js.UndefOr[String] = js.native
  
  var id: js.UndefOr[String] = js.native
  
  var isActive: js.UndefOr[Boolean] = js.native
  
  var onItemClick: js.UndefOr[js.Function1[/* panelKey */ String | Double, Unit]] = js.native
  
  var openMotion: js.UndefOr[CSSMotionProps] = js.native
  
  var panelKey: js.UndefOr[String | Double] = js.native
  
  var prefixCls: js.UndefOr[String] = js.native
  
  var role: js.UndefOr[String] = js.native
  
  var showArrow: js.UndefOr[Boolean] = js.native
  
  var style: js.UndefOr[js.Object] = js.native
}
object CollapsePanelProps {
  
  @scala.inline
  def apply(): CollapsePanelProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CollapsePanelProps]
  }
  
  @scala.inline
  implicit class CollapsePanelPropsOps[Self <: CollapsePanelProps] (val x: Self) extends AnyVal {
    
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
    def setAccordion(value: Boolean): Self = this.set("accordion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAccordion: Self = this.set("accordion", js.undefined)
    
    @scala.inline
    def setClassName(value: String): Self = this.set("className", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClassName: Self = this.set("className", js.undefined)
    
    @scala.inline
    def setCollapsible(value: CollapsibleType): Self = this.set("collapsible", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCollapsible: Self = this.set("collapsible", js.undefined)
    
    @scala.inline
    def setDestroyInactivePanel(value: Boolean): Self = this.set("destroyInactivePanel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDestroyInactivePanel: Self = this.set("destroyInactivePanel", js.undefined)
    
    @scala.inline
    def setExpandIcon(value: /* props */ js.Object => ReactNode): Self = this.set("expandIcon", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteExpandIcon: Self = this.set("expandIcon", js.undefined)
    
    @scala.inline
    def setExtra(value: String | ReactNode): Self = this.set("extra", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExtra: Self = this.set("extra", js.undefined)
    
    @scala.inline
    def setForceRender(value: Boolean): Self = this.set("forceRender", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteForceRender: Self = this.set("forceRender", js.undefined)
    
    @scala.inline
    def setHeader(value: String | ReactNode): Self = this.set("header", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHeader: Self = this.set("header", js.undefined)
    
    @scala.inline
    def setHeaderClass(value: String): Self = this.set("headerClass", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHeaderClass: Self = this.set("headerClass", js.undefined)
    
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteId: Self = this.set("id", js.undefined)
    
    @scala.inline
    def setIsActive(value: Boolean): Self = this.set("isActive", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIsActive: Self = this.set("isActive", js.undefined)
    
    @scala.inline
    def setOnItemClick(value: /* panelKey */ String | Double => Unit): Self = this.set("onItemClick", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnItemClick: Self = this.set("onItemClick", js.undefined)
    
    @scala.inline
    def setOpenMotion(value: CSSMotionProps): Self = this.set("openMotion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOpenMotion: Self = this.set("openMotion", js.undefined)
    
    @scala.inline
    def setPanelKey(value: String | Double): Self = this.set("panelKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePanelKey: Self = this.set("panelKey", js.undefined)
    
    @scala.inline
    def setPrefixCls(value: String): Self = this.set("prefixCls", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePrefixCls: Self = this.set("prefixCls", js.undefined)
    
    @scala.inline
    def setRole(value: String): Self = this.set("role", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRole: Self = this.set("role", js.undefined)
    
    @scala.inline
    def setShowArrow(value: Boolean): Self = this.set("showArrow", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShowArrow: Self = this.set("showArrow", js.undefined)
    
    @scala.inline
    def setStyle(value: js.Object): Self = this.set("style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStyle: Self = this.set("style", js.undefined)
  }
}
