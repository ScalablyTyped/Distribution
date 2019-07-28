package typings.rcDashTree.rcDashTreeMod

import typings.rcDashTree.rcDashTreeStrings.check
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CheckData extends js.Object {
  var checked: Boolean
  var checkedNodes: js.Array[InternalTreeNode]
  var event: check
  var halfCheckedKeys: js.Array[String]
  var node: InternalTreeNode
}

object CheckData {
  @scala.inline
  def apply(
    checked: Boolean,
    checkedNodes: js.Array[InternalTreeNode],
    event: check,
    halfCheckedKeys: js.Array[String],
    node: InternalTreeNode
  ): CheckData = {
    val __obj = js.Dynamic.literal(checked = checked, checkedNodes = checkedNodes, event = event, halfCheckedKeys = halfCheckedKeys, node = node)
  
    __obj.asInstanceOf[CheckData]
  }
}

