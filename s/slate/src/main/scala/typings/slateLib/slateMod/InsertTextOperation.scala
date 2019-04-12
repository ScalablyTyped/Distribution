package typings
package slateLib.slateMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InsertTextOperation extends Operation {
  var data: Data
  var marks: js.Array[Mark]
  var offset: scala.Double
  var path: Path
  var text: java.lang.String
  var `type`: slateLib.slateLibStrings.insert_text
}

object InsertTextOperation {
  @scala.inline
  def apply(
    data: Data,
    marks: js.Array[Mark],
    offset: scala.Double,
    path: Path,
    text: java.lang.String,
    `type`: slateLib.slateLibStrings.insert_text
  ): InsertTextOperation = {
    val __obj = js.Dynamic.literal(data = data, marks = marks, offset = offset, path = path.asInstanceOf[js.Any], text = text)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[InsertTextOperation]
  }
}

