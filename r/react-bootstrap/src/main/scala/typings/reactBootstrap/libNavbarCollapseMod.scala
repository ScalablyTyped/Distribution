package typings.reactBootstrap

import typings.react.mod.Component
import typings.react.mod.HTMLProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libNavbarCollapseMod {
  
  @JSImport("react-bootstrap/lib/NavbarCollapse", JSImport.Namespace)
  @js.native
  open class ^ ()
    extends Component[NavbarCollapseProps, js.Object, Any]
  
  type NavbarCollapse = Component[NavbarCollapseProps, js.Object, Any]
  
  trait NavbarCollapseProps
    extends StObject
       with HTMLProps[NavbarCollapse]
  object NavbarCollapseProps {
    
    inline def apply(): NavbarCollapseProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[NavbarCollapseProps]
    }
  }
}
