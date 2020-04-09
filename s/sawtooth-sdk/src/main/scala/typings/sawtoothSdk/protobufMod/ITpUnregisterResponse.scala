package typings.sawtoothSdk.protobufMod

import typings.sawtoothSdk.protobufMod.TpUnregisterResponse.Status
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ITpUnregisterResponse extends js.Object {
  /** TpUnregisterResponse status */
  var status: js.UndefOr[Status | Null] = js.undefined
}

object ITpUnregisterResponse {
  @scala.inline
  def apply(status: Status = null): ITpUnregisterResponse = {
    val __obj = js.Dynamic.literal()
    if (status != null) __obj.updateDynamic("status")(status.asInstanceOf[js.Any])
    __obj.asInstanceOf[ITpUnregisterResponse]
  }
}

