package typings.screeps.anon

import typings.screeps.EVENT_TRANSFER
import typings.screeps.EventItem
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EventEVENTTRANSFER
  extends StObject
     with EventItem {
  
  var data: /* import warning: importer.ImportType#apply Failed type conversion: screeps.EventData[screeps.EVENT_TRANSFER] */ js.Any
  
  var event: EVENT_TRANSFER
  
  var objectId: String
}
object EventEVENTTRANSFER {
  
  inline def apply(
    data: /* import warning: importer.ImportType#apply Failed type conversion: screeps.EventData[screeps.EVENT_TRANSFER] */ js.Any,
    event: EVENT_TRANSFER,
    objectId: String
  ): EventEVENTTRANSFER = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], event = event.asInstanceOf[js.Any], objectId = objectId.asInstanceOf[js.Any])
    __obj.asInstanceOf[EventEVENTTRANSFER]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: EventEVENTTRANSFER] (val x: Self) extends AnyVal {
    
    inline def setData(
      value: /* import warning: importer.ImportType#apply Failed type conversion: screeps.EventData[screeps.EVENT_TRANSFER] */ js.Any
    ): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setEvent(value: EVENT_TRANSFER): Self = StObject.set(x, "event", value.asInstanceOf[js.Any])
    
    inline def setObjectId(value: String): Self = StObject.set(x, "objectId", value.asInstanceOf[js.Any])
  }
}
