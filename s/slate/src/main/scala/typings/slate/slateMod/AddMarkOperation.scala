package typings.slate.slateMod

import typings.slate.slateStrings.add_mark
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AddMarkOperation extends Operation {
  var data: Data
  var length: Double
  var mark: Mark
  var offset: Double
  var path: Path
  var `type`: add_mark
}

object AddMarkOperation {
  @scala.inline
  def apply(data: Data, length: Double, mark: Mark, offset: Double, path: Path, `type`: add_mark): AddMarkOperation = {
    val __obj = js.Dynamic.literal(data = data, length = length, mark = mark, offset = offset, path = path.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[AddMarkOperation]
  }
}

