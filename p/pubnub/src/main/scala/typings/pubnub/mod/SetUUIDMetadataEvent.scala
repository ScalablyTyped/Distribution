package typings.pubnub.mod

import typings.pubnub.anon.DataEventType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SetUUIDMetadataEvent[UUIDCustom /* <: ObjectCustom */]
  extends BaseObjectsEvent
     with ObjectsEvent[UUIDCustom, js.Any, js.Any] {
  @JSName("message")
  var message_SetUUIDMetadataEvent: DataEventType[UUIDCustom] = js.native
}

object SetUUIDMetadataEvent {
  @scala.inline
  def apply[/* <: typings.pubnub.mod.ObjectCustom */ UUIDCustom](channel: String, message: DataEventType[UUIDCustom], timetoken: Double): SetUUIDMetadataEvent[UUIDCustom] = {
    val __obj = js.Dynamic.literal(channel = channel.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], timetoken = timetoken.asInstanceOf[js.Any])
    __obj.asInstanceOf[SetUUIDMetadataEvent[UUIDCustom]]
  }
  @scala.inline
  implicit class SetUUIDMetadataEventOps[Self <: SetUUIDMetadataEvent[_], /* <: typings.pubnub.mod.ObjectCustom */ UUIDCustom] (val x: Self with SetUUIDMetadataEvent[UUIDCustom]) extends AnyVal {
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
    def setMessage(value: DataEventType[UUIDCustom]): Self = this.set("message", value.asInstanceOf[js.Any])
  }
  
}

