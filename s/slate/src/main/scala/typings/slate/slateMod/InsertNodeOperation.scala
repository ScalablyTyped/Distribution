package typings.slate.slateMod

import typings.slate.slateStrings.insert_node
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InsertNodeOperation extends Operation {
  var data: Data
  var node: Node
  var path: Path
  var `type`: insert_node
}

object InsertNodeOperation {
  @scala.inline
  def apply(data: Data, node: Node, path: Path, `type`: insert_node): InsertNodeOperation = {
    val __obj = js.Dynamic.literal(data = data, node = node.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[InsertNodeOperation]
  }
}

