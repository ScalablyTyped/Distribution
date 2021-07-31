package typings.reactBootstrap

import typings.react.mod.Component
import typings.react.mod.HTMLProps
import typings.reactBootstrap.mod.Sizes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object navMod {
  
  @JSImport("react-bootstrap/lib/Nav", JSImport.Namespace)
  @js.native
  class ^ ()
    extends Component[NavProps, js.Object, js.Any]
  
  @js.native
  trait Nav
    extends Component[NavProps, js.Object, js.Any]
  
  trait NavProps
    extends StObject
       with HTMLProps[Nav] {
    
    // Optional
    var activeHref: js.UndefOr[String] = js.undefined
    
    var activeKey: js.UndefOr[js.Any] = js.undefined
    
    var bsClass: js.UndefOr[String] = js.undefined
    
    var bsSize: js.UndefOr[Sizes] = js.undefined
    
    var bsStyle: js.UndefOr[String] = js.undefined
    
    var collapsible: js.UndefOr[Boolean] = js.undefined
    
    var eventKey: js.UndefOr[js.Any] = js.undefined
    
    var expanded: js.UndefOr[Boolean] = js.undefined
    
    var justified: js.UndefOr[Boolean] = js.undefined
    
    var navbar: js.UndefOr[Boolean] = js.undefined
    
    var pullRight: js.UndefOr[Boolean] = js.undefined
    
    var right: js.UndefOr[Boolean] = js.undefined
    
    var stacked: js.UndefOr[Boolean] = js.undefined
    
    var ulClassName: js.UndefOr[String] = js.undefined
    
    var ulId: js.UndefOr[String] = js.undefined
  }
  object NavProps {
    
    @scala.inline
    def apply(): NavProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[NavProps]
    }
    
    @scala.inline
    implicit class NavPropsMutableBuilder[Self <: NavProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setActiveHref(value: String): Self = StObject.set(x, "activeHref", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setActiveHrefUndefined: Self = StObject.set(x, "activeHref", js.undefined)
      
      @scala.inline
      def setActiveKey(value: js.Any): Self = StObject.set(x, "activeKey", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setActiveKeyUndefined: Self = StObject.set(x, "activeKey", js.undefined)
      
      @scala.inline
      def setBsClass(value: String): Self = StObject.set(x, "bsClass", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBsClassUndefined: Self = StObject.set(x, "bsClass", js.undefined)
      
      @scala.inline
      def setBsSize(value: Sizes): Self = StObject.set(x, "bsSize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBsSizeUndefined: Self = StObject.set(x, "bsSize", js.undefined)
      
      @scala.inline
      def setBsStyle(value: String): Self = StObject.set(x, "bsStyle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBsStyleUndefined: Self = StObject.set(x, "bsStyle", js.undefined)
      
      @scala.inline
      def setCollapsible(value: Boolean): Self = StObject.set(x, "collapsible", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCollapsibleUndefined: Self = StObject.set(x, "collapsible", js.undefined)
      
      @scala.inline
      def setEventKey(value: js.Any): Self = StObject.set(x, "eventKey", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEventKeyUndefined: Self = StObject.set(x, "eventKey", js.undefined)
      
      @scala.inline
      def setExpanded(value: Boolean): Self = StObject.set(x, "expanded", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExpandedUndefined: Self = StObject.set(x, "expanded", js.undefined)
      
      @scala.inline
      def setJustified(value: Boolean): Self = StObject.set(x, "justified", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setJustifiedUndefined: Self = StObject.set(x, "justified", js.undefined)
      
      @scala.inline
      def setNavbar(value: Boolean): Self = StObject.set(x, "navbar", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNavbarUndefined: Self = StObject.set(x, "navbar", js.undefined)
      
      @scala.inline
      def setPullRight(value: Boolean): Self = StObject.set(x, "pullRight", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPullRightUndefined: Self = StObject.set(x, "pullRight", js.undefined)
      
      @scala.inline
      def setRight(value: Boolean): Self = StObject.set(x, "right", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRightUndefined: Self = StObject.set(x, "right", js.undefined)
      
      @scala.inline
      def setStacked(value: Boolean): Self = StObject.set(x, "stacked", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStackedUndefined: Self = StObject.set(x, "stacked", js.undefined)
      
      @scala.inline
      def setUlClassName(value: String): Self = StObject.set(x, "ulClassName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUlClassNameUndefined: Self = StObject.set(x, "ulClassName", js.undefined)
      
      @scala.inline
      def setUlId(value: String): Self = StObject.set(x, "ulId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUlIdUndefined: Self = StObject.set(x, "ulId", js.undefined)
    }
  }
}
