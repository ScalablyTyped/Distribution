package typings.screeps.anon

import typings.screeps.EVENT_OBJECT_DESTROYED
import typings.screeps.EventItem
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Event
  extends StObject
     with EventItem {
  
  var data: /* import warning: importer.ImportType#apply Failed type conversion: screeps.EventData[screeps.EVENT_OBJECT_DESTROYED] */ js.Any
  
  var event: EVENT_OBJECT_DESTROYED
  
  var objectId: String
}
object Event {
  
  inline def apply(
    data: /* import warning: importer.ImportType#apply Failed type conversion: screeps.EventData[screeps.EVENT_OBJECT_DESTROYED] */ js.Any,
    event: EVENT_OBJECT_DESTROYED,
    objectId: String
  ): Event = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], event = event.asInstanceOf[js.Any], objectId = objectId.asInstanceOf[js.Any])
    __obj.asInstanceOf[Event]
  }
  
  extension [Self <: Event](x: Self) {
    
    inline def setData(
      value: /* import warning: importer.ImportType#apply Failed type conversion: screeps.EventData[screeps.EVENT_OBJECT_DESTROYED] */ js.Any
    ): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setEvent(value: EVENT_OBJECT_DESTROYED): Self = StObject.set(x, "event", value.asInstanceOf[js.Any])
    
    inline def setObjectId(value: String): Self = StObject.set(x, "objectId", value.asInstanceOf[js.Any])
  }
}
