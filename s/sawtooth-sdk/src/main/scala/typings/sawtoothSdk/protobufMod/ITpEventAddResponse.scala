package typings.sawtoothSdk.protobufMod

import typings.sawtoothSdk.protobufMod.TpEventAddResponse.Status
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ITpEventAddResponse extends js.Object {
  /** TpEventAddResponse status */
  var status: js.UndefOr[Status | Null] = js.undefined
}

object ITpEventAddResponse {
  @scala.inline
  def apply(status: js.UndefOr[Null | Status] = js.undefined): ITpEventAddResponse = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(status)) __obj.updateDynamic("status")(status.asInstanceOf[js.Any])
    __obj.asInstanceOf[ITpEventAddResponse]
  }
}

