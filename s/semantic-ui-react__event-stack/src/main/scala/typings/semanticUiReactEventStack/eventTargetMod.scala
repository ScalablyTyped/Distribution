package typings.semanticUiReactEventStack

import typings.semanticUiReactEventStack.typesMod.EventListeners
import typings.semanticUiReactEventStack.typesMod.TargetElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object eventTargetMod {
  
  @JSImport("@semantic-ui-react/event-stack/lib/types/lib/EventTarget", JSImport.Default)
  @js.native
  class default protected () extends EventTarget {
    def this(target: TargetElement) = this()
  }
  
  @js.native
  trait EventTarget extends StObject {
    
    def addHandlers(poolName: String, eventType: String, eventHandlers: EventListeners): Unit = js.native
    
    var addTargetHandler: js.Any = js.native
    
    var createEmitter: js.Any = js.native
    
    val handlers: js.Any = js.native
    
    def hasHandlers(): Boolean = js.native
    
    val pools: js.Any = js.native
    
    def removeHandlers(poolName: String, eventType: String, eventHandlers: EventListeners): Unit = js.native
    
    var removeTargetHandler: js.Any = js.native
    
    val target: js.Any = js.native
  }
  object EventTarget {
    
    @scala.inline
    def apply(
      addHandlers: (String, String, EventListeners) => Unit,
      addTargetHandler: js.Any,
      createEmitter: js.Any,
      handlers: js.Any,
      hasHandlers: () => Boolean,
      pools: js.Any,
      removeHandlers: (String, String, EventListeners) => Unit,
      removeTargetHandler: js.Any,
      target: js.Any
    ): EventTarget = {
      val __obj = js.Dynamic.literal(addHandlers = js.Any.fromFunction3(addHandlers), addTargetHandler = addTargetHandler.asInstanceOf[js.Any], createEmitter = createEmitter.asInstanceOf[js.Any], handlers = handlers.asInstanceOf[js.Any], hasHandlers = js.Any.fromFunction0(hasHandlers), pools = pools.asInstanceOf[js.Any], removeHandlers = js.Any.fromFunction3(removeHandlers), removeTargetHandler = removeTargetHandler.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any])
      __obj.asInstanceOf[EventTarget]
    }
    
    @scala.inline
    implicit class EventTargetMutableBuilder[Self <: EventTarget] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAddHandlers(value: (String, String, EventListeners) => Unit): Self = StObject.set(x, "addHandlers", js.Any.fromFunction3(value))
      
      @scala.inline
      def setAddTargetHandler(value: js.Any): Self = StObject.set(x, "addTargetHandler", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCreateEmitter(value: js.Any): Self = StObject.set(x, "createEmitter", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHandlers(value: js.Any): Self = StObject.set(x, "handlers", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHasHandlers(value: () => Boolean): Self = StObject.set(x, "hasHandlers", js.Any.fromFunction0(value))
      
      @scala.inline
      def setPools(value: js.Any): Self = StObject.set(x, "pools", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRemoveHandlers(value: (String, String, EventListeners) => Unit): Self = StObject.set(x, "removeHandlers", js.Any.fromFunction3(value))
      
      @scala.inline
      def setRemoveTargetHandler(value: js.Any): Self = StObject.set(x, "removeTargetHandler", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTarget(value: js.Any): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
    }
  }
}
