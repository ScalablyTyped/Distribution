package typings.sawtoothSdk.protobufMod

import typings.sawtoothSdk.protobufMod.ClientStatusGetResponse.IPeer
import typings.sawtoothSdk.protobufMod.ClientStatusGetResponse.Status
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IClientStatusGetResponse extends js.Object {
  /** ClientStatusGetResponse endpoint */
  var endpoint: js.UndefOr[String | Null] = js.native
  /** ClientStatusGetResponse peers */
  var peers: js.UndefOr[js.Array[IPeer] | Null] = js.native
  /** ClientStatusGetResponse status */
  var status: js.UndefOr[Status | Null] = js.native
}

object IClientStatusGetResponse {
  @scala.inline
  def apply(): IClientStatusGetResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IClientStatusGetResponse]
  }
  @scala.inline
  implicit class IClientStatusGetResponseOps[Self <: IClientStatusGetResponse] (val x: Self) extends AnyVal {
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
    def setEndpoint(value: String): Self = this.set("endpoint", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEndpoint: Self = this.set("endpoint", js.undefined)
    @scala.inline
    def setEndpointNull: Self = this.set("endpoint", null)
    @scala.inline
    def setPeersVarargs(value: IPeer*): Self = this.set("peers", js.Array(value :_*))
    @scala.inline
    def setPeers(value: js.Array[IPeer]): Self = this.set("peers", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePeers: Self = this.set("peers", js.undefined)
    @scala.inline
    def setPeersNull: Self = this.set("peers", null)
    @scala.inline
    def setStatus(value: Status): Self = this.set("status", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStatus: Self = this.set("status", js.undefined)
    @scala.inline
    def setStatusNull: Self = this.set("status", null)
  }
  
}

