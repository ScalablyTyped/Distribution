package typings
package slateLib.slateMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RemoveNodeOperation extends Operation {
  var node: Node
  var path: js.Array[scala.Double]
  var `type`: slateLib.slateLibStrings.remove_node
}

object RemoveNodeOperation {
  @scala.inline
  def apply(node: Node, path: js.Array[scala.Double], `type`: slateLib.slateLibStrings.remove_node): RemoveNodeOperation = {
    val __obj = js.Dynamic.literal(node = node.asInstanceOf[js.Any], path = path)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[RemoveNodeOperation]
  }
}

