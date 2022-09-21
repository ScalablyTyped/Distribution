package typings.reactBootstrap

import typings.react.mod.Component
import typings.react.mod.ElementType
import typings.react.mod.HTMLProps
import typings.react.mod.MouseEvent
import typings.react.mod.MouseEventHandler
import typings.react.mod.NativeMouseEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object safeAnchorMod {
  
  @JSImport("react-bootstrap/lib/SafeAnchor", JSImport.Namespace)
  @js.native
  open class ^ ()
    extends Component[SafeAnchorProps, js.Object, Any]
  
  type SafeAnchor = Component[SafeAnchorProps, js.Object, Any]
  
  trait SafeAnchorProps
    extends StObject
       with HTMLProps[SafeAnchor] {
    
    var componentClass: js.UndefOr[ElementType[Any]] = js.undefined
    
    @JSName("onClick")
    var onClick_SafeAnchorProps: js.UndefOr[MouseEventHandler[js.Object]] = js.undefined
    
    @JSName("role")
    var role_SafeAnchorProps: js.UndefOr[String] = js.undefined
  }
  object SafeAnchorProps {
    
    inline def apply(): SafeAnchorProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SafeAnchorProps]
    }
    
    extension [Self <: SafeAnchorProps](x: Self) {
      
      inline def setComponentClass(value: ElementType[Any]): Self = StObject.set(x, "componentClass", value.asInstanceOf[js.Any])
      
      inline def setComponentClassUndefined: Self = StObject.set(x, "componentClass", js.undefined)
      
      inline def setOnClick(value: MouseEvent[js.Object, NativeMouseEvent] => Unit): Self = StObject.set(x, "onClick", js.Any.fromFunction1(value))
      
      inline def setOnClickUndefined: Self = StObject.set(x, "onClick", js.undefined)
      
      inline def setRole(value: String): Self = StObject.set(x, "role", value.asInstanceOf[js.Any])
      
      inline def setRoleUndefined: Self = StObject.set(x, "role", js.undefined)
    }
  }
}
