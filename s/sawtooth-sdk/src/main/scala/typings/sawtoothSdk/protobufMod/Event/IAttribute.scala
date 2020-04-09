package typings.sawtoothSdk.protobufMod.Event

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Properties of an Attribute. */
trait IAttribute extends js.Object {
  /** Attribute key */
  var key: js.UndefOr[String | Null] = js.undefined
  /** Attribute value */
  var value: js.UndefOr[String | Null] = js.undefined
}

object IAttribute {
  @scala.inline
  def apply(key: String = null, value: String = null): IAttribute = {
    val __obj = js.Dynamic.literal()
    if (key != null) __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[IAttribute]
  }
}

