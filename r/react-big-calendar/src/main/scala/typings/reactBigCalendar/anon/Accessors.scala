package typings.reactBigCalendar.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Accessors[TEvent /* <: js.Object */] extends StObject {
  
  var accessors: js.Any = js.native
  
  var events: js.Array[TEvent] = js.native
  
  var minimumStartDifference: Double = js.native
  
  var slotMetrics: js.Any = js.native
}
object Accessors {
  
  @scala.inline
  def apply[TEvent /* <: js.Object */](accessors: js.Any, events: js.Array[TEvent], minimumStartDifference: Double, slotMetrics: js.Any): Accessors[TEvent] = {
    val __obj = js.Dynamic.literal(accessors = accessors.asInstanceOf[js.Any], events = events.asInstanceOf[js.Any], minimumStartDifference = minimumStartDifference.asInstanceOf[js.Any], slotMetrics = slotMetrics.asInstanceOf[js.Any])
    __obj.asInstanceOf[Accessors[TEvent]]
  }
  
  @scala.inline
  implicit class AccessorsMutableBuilder[Self <: Accessors[_], TEvent /* <: js.Object */] (val x: Self with Accessors[TEvent]) extends AnyVal {
    
    @scala.inline
    def setAccessors(value: js.Any): Self = StObject.set(x, "accessors", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEvents(value: js.Array[TEvent]): Self = StObject.set(x, "events", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEventsVarargs(value: TEvent*): Self = StObject.set(x, "events", js.Array(value :_*))
    
    @scala.inline
    def setMinimumStartDifference(value: Double): Self = StObject.set(x, "minimumStartDifference", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSlotMetrics(value: js.Any): Self = StObject.set(x, "slotMetrics", value.asInstanceOf[js.Any])
  }
}
