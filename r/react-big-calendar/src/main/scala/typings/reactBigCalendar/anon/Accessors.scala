package typings.reactBigCalendar.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Accessors[TEvent /* <: js.Object */] extends StObject {
  
  var accessors: Any
  
  var events: js.Array[TEvent]
  
  var minimumStartDifference: Double
  
  var slotMetrics: Any
}
object Accessors {
  
  inline def apply[TEvent /* <: js.Object */](accessors: Any, events: js.Array[TEvent], minimumStartDifference: Double, slotMetrics: Any): Accessors[TEvent] = {
    val __obj = js.Dynamic.literal(accessors = accessors.asInstanceOf[js.Any], events = events.asInstanceOf[js.Any], minimumStartDifference = minimumStartDifference.asInstanceOf[js.Any], slotMetrics = slotMetrics.asInstanceOf[js.Any])
    __obj.asInstanceOf[Accessors[TEvent]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Accessors[?], TEvent /* <: js.Object */] (val x: Self & Accessors[TEvent]) extends AnyVal {
    
    inline def setAccessors(value: Any): Self = StObject.set(x, "accessors", value.asInstanceOf[js.Any])
    
    inline def setEvents(value: js.Array[TEvent]): Self = StObject.set(x, "events", value.asInstanceOf[js.Any])
    
    inline def setEventsVarargs(value: TEvent*): Self = StObject.set(x, "events", js.Array(value*))
    
    inline def setMinimumStartDifference(value: Double): Self = StObject.set(x, "minimumStartDifference", value.asInstanceOf[js.Any])
    
    inline def setSlotMetrics(value: Any): Self = StObject.set(x, "slotMetrics", value.asInstanceOf[js.Any])
  }
}
