package typings.reactBootstrap.navItemMod

import typings.react.mod.AllHTMLAttributes
import typings.react.mod.ClassAttributes
import typings.react.mod.ReactType
import typings.reactBootstrap.mod.SelectCallback
import typings.reactBootstrap.mod.Sizes
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NavItemProps
  extends AllHTMLAttributes[NavItem]
     with ClassAttributes[NavItem] {
  
  var active: js.UndefOr[Boolean] = js.native
  
  var brand: js.UndefOr[js.Any] = js.native
  
   // TODO: Add more specific type
  var bsSize: js.UndefOr[Sizes] = js.native
  
  var bsStyle: js.UndefOr[String] = js.native
  
  var componentClass: js.UndefOr[ReactType[_]] = js.native
  
  var defaultNavExpanded: js.UndefOr[Boolean] = js.native
  
  var eventKey: js.UndefOr[js.Any] = js.native
  
  var fixedBottom: js.UndefOr[Boolean] = js.native
  
  var fixedTop: js.UndefOr[Boolean] = js.native
  
  var fluid: js.UndefOr[Boolean] = js.native
  
  var inverse: js.UndefOr[Boolean] = js.native
  
  var linkId: js.UndefOr[String] = js.native
  
  var navExpanded: js.UndefOr[Boolean] = js.native
  
  @JSName("onSelect")
  var onSelect_NavItemProps: js.UndefOr[SelectCallback] = js.native
  
  var onToggle: js.UndefOr[js.Function] = js.native
  
  var staticTop: js.UndefOr[Boolean] = js.native
  
  var toggleButton: js.UndefOr[js.Any] = js.native
  
   // TODO: Add more specific type
  var toggleNavKey: js.UndefOr[String | Double] = js.native
}
object NavItemProps {
  
  @scala.inline
  def apply(): NavItemProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NavItemProps]
  }
  
  @scala.inline
  implicit class NavItemPropsOps[Self <: NavItemProps] (val x: Self) extends AnyVal {
    
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
    def setActive(value: Boolean): Self = this.set("active", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteActive: Self = this.set("active", js.undefined)
    
    @scala.inline
    def setBrand(value: js.Any): Self = this.set("brand", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBrand: Self = this.set("brand", js.undefined)
    
    @scala.inline
    def setBsSize(value: Sizes): Self = this.set("bsSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBsSize: Self = this.set("bsSize", js.undefined)
    
    @scala.inline
    def setBsStyle(value: String): Self = this.set("bsStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBsStyle: Self = this.set("bsStyle", js.undefined)
    
    @scala.inline
    def setComponentClass(value: ReactType[_]): Self = this.set("componentClass", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteComponentClass: Self = this.set("componentClass", js.undefined)
    
    @scala.inline
    def setDefaultNavExpanded(value: Boolean): Self = this.set("defaultNavExpanded", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDefaultNavExpanded: Self = this.set("defaultNavExpanded", js.undefined)
    
    @scala.inline
    def setEventKey(value: js.Any): Self = this.set("eventKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEventKey: Self = this.set("eventKey", js.undefined)
    
    @scala.inline
    def setFixedBottom(value: Boolean): Self = this.set("fixedBottom", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFixedBottom: Self = this.set("fixedBottom", js.undefined)
    
    @scala.inline
    def setFixedTop(value: Boolean): Self = this.set("fixedTop", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFixedTop: Self = this.set("fixedTop", js.undefined)
    
    @scala.inline
    def setFluid(value: Boolean): Self = this.set("fluid", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFluid: Self = this.set("fluid", js.undefined)
    
    @scala.inline
    def setInverse(value: Boolean): Self = this.set("inverse", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInverse: Self = this.set("inverse", js.undefined)
    
    @scala.inline
    def setLinkId(value: String): Self = this.set("linkId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLinkId: Self = this.set("linkId", js.undefined)
    
    @scala.inline
    def setNavExpanded(value: Boolean): Self = this.set("navExpanded", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNavExpanded: Self = this.set("navExpanded", js.undefined)
    
    @scala.inline
    def setOnSelect(value: SelectCallback): Self = this.set("onSelect", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnSelect: Self = this.set("onSelect", js.undefined)
    
    @scala.inline
    def setOnToggle(value: js.Function): Self = this.set("onToggle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnToggle: Self = this.set("onToggle", js.undefined)
    
    @scala.inline
    def setStaticTop(value: Boolean): Self = this.set("staticTop", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStaticTop: Self = this.set("staticTop", js.undefined)
    
    @scala.inline
    def setToggleButton(value: js.Any): Self = this.set("toggleButton", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteToggleButton: Self = this.set("toggleButton", js.undefined)
    
    @scala.inline
    def setToggleNavKey(value: String | Double): Self = this.set("toggleNavKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteToggleNavKey: Self = this.set("toggleNavKey", js.undefined)
  }
}
