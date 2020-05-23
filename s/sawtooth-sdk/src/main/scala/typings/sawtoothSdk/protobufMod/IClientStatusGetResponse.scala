package typings.sawtoothSdk.protobufMod

import typings.sawtoothSdk.protobufMod.ClientStatusGetResponse.IPeer
import typings.sawtoothSdk.protobufMod.ClientStatusGetResponse.Status
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IClientStatusGetResponse extends js.Object {
  /** ClientStatusGetResponse endpoint */
  var endpoint: js.UndefOr[String | Null] = js.undefined
  /** ClientStatusGetResponse peers */
  var peers: js.UndefOr[js.Array[IPeer] | Null] = js.undefined
  /** ClientStatusGetResponse status */
  var status: js.UndefOr[Status | Null] = js.undefined
}

object IClientStatusGetResponse {
  @scala.inline
  def apply(
    endpoint: js.UndefOr[Null | String] = js.undefined,
    peers: js.UndefOr[Null | js.Array[IPeer]] = js.undefined,
    status: js.UndefOr[Null | Status] = js.undefined
  ): IClientStatusGetResponse = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(endpoint)) __obj.updateDynamic("endpoint")(endpoint.asInstanceOf[js.Any])
    if (!js.isUndefined(peers)) __obj.updateDynamic("peers")(peers.asInstanceOf[js.Any])
    if (!js.isUndefined(status)) __obj.updateDynamic("status")(status.asInstanceOf[js.Any])
    __obj.asInstanceOf[IClientStatusGetResponse]
  }
}

