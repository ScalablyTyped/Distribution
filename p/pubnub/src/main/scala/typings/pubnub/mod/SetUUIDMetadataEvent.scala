package typings.pubnub.mod

import typings.pubnub.anon.DataEventType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SetUUIDMetadataEvent[UUIDCustom /* <: ObjectCustom */]
  extends StObject
     with BaseObjectsEvent
     with ObjectsEvent[UUIDCustom, js.Any, js.Any] {
  
  @JSName("message")
  var message_SetUUIDMetadataEvent: DataEventType[UUIDCustom]
}
object SetUUIDMetadataEvent {
  
  @scala.inline
  def apply[UUIDCustom /* <: ObjectCustom */](channel: String, message: DataEventType[UUIDCustom], timetoken: Double): SetUUIDMetadataEvent[UUIDCustom] = {
    val __obj = js.Dynamic.literal(channel = channel.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], timetoken = timetoken.asInstanceOf[js.Any], subscription = null)
    __obj.asInstanceOf[SetUUIDMetadataEvent[UUIDCustom]]
  }
  
  @scala.inline
  implicit class SetUUIDMetadataEventMutableBuilder[Self <: SetUUIDMetadataEvent[?], UUIDCustom /* <: ObjectCustom */] (val x: Self & SetUUIDMetadataEvent[UUIDCustom]) extends AnyVal {
    
    @scala.inline
    def setMessage(value: DataEventType[UUIDCustom]): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
  }
}
