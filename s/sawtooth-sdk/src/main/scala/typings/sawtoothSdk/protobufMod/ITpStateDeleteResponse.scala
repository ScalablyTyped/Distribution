package typings.sawtoothSdk.protobufMod

import typings.sawtoothSdk.protobufMod.TpStateDeleteResponse.Status
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ITpStateDeleteResponse extends js.Object {
  /** TpStateDeleteResponse addresses */
  var addresses: js.UndefOr[js.Array[String] | Null] = js.undefined
  /** TpStateDeleteResponse status */
  var status: js.UndefOr[Status | Null] = js.undefined
}

object ITpStateDeleteResponse {
  @scala.inline
  def apply(addresses: js.Array[String] = null, status: Status = null): ITpStateDeleteResponse = {
    val __obj = js.Dynamic.literal()
    if (addresses != null) __obj.updateDynamic("addresses")(addresses.asInstanceOf[js.Any])
    if (status != null) __obj.updateDynamic("status")(status.asInstanceOf[js.Any])
    __obj.asInstanceOf[ITpStateDeleteResponse]
  }
}

