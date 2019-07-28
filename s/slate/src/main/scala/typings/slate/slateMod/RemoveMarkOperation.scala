package typings.slate.slateMod

import typings.slate.slateStrings.remove_mark
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RemoveMarkOperation extends Operation {
  var data: Data
  var length: Double
  var mark: Mark
  var offset: Double
  var path: Path
  var `type`: remove_mark
}

object RemoveMarkOperation {
  @scala.inline
  def apply(data: Data, length: Double, mark: Mark, offset: Double, path: Path, `type`: remove_mark): RemoveMarkOperation = {
    val __obj = js.Dynamic.literal(data = data, length = length, mark = mark, offset = offset, path = path.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[RemoveMarkOperation]
  }
}

