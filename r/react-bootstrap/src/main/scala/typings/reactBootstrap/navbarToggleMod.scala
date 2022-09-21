package typings.reactBootstrap

import typings.react.mod.Component
import typings.react.mod.HTMLProps
import typings.react.mod.MouseEvent
import typings.react.mod.MouseEventHandler
import typings.react.mod.NativeMouseEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object navbarToggleMod {
  
  @JSImport("react-bootstrap/lib/NavbarToggle", JSImport.Namespace)
  @js.native
  open class ^ ()
    extends Component[NavbarToggleProps, js.Object, Any]
  
  type NavbarToggle = Component[NavbarToggleProps, js.Object, Any]
  
  trait NavbarToggleProps
    extends StObject
       with HTMLProps[NavbarToggle] {
    
    @JSName("onClick")
    var onClick_NavbarToggleProps: js.UndefOr[MouseEventHandler[Any]] = js.undefined
  }
  object NavbarToggleProps {
    
    inline def apply(): NavbarToggleProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[NavbarToggleProps]
    }
    
    extension [Self <: NavbarToggleProps](x: Self) {
      
      inline def setOnClick(value: MouseEvent[Any, NativeMouseEvent] => Unit): Self = StObject.set(x, "onClick", js.Any.fromFunction1(value))
      
      inline def setOnClickUndefined: Self = StObject.set(x, "onClick", js.undefined)
    }
  }
}
