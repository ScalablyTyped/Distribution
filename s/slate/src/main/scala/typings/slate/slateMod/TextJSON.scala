package typings.slate.slateMod

import typings.slate.slateStrings.text
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TextJSON extends NodeJSON {
  var key: js.UndefOr[String] = js.undefined
  var leaves: js.Array[LeafJSON]
  var `object`: text
}

object TextJSON {
  @scala.inline
  def apply(leaves: js.Array[LeafJSON], `object`: text, key: String = null): TextJSON = {
    val __obj = js.Dynamic.literal(leaves = leaves)
    __obj.updateDynamic("object")(`object`)
    if (key != null) __obj.updateDynamic("key")(key)
    __obj.asInstanceOf[TextJSON]
  }
}

