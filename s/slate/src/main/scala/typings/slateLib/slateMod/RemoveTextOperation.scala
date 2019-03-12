package typings
package slateLib.slateMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RemoveTextOperation extends Operation {
  var offset: scala.Double
  var path: js.Array[scala.Double]
  var text: java.lang.String
  var `type`: slateLib.slateLibStrings.remove_text
}

object RemoveTextOperation {
  @scala.inline
  def apply(
    offset: scala.Double,
    path: js.Array[scala.Double],
    text: java.lang.String,
    `type`: slateLib.slateLibStrings.remove_text
  ): RemoveTextOperation = {
    val __obj = js.Dynamic.literal(offset = offset, path = path, text = text)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[RemoveTextOperation]
  }
}

