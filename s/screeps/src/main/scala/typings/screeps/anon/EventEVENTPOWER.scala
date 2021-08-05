package typings.screeps.anon

import typings.screeps.EVENT_POWER
import typings.screeps.EventItem
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EventEVENTPOWER
  extends StObject
     with EventItem {
  
  var data: /* import warning: importer.ImportType#apply Failed type conversion: screeps.EventData[screeps.EVENT_POWER] */ js.Any
  
  var event: EVENT_POWER
  
  var objectId: String
}
object EventEVENTPOWER {
  
  inline def apply(
    data: /* import warning: importer.ImportType#apply Failed type conversion: screeps.EventData[screeps.EVENT_POWER] */ js.Any,
    event: EVENT_POWER,
    objectId: String
  ): EventEVENTPOWER = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], event = event.asInstanceOf[js.Any], objectId = objectId.asInstanceOf[js.Any])
    __obj.asInstanceOf[EventEVENTPOWER]
  }
  
  extension [Self <: EventEVENTPOWER](x: Self) {
    
    inline def setData(
      value: /* import warning: importer.ImportType#apply Failed type conversion: screeps.EventData[screeps.EVENT_POWER] */ js.Any
    ): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setEvent(value: EVENT_POWER): Self = StObject.set(x, "event", value.asInstanceOf[js.Any])
    
    inline def setObjectId(value: String): Self = StObject.set(x, "objectId", value.asInstanceOf[js.Any])
  }
}
