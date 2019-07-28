package typings.slate.slateMod

import typings.slate.slateStrings.insert_text
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InsertTextOperation extends Operation {
  var data: Data
  var marks: js.Array[Mark]
  var offset: Double
  var path: Path
  var text: String
  var `type`: insert_text
}

object InsertTextOperation {
  @scala.inline
  def apply(data: Data, marks: js.Array[Mark], offset: Double, path: Path, text: String, `type`: insert_text): InsertTextOperation = {
    val __obj = js.Dynamic.literal(data = data, marks = marks, offset = offset, path = path.asInstanceOf[js.Any], text = text)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[InsertTextOperation]
  }
}

