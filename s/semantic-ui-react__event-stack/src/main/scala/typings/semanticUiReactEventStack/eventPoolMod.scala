package typings.semanticUiReactEventStack

import typings.semanticUiReactEventStack.typesMod.CallableEventListener
import typings.semanticUiReactEventStack.typesMod.EventListeners
import typings.std.Event
import typings.std.Map
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object eventPoolMod {
  
  @JSImport("@semantic-ui-react/event-stack/lib/types/lib/EventPool", JSImport.Default)
  @js.native
  class default protected () extends EventPool {
    def this(poolName: String, handlerSets: Map[String, typings.semanticUiReactEventStack.eventSetMod.default]) = this()
  }
  /* static members */
  object default {
    
    @JSImport("@semantic-ui-react/event-stack/lib/types/lib/EventPool", "default.createByType")
    @js.native
    def createByType(poolName: String, eventType: String, eventHandlers: js.Array[CallableEventListener]): EventPool = js.native
  }
  
  @js.native
  trait EventPool extends StObject {
    
    def addHandlers(eventType: String, eventHandlers: EventListeners): EventPool = js.native
    
    def dispatchEvent(eventType: String, event: Event): Unit = js.native
    
    val handlerSets: js.Any = js.native
    
    def hasHandlers(): Boolean = js.native
    def hasHandlers(eventType: String): Boolean = js.native
    
    val poolName: js.Any = js.native
    
    def removeHandlers(eventType: String, eventHandlers: EventListeners): EventPool = js.native
  }
}
