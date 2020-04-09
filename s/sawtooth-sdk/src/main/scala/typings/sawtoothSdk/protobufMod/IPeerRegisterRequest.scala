package typings.sawtoothSdk.protobufMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IPeerRegisterRequest extends js.Object {
  /** PeerRegisterRequest endpoint */
  var endpoint: js.UndefOr[String | Null] = js.undefined
  /** PeerRegisterRequest protocolVersion */
  var protocolVersion: js.UndefOr[Double | Null] = js.undefined
}

object IPeerRegisterRequest {
  @scala.inline
  def apply(endpoint: String = null, protocolVersion: Int | Double = null): IPeerRegisterRequest = {
    val __obj = js.Dynamic.literal()
    if (endpoint != null) __obj.updateDynamic("endpoint")(endpoint.asInstanceOf[js.Any])
    if (protocolVersion != null) __obj.updateDynamic("protocolVersion")(protocolVersion.asInstanceOf[js.Any])
    __obj.asInstanceOf[IPeerRegisterRequest]
  }
}

