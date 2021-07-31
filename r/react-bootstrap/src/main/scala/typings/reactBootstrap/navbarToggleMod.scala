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
  class ^ ()
    extends Component[NavbarToggleProps, js.Object, js.Any]
  
  @js.native
  trait NavbarToggle
    extends Component[NavbarToggleProps, js.Object, js.Any]
  
  trait NavbarToggleProps
    extends StObject
       with HTMLProps[NavbarToggle] {
    
    @JSName("onClick")
    var onClick_NavbarToggleProps: js.UndefOr[MouseEventHandler[js.Any]] = js.undefined
  }
  object NavbarToggleProps {
    
    @scala.inline
    def apply(): NavbarToggleProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[NavbarToggleProps]
    }
    
    @scala.inline
    implicit class NavbarTogglePropsMutableBuilder[Self <: NavbarToggleProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setOnClick(value: MouseEvent[js.Any, NativeMouseEvent] => Unit): Self = StObject.set(x, "onClick", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnClickUndefined: Self = StObject.set(x, "onClick", js.undefined)
    }
  }
}
