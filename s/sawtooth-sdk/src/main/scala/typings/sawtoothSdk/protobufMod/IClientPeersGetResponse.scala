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
  def apply(peers: js.Array[String] = null, status: Status = null): IClientPeersGetResponse = {
    val __obj = js.Dynamic.literal()
    if (peers != null) __obj.updateDynamic("peers")(peers.asInstanceOf[js.Any])
    if (status != null) __obj.updateDynamic("status")(status.asInstanceOf[js.Any])
    __obj.asInstanceOf[IClientPeersGetResponse]
  }
}

