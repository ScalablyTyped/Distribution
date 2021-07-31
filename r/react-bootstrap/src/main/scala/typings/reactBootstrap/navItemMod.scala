package typings.reactBootstrap

import typings.react.mod.Component
import typings.react.mod.HTMLProps
import typings.react.mod.ReactType
import typings.reactBootstrap.mod.SelectCallback
import typings.reactBootstrap.mod.Sizes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object navItemMod {
  
  @JSImport("react-bootstrap/lib/NavItem", JSImport.Namespace)
  @js.native
  class ^ ()
    extends Component[NavItemProps, js.Object, js.Any]
  
  @js.native
  trait NavItem
    extends Component[NavItemProps, js.Object, js.Any]
  
  trait NavItemProps
    extends StObject
       with HTMLProps[NavItem] {
    
    var active: js.UndefOr[Boolean] = js.undefined
    
    var brand: js.UndefOr[js.Any] = js.undefined
    
    // TODO: Add more specific type
    var bsSize: js.UndefOr[Sizes] = js.undefined
    
    var bsStyle: js.UndefOr[String] = js.undefined
    
    var componentClass: js.UndefOr[ReactType[js.Any]] = js.undefined
    
    var defaultNavExpanded: js.UndefOr[Boolean] = js.undefined
    
    var eventKey: js.UndefOr[js.Any] = js.undefined
    
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
    
    var toggleButton: js.UndefOr[js.Any] = js.undefined
    
    // TODO: Add more specific type
    var toggleNavKey: js.UndefOr[String | Double] = js.undefined
  }
  object NavItemProps {
    
    @scala.inline
    def apply(): NavItemProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[NavItemProps]
    }
    
    @scala.inline
    implicit class NavItemPropsMutableBuilder[Self <: NavItemProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setActive(value: Boolean): Self = StObject.set(x, "active", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setActiveUndefined: Self = StObject.set(x, "active", js.undefined)
      
      @scala.inline
      def setBrand(value: js.Any): Self = StObject.set(x, "brand", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBrandUndefined: Self = StObject.set(x, "brand", js.undefined)
      
      @scala.inline
      def setBsSize(value: Sizes): Self = StObject.set(x, "bsSize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBsSizeUndefined: Self = StObject.set(x, "bsSize", js.undefined)
      
      @scala.inline
      def setBsStyle(value: String): Self = StObject.set(x, "bsStyle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBsStyleUndefined: Self = StObject.set(x, "bsStyle", js.undefined)
      
      @scala.inline
      def setComponentClass(value: ReactType[js.Any]): Self = StObject.set(x, "componentClass", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setComponentClassUndefined: Self = StObject.set(x, "componentClass", js.undefined)
      
      @scala.inline
      def setDefaultNavExpanded(value: Boolean): Self = StObject.set(x, "defaultNavExpanded", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDefaultNavExpandedUndefined: Self = StObject.set(x, "defaultNavExpanded", js.undefined)
      
      @scala.inline
      def setEventKey(value: js.Any): Self = StObject.set(x, "eventKey", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEventKeyUndefined: Self = StObject.set(x, "eventKey", js.undefined)
      
      @scala.inline
      def setFixedBottom(value: Boolean): Self = StObject.set(x, "fixedBottom", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFixedBottomUndefined: Self = StObject.set(x, "fixedBottom", js.undefined)
      
      @scala.inline
      def setFixedTop(value: Boolean): Self = StObject.set(x, "fixedTop", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFixedTopUndefined: Self = StObject.set(x, "fixedTop", js.undefined)
      
      @scala.inline
      def setFluid(value: Boolean): Self = StObject.set(x, "fluid", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFluidUndefined: Self = StObject.set(x, "fluid", js.undefined)
      
      @scala.inline
      def setInverse(value: Boolean): Self = StObject.set(x, "inverse", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInverseUndefined: Self = StObject.set(x, "inverse", js.undefined)
      
      @scala.inline
      def setLinkId(value: String): Self = StObject.set(x, "linkId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLinkIdUndefined: Self = StObject.set(x, "linkId", js.undefined)
      
      @scala.inline
      def setNavExpanded(value: Boolean): Self = StObject.set(x, "navExpanded", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNavExpandedUndefined: Self = StObject.set(x, "navExpanded", js.undefined)
      
      @scala.inline
      def setOnSelect(value: SelectCallback): Self = StObject.set(x, "onSelect", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnSelectUndefined: Self = StObject.set(x, "onSelect", js.undefined)
      
      @scala.inline
      def setOnToggle(value: js.Function): Self = StObject.set(x, "onToggle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnToggleUndefined: Self = StObject.set(x, "onToggle", js.undefined)
      
      @scala.inline
      def setStaticTop(value: Boolean): Self = StObject.set(x, "staticTop", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStaticTopUndefined: Self = StObject.set(x, "staticTop", js.undefined)
      
      @scala.inline
      def setToggleButton(value: js.Any): Self = StObject.set(x, "toggleButton", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setToggleButtonUndefined: Self = StObject.set(x, "toggleButton", js.undefined)
      
      @scala.inline
      def setToggleNavKey(value: String | Double): Self = StObject.set(x, "toggleNavKey", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setToggleNavKeyUndefined: Self = StObject.set(x, "toggleNavKey", js.undefined)
    }
  }
}
