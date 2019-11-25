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
    val __obj = js.Dynamic.literal(node = node.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], searchQuery = searchQuery.asInstanceOf[js.Any], treeIndex = treeIndex.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[SearchData]
  }
}

