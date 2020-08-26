package typings.sawtoothSdk.protobufMod

import typings.sawtoothSdk.protobufMod.ClientEventsUnsubscribeResponse.Status
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IClientEventsUnsubscribeResponse extends js.Object {
  /** ClientEventsUnsubscribeResponse status */
  var status: js.UndefOr[Status | Null] = js.native
}

object IClientEventsUnsubscribeResponse {
  @scala.inline
  def apply(): IClientEventsUnsubscribeResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IClientEventsUnsubscribeResponse]
  }
  @scala.inline
  implicit class IClientEventsUnsubscribeResponseOps[Self <: IClientEventsUnsubscribeResponse] (val x: Self) extends AnyVal {
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
    def setStatus(value: Status): Self = this.set("status", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStatus: Self = this.set("status", js.undefined)
    @scala.inline
    def setStatusNull: Self = this.set("status", null)
  }
  
}

