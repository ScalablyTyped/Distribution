package typings.reactBootstrap

import typings.react.mod.Component
import typings.react.mod.HTMLProps
import typings.react.mod.ReactNode
import typings.reactBootstrap.libDropdownMod.DropdownBaseProps
import typings.reactBootstrap.mod.Omit
import typings.reactBootstrap.reactBootstrapStrings.title
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libNavDropdownMod {
  
  @JSImport("react-bootstrap/lib/NavDropdown", JSImport.Namespace)
  @js.native
  open class ^ ()
    extends Component[NavDropdownProps, js.Object, Any]
  
  type NavDropdown = Component[NavDropdownProps, js.Object, Any]
  
  trait NavDropdownBaseProps
    extends StObject
       with DropdownBaseProps {
    
    var active: js.UndefOr[Boolean] = js.undefined
    
    var eventKey: js.UndefOr[Any] = js.undefined
    
    var noCaret: js.UndefOr[Boolean] = js.undefined
    
    var title: ReactNode
  }
  object NavDropdownBaseProps {
    
    inline def apply(id: String): NavDropdownBaseProps = {
      val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
      __obj.asInstanceOf[NavDropdownBaseProps]
    }
    
    extension [Self <: NavDropdownBaseProps](x: Self) {
      
      inline def setActive(value: Boolean): Self = StObject.set(x, "active", value.asInstanceOf[js.Any])
      
      inline def setActiveUndefined: Self = StObject.set(x, "active", js.undefined)
      
      inline def setEventKey(value: Any): Self = StObject.set(x, "eventKey", value.asInstanceOf[js.Any])
      
      inline def setEventKeyUndefined: Self = StObject.set(x, "eventKey", js.undefined)
      
      inline def setNoCaret(value: Boolean): Self = StObject.set(x, "noCaret", value.asInstanceOf[js.Any])
      
      inline def setNoCaretUndefined: Self = StObject.set(x, "noCaret", js.undefined)
      
      inline def setTitle(value: ReactNode): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    }
  }
  
  /** 
  NOTE: Rewritten from type alias:
  {{{
  type NavDropdownProps = react-bootstrap.react-bootstrap/lib/NavDropdown.NavDropdownBaseProps & react-bootstrap.react-bootstrap.Omit<react.react.HTMLProps<react-bootstrap.react-bootstrap/lib/NavDropdown.NavDropdown>, 'title'>
  }}}
  to avoid circular code involving: 
  - react-bootstrap.react-bootstrap/lib/NavDropdown.NavDropdown
  - react-bootstrap.react-bootstrap/lib/NavDropdown.NavDropdownProps
  */
  type NavDropdownProps = NavDropdownBaseProps & (Omit[HTMLProps[Any], title])
}
