package typings.reactDashSortableDashTree.reactDashSortableDashTreeMod

import typings.reactDashSortableDashTree.NumberOrStringArray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SearchData
  extends TreeNode
     with TreePath
     with TreeIndex {
  var searchQuery: js.Any
}

object SearchData {
  @scala.inline
  def apply(node: TreeItem, path: NumberOrStringArray, searchQuery: js.Any, treeIndex: Double): SearchData = {
    val __obj = js.Dynamic.literal(node = node, path = path, searchQuery = searchQuery, treeIndex = treeIndex)
  
    __obj.asInstanceOf[SearchData]
  }
}

