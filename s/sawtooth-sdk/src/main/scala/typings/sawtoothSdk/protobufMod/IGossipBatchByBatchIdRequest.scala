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
  def apply(id: String = null, nonce: String = null, timeToLive: Int | Double = null): IGossipBatchByBatchIdRequest = {
    val __obj = js.Dynamic.literal()
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (nonce != null) __obj.updateDynamic("nonce")(nonce.asInstanceOf[js.Any])
    if (timeToLive != null) __obj.updateDynamic("timeToLive")(timeToLive.asInstanceOf[js.Any])
    __obj.asInstanceOf[IGossipBatchByBatchIdRequest]
  }
}

