package typings.sawtoothSdk.protobufMod

import typings.sawtoothSdk.protobufMod.Setting.IEntry
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ISetting extends js.Object {
  /** Setting entries */
  var entries: js.UndefOr[js.Array[IEntry] | Null] = js.undefined
}

object ISetting {
  @scala.inline
  def apply(entries: js.UndefOr[Null | js.Array[IEntry]] = js.undefined): ISetting = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(entries)) __obj.updateDynamic("entries")(entries.asInstanceOf[js.Any])
    __obj.asInstanceOf[ISetting]
  }
}

