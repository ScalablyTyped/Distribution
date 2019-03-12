package typings
package slateLib.slateMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MoveNodeOperation extends Operation {
  var newPath: js.Array[scala.Double]
  var path: js.Array[scala.Double]
  var `type`: slateLib.slateLibStrings.move_node
}

object MoveNodeOperation {
  @scala.inline
  def apply(
    newPath: js.Array[scala.Double],
    path: js.Array[scala.Double],
    `type`: slateLib.slateLibStrings.move_node
  ): MoveNodeOperation = {
    val __obj = js.Dynamic.literal(newPath = newPath, path = path)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[MoveNodeOperation]
  }
}

