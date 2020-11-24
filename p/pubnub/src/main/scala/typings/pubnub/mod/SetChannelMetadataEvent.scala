package typings.pubnub.mod

import typings.pubnub.anon.DataChannelMetadataObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SetChannelMetadataEvent[ChannelCustom /* <: ObjectCustom */]
  extends BaseObjectsEvent
     with ObjectsEvent[js.Any, ChannelCustom, js.Any] {
  
  @JSName("message")
  var message_SetChannelMetadataEvent: DataChannelMetadataObject[ChannelCustom] = js.native
}
object SetChannelMetadataEvent {
  
  @scala.inline
  def apply[ChannelCustom /* <: ObjectCustom */](channel: String, message: DataChannelMetadataObject[ChannelCustom], timetoken: Double): SetChannelMetadataEvent[ChannelCustom] = {
    val __obj = js.Dynamic.literal(channel = channel.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], timetoken = timetoken.asInstanceOf[js.Any])
    __obj.asInstanceOf[SetChannelMetadataEvent[ChannelCustom]]
  }
  
  @scala.inline
  implicit class SetChannelMetadataEventOps[Self <: SetChannelMetadataEvent[_], ChannelCustom /* <: ObjectCustom */] (val x: Self with SetChannelMetadataEvent[ChannelCustom]) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setMessage(value: DataChannelMetadataObject[ChannelCustom]): Self = this.set("message", value.asInstanceOf[js.Any])
  }
}
