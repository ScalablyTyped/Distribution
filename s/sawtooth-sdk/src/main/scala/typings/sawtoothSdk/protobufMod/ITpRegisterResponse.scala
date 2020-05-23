package typings.sawtoothSdk.protobufMod

import typings.sawtoothSdk.protobufMod.TpRegisterResponse.Status
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ITpRegisterResponse extends js.Object {
  /** TpRegisterResponse status */
  var status: js.UndefOr[Status | Null] = js.undefined
}

object ITpRegisterResponse {
  @scala.inline
  def apply(status: js.UndefOr[Null | Status] = js.undefined): ITpRegisterResponse = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(status)) __obj.updateDynamic("status")(status.asInstanceOf[js.Any])
    __obj.asInstanceOf[ITpRegisterResponse]
  }
}

