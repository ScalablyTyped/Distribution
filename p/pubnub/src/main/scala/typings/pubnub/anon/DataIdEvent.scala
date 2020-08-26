package typings.pubnub.anon

import typings.pubnub.pubnubStrings.channel
import typings.pubnub.pubnubStrings.delete
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DataIdEvent extends js.Object {
  var data: Id = js.native
  var event: delete = js.native
  var `type`: channel = js.native
}

object DataIdEvent {
  @scala.inline
  def apply(data: Id, event: delete, `type`: channel): DataIdEvent = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], event = event.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[DataIdEvent]
  }
  @scala.inline
  implicit class DataIdEventOps[Self <: DataIdEvent] (val x: Self) extends AnyVal {
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
    def setData(value: Id): Self = this.set("data", value.asInstanceOf[js.Any])
    @scala.inline
    def setEvent(value: delete): Self = this.set("event", value.asInstanceOf[js.Any])
    @scala.inline
    def setType(value: channel): Self = this.set("type", value.asInstanceOf[js.Any])
  }
  
}

