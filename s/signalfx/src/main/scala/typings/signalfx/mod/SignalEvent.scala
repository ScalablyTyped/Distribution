package typings.signalfx.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SignalEvent extends StObject {
  
  var category: js.UndefOr[EventCategory] = js.undefined
  
  var dimensions: js.UndefOr[js.Object] = js.undefined
  
  var eventType: String
  
  var properties: js.UndefOr[js.Object] = js.undefined
  
  var timestamp: js.UndefOr[Double] = js.undefined
}
object SignalEvent {
  
  inline def apply(eventType: String): SignalEvent = {
    val __obj = js.Dynamic.literal(eventType = eventType.asInstanceOf[js.Any])
    __obj.asInstanceOf[SignalEvent]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SignalEvent] (val x: Self) extends AnyVal {
    
    inline def setCategory(value: EventCategory): Self = StObject.set(x, "category", value.asInstanceOf[js.Any])
    
    inline def setCategoryUndefined: Self = StObject.set(x, "category", js.undefined)
    
    inline def setDimensions(value: js.Object): Self = StObject.set(x, "dimensions", value.asInstanceOf[js.Any])
    
    inline def setDimensionsUndefined: Self = StObject.set(x, "dimensions", js.undefined)
    
    inline def setEventType(value: String): Self = StObject.set(x, "eventType", value.asInstanceOf[js.Any])
    
    inline def setProperties(value: js.Object): Self = StObject.set(x, "properties", value.asInstanceOf[js.Any])
    
    inline def setPropertiesUndefined: Self = StObject.set(x, "properties", js.undefined)
    
    inline def setTimestamp(value: Double): Self = StObject.set(x, "timestamp", value.asInstanceOf[js.Any])
    
    inline def setTimestampUndefined: Self = StObject.set(x, "timestamp", js.undefined)
  }
}
