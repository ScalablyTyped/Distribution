package typings.sawtoothSdk.protobufMod

import typings.sawtoothSdk.protobufMod.TpStateSetResponse.Status
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ITpStateSetResponse extends js.Object {
  /** TpStateSetResponse addresses */
  var addresses: js.UndefOr[js.Array[String] | Null] = js.undefined
  /** TpStateSetResponse status */
  var status: js.UndefOr[Status | Null] = js.undefined
}

object ITpStateSetResponse {
  @scala.inline
  def apply(addresses: js.Array[String] = null, status: Status = null): ITpStateSetResponse = {
    val __obj = js.Dynamic.literal()
    if (addresses != null) __obj.updateDynamic("addresses")(addresses.asInstanceOf[js.Any])
    if (status != null) __obj.updateDynamic("status")(status.asInstanceOf[js.Any])
    __obj.asInstanceOf[ITpStateSetResponse]
  }
}

