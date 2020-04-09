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
  def apply(key: String = null, value: String = null): IEntry = {
    val __obj = js.Dynamic.literal()
    if (key != null) __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[IEntry]
  }
}

