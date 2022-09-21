package typings.reactBootstrap

import typings.react.mod.Component
import typings.react.mod.HTMLProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object navbarHeaderMod {
  
  @JSImport("react-bootstrap/lib/NavbarHeader", JSImport.Namespace)
  @js.native
  open class ^ ()
    extends Component[NavbarHeaderProps, js.Object, Any]
  
  type NavbarHeader = Component[NavbarHeaderProps, js.Object, Any]
  
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
