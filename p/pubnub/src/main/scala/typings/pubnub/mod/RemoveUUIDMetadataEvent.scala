package typings.pubnub.mod

import typings.pubnub.anon.DataId
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RemoveUUIDMetadataEvent
  extends StObject
     with BaseObjectsEvent
     with ObjectsEvent[js.Any, js.Any, js.Any] {
  
  @JSName("message")
  var message_RemoveUUIDMetadataEvent: DataId
}
object RemoveUUIDMetadataEvent {
  
  @scala.inline
  def apply(channel: String, message: DataId, timetoken: Double): RemoveUUIDMetadataEvent = {
    val __obj = js.Dynamic.literal(channel = channel.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], timetoken = timetoken.asInstanceOf[js.Any], subscription = null)
    __obj.asInstanceOf[RemoveUUIDMetadataEvent]
  }
  
  @scala.inline
  implicit class RemoveUUIDMetadataEventMutableBuilder[Self <: RemoveUUIDMetadataEvent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMessage(value: DataId): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
  }
}
