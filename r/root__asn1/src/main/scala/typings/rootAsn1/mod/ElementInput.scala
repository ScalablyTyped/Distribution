package typings.rootAsn1.mod

import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ElementInput extends js.Object {
  var children: js.UndefOr[js.Array[ElementInput]] = js.undefined
  var `type`: Double
  var value: js.UndefOr[String | Uint8Array] = js.undefined
}

object ElementInput {
  @scala.inline
  def apply(`type`: Double, children: js.Array[ElementInput] = null, value: String | Uint8Array = null): ElementInput = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[ElementInput]
  }
}

