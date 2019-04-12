package typings
package slateLib.slateMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AddMarkOperation extends Operation {
  var data: Data
  var length: scala.Double
  var mark: Mark
  var offset: scala.Double
  var path: Path
  var `type`: slateLib.slateLibStrings.add_mark
}

object AddMarkOperation {
  @scala.inline
  def apply(
    data: Data,
    length: scala.Double,
    mark: Mark,
    offset: scala.Double,
    path: Path,
    `type`: slateLib.slateLibStrings.add_mark
  ): AddMarkOperation = {
    val __obj = js.Dynamic.literal(data = data, length = length, mark = mark, offset = offset, path = path.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[AddMarkOperation]
  }
}

