package typings.puppeteerCore

import typings.puppeteerCore.srcMod.EventType
import typings.puppeteerCore.srcMod.Handler
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object eventEmitterMod {
  
  @JSImport("puppeteer-core/lib/cjs/puppeteer/common/EventEmitter", "EventEmitter")
  @js.native
  /**
    * @internal
    */
  open class EventEmitter ()
    extends StObject
       with CommonEventEmitter {
    
    /* private */ var emitter: Any = js.native
    
    /* private */ var eventListenersCount: Any = js.native
    
    /* private */ var eventsMap: Any = js.native
    
    /**
      * Gets the number of listeners for a given event.
      *
      * @param event - the event to get the listener count for
      * @returns the number of listeners bound to the given event
      */
    def listenerCount(event: EventType): Double = js.native
  }
  
  @js.native
  trait CommonEventEmitter extends StObject {
    
    def addListener(event: EventType, handler: Handler[Any]): CommonEventEmitter = js.native
    
    def emit(event: EventType): Boolean = js.native
    def emit(event: EventType, eventData: Any): Boolean = js.native
    
    def listenerCount(event: String): Double = js.native
    
    def off(event: EventType, handler: Handler[Any]): CommonEventEmitter = js.native
    
    def on(event: EventType, handler: Handler[Any]): CommonEventEmitter = js.native
    
    def once(event: EventType, handler: Handler[Any]): CommonEventEmitter = js.native
    
    def removeAllListeners(): CommonEventEmitter = js.native
    def removeAllListeners(event: EventType): CommonEventEmitter = js.native
    
    def removeListener(event: EventType, handler: Handler[Any]): CommonEventEmitter = js.native
  }
}
