package typings.sawtoothSdk.protobufMod

import typings.sawtoothSdk.protobufMod.ConsensusSettingsGetResponse.Status
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IConsensusSettingsGetResponse extends js.Object {
  /** ConsensusSettingsGetResponse entries */
  var entries: js.UndefOr[js.Array[IConsensusSettingsEntry] | Null] = js.undefined
  /** ConsensusSettingsGetResponse status */
  var status: js.UndefOr[Status | Null] = js.undefined
}

object IConsensusSettingsGetResponse {
  @scala.inline
  def apply(entries: js.Array[IConsensusSettingsEntry] = null, status: Status = null): IConsensusSettingsGetResponse = {
    val __obj = js.Dynamic.literal()
    if (entries != null) __obj.updateDynamic("entries")(entries.asInstanceOf[js.Any])
    if (status != null) __obj.updateDynamic("status")(status.asInstanceOf[js.Any])
    __obj.asInstanceOf[IConsensusSettingsGetResponse]
  }
}

