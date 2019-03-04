package typings
package reactDashSortableDashTreeLib.reactDashSortableDashTreeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SearchData extends NodeData {
  var searchQuery: js.Any
}

object SearchData {
  @scala.inline
  def apply(
    node: TreeItem,
    path: reactDashSortableDashTreeLib.NumberOrStringArray,
    searchQuery: js.Any,
    treeIndex: scala.Double
  ): SearchData = {
    val __obj = js.Dynamic.literal(node = node, path = path, searchQuery = searchQuery, treeIndex = treeIndex)
  
    __obj.asInstanceOf[SearchData]
  }
}

