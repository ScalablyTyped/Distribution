package typings.sawtoothSdk.protobufMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IGossipBlockRequest extends js.Object {
  /** GossipBlockRequest blockId */
  var blockId: js.UndefOr[String | Null] = js.undefined
  /** GossipBlockRequest nonce */
  var nonce: js.UndefOr[String | Null] = js.undefined
  /** GossipBlockRequest timeToLive */
  var timeToLive: js.UndefOr[Double | Null] = js.undefined
}

object IGossipBlockRequest {
  @scala.inline
  def apply(blockId: String = null, nonce: String = null, timeToLive: Int | Double = null): IGossipBlockRequest = {
    val __obj = js.Dynamic.literal()
    if (blockId != null) __obj.updateDynamic("blockId")(blockId.asInstanceOf[js.Any])
    if (nonce != null) __obj.updateDynamic("nonce")(nonce.asInstanceOf[js.Any])
    if (timeToLive != null) __obj.updateDynamic("timeToLive")(timeToLive.asInstanceOf[js.Any])
    __obj.asInstanceOf[IGossipBlockRequest]
  }
}

