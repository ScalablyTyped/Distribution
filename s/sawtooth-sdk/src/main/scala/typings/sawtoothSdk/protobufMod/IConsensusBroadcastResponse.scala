package typings.sawtoothSdk.protobufMod

import typings.sawtoothSdk.protobufMod.ConsensusBroadcastResponse.Status
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IConsensusBroadcastResponse extends js.Object {
  /** ConsensusBroadcastResponse status */
  var status: js.UndefOr[Status | Null] = js.native
}

object IConsensusBroadcastResponse {
  @scala.inline
  def apply(): IConsensusBroadcastResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IConsensusBroadcastResponse]
  }
  @scala.inline
  implicit class IConsensusBroadcastResponseOps[Self <: IConsensusBroadcastResponse] (val x: Self) extends AnyVal {
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

