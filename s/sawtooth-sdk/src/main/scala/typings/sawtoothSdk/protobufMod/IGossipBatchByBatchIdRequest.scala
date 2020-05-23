package typings.sawtoothSdk.protobufMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IGossipBatchByBatchIdRequest extends js.Object {
  /** GossipBatchByBatchIdRequest id */
  var id: js.UndefOr[String | Null] = js.undefined
  /** GossipBatchByBatchIdRequest nonce */
  var nonce: js.UndefOr[String | Null] = js.undefined
  /** GossipBatchByBatchIdRequest timeToLive */
  var timeToLive: js.UndefOr[Double | Null] = js.undefined
}

object IGossipBatchByBatchIdRequest {
  @scala.inline
  def apply(
    id: js.UndefOr[Null | String] = js.undefined,
    nonce: js.UndefOr[Null | String] = js.undefined,
    timeToLive: js.UndefOr[Null | Double] = js.undefined
  ): IGossipBatchByBatchIdRequest = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(id)) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (!js.isUndefined(nonce)) __obj.updateDynamic("nonce")(nonce.asInstanceOf[js.Any])
    if (!js.isUndefined(timeToLive)) __obj.updateDynamic("timeToLive")(timeToLive.asInstanceOf[js.Any])
    __obj.asInstanceOf[IGossipBatchByBatchIdRequest]
  }
}

