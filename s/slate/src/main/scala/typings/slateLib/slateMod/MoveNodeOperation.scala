package typings
package slateLib.slateMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MoveNodeOperation extends Operation {
  var data: Data
  var newPath: Path | js.Array[scala.Double]
  var path: Path
  var `type`: slateLib.slateLibStrings.move_node
}

object MoveNodeOperation {
  @scala.inline
  def apply(
    data: Data,
    newPath: Path | js.Array[scala.Double],
    path: Path,
    `type`: slateLib.slateLibStrings.move_node
  ): MoveNodeOperation = {
    val __obj = js.Dynamic.literal(data = data, newPath = newPath.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[MoveNodeOperation]
  }
}

