package typings.pubnub.mod

import typings.pubnub.anon.DataChannelMetadataObject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SetChannelMetadataEvent[ChannelCustom /* <: ObjectCustom */]
  extends StObject
     with BaseObjectsEvent
     with ObjectsEvent[js.Any, ChannelCustom, js.Any] {
  
  @JSName("message")
  var message_SetChannelMetadataEvent: DataChannelMetadataObject[ChannelCustom]
}
object SetChannelMetadataEvent {
  
  @scala.inline
  def apply[ChannelCustom /* <: ObjectCustom */](channel: String, message: DataChannelMetadataObject[ChannelCustom], timetoken: Double): SetChannelMetadataEvent[ChannelCustom] = {
    val __obj = js.Dynamic.literal(channel = channel.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], timetoken = timetoken.asInstanceOf[js.Any], subscription = null)
    __obj.asInstanceOf[SetChannelMetadataEvent[ChannelCustom]]
  }
  
  @scala.inline
  implicit class SetChannelMetadataEventMutableBuilder[Self <: SetChannelMetadataEvent[?], ChannelCustom /* <: ObjectCustom */] (val x: Self & SetChannelMetadataEvent[ChannelCustom]) extends AnyVal {
    
    @scala.inline
    def setMessage(value: DataChannelMetadataObject[ChannelCustom]): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
  }
}
