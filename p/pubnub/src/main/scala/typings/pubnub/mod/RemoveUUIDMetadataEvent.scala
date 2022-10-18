package typings.pubnub.mod

import typings.pubnub.anon.EventType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RemoveUUIDMetadataEvent
  extends StObject
     with BaseObjectsEvent
     with ObjectsEvent[Any, Any, Any] {
  
  @JSName("message")
  var message_RemoveUUIDMetadataEvent: EventType
}
object RemoveUUIDMetadataEvent {
  
  inline def apply(channel: String, message: EventType, timetoken: Double): RemoveUUIDMetadataEvent = {
    val __obj = js.Dynamic.literal(channel = channel.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], timetoken = timetoken.asInstanceOf[js.Any], subscription = null)
    __obj.asInstanceOf[RemoveUUIDMetadataEvent]
  }
  
  extension [Self <: RemoveUUIDMetadataEvent](x: Self) {
    
    inline def setMessage(value: EventType): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
  }
}
