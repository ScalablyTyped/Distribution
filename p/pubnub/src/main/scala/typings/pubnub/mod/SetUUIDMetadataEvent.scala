package typings.pubnub.mod

import typings.pubnub.anon.Event
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SetUUIDMetadataEvent[UUIDCustom /* <: ObjectCustom */]
  extends StObject
     with BaseObjectsEvent
     with ObjectsEvent[UUIDCustom, Any, Any] {
  
  @JSName("message")
  var message_SetUUIDMetadataEvent: Event[UUIDCustom]
}
object SetUUIDMetadataEvent {
  
  inline def apply[UUIDCustom /* <: ObjectCustom */](channel: String, message: Event[UUIDCustom], timetoken: Double): SetUUIDMetadataEvent[UUIDCustom] = {
    val __obj = js.Dynamic.literal(channel = channel.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], timetoken = timetoken.asInstanceOf[js.Any], subscription = null)
    __obj.asInstanceOf[SetUUIDMetadataEvent[UUIDCustom]]
  }
  
  extension [Self <: SetUUIDMetadataEvent[?], UUIDCustom /* <: ObjectCustom */](x: Self & SetUUIDMetadataEvent[UUIDCustom]) {
    
    inline def setMessage(value: Event[UUIDCustom]): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
  }
}
