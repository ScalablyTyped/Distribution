package typings.sawtoothSdk.protobufMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IGetPeersResponse extends js.Object {
  /** GetPeersResponse peerEndpoints */
  var peerEndpoints: js.UndefOr[js.Array[String] | Null] = js.undefined
}

object IGetPeersResponse {
  @scala.inline
  def apply(peerEndpoints: js.UndefOr[Null | js.Array[String]] = js.undefined): IGetPeersResponse = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(peerEndpoints)) __obj.updateDynamic("peerEndpoints")(peerEndpoints.asInstanceOf[js.Any])
    __obj.asInstanceOf[IGetPeersResponse]
  }
}

