package typings.reactBootstrap

import typings.react.mod.Component
import typings.react.mod.HTMLProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libNavbarHeaderMod {
  
  @JSImport("react-bootstrap/lib/NavbarHeader", JSImport.Namespace)
  @js.native
  open class ^ ()
    extends Component[NavbarHeaderProps, js.Object, Any]
  
  type NavbarHeader = Component[NavbarHeaderProps, js.Object, Any]
  
  /** 
  NOTE: Rewritten from type alias:
  {{{
  type NavbarHeaderProps = react.react.HTMLProps<react-bootstrap.react-bootstrap/lib/NavbarHeader.NavbarHeader>
  }}}
  to avoid circular code involving: 
  - react-bootstrap.react-bootstrap/lib/NavbarHeader.NavbarHeader
  - react-bootstrap.react-bootstrap/lib/NavbarHeader.NavbarHeaderProps
  */
  trait NavbarHeaderProps
    extends StObject
       with HTMLProps[NavbarHeader]
  object NavbarHeaderProps {
    
    inline def apply(): NavbarHeaderProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[NavbarHeaderProps]
    }
  }
}
