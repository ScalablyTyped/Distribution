package typings
package reactDashSortableDashTreeLib.reactDashSortableDashTreeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FlatDataItem
  extends TreeNode
     with TreePath {
  var lowerSiblingsCounts: js.Array[scala.Double]
  var parentNode: TreeItem
}

object FlatDataItem {
  @scala.inline
  def apply(
    lowerSiblingsCounts: js.Array[scala.Double],
    node: TreeItem,
    parentNode: TreeItem,
    path: reactDashSortableDashTreeLib.NumberOrStringArray
  ): FlatDataItem = {
    val __obj = js.Dynamic.literal(lowerSiblingsCounts = lowerSiblingsCounts, node = node, parentNode = parentNode, path = path)
  
    __obj.asInstanceOf[FlatDataItem]
  }
}

