package typings.semanticUiReactEventStack

import typings.semanticUiReactEventStack.typesMod.InputEventListener
import typings.semanticUiReactEventStack.typesMod.Options
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@semantic-ui-react/event-stack/lib/types/lib/EventStack", JSImport.Namespace)
@js.native
object eventStackMod extends js.Object {
  
  @js.native
  trait EventStack extends js.Object {
    
    var getTarget: js.Any = js.native
    
    var removeTarget: js.Any = js.native
    
    def sub(eventName: String, eventHandlers: InputEventListener): Unit = js.native
    def sub(eventName: String, eventHandlers: InputEventListener, options: Options): Unit = js.native
    
    val targets: js.Any = js.native
    
    def unsub(eventName: String, eventHandlers: InputEventListener): Unit = js.native
    def unsub(eventName: String, eventHandlers: InputEventListener, options: Options): Unit = js.native
  }
  
  @js.native
  class default () extends EventStack
}
