package typings
package rcDashTreeLib.rcDashTreeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SelectData extends js.Object {
  var event: rcDashTreeLib.rcDashTreeLibStrings.select
  var node: InternalTreeNode
  var selected: scala.Boolean
  var selectedNodes: js.Array[InternalTreeNode]
}

object SelectData {
  @scala.inline
  def apply(
    event: rcDashTreeLib.rcDashTreeLibStrings.select,
    node: InternalTreeNode,
    selected: scala.Boolean,
    selectedNodes: js.Array[InternalTreeNode]
  ): SelectData = {
    val __obj = js.Dynamic.literal(event = event, node = node, selected = selected, selectedNodes = selectedNodes)
  
    __obj.asInstanceOf[SelectData]
  }
}

