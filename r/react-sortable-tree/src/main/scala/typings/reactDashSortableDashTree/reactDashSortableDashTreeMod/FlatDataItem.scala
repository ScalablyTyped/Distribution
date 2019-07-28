package typings.reactDashSortableDashTree.reactDashSortableDashTreeMod

import typings.reactDashSortableDashTree.NumberOrStringArray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FlatDataItem
  extends TreeNode
     with TreePath {
  var lowerSiblingsCounts: js.Array[Double]
  var parentNode: TreeItem
}

object FlatDataItem {
  @scala.inline
  def apply(
    lowerSiblingsCounts: js.Array[Double],
    node: TreeItem,
    parentNode: TreeItem,
    path: NumberOrStringArray
  ): FlatDataItem = {
    val __obj = js.Dynamic.literal(lowerSiblingsCounts = lowerSiblingsCounts, node = node, parentNode = parentNode, path = path)
  
    __obj.asInstanceOf[FlatDataItem]
  }
}

