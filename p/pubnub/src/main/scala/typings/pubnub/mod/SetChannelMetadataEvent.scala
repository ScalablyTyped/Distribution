package typings.pubnub.mod

import typings.pubnub.anon.DataEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SetChannelMetadataEvent[ChannelCustom /* <: ObjectCustom */]
  extends StObject
     with BaseObjectsEvent
     with ObjectsEvent[Any, ChannelCustom, Any] {
  
  @JSName("message")
  var message_SetChannelMetadataEvent: DataEvent[ChannelCustom]
}
object SetChannelMetadataEvent {
  
  inline def apply[ChannelCustom /* <: ObjectCustom */](channel: String, message: DataEvent[ChannelCustom], timetoken: Double): SetChannelMetadataEvent[ChannelCustom] = {
    val __obj = js.Dynamic.literal(channel = channel.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], timetoken = timetoken.asInstanceOf[js.Any], subscription = null)
    __obj.asInstanceOf[SetChannelMetadataEvent[ChannelCustom]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SetChannelMetadataEvent[?], ChannelCustom /* <: ObjectCustom */] (val x: Self & SetChannelMetadataEvent[ChannelCustom]) extends AnyVal {
    
    inline def setMessage(value: DataEvent[ChannelCustom]): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
  }
}
