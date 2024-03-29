package typings.reactBootstrap

import typings.react.mod.Component
import typings.react.mod.HTMLProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libNavbarBrandMod {
  
  @JSImport("react-bootstrap/lib/NavbarBrand", JSImport.Namespace)
  @js.native
  open class ^ ()
    extends Component[NavbarBrandProps, js.Object, Any]
  
  type NavbarBrand = Component[NavbarBrandProps, js.Object, Any]
  
  /** 
  NOTE: Rewritten from type alias:
  {{{
  type NavbarBrandProps = react.react.HTMLProps<react-bootstrap.react-bootstrap/lib/NavbarBrand.NavbarBrand>
  }}}
  to avoid circular code involving: 
  - react-bootstrap.react-bootstrap/lib/NavbarBrand.NavbarBrand
  - react-bootstrap.react-bootstrap/lib/NavbarBrand.NavbarBrandProps
  */
  trait NavbarBrandProps
    extends StObject
       with HTMLProps[NavbarBrand]
  object NavbarBrandProps {
    
    inline def apply(): NavbarBrandProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[NavbarBrandProps]
    }
  }
}
