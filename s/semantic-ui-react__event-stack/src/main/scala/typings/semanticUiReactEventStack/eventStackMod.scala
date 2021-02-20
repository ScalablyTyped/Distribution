package typings.semanticUiReactEventStack

import typings.semanticUiReactEventStack.typesMod.InputEventListener
import typings.semanticUiReactEventStack.typesMod.Options
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object eventStackMod {
  
  @JSImport("@semantic-ui-react/event-stack/lib/types/lib/EventStack", JSImport.Default)
  @js.native
  class default () extends EventStack
  
  @js.native
  trait EventStack extends StObject {
    
    var getTarget: js.Any = js.native
    
    var removeTarget: js.Any = js.native
    
    def sub(eventName: String, eventHandlers: InputEventListener): Unit = js.native
    def sub(eventName: String, eventHandlers: InputEventListener, options: Options): Unit = js.native
    
    val targets: js.Any = js.native
    
    def unsub(eventName: String, eventHandlers: InputEventListener): Unit = js.native
    def unsub(eventName: String, eventHandlers: InputEventListener, options: Options): Unit = js.native
  }
}
