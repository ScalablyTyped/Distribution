package typings.sawtoothSdk.protobufMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ITpStateDeleteRequest extends js.Object {
  /** TpStateDeleteRequest addresses */
  var addresses: js.UndefOr[js.Array[String] | Null] = js.undefined
  /** TpStateDeleteRequest contextId */
  var contextId: js.UndefOr[String | Null] = js.undefined
}

object ITpStateDeleteRequest {
  @scala.inline
  def apply(addresses: js.Array[String] = null, contextId: String = null): ITpStateDeleteRequest = {
    val __obj = js.Dynamic.literal()
    if (addresses != null) __obj.updateDynamic("addresses")(addresses.asInstanceOf[js.Any])
    if (contextId != null) __obj.updateDynamic("contextId")(contextId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ITpStateDeleteRequest]
  }
}

