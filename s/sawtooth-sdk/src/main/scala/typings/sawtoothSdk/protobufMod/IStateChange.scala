package typings.sawtoothSdk.protobufMod

import typings.sawtoothSdk.protobufMod.StateChange.Type
import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IStateChange extends js.Object {
  /** StateChange address */
  var address: js.UndefOr[String | Null] = js.undefined
  /** StateChange type */
  var `type`: js.UndefOr[Type | Null] = js.undefined
  /** StateChange value */
  var value: js.UndefOr[Uint8Array | Null] = js.undefined
}

object IStateChange {
  @scala.inline
  def apply(
    address: js.UndefOr[Null | String] = js.undefined,
    `type`: js.UndefOr[Null | Type] = js.undefined,
    value: js.UndefOr[Null | Uint8Array] = js.undefined
  ): IStateChange = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(address)) __obj.updateDynamic("address")(address.asInstanceOf[js.Any])
    if (!js.isUndefined(`type`)) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (!js.isUndefined(value)) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[IStateChange]
  }
}

