package typings.sawtoothSdk.protobufMod

import typings.sawtoothSdk.protobufMod.ConsensusBlocksGetResponse.Status
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IConsensusBlocksGetResponse extends js.Object {
  /** ConsensusBlocksGetResponse blocks */
  var blocks: js.UndefOr[js.Array[IConsensusBlock] | Null] = js.undefined
  /** ConsensusBlocksGetResponse status */
  var status: js.UndefOr[Status | Null] = js.undefined
}

object IConsensusBlocksGetResponse {
  @scala.inline
  def apply(
    blocks: js.UndefOr[Null | js.Array[IConsensusBlock]] = js.undefined,
    status: js.UndefOr[Null | Status] = js.undefined
  ): IConsensusBlocksGetResponse = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(blocks)) __obj.updateDynamic("blocks")(blocks.asInstanceOf[js.Any])
    if (!js.isUndefined(status)) __obj.updateDynamic("status")(status.asInstanceOf[js.Any])
    __obj.asInstanceOf[IConsensusBlocksGetResponse]
  }
}

