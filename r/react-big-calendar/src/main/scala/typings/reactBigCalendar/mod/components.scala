package typings.reactBigCalendar.mod

import typings.react.mod.ComponentType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait components extends StObject {
  
  var dateCellWrapper: ComponentType[js.Object]
  
  var eventWrapper: ComponentType[Event]
  
  var timeSlotWrapper: ComponentType[js.Object]
}
object components {
  
  inline def apply(
    dateCellWrapper: ComponentType[js.Object],
    eventWrapper: ComponentType[Event],
    timeSlotWrapper: ComponentType[js.Object]
  ): components = {
    val __obj = js.Dynamic.literal(dateCellWrapper = dateCellWrapper.asInstanceOf[js.Any], eventWrapper = eventWrapper.asInstanceOf[js.Any], timeSlotWrapper = timeSlotWrapper.asInstanceOf[js.Any])
    __obj.asInstanceOf[components]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: components] (val x: Self) extends AnyVal {
    
    inline def setDateCellWrapper(value: ComponentType[js.Object]): Self = StObject.set(x, "dateCellWrapper", value.asInstanceOf[js.Any])
    
    inline def setEventWrapper(value: ComponentType[Event]): Self = StObject.set(x, "eventWrapper", value.asInstanceOf[js.Any])
    
    inline def setTimeSlotWrapper(value: ComponentType[js.Object]): Self = StObject.set(x, "timeSlotWrapper", value.asInstanceOf[js.Any])
  }
}
