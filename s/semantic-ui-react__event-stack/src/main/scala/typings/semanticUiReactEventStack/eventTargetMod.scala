package typings.semanticUiReactEventStack

import typings.semanticUiReactEventStack.typesMod.EventListeners
import typings.semanticUiReactEventStack.typesMod.TargetElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object eventTargetMod {
  
  @JSImport("@semantic-ui-react/event-stack/lib/types/lib/EventTarget", JSImport.Default)
  @js.native
  class default protected ()
    extends StObject
       with EventTarget {
    def this(target: TargetElement) = this()
    
    /* CompleteClass */
    override def addHandlers(poolName: String, eventType: String, eventHandlers: EventListeners): Unit = js.native
    
    /* private */ /* CompleteClass */
    var addTargetHandler: js.Any = js.native
    
    /* private */ /* CompleteClass */
    var createEmitter: js.Any = js.native
    
    /* private */ /* CompleteClass */
    override val handlers: js.Any = js.native
    
    /* CompleteClass */
    override def hasHandlers(): Boolean = js.native
    
    /* private */ /* CompleteClass */
    override val pools: js.Any = js.native
    
    /* CompleteClass */
    override def removeHandlers(poolName: String, eventType: String, eventHandlers: EventListeners): Unit = js.native
    
    /* private */ /* CompleteClass */
    var removeTargetHandler: js.Any = js.native
    
    /* private */ /* CompleteClass */
    override val target: js.Any = js.native
  }
  
  trait EventTarget extends StObject {
    
    def addHandlers(poolName: String, eventType: String, eventHandlers: EventListeners): Unit
    
    /* private */ var addTargetHandler: js.Any
    
    /* private */ var createEmitter: js.Any
    
    /* private */ val handlers: js.Any
    
    def hasHandlers(): Boolean
    
    /* private */ val pools: js.Any
    
    def removeHandlers(poolName: String, eventType: String, eventHandlers: EventListeners): Unit
    
    /* private */ var removeTargetHandler: js.Any
    
    /* private */ val target: js.Any
  }
  object EventTarget {
    
    inline def apply(
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
    
    extension [Self <: EventTarget](x: Self) {
      
      inline def setAddHandlers(value: (String, String, EventListeners) => Unit): Self = StObject.set(x, "addHandlers", js.Any.fromFunction3(value))
      
      inline def setAddTargetHandler(value: js.Any): Self = StObject.set(x, "addTargetHandler", value.asInstanceOf[js.Any])
      
      inline def setCreateEmitter(value: js.Any): Self = StObject.set(x, "createEmitter", value.asInstanceOf[js.Any])
      
      inline def setHandlers(value: js.Any): Self = StObject.set(x, "handlers", value.asInstanceOf[js.Any])
      
      inline def setHasHandlers(value: () => Boolean): Self = StObject.set(x, "hasHandlers", js.Any.fromFunction0(value))
      
      inline def setPools(value: js.Any): Self = StObject.set(x, "pools", value.asInstanceOf[js.Any])
      
      inline def setRemoveHandlers(value: (String, String, EventListeners) => Unit): Self = StObject.set(x, "removeHandlers", js.Any.fromFunction3(value))
      
      inline def setRemoveTargetHandler(value: js.Any): Self = StObject.set(x, "removeTargetHandler", value.asInstanceOf[js.Any])
      
      inline def setTarget(value: js.Any): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
    }
  }
}
