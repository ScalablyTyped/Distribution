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
  def apply(entries: js.Array[ITpStateEntry] = null, status: Status = null): ITpStateGetResponse = {
    val __obj = js.Dynamic.literal()
    if (entries != null) __obj.updateDynamic("entries")(entries.asInstanceOf[js.Any])
    if (status != null) __obj.updateDynamic("status")(status.asInstanceOf[js.Any])
    __obj.asInstanceOf[ITpStateGetResponse]
  }
}

