package typings.puppeteerCore

import typings.puppeteerCore.mittSrcMod.EventType
import typings.puppeteerCore.mittSrcMod.Handler
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object commonEventEmitterMod {
  
  @JSImport("puppeteer-core/lib/esm/puppeteer/common/EventEmitter", "EventEmitter")
  @js.native
  /**
    * @internal
    */
  class EventEmitter ()
    extends StObject
       with CommonEventEmitter {
    
    var emitter: js.Any = js.native
    
    var eventListenersCount: js.Any = js.native
    
    var eventsMap: js.Any = js.native
    
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
    
    def addListener(event: EventType, handler: Handler[js.Any]): CommonEventEmitter = js.native
    
    def emit(event: EventType): Boolean = js.native
    def emit(event: EventType, eventData: js.Any): Boolean = js.native
    
    def listenerCount(event: String): Double = js.native
    
    def off(event: EventType, handler: Handler[js.Any]): CommonEventEmitter = js.native
    
    def on(event: EventType, handler: Handler[js.Any]): CommonEventEmitter = js.native
    
    def once(event: EventType, handler: Handler[js.Any]): CommonEventEmitter = js.native
    
    def removeAllListeners(): CommonEventEmitter = js.native
    def removeAllListeners(event: EventType): CommonEventEmitter = js.native
    
    def removeListener(event: EventType, handler: Handler[js.Any]): CommonEventEmitter = js.native
  }
}
