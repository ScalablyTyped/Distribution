package typings.pubnub.anon

import typings.pubnub.pubnubStrings.delete
import typings.pubnub.pubnubStrings.uuid
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EventType extends StObject {
  
  var data: Id
  
  var event: delete
  
  var `type`: uuid
}
object EventType {
  
  inline def apply(data: Id): EventType = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], event = "delete")
    __obj.updateDynamic("type")("uuid")
    __obj.asInstanceOf[EventType]
  }
  
  extension [Self <: EventType](x: Self) {
    
    inline def setData(value: Id): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setEvent(value: delete): Self = StObject.set(x, "event", value.asInstanceOf[js.Any])
    
    inline def setType(value: uuid): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
