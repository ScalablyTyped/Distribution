package typings.reactBootstrap.tabsMod

import typings.react.mod.AllHTMLAttributes
import typings.react.mod.ClassAttributes
import typings.reactBootstrap.mod.SelectCallback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TabsProps
  extends AllHTMLAttributes[Tabs]
     with ClassAttributes[Tabs] {
  
  var activeKey: js.UndefOr[js.Any] = js.native
  
  var animation: js.UndefOr[Boolean] = js.native
  
  var bsStyle: js.UndefOr[String] = js.native
  
  var defaultActiveKey: js.UndefOr[js.Any] = js.native
  
  var justified: js.UndefOr[Boolean] = js.native
  
   // TODO: Add more specific type
  var mountOnEnter: js.UndefOr[Boolean] = js.native
  
  @JSName("onSelect")
  var onSelect_TabsProps: js.UndefOr[SelectCallback] = js.native
  
  var paneWidth: js.UndefOr[js.Any] = js.native
  
   // TODO: Add more specific type
  var position: js.UndefOr[String] = js.native
  
  var tabWidth: js.UndefOr[js.Any] = js.native
  
  var unmountOnExit: js.UndefOr[Boolean] = js.native
}
object TabsProps {
  
  @scala.inline
  def apply(): TabsProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TabsProps]
  }
  
  @scala.inline
  implicit class TabsPropsOps[Self <: TabsProps] (val x: Self) extends AnyVal {
    
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
    def setActiveKey(value: js.Any): Self = this.set("activeKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteActiveKey: Self = this.set("activeKey", js.undefined)
    
    @scala.inline
    def setAnimation(value: Boolean): Self = this.set("animation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAnimation: Self = this.set("animation", js.undefined)
    
    @scala.inline
    def setBsStyle(value: String): Self = this.set("bsStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBsStyle: Self = this.set("bsStyle", js.undefined)
    
    @scala.inline
    def setDefaultActiveKey(value: js.Any): Self = this.set("defaultActiveKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDefaultActiveKey: Self = this.set("defaultActiveKey", js.undefined)
    
    @scala.inline
    def setJustified(value: Boolean): Self = this.set("justified", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteJustified: Self = this.set("justified", js.undefined)
    
    @scala.inline
    def setMountOnEnter(value: Boolean): Self = this.set("mountOnEnter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMountOnEnter: Self = this.set("mountOnEnter", js.undefined)
    
    @scala.inline
    def setOnSelect(value: SelectCallback): Self = this.set("onSelect", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnSelect: Self = this.set("onSelect", js.undefined)
    
    @scala.inline
    def setPaneWidth(value: js.Any): Self = this.set("paneWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePaneWidth: Self = this.set("paneWidth", js.undefined)
    
    @scala.inline
    def setPosition(value: String): Self = this.set("position", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePosition: Self = this.set("position", js.undefined)
    
    @scala.inline
    def setTabWidth(value: js.Any): Self = this.set("tabWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTabWidth: Self = this.set("tabWidth", js.undefined)
    
    @scala.inline
    def setUnmountOnExit(value: Boolean): Self = this.set("unmountOnExit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUnmountOnExit: Self = this.set("unmountOnExit", js.undefined)
  }
}
