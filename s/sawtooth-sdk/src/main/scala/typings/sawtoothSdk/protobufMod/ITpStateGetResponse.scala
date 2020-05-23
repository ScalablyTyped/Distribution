package typings.sawtoothSdk.protobufMod

import typings.sawtoothSdk.protobufMod.TpStateGetResponse.Status
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ITpStateGetResponse extends js.Object {
  /** TpStateGetResponse entries */
  var entries: js.UndefOr[js.Array[ITpStateEntry] | Null] = js.undefined
  /** TpStateGetResponse status */
  var status: js.UndefOr[Status | Null] = js.undefined
}

object ITpStateGetResponse {
  @scala.inline
  def apply(
    entries: js.UndefOr[Null | js.Array[ITpStateEntry]] = js.undefined,
    status: js.UndefOr[Null | Status] = js.undefined
  ): ITpStateGetResponse = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(entries)) __obj.updateDynamic("entries")(entries.asInstanceOf[js.Any])
    if (!js.isUndefined(status)) __obj.updateDynamic("status")(status.asInstanceOf[js.Any])
    __obj.asInstanceOf[ITpStateGetResponse]
  }
}

