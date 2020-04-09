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
  def apply(entries: js.Array[IConsensusStateEntry] = null, status: Status = null): IConsensusStateGetResponse = {
    val __obj = js.Dynamic.literal()
    if (entries != null) __obj.updateDynamic("entries")(entries.asInstanceOf[js.Any])
    if (status != null) __obj.updateDynamic("status")(status.asInstanceOf[js.Any])
    __obj.asInstanceOf[IConsensusStateGetResponse]
  }
}

