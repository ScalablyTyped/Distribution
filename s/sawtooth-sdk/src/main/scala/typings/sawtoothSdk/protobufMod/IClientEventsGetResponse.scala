package typings.sawtoothSdk.protobufMod

import typings.sawtoothSdk.protobufMod.ClientEventsGetResponse.Status
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IClientEventsGetResponse extends js.Object {
  /** ClientEventsGetResponse events */
  var events: js.UndefOr[js.Array[IEvent] | Null] = js.native
  /** ClientEventsGetResponse status */
  var status: js.UndefOr[Status | Null] = js.native
}

object IClientEventsGetResponse {
  @scala.inline
  def apply(): IClientEventsGetResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IClientEventsGetResponse]
  }
  @scala.inline
  implicit class IClientEventsGetResponseOps[Self <: IClientEventsGetResponse] (val x: Self) extends AnyVal {
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
    def setEventsVarargs(value: IEvent*): Self = this.set("events", js.Array(value :_*))
    @scala.inline
    def setEvents(value: js.Array[IEvent]): Self = this.set("events", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEvents: Self = this.set("events", js.undefined)
    @scala.inline
    def setEventsNull: Self = this.set("events", null)
    @scala.inline
    def setStatus(value: Status): Self = this.set("status", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStatus: Self = this.set("status", js.undefined)
    @scala.inline
    def setStatusNull: Self = this.set("status", null)
  }
  
}

