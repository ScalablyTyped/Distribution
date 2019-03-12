package typings
package slateLib.slateMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InsertNodeOperation extends Operation {
  var node: Node
  var path: js.Array[scala.Double]
  var `type`: slateLib.slateLibStrings.insert_node
}

object InsertNodeOperation {
  @scala.inline
  def apply(node: Node, path: js.Array[scala.Double], `type`: slateLib.slateLibStrings.insert_node): InsertNodeOperation = {
    val __obj = js.Dynamic.literal(node = node.asInstanceOf[js.Any], path = path)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[InsertNodeOperation]
  }
}

