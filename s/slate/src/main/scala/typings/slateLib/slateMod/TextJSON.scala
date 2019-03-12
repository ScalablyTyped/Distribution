package typings
package slateLib.slateMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TextJSON extends NodeJSON {
  var key: js.UndefOr[java.lang.String] = js.undefined
  var leaves: js.Array[LeafJSON]
  var `object`: slateLib.slateLibStrings.text
}

object TextJSON {
  @scala.inline
  def apply(leaves: js.Array[LeafJSON], `object`: slateLib.slateLibStrings.text, key: java.lang.String = null): TextJSON = {
    val __obj = js.Dynamic.literal(leaves = leaves)
    __obj.updateDynamic("object")(`object`)
    if (key != null) __obj.updateDynamic("key")(key)
    __obj.asInstanceOf[TextJSON]
  }
}

