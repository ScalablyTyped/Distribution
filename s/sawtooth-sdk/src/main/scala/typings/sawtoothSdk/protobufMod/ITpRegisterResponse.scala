package typings.sawtoothSdk.protobufMod

import typings.sawtoothSdk.protobufMod.TpRegisterResponse.Status
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ITpRegisterResponse extends js.Object {
  /** TpRegisterResponse status */
  var status: js.UndefOr[Status | Null] = js.native
}

object ITpRegisterResponse {
  @scala.inline
  def apply(): ITpRegisterResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ITpRegisterResponse]
  }
  @scala.inline
  implicit class ITpRegisterResponseOps[Self <: ITpRegisterResponse] (val x: Self) extends AnyVal {
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

