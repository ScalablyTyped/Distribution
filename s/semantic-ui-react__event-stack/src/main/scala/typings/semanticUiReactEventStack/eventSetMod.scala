package typings.semanticUiReactEventStack

import typings.semanticUiReactEventStack.typesMod.EventListeners
import typings.std.Event
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object eventSetMod {
  
  @JSImport("@semantic-ui-react/event-stack/lib/types/lib/EventSet", JSImport.Default)
  @js.native
  open class default protected ()
    extends StObject
       with EventSet {
    /**
      * @see https://jsperf.com/suir-eventset-constructor
      */
    def this(eventHandlers: EventListeners) = this()
    
    /**
      * @see https://jsperf.com/suir-eventset-addhandlers
      */
    /* CompleteClass */
    override def addHandlers(additionalHandlers: EventListeners): EventSet = js.native
    
    /**
      * @see https://jsperf.com/suir-eventset-dispatchsingle
      * @see https://jsperf.com/suir-eventset-dispatchmultiple2
      */
    /* CompleteClass */
    override def dispatchEvent(event: Event, dispatchAll: Boolean): Unit = js.native
    
    /* private */ /* CompleteClass */
    override val handlers: Any = js.native
    
    /* CompleteClass */
    override def hasHandlers(): Boolean = js.native
    
    /**
      * @see https://jsperf.com/suir-eventset-removehandlers
      */
    /* CompleteClass */
    override def removeHandlers(removalHandlers: EventListeners): EventSet = js.native
  }
  
  trait EventSet extends StObject {
    
    /**
      * @see https://jsperf.com/suir-eventset-addhandlers
      */
    def addHandlers(additionalHandlers: EventListeners): EventSet
    
    /**
      * @see https://jsperf.com/suir-eventset-dispatchsingle
      * @see https://jsperf.com/suir-eventset-dispatchmultiple2
      */
    def dispatchEvent(event: Event, dispatchAll: Boolean): Unit
    
    /* private */ val handlers: Any
    
    def hasHandlers(): Boolean
    
    /**
      * @see https://jsperf.com/suir-eventset-removehandlers
      */
    def removeHandlers(removalHandlers: EventListeners): EventSet
  }
  object EventSet {
    
    inline def apply(
      addHandlers: EventListeners => EventSet,
      dispatchEvent: (Event, Boolean) => Unit,
      handlers: Any,
      hasHandlers: () => Boolean,
      removeHandlers: EventListeners => EventSet
    ): EventSet = {
      val __obj = js.Dynamic.literal(addHandlers = js.Any.fromFunction1(addHandlers), dispatchEvent = js.Any.fromFunction2(dispatchEvent), handlers = handlers.asInstanceOf[js.Any], hasHandlers = js.Any.fromFunction0(hasHandlers), removeHandlers = js.Any.fromFunction1(removeHandlers))
      __obj.asInstanceOf[EventSet]
    }
    
    extension [Self <: EventSet](x: Self) {
      
      inline def setAddHandlers(value: EventListeners => EventSet): Self = StObject.set(x, "addHandlers", js.Any.fromFunction1(value))
      
      inline def setDispatchEvent(value: (Event, Boolean) => Unit): Self = StObject.set(x, "dispatchEvent", js.Any.fromFunction2(value))
      
      inline def setHandlers(value: Any): Self = StObject.set(x, "handlers", value.asInstanceOf[js.Any])
      
      inline def setHasHandlers(value: () => Boolean): Self = StObject.set(x, "hasHandlers", js.Any.fromFunction0(value))
      
      inline def setRemoveHandlers(value: EventListeners => EventSet): Self = StObject.set(x, "removeHandlers", js.Any.fromFunction1(value))
    }
  }
}
