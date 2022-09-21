package typings.puppeteer.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("puppeteer", "EventEmitter")
@js.native
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
