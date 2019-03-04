package typings
package reactDashSortableDashTreeLib.reactDashSortableDashTreeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ExtendedNodeData extends NodeData {
  var isSearchFocus: scala.Boolean
  var isSearchMatch: scala.Boolean
  var lowerSiblingsCounts: js.Array[scala.Double]
  var parentNode: TreeItem
}

object ExtendedNodeData {
  @scala.inline
  def apply(
    isSearchFocus: scala.Boolean,
    isSearchMatch: scala.Boolean,
    lowerSiblingsCounts: js.Array[scala.Double],
    node: TreeItem,
    parentNode: TreeItem,
    path: reactDashSortableDashTreeLib.NumberOrStringArray,
    treeIndex: scala.Double
  ): ExtendedNodeData = {
    val __obj = js.Dynamic.literal(isSearchFocus = isSearchFocus, isSearchMatch = isSearchMatch, lowerSiblingsCounts = lowerSiblingsCounts, node = node, parentNode = parentNode, path = path, treeIndex = treeIndex)
  
    __obj.asInstanceOf[ExtendedNodeData]
  }
}

