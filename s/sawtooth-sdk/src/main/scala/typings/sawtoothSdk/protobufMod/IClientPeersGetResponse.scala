package typings.sawtoothSdk.protobufMod

import typings.sawtoothSdk.protobufMod.ClientPeersGetResponse.Status
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IClientPeersGetResponse extends js.Object {
  /** ClientPeersGetResponse peers */
  var peers: js.UndefOr[js.Array[String] | Null] = js.undefined
  /** ClientPeersGetResponse status */
  var status: js.UndefOr[Status | Null] = js.undefined
}

object IClientPeersGetResponse {
  @scala.inline
  def apply(
    peers: js.UndefOr[Null | js.Array[String]] = js.undefined,
    status: js.UndefOr[Null | Status] = js.undefined
  ): IClientPeersGetResponse = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(peers)) __obj.updateDynamic("peers")(peers.asInstanceOf[js.Any])
    if (!js.isUndefined(status)) __obj.updateDynamic("status")(status.asInstanceOf[js.Any])
    __obj.asInstanceOf[IClientPeersGetResponse]
  }
}

