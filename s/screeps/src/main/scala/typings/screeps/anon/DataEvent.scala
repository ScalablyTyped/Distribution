package typings.screeps.anon

import typings.screeps.EVENT_BUILD
import typings.screeps.EventItem
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DataEvent extends EventItem {
  
  var data: /* import warning: importer.ImportType#apply Failed type conversion: screeps.EventData[screeps.EVENT_BUILD] */ js.Any = js.native
  
  var event: EVENT_BUILD = js.native
  
  var objectId: String = js.native
}
object DataEvent {
  
  @scala.inline
  def apply(
    data: /* import warning: importer.ImportType#apply Failed type conversion: screeps.EventData[screeps.EVENT_BUILD] */ js.Any,
    event: EVENT_BUILD,
    objectId: String
  ): DataEvent = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], event = event.asInstanceOf[js.Any], objectId = objectId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DataEvent]
  }
  
  @scala.inline
  implicit class DataEventMutableBuilder[Self <: DataEvent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setData(
      value: /* import warning: importer.ImportType#apply Failed type conversion: screeps.EventData[screeps.EVENT_BUILD] */ js.Any
    ): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEvent(value: EVENT_BUILD): Self = StObject.set(x, "event", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setObjectId(value: String): Self = StObject.set(x, "objectId", value.asInstanceOf[js.Any])
  }
}
