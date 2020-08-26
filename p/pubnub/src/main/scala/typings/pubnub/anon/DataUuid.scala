package typings.pubnub.anon

import typings.pubnub.pubnubStrings.delete
import typings.pubnub.pubnubStrings.membership
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DataUuid extends js.Object {
  var data: Uuid = js.native
  var event: delete = js.native
  var `type`: membership = js.native
}

object DataUuid {
  @scala.inline
  def apply(data: Uuid, event: delete, `type`: membership): DataUuid = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], event = event.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[DataUuid]
  }
  @scala.inline
  implicit class DataUuidOps[Self <: DataUuid] (val x: Self) extends AnyVal {
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
    def setData(value: Uuid): Self = this.set("data", value.asInstanceOf[js.Any])
    @scala.inline
    def setEvent(value: delete): Self = this.set("event", value.asInstanceOf[js.Any])
    @scala.inline
    def setType(value: membership): Self = this.set("type", value.asInstanceOf[js.Any])
  }
  
}

