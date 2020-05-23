package typings.sawtoothSdk.protobufMod

import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ITpStateEntry extends js.Object {
  /** TpStateEntry address */
  var address: js.UndefOr[String | Null] = js.undefined
  /** TpStateEntry data */
  var data: js.UndefOr[Uint8Array | Null] = js.undefined
}

object ITpStateEntry {
  @scala.inline
  def apply(
    address: js.UndefOr[Null | String] = js.undefined,
    data: js.UndefOr[Null | Uint8Array] = js.undefined
  ): ITpStateEntry = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(address)) __obj.updateDynamic("address")(address.asInstanceOf[js.Any])
    if (!js.isUndefined(data)) __obj.updateDynamic("data")(data.asInstanceOf[js.Any])
    __obj.asInstanceOf[ITpStateEntry]
  }
}

