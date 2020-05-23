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
  def apply(
    status: js.UndefOr[Null | Status] = js.undefined,
    summary: js.UndefOr[Null | Uint8Array] = js.undefined
  ): IConsensusSummarizeBlockResponse = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(status)) __obj.updateDynamic("status")(status.asInstanceOf[js.Any])
    if (!js.isUndefined(summary)) __obj.updateDynamic("summary")(summary.asInstanceOf[js.Any])
    __obj.asInstanceOf[IConsensusSummarizeBlockResponse]
  }
}

