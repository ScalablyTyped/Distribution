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
  def apply(address: String = null, `type`: Type = null, value: Uint8Array = null): IStateChange = {
    val __obj = js.Dynamic.literal()
    if (address != null) __obj.updateDynamic("address")(address.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[IStateChange]
  }
}

