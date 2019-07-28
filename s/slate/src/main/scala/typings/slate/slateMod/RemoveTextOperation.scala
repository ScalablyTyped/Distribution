package typings.slate.slateMod

import typings.slate.slateStrings.remove_text
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RemoveTextOperation extends Operation {
  var data: Data
  var offset: Double
  var path: Path
  var text: String
  var `type`: remove_text
}

object RemoveTextOperation {
  @scala.inline
  def apply(data: Data, offset: Double, path: Path, text: String, `type`: remove_text): RemoveTextOperation = {
    val __obj = js.Dynamic.literal(data = data, offset = offset, path = path.asInstanceOf[js.Any], text = text)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[RemoveTextOperation]
  }
}

