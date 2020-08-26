package typings.sawtoothSdk.protobufMod

import typings.sawtoothSdk.protobufMod.ClientStateGetResponse.Status
import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IClientStateGetResponse extends js.Object {
  /** ClientStateGetResponse stateRoot */
  var stateRoot: js.UndefOr[String | Null] = js.native
  /** ClientStateGetResponse status */
  var status: js.UndefOr[Status | Null] = js.native
  /** ClientStateGetResponse value */
  var value: js.UndefOr[Uint8Array | Null] = js.native
}

object IClientStateGetResponse {
  @scala.inline
  def apply(): IClientStateGetResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IClientStateGetResponse]
  }
  @scala.inline
  implicit class IClientStateGetResponseOps[Self <: IClientStateGetResponse] (val x: Self) extends AnyVal {
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
    def setStateRoot(value: String): Self = this.set("stateRoot", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStateRoot: Self = this.set("stateRoot", js.undefined)
    @scala.inline
    def setStateRootNull: Self = this.set("stateRoot", null)
    @scala.inline
    def setStatus(value: Status): Self = this.set("status", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStatus: Self = this.set("status", js.undefined)
    @scala.inline
    def setStatusNull: Self = this.set("status", null)
    @scala.inline
    def setValue(value: Uint8Array): Self = this.set("value", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteValue: Self = this.set("value", js.undefined)
    @scala.inline
    def setValueNull: Self = this.set("value", null)
  }
  
}

