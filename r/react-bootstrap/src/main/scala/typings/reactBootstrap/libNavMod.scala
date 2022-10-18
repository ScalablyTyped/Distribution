package typings.reactBootstrap

import typings.react.mod.Component
import typings.react.mod.HTMLProps
import typings.reactBootstrap.mod.Sizes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libNavMod {
  
  @JSImport("react-bootstrap/lib/Nav", JSImport.Namespace)
  @js.native
  open class ^ ()
    extends Component[NavProps, js.Object, Any]
  
  type Nav = Component[NavProps, js.Object, Any]
  
  trait NavProps
    extends StObject
       with HTMLProps[Nav] {
    
    // Optional
    var activeHref: js.UndefOr[String] = js.undefined
    
    var activeKey: js.UndefOr[Any] = js.undefined
    
    var bsClass: js.UndefOr[String] = js.undefined
    
    var bsSize: js.UndefOr[Sizes] = js.undefined
    
    var bsStyle: js.UndefOr[String] = js.undefined
    
    var collapsible: js.UndefOr[Boolean] = js.undefined
    
    var eventKey: js.UndefOr[Any] = js.undefined
    
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
    
    inline def apply(): NavProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[NavProps]
    }
    
    extension [Self <: NavProps](x: Self) {
      
      inline def setActiveHref(value: String): Self = StObject.set(x, "activeHref", value.asInstanceOf[js.Any])
      
      inline def setActiveHrefUndefined: Self = StObject.set(x, "activeHref", js.undefined)
      
      inline def setActiveKey(value: Any): Self = StObject.set(x, "activeKey", value.asInstanceOf[js.Any])
      
      inline def setActiveKeyUndefined: Self = StObject.set(x, "activeKey", js.undefined)
      
      inline def setBsClass(value: String): Self = StObject.set(x, "bsClass", value.asInstanceOf[js.Any])
      
      inline def setBsClassUndefined: Self = StObject.set(x, "bsClass", js.undefined)
      
      inline def setBsSize(value: Sizes): Self = StObject.set(x, "bsSize", value.asInstanceOf[js.Any])
      
      inline def setBsSizeUndefined: Self = StObject.set(x, "bsSize", js.undefined)
      
      inline def setBsStyle(value: String): Self = StObject.set(x, "bsStyle", value.asInstanceOf[js.Any])
      
      inline def setBsStyleUndefined: Self = StObject.set(x, "bsStyle", js.undefined)
      
      inline def setCollapsible(value: Boolean): Self = StObject.set(x, "collapsible", value.asInstanceOf[js.Any])
      
      inline def setCollapsibleUndefined: Self = StObject.set(x, "collapsible", js.undefined)
      
      inline def setEventKey(value: Any): Self = StObject.set(x, "eventKey", value.asInstanceOf[js.Any])
      
      inline def setEventKeyUndefined: Self = StObject.set(x, "eventKey", js.undefined)
      
      inline def setExpanded(value: Boolean): Self = StObject.set(x, "expanded", value.asInstanceOf[js.Any])
      
      inline def setExpandedUndefined: Self = StObject.set(x, "expanded", js.undefined)
      
      inline def setJustified(value: Boolean): Self = StObject.set(x, "justified", value.asInstanceOf[js.Any])
      
      inline def setJustifiedUndefined: Self = StObject.set(x, "justified", js.undefined)
      
      inline def setNavbar(value: Boolean): Self = StObject.set(x, "navbar", value.asInstanceOf[js.Any])
      
      inline def setNavbarUndefined: Self = StObject.set(x, "navbar", js.undefined)
      
      inline def setPullRight(value: Boolean): Self = StObject.set(x, "pullRight", value.asInstanceOf[js.Any])
      
      inline def setPullRightUndefined: Self = StObject.set(x, "pullRight", js.undefined)
      
      inline def setRight(value: Boolean): Self = StObject.set(x, "right", value.asInstanceOf[js.Any])
      
      inline def setRightUndefined: Self = StObject.set(x, "right", js.undefined)
      
      inline def setStacked(value: Boolean): Self = StObject.set(x, "stacked", value.asInstanceOf[js.Any])
      
      inline def setStackedUndefined: Self = StObject.set(x, "stacked", js.undefined)
      
      inline def setUlClassName(value: String): Self = StObject.set(x, "ulClassName", value.asInstanceOf[js.Any])
      
      inline def setUlClassNameUndefined: Self = StObject.set(x, "ulClassName", js.undefined)
      
      inline def setUlId(value: String): Self = StObject.set(x, "ulId", value.asInstanceOf[js.Any])
      
      inline def setUlIdUndefined: Self = StObject.set(x, "ulId", js.undefined)
    }
  }
}
