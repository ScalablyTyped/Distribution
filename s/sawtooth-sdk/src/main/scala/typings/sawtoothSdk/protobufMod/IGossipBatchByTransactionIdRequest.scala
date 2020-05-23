package typings.sawtoothSdk.protobufMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IGossipBatchByTransactionIdRequest extends js.Object {
  /** GossipBatchByTransactionIdRequest ids */
  var ids: js.UndefOr[js.Array[String] | Null] = js.undefined
  /** GossipBatchByTransactionIdRequest nonce */
  var nonce: js.UndefOr[String | Null] = js.undefined
  /** GossipBatchByTransactionIdRequest timeToLive */
  var timeToLive: js.UndefOr[Double | Null] = js.undefined
}

object IGossipBatchByTransactionIdRequest {
  @scala.inline
  def apply(
    ids: js.UndefOr[Null | js.Array[String]] = js.undefined,
    nonce: js.UndefOr[Null | String] = js.undefined,
    timeToLive: js.UndefOr[Null | Double] = js.undefined
  ): IGossipBatchByTransactionIdRequest = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(ids)) __obj.updateDynamic("ids")(ids.asInstanceOf[js.Any])
    if (!js.isUndefined(nonce)) __obj.updateDynamic("nonce")(nonce.asInstanceOf[js.Any])
    if (!js.isUndefined(timeToLive)) __obj.updateDynamic("timeToLive")(timeToLive.asInstanceOf[js.Any])
    __obj.asInstanceOf[IGossipBatchByTransactionIdRequest]
  }
}

