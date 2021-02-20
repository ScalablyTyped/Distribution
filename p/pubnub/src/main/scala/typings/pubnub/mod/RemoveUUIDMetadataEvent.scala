package typings.pubnub.mod

import typings.pubnub.anon.DataId
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RemoveUUIDMetadataEvent
  extends BaseObjectsEvent
     with ObjectsEvent[js.Any, js.Any, js.Any] {
  
  @JSName("message")
  var message_RemoveUUIDMetadataEvent: DataId = js.native
}
object RemoveUUIDMetadataEvent {
  
  @scala.inline
  def apply(channel: String, message: DataId, timetoken: Double): RemoveUUIDMetadataEvent = {
    val __obj = js.Dynamic.literal(channel = channel.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], timetoken = timetoken.asInstanceOf[js.Any])
    __obj.asInstanceOf[RemoveUUIDMetadataEvent]
  }
  
  @scala.inline
  implicit class RemoveUUIDMetadataEventMutableBuilder[Self <: RemoveUUIDMetadataEvent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMessage(value: DataId): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
  }
}
