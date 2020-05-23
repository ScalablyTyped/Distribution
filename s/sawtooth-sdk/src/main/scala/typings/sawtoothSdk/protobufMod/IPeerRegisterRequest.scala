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
  def apply(
    endpoint: js.UndefOr[Null | String] = js.undefined,
    protocolVersion: js.UndefOr[Null | Double] = js.undefined
  ): IPeerRegisterRequest = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(endpoint)) __obj.updateDynamic("endpoint")(endpoint.asInstanceOf[js.Any])
    if (!js.isUndefined(protocolVersion)) __obj.updateDynamic("protocolVersion")(protocolVersion.asInstanceOf[js.Any])
    __obj.asInstanceOf[IPeerRegisterRequest]
  }
}

