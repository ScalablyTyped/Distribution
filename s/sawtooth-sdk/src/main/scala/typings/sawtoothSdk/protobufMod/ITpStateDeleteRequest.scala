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
  def apply(
    addresses: js.UndefOr[Null | js.Array[String]] = js.undefined,
    contextId: js.UndefOr[Null | String] = js.undefined
  ): ITpStateDeleteRequest = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(addresses)) __obj.updateDynamic("addresses")(addresses.asInstanceOf[js.Any])
    if (!js.isUndefined(contextId)) __obj.updateDynamic("contextId")(contextId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ITpStateDeleteRequest]
  }
}

