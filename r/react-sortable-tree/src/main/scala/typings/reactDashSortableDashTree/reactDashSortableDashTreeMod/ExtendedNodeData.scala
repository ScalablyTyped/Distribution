package typings.reactDashSortableDashTree.reactDashSortableDashTreeMod

import typings.reactDashSortableDashTree.NumberOrStringArray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ExtendedNodeData
  extends TreeNode
     with TreePath
     with TreeIndex {
  var isSearchFocus: Boolean
  var isSearchMatch: Boolean
  var lowerSiblingCounts: js.Array[Double]
  var parentNode: TreeItem
}

object ExtendedNodeData {
  @scala.inline
  def apply(
    isSearchFocus: Boolean,
    isSearchMatch: Boolean,
    lowerSiblingCounts: js.Array[Double],
    node: TreeItem,
    parentNode: TreeItem,
    path: NumberOrStringArray,
    treeIndex: Double
  ): ExtendedNodeData = {
    val __obj = js.Dynamic.literal(isSearchFocus = isSearchFocus, isSearchMatch = isSearchMatch, lowerSiblingCounts = lowerSiblingCounts, node = node, parentNode = parentNode, path = path, treeIndex = treeIndex)
  
    __obj.asInstanceOf[ExtendedNodeData]
  }
}

