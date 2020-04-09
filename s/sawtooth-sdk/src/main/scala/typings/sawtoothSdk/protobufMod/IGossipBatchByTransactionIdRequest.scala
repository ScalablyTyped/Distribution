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
  def apply(ids: js.Array[String] = null, nonce: String = null, timeToLive: Int | Double = null): IGossipBatchByTransactionIdRequest = {
    val __obj = js.Dynamic.literal()
    if (ids != null) __obj.updateDynamic("ids")(ids.asInstanceOf[js.Any])
    if (nonce != null) __obj.updateDynamic("nonce")(nonce.asInstanceOf[js.Any])
    if (timeToLive != null) __obj.updateDynamic("timeToLive")(timeToLive.asInstanceOf[js.Any])
    __obj.asInstanceOf[IGossipBatchByTransactionIdRequest]
  }
}

