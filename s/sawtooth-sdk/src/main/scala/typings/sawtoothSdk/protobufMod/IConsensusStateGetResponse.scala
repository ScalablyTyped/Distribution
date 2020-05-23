package typings.sawtoothSdk.protobufMod

import typings.sawtoothSdk.protobufMod.ConsensusStateGetResponse.Status
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IConsensusStateGetResponse extends js.Object {
  /** ConsensusStateGetResponse entries */
  var entries: js.UndefOr[js.Array[IConsensusStateEntry] | Null] = js.undefined
  /** ConsensusStateGetResponse status */
  var status: js.UndefOr[Status | Null] = js.undefined
}

object IConsensusStateGetResponse {
  @scala.inline
  def apply(
    entries: js.UndefOr[Null | js.Array[IConsensusStateEntry]] = js.undefined,
    status: js.UndefOr[Null | Status] = js.undefined
  ): IConsensusStateGetResponse = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(entries)) __obj.updateDynamic("entries")(entries.asInstanceOf[js.Any])
    if (!js.isUndefined(status)) __obj.updateDynamic("status")(status.asInstanceOf[js.Any])
    __obj.asInstanceOf[IConsensusStateGetResponse]
  }
}

