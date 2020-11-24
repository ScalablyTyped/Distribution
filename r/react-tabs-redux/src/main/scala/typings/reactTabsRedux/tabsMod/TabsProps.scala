package typings.reactTabsRedux.tabsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TabsProps extends js.Object {
  
  var activeLinkStyle: js.UndefOr[js.Object] = js.native
  
  var disableInlineStyles: js.UndefOr[Boolean] = js.native
  
  var handleSelect: js.UndefOr[js.Function2[/* tab */ String, /* name */ String, Unit]] = js.native
  
  var name: js.UndefOr[String] = js.native
  
  var onChange: js.UndefOr[js.Function2[/* selectedTab */ String, /* name */ String, Unit]] = js.native
  
  var renderActiveTabContentOnly: js.UndefOr[Boolean] = js.native
  
  var selectedTab: js.UndefOr[String] = js.native
  
  var visibleTabStyle: js.UndefOr[js.Object] = js.native
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
    def setActiveLinkStyle(value: js.Object): Self = this.set("activeLinkStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteActiveLinkStyle: Self = this.set("activeLinkStyle", js.undefined)
    
    @scala.inline
    def setDisableInlineStyles(value: Boolean): Self = this.set("disableInlineStyles", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDisableInlineStyles: Self = this.set("disableInlineStyles", js.undefined)
    
    @scala.inline
    def setHandleSelect(value: (/* tab */ String, /* name */ String) => Unit): Self = this.set("handleSelect", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteHandleSelect: Self = this.set("handleSelect", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    
    @scala.inline
    def setOnChange(value: (/* selectedTab */ String, /* name */ String) => Unit): Self = this.set("onChange", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteOnChange: Self = this.set("onChange", js.undefined)
    
    @scala.inline
    def setRenderActiveTabContentOnly(value: Boolean): Self = this.set("renderActiveTabContentOnly", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRenderActiveTabContentOnly: Self = this.set("renderActiveTabContentOnly", js.undefined)
    
    @scala.inline
    def setSelectedTab(value: String): Self = this.set("selectedTab", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSelectedTab: Self = this.set("selectedTab", js.undefined)
    
    @scala.inline
    def setVisibleTabStyle(value: js.Object): Self = this.set("visibleTabStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVisibleTabStyle: Self = this.set("visibleTabStyle", js.undefined)
  }
}
