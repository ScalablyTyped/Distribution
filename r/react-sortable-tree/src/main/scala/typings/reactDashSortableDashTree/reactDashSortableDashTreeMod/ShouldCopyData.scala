package typings.reactDashSortableDashTree.reactDashSortableDashTreeMod

import typings.reactDashSortableDashTree.NumberOrStringArray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ShouldCopyData extends js.Object {
  var node: TreeNode
  var prevPath: NumberOrStringArray
  var prevTreeIndex: Double
}

object ShouldCopyData {
  @scala.inline
  def apply(node: TreeNode, prevPath: NumberOrStringArray, prevTreeIndex: Double): ShouldCopyData = {
    val __obj = js.Dynamic.literal(node = node, prevPath = prevPath, prevTreeIndex = prevTreeIndex)
  
    __obj.asInstanceOf[ShouldCopyData]
  }
}

