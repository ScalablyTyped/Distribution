package typings
package reactDashSortableDashTreeLib.reactDashSortableDashTreeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ShouldCopyData extends js.Object {
  var node: TreeNode
  var prevPath: reactDashSortableDashTreeLib.NumberOrStringArray
  var prevTreeIndex: scala.Double
}

object ShouldCopyData {
  @scala.inline
  def apply(
    node: TreeNode,
    prevPath: reactDashSortableDashTreeLib.NumberOrStringArray,
    prevTreeIndex: scala.Double
  ): ShouldCopyData = {
    val __obj = js.Dynamic.literal(node = node, prevPath = prevPath, prevTreeIndex = prevTreeIndex)
  
    __obj.asInstanceOf[ShouldCopyData]
  }
}

