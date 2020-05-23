package typings.sawtoothSdk.protobufMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IClientSortControls extends js.Object {
  /** ClientSortControls keys */
  var keys: js.UndefOr[js.Array[String] | Null] = js.undefined
  /** ClientSortControls reverse */
  var reverse: js.UndefOr[Boolean | Null] = js.undefined
}

object IClientSortControls {
  @scala.inline
  def apply(
    keys: js.UndefOr[Null | js.Array[String]] = js.undefined,
    reverse: js.UndefOr[Null | Boolean] = js.undefined
  ): IClientSortControls = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(keys)) __obj.updateDynamic("keys")(keys.asInstanceOf[js.Any])
    if (!js.isUndefined(reverse)) __obj.updateDynamic("reverse")(reverse.asInstanceOf[js.Any])
    __obj.asInstanceOf[IClientSortControls]
  }
}

