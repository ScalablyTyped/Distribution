package typings.reactDashSortableDashTree.reactDashSortableDashTreeMod

import typings.reactDashSortableDashTree.NumberOrStringArray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetTreeItemChildren extends js.Object {
  var lowerSiblingCounts: js.Array[Double]
  var node: TreeItem
  var path: NumberOrStringArray
  var treeIndex: Double
  def done(children: js.Array[TreeItem]): Unit
}

object GetTreeItemChildren {
  @scala.inline
  def apply(
    done: js.Array[TreeItem] => Unit,
    lowerSiblingCounts: js.Array[Double],
    node: TreeItem,
    path: NumberOrStringArray,
    treeIndex: Double
  ): GetTreeItemChildren = {
    val __obj = js.Dynamic.literal(done = js.Any.fromFunction1(done), lowerSiblingCounts = lowerSiblingCounts, node = node, path = path, treeIndex = treeIndex)
  
    __obj.asInstanceOf[GetTreeItemChildren]
  }
}

