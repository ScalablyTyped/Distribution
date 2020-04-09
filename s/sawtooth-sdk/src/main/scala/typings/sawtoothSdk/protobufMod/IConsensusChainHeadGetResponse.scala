package typings.sawtoothSdk.protobufMod

import typings.sawtoothSdk.protobufMod.ConsensusChainHeadGetResponse.Status
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IConsensusChainHeadGetResponse extends js.Object {
  /** ConsensusChainHeadGetResponse block */
  var block: js.UndefOr[IConsensusBlock | Null] = js.undefined
  /** ConsensusChainHeadGetResponse status */
  var status: js.UndefOr[Status | Null] = js.undefined
}

object IConsensusChainHeadGetResponse {
  @scala.inline
  def apply(block: IConsensusBlock = null, status: Status = null): IConsensusChainHeadGetResponse = {
    val __obj = js.Dynamic.literal()
    if (block != null) __obj.updateDynamic("block")(block.asInstanceOf[js.Any])
    if (status != null) __obj.updateDynamic("status")(status.asInstanceOf[js.Any])
    __obj.asInstanceOf[IConsensusChainHeadGetResponse]
  }
}

