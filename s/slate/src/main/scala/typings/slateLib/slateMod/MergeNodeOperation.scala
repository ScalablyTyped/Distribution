package typings
package slateLib.slateMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MergeNodeOperation extends Operation {
  var path: js.Array[scala.Double]
  var position: scala.Double
  var `type`: slateLib.slateLibStrings.merge_node
}

object MergeNodeOperation {
  @scala.inline
  def apply(path: js.Array[scala.Double], position: scala.Double, `type`: slateLib.slateLibStrings.merge_node): MergeNodeOperation = {
    val __obj = js.Dynamic.literal(path = path, position = position)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[MergeNodeOperation]
  }
}

