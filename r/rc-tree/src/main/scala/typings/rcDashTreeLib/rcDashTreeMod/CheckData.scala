package typings
package rcDashTreeLib.rcDashTreeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CheckData extends js.Object {
  var checked: scala.Boolean
  var checkedNodes: js.Array[InternalTreeNode]
  var event: rcDashTreeLib.rcDashTreeLibStrings.check
  var halfCheckedKeys: js.Array[java.lang.String]
  var node: InternalTreeNode
}

object CheckData {
  @scala.inline
  def apply(
    checked: scala.Boolean,
    checkedNodes: js.Array[InternalTreeNode],
    event: rcDashTreeLib.rcDashTreeLibStrings.check,
    halfCheckedKeys: js.Array[java.lang.String],
    node: InternalTreeNode
  ): CheckData = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("checked")(checked)
    __obj.updateDynamic("checkedNodes")(checkedNodes)
    __obj.updateDynamic("event")(event)
    __obj.updateDynamic("halfCheckedKeys")(halfCheckedKeys)
    __obj.updateDynamic("node")(node)
    __obj.asInstanceOf[CheckData]
  }
}

