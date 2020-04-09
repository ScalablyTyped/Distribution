package typings.sawtoothSdk.protobufMod

import typings.sawtoothSdk.protobufMod.ConsensusFailBlockResponse.Status
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IConsensusFailBlockResponse extends js.Object {
  /** ConsensusFailBlockResponse status */
  var status: js.UndefOr[Status | Null] = js.undefined
}

object IConsensusFailBlockResponse {
  @scala.inline
  def apply(status: Status = null): IConsensusFailBlockResponse = {
    val __obj = js.Dynamic.literal()
    if (status != null) __obj.updateDynamic("status")(status.asInstanceOf[js.Any])
    __obj.asInstanceOf[IConsensusFailBlockResponse]
  }
}

