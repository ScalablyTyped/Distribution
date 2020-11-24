package typings.rcCollapse.interfaceMod

import typings.rcMotion.cssmotionMod.CSSMotionProps
import typings.react.mod.Key
import typings.react.mod.ReactNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CollapseProps extends js.Object {
  
  var accordion: js.UndefOr[Boolean] = js.native
  
  var activeKey: js.UndefOr[Key | js.Array[Key]] = js.native
  
  var className: js.UndefOr[String] = js.native
  
  var collapsible: js.UndefOr[CollapsibleType] = js.native
  
  var defaultActiveKey: js.UndefOr[Key | js.Array[Key]] = js.native
  
  var destroyInactivePanel: js.UndefOr[Boolean] = js.native
  
  var expandIcon: js.UndefOr[js.Function1[/* props */ js.Object, ReactNode]] = js.native
  
  var onChange: js.UndefOr[js.Function1[/* key */ Key | js.Array[Key], Unit]] = js.native
  
  var openMotion: js.UndefOr[CSSMotionProps] = js.native
  
  var prefixCls: js.UndefOr[String] = js.native
  
  var style: js.UndefOr[js.Object] = js.native
}
object CollapseProps {
  
  @scala.inline
  def apply(): CollapseProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CollapseProps]
  }
  
  @scala.inline
  implicit class CollapsePropsOps[Self <: CollapseProps] (val x: Self) extends AnyVal {
    
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
    def setActiveKeyVarargs(value: Key*): Self = this.set("activeKey", js.Array(value :_*))
    
    @scala.inline
    def setActiveKey(value: Key | js.Array[Key]): Self = this.set("activeKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteActiveKey: Self = this.set("activeKey", js.undefined)
    
    @scala.inline
    def setClassName(value: String): Self = this.set("className", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClassName: Self = this.set("className", js.undefined)
    
    @scala.inline
    def setCollapsible(value: CollapsibleType): Self = this.set("collapsible", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCollapsible: Self = this.set("collapsible", js.undefined)
    
    @scala.inline
    def setDefaultActiveKeyVarargs(value: Key*): Self = this.set("defaultActiveKey", js.Array(value :_*))
    
    @scala.inline
    def setDefaultActiveKey(value: Key | js.Array[Key]): Self = this.set("defaultActiveKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDefaultActiveKey: Self = this.set("defaultActiveKey", js.undefined)
    
    @scala.inline
    def setDestroyInactivePanel(value: Boolean): Self = this.set("destroyInactivePanel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDestroyInactivePanel: Self = this.set("destroyInactivePanel", js.undefined)
    
    @scala.inline
    def setExpandIcon(value: /* props */ js.Object => ReactNode): Self = this.set("expandIcon", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteExpandIcon: Self = this.set("expandIcon", js.undefined)
    
    @scala.inline
    def setOnChange(value: /* key */ Key | js.Array[Key] => Unit): Self = this.set("onChange", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnChange: Self = this.set("onChange", js.undefined)
    
    @scala.inline
    def setOpenMotion(value: CSSMotionProps): Self = this.set("openMotion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOpenMotion: Self = this.set("openMotion", js.undefined)
    
    @scala.inline
    def setPrefixCls(value: String): Self = this.set("prefixCls", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePrefixCls: Self = this.set("prefixCls", js.undefined)
    
    @scala.inline
    def setStyle(value: js.Object): Self = this.set("style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStyle: Self = this.set("style", js.undefined)
  }
}
