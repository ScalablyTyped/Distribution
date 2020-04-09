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
  def apply(endpoint: String = null, peers: js.Array[IPeer] = null, status: Status = null): IClientStatusGetResponse = {
    val __obj = js.Dynamic.literal()
    if (endpoint != null) __obj.updateDynamic("endpoint")(endpoint.asInstanceOf[js.Any])
    if (peers != null) __obj.updateDynamic("peers")(peers.asInstanceOf[js.Any])
    if (status != null) __obj.updateDynamic("status")(status.asInstanceOf[js.Any])
    __obj.asInstanceOf[IClientStatusGetResponse]
  }
}

