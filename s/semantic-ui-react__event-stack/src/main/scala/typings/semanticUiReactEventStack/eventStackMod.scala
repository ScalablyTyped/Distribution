package typings.semanticUiReactEventStack

import typings.semanticUiReactEventStack.typesMod.InputEventListener
import typings.semanticUiReactEventStack.typesMod.Options
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object eventStackMod {
  
  @JSImport("@semantic-ui-react/event-stack/lib/types/lib/EventStack", JSImport.Default)
  @js.native
  open class default ()
    extends StObject
       with EventStack
  
  @js.native
  trait EventStack extends StObject {
    
    /* private */ var getTarget: Any = js.native
    
    /* private */ var removeTarget: Any = js.native
    
    def sub(eventName: String, eventHandlers: InputEventListener): Unit = js.native
    def sub(eventName: String, eventHandlers: InputEventListener, options: Options): Unit = js.native
    
    /* private */ val targets: Any = js.native
    
    def unsub(eventName: String, eventHandlers: InputEventListener): Unit = js.native
    def unsub(eventName: String, eventHandlers: InputEventListener, options: Options): Unit = js.native
  }
}
