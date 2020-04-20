package typings.reactSortableTree.mod

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
    val __obj = js.Dynamic.literal(done = js.Any.fromFunction1(done), lowerSiblingCounts = lowerSiblingCounts.asInstanceOf[js.Any], node = node.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], treeIndex = treeIndex.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetTreeItemChildren]
  }
}

