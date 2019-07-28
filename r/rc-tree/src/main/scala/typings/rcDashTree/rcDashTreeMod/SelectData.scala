package typings.rcDashTree.rcDashTreeMod

import typings.rcDashTree.rcDashTreeStrings.select
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
    val __obj = js.Dynamic.literal(event = event, node = node, selected = selected, selectedNodes = selectedNodes)
  
    __obj.asInstanceOf[SelectData]
  }
}

