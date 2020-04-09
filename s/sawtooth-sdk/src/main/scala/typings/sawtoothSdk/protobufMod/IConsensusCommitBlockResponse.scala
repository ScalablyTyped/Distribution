package typings.sawtoothSdk.protobufMod

import typings.sawtoothSdk.protobufMod.ConsensusCommitBlockResponse.Status
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IConsensusCommitBlockResponse extends js.Object {
  /** ConsensusCommitBlockResponse status */
  var status: js.UndefOr[Status | Null] = js.undefined
}

object IConsensusCommitBlockResponse {
  @scala.inline
  def apply(status: Status = null): IConsensusCommitBlockResponse = {
    val __obj = js.Dynamic.literal()
    if (status != null) __obj.updateDynamic("status")(status.asInstanceOf[js.Any])
    __obj.asInstanceOf[IConsensusCommitBlockResponse]
  }
}

