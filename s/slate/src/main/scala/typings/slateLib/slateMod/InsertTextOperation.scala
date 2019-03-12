package typings
package slateLib.slateMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InsertTextOperation extends Operation {
  var marks: js.Array[Mark]
  var offset: scala.Double
  var path: js.Array[scala.Double]
  var text: java.lang.String
  var `type`: slateLib.slateLibStrings.insert_text
}

object InsertTextOperation {
  @scala.inline
  def apply(
    marks: js.Array[Mark],
    offset: scala.Double,
    path: js.Array[scala.Double],
    text: java.lang.String,
    `type`: slateLib.slateLibStrings.insert_text
  ): InsertTextOperation = {
    val __obj = js.Dynamic.literal(marks = marks, offset = offset, path = path, text = text)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[InsertTextOperation]
  }
}

