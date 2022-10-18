package typings.reactBootstrap

import typings.react.mod.Component
import typings.react.mod.ElementType
import typings.react.mod.HTMLProps
import typings.reactBootstrap.mod.SelectCallback
import typings.reactBootstrap.mod.Sizes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libNavItemMod {
  
  @JSImport("react-bootstrap/lib/NavItem", JSImport.Namespace)
  @js.native
  open class ^ ()
    extends Component[NavItemProps, js.Object, Any]
  
  type NavItem = Component[NavItemProps, js.Object, Any]
  
  trait NavItemProps
    extends StObject
       with HTMLProps[NavItem] {
    
    var active: js.UndefOr[Boolean] = js.undefined
    
    var brand: js.UndefOr[Any] = js.undefined
    
    // TODO: Add more specific type
    var bsSize: js.UndefOr[Sizes] = js.undefined
    
    var bsStyle: js.UndefOr[String] = js.undefined
    
    var componentClass: js.UndefOr[ElementType[Any]] = js.undefined
    
    var defaultNavExpanded: js.UndefOr[Boolean] = js.undefined
    
    var eventKey: js.UndefOr[Any] = js.undefined
    
    var fixedBottom: js.UndefOr[Boolean] = js.undefined
    
    var fixedTop: js.UndefOr[Boolean] = js.undefined
    
    var fluid: js.UndefOr[Boolean] = js.undefined
    
    var inverse: js.UndefOr[Boolean] = js.undefined
    
    var linkId: js.UndefOr[String] = js.undefined
    
    var navExpanded: js.UndefOr[Boolean] = js.undefined
    
    @JSName("onSelect")
    var onSelect_NavItemProps: js.UndefOr[SelectCallback] = js.undefined
    
    var onToggle: js.UndefOr[js.Function] = js.undefined
    
    var staticTop: js.UndefOr[Boolean] = js.undefined
    
    var toggleButton: js.UndefOr[Any] = js.undefined
    
    // TODO: Add more specific type
    var toggleNavKey: js.UndefOr[String | Double] = js.undefined
  }
  object NavItemProps {
    
    inline def apply(): NavItemProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[NavItemProps]
    }
    
    extension [Self <: NavItemProps](x: Self) {
      
      inline def setActive(value: Boolean): Self = StObject.set(x, "active", value.asInstanceOf[js.Any])
      
      inline def setActiveUndefined: Self = StObject.set(x, "active", js.undefined)
      
      inline def setBrand(value: Any): Self = StObject.set(x, "brand", value.asInstanceOf[js.Any])
      
      inline def setBrandUndefined: Self = StObject.set(x, "brand", js.undefined)
      
      inline def setBsSize(value: Sizes): Self = StObject.set(x, "bsSize", value.asInstanceOf[js.Any])
      
      inline def setBsSizeUndefined: Self = StObject.set(x, "bsSize", js.undefined)
      
      inline def setBsStyle(value: String): Self = StObject.set(x, "bsStyle", value.asInstanceOf[js.Any])
      
      inline def setBsStyleUndefined: Self = StObject.set(x, "bsStyle", js.undefined)
      
      inline def setComponentClass(value: ElementType[Any]): Self = StObject.set(x, "componentClass", value.asInstanceOf[js.Any])
      
      inline def setComponentClassUndefined: Self = StObject.set(x, "componentClass", js.undefined)
      
      inline def setDefaultNavExpanded(value: Boolean): Self = StObject.set(x, "defaultNavExpanded", value.asInstanceOf[js.Any])
      
      inline def setDefaultNavExpandedUndefined: Self = StObject.set(x, "defaultNavExpanded", js.undefined)
      
      inline def setEventKey(value: Any): Self = StObject.set(x, "eventKey", value.asInstanceOf[js.Any])
      
      inline def setEventKeyUndefined: Self = StObject.set(x, "eventKey", js.undefined)
      
      inline def setFixedBottom(value: Boolean): Self = StObject.set(x, "fixedBottom", value.asInstanceOf[js.Any])
      
      inline def setFixedBottomUndefined: Self = StObject.set(x, "fixedBottom", js.undefined)
      
      inline def setFixedTop(value: Boolean): Self = StObject.set(x, "fixedTop", value.asInstanceOf[js.Any])
      
      inline def setFixedTopUndefined: Self = StObject.set(x, "fixedTop", js.undefined)
      
      inline def setFluid(value: Boolean): Self = StObject.set(x, "fluid", value.asInstanceOf[js.Any])
      
      inline def setFluidUndefined: Self = StObject.set(x, "fluid", js.undefined)
      
      inline def setInverse(value: Boolean): Self = StObject.set(x, "inverse", value.asInstanceOf[js.Any])
      
      inline def setInverseUndefined: Self = StObject.set(x, "inverse", js.undefined)
      
      inline def setLinkId(value: String): Self = StObject.set(x, "linkId", value.asInstanceOf[js.Any])
      
      inline def setLinkIdUndefined: Self = StObject.set(x, "linkId", js.undefined)
      
      inline def setNavExpanded(value: Boolean): Self = StObject.set(x, "navExpanded", value.asInstanceOf[js.Any])
      
      inline def setNavExpandedUndefined: Self = StObject.set(x, "navExpanded", js.undefined)
      
      inline def setOnSelect(value: SelectCallback): Self = StObject.set(x, "onSelect", value.asInstanceOf[js.Any])
      
      inline def setOnSelectUndefined: Self = StObject.set(x, "onSelect", js.undefined)
      
      inline def setOnToggle(value: js.Function): Self = StObject.set(x, "onToggle", value.asInstanceOf[js.Any])
      
      inline def setOnToggleUndefined: Self = StObject.set(x, "onToggle", js.undefined)
      
      inline def setStaticTop(value: Boolean): Self = StObject.set(x, "staticTop", value.asInstanceOf[js.Any])
      
      inline def setStaticTopUndefined: Self = StObject.set(x, "staticTop", js.undefined)
      
      inline def setToggleButton(value: Any): Self = StObject.set(x, "toggleButton", value.asInstanceOf[js.Any])
      
      inline def setToggleButtonUndefined: Self = StObject.set(x, "toggleButton", js.undefined)
      
      inline def setToggleNavKey(value: String | Double): Self = StObject.set(x, "toggleNavKey", value.asInstanceOf[js.Any])
      
      inline def setToggleNavKeyUndefined: Self = StObject.set(x, "toggleNavKey", js.undefined)
    }
  }
}
