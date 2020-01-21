package typings.rcTree.mod

import typings.rcTree.rcTreeStrings.select
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SelectData extends js.Object {
  var event: select
  var node: InternalTreeNode
  var selected: Boolean
  var selectedNodes: js.Array[InternalTreeNode]
}

object SelectData {
  @scala.inline
  def apply(
    event: select,
    node: InternalTreeNode,
    selected: Boolean,
    selectedNodes: js.Array[InternalTreeNode]
  ): SelectData = {
    val __obj = js.Dynamic.literal(event = event.asInstanceOf[js.Any], node = node.asInstanceOf[js.Any], selected = selected.asInstanceOf[js.Any], selectedNodes = selectedNodes.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[SelectData]
  }
}

