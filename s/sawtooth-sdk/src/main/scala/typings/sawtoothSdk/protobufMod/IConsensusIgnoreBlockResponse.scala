package typings.sawtoothSdk.protobufMod

import typings.sawtoothSdk.protobufMod.ConsensusIgnoreBlockResponse.Status
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IConsensusIgnoreBlockResponse extends js.Object {
  /** ConsensusIgnoreBlockResponse status */
  var status: js.UndefOr[Status | Null] = js.undefined
}

object IConsensusIgnoreBlockResponse {
  @scala.inline
  def apply(status: js.UndefOr[Null | Status] = js.undefined): IConsensusIgnoreBlockResponse = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(status)) __obj.updateDynamic("status")(status.asInstanceOf[js.Any])
    __obj.asInstanceOf[IConsensusIgnoreBlockResponse]
  }
}

