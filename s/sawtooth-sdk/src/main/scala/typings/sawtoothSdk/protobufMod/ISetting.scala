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
  def apply(entries: js.Array[IEntry] = null): ISetting = {
    val __obj = js.Dynamic.literal()
    if (entries != null) __obj.updateDynamic("entries")(entries.asInstanceOf[js.Any])
    __obj.asInstanceOf[ISetting]
  }
}

