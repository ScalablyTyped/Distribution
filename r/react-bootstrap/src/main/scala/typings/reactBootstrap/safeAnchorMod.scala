package typings.reactBootstrap

import typings.react.mod.Component
import typings.react.mod.HTMLProps
import typings.react.mod.MouseEvent
import typings.react.mod.MouseEventHandler
import typings.react.mod.NativeMouseEvent
import typings.react.mod.ReactType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object safeAnchorMod {
  
  @JSImport("react-bootstrap/lib/SafeAnchor", JSImport.Namespace)
  @js.native
  class ^ ()
    extends Component[SafeAnchorProps, js.Object, js.Any]
  
  @js.native
  trait SafeAnchor
    extends Component[SafeAnchorProps, js.Object, js.Any]
  
  trait SafeAnchorProps
    extends StObject
       with HTMLProps[SafeAnchor] {
    
    var componentClass: js.UndefOr[ReactType[js.Any]] = js.undefined
    
    @JSName("onClick")
    var onClick_SafeAnchorProps: js.UndefOr[MouseEventHandler[js.Object]] = js.undefined
  }
  object SafeAnchorProps {
    
    inline def apply(): SafeAnchorProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SafeAnchorProps]
    }
    
    extension [Self <: SafeAnchorProps](x: Self) {
      
      inline def setComponentClass(value: ReactType[js.Any]): Self = StObject.set(x, "componentClass", value.asInstanceOf[js.Any])
      
      inline def setComponentClassUndefined: Self = StObject.set(x, "componentClass", js.undefined)
      
      inline def setOnClick(value: MouseEvent[js.Object, NativeMouseEvent] => Unit): Self = StObject.set(x, "onClick", js.Any.fromFunction1(value))
      
      inline def setOnClickUndefined: Self = StObject.set(x, "onClick", js.undefined)
    }
  }
}
