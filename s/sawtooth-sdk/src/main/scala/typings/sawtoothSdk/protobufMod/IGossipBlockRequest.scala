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
  def apply(
    blockId: js.UndefOr[Null | String] = js.undefined,
    nonce: js.UndefOr[Null | String] = js.undefined,
    timeToLive: js.UndefOr[Null | Double] = js.undefined
  ): IGossipBlockRequest = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(blockId)) __obj.updateDynamic("blockId")(blockId.asInstanceOf[js.Any])
    if (!js.isUndefined(nonce)) __obj.updateDynamic("nonce")(nonce.asInstanceOf[js.Any])
    if (!js.isUndefined(timeToLive)) __obj.updateDynamic("timeToLive")(timeToLive.asInstanceOf[js.Any])
    __obj.asInstanceOf[IGossipBlockRequest]
  }
}

