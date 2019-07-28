package typings.reactDashSortableDashTree.reactDashSortableDashTreeMod

import typings.reactDashSortableDashTree.NumberOrStringArray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NodeData
  extends TreeNode
     with TreePath
     with TreeIndex

object NodeData {
  @scala.inline
  def apply(node: TreeItem, path: NumberOrStringArray, treeIndex: Double): NodeData = {
    val __obj = js.Dynamic.literal(node = node, path = path, treeIndex = treeIndex)
  
    __obj.asInstanceOf[NodeData]
  }
}

