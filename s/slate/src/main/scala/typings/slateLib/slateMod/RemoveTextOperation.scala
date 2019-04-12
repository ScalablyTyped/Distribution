package typings
package slateLib.slateMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RemoveTextOperation extends Operation {
  var data: Data
  var offset: scala.Double
  var path: Path
  var text: java.lang.String
  var `type`: slateLib.slateLibStrings.remove_text
}

object RemoveTextOperation {
  @scala.inline
  def apply(
    data: Data,
    offset: scala.Double,
    path: Path,
    text: java.lang.String,
    `type`: slateLib.slateLibStrings.remove_text
  ): RemoveTextOperation = {
    val __obj = js.Dynamic.literal(data = data, offset = offset, path = path.asInstanceOf[js.Any], text = text)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[RemoveTextOperation]
  }
}

