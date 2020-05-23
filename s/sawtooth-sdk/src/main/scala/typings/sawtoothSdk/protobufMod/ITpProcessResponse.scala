package typings.sawtoothSdk.protobufMod

import typings.sawtoothSdk.protobufMod.TpProcessResponse.Status
import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ITpProcessResponse extends js.Object {
  /** TpProcessResponse extendedData */
  var extendedData: js.UndefOr[Uint8Array | Null] = js.undefined
  /** TpProcessResponse message */
  var message: js.UndefOr[String | Null] = js.undefined
  /** TpProcessResponse status */
  var status: js.UndefOr[Status | Null] = js.undefined
}

object ITpProcessResponse {
  @scala.inline
  def apply(
    extendedData: js.UndefOr[Null | Uint8Array] = js.undefined,
    message: js.UndefOr[Null | String] = js.undefined,
    status: js.UndefOr[Null | Status] = js.undefined
  ): ITpProcessResponse = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(extendedData)) __obj.updateDynamic("extendedData")(extendedData.asInstanceOf[js.Any])
    if (!js.isUndefined(message)) __obj.updateDynamic("message")(message.asInstanceOf[js.Any])
    if (!js.isUndefined(status)) __obj.updateDynamic("status")(status.asInstanceOf[js.Any])
    __obj.asInstanceOf[ITpProcessResponse]
  }
}

