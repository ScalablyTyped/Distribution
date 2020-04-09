package typings.sawtoothSdk.protobufMod

import typings.sawtoothSdk.protobufMod.ConsensusInitializeBlockResponse.Status
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IConsensusInitializeBlockResponse extends js.Object {
  /** ConsensusInitializeBlockResponse status */
  var status: js.UndefOr[Status | Null] = js.undefined
}

object IConsensusInitializeBlockResponse {
  @scala.inline
  def apply(status: Status = null): IConsensusInitializeBlockResponse = {
    val __obj = js.Dynamic.literal()
    if (status != null) __obj.updateDynamic("status")(status.asInstanceOf[js.Any])
    __obj.asInstanceOf[IConsensusInitializeBlockResponse]
  }
}

