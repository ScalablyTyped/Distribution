package typings.sawtoothSdk.protobufMod.Setting

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Properties of an Entry. */
trait IEntry extends js.Object {
  /** Entry key */
  var key: js.UndefOr[String | Null] = js.undefined
  /** Entry value */
  var value: js.UndefOr[String | Null] = js.undefined
}

object IEntry {
  @scala.inline
  def apply(key: js.UndefOr[Null | String] = js.undefined, value: js.UndefOr[Null | String] = js.undefined): IEntry = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(key)) __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    if (!js.isUndefined(value)) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[IEntry]
  }
}

