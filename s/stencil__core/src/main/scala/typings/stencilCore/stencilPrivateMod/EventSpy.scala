package typings.stencilCore.stencilPrivateMod

import typings.stencilCore.anon.Done
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EventSpy extends StObject {
  
  var eventName: String
  
  var events: js.Array[SerializedEvent]
  
  var firstEvent: SerializedEvent
  
  var lastEvent: SerializedEvent
  
  var length: Double
  
  def next(): js.Promise[Done]
}
object EventSpy {
  
  inline def apply(
    eventName: String,
    events: js.Array[SerializedEvent],
    firstEvent: SerializedEvent,
    lastEvent: SerializedEvent,
    length: Double,
    next: () => js.Promise[Done]
  ): EventSpy = {
    val __obj = js.Dynamic.literal(eventName = eventName.asInstanceOf[js.Any], events = events.asInstanceOf[js.Any], firstEvent = firstEvent.asInstanceOf[js.Any], lastEvent = lastEvent.asInstanceOf[js.Any], length = length.asInstanceOf[js.Any], next = js.Any.fromFunction0(next))
    __obj.asInstanceOf[EventSpy]
  }
  
  extension [Self <: EventSpy](x: Self) {
    
    inline def setEventName(value: String): Self = StObject.set(x, "eventName", value.asInstanceOf[js.Any])
    
    inline def setEvents(value: js.Array[SerializedEvent]): Self = StObject.set(x, "events", value.asInstanceOf[js.Any])
    
    inline def setEventsVarargs(value: SerializedEvent*): Self = StObject.set(x, "events", js.Array(value*))
    
    inline def setFirstEvent(value: SerializedEvent): Self = StObject.set(x, "firstEvent", value.asInstanceOf[js.Any])
    
    inline def setLastEvent(value: SerializedEvent): Self = StObject.set(x, "lastEvent", value.asInstanceOf[js.Any])
    
    inline def setLength(value: Double): Self = StObject.set(x, "length", value.asInstanceOf[js.Any])
    
    inline def setNext(value: () => js.Promise[Done]): Self = StObject.set(x, "next", js.Any.fromFunction0(value))
  }
}
