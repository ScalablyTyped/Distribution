package typings.sawtoothSdk.protobufMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IPeerRegisterRequest extends js.Object {
  /** PeerRegisterRequest endpoint */
  var endpoint: js.UndefOr[String | Null] = js.native
  /** PeerRegisterRequest protocolVersion */
  var protocolVersion: js.UndefOr[Double | Null] = js.native
}

object IPeerRegisterRequest {
  @scala.inline
  def apply(): IPeerRegisterRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IPeerRegisterRequest]
  }
  @scala.inline
  implicit class IPeerRegisterRequestOps[Self <: IPeerRegisterRequest] (val x: Self) extends AnyVal {
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
    def setProtocolVersion(value: Double): Self = this.set("protocolVersion", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteProtocolVersion: Self = this.set("protocolVersion", js.undefined)
    @scala.inline
    def setProtocolVersionNull: Self = this.set("protocolVersion", null)
  }
  
}

