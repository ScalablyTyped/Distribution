package typings.sawtoothSdk.protobufMod

import typings.sawtoothSdk.protobufMod.ConsensusSummarizeBlockResponse.Status
import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IConsensusSummarizeBlockResponse extends js.Object {
  /** ConsensusSummarizeBlockResponse status */
  var status: js.UndefOr[Status | Null] = js.undefined
  /** ConsensusSummarizeBlockResponse summary */
  var summary: js.UndefOr[Uint8Array | Null] = js.undefined
}

object IConsensusSummarizeBlockResponse {
  @scala.inline
  def apply(status: Status = null, summary: Uint8Array = null): IConsensusSummarizeBlockResponse = {
    val __obj = js.Dynamic.literal()
    if (status != null) __obj.updateDynamic("status")(status.asInstanceOf[js.Any])
    if (summary != null) __obj.updateDynamic("summary")(summary.asInstanceOf[js.Any])
    __obj.asInstanceOf[IConsensusSummarizeBlockResponse]
  }
}

