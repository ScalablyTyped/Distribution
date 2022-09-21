package typings.slateReact

import typings.react.mod.ComponentType
import typings.react.mod.RefObject
import typings.std.HTMLDivElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object restoreDomMod {
  
  @JSImport("slate-react/dist/components/restore-dom/restore-dom", "RestoreDOM")
  @js.native
  val RestoreDOM: ComponentType[RestoreDOMProps] = js.native
  
  trait RestoreDOMProps extends StObject {
    
    var node: RefObject[HTMLDivElement]
    
    var receivedUserInput: RefObject[Boolean]
  }
  object RestoreDOMProps {
    
    inline def apply(node: RefObject[HTMLDivElement], receivedUserInput: RefObject[Boolean]): RestoreDOMProps = {
      val __obj = js.Dynamic.literal(node = node.asInstanceOf[js.Any], receivedUserInput = receivedUserInput.asInstanceOf[js.Any])
      __obj.asInstanceOf[RestoreDOMProps]
    }
    
    extension [Self <: RestoreDOMProps](x: Self) {
      
      inline def setNode(value: RefObject[HTMLDivElement]): Self = StObject.set(x, "node", value.asInstanceOf[js.Any])
      
      inline def setReceivedUserInput(value: RefObject[Boolean]): Self = StObject.set(x, "receivedUserInput", value.asInstanceOf[js.Any])
    }
  }
}
