package typings.pubnub.anon

import typings.pubnub.pubnubStrings.channel
import typings.pubnub.pubnubStrings.delete
import typings.pubnub.pubnubStrings.membership
import typings.pubnub.pubnubStrings.set
import typings.pubnub.pubnubStrings.uuid
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EventType extends js.Object {
  var data: js.Object = js.native
  var event: set | delete = js.native
  var `type`: uuid | channel | membership = js.native
}

object EventType {
  @scala.inline
  def apply(data: js.Object, event: set | delete, `type`: uuid | channel | membership): EventType = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], event = event.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[EventType]
  }
  @scala.inline
  implicit class EventTypeOps[Self <: EventType] (val x: Self) extends AnyVal {
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
    def setData(value: js.Object): Self = this.set("data", value.asInstanceOf[js.Any])
    @scala.inline
    def setEvent(value: set | delete): Self = this.set("event", value.asInstanceOf[js.Any])
    @scala.inline
    def setType(value: uuid | channel | membership): Self = this.set("type", value.asInstanceOf[js.Any])
  }
  
}

