package typings.reactSortableTree

import typings.reactSortableTree.mod.NumberOrStringArray
import typings.reactSortableTree.mod.TreeItem
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined react-sortable-tree.react-sortable-tree.TreeNode & react-sortable-tree.react-sortable-tree.TreePath & {  lowerSiblingsCounts  :std.Array<number>} */
trait TreeNodeTreePathlowerSibl extends js.Object {
  var lowerSiblingsCounts: js.Array[Double]
  var node: TreeItem
  var path: NumberOrStringArray
}

object TreeNodeTreePathlowerSibl {
  @scala.inline
  def apply(lowerSiblingsCounts: js.Array[Double], node: TreeItem, path: NumberOrStringArray): TreeNodeTreePathlowerSibl = {
    val __obj = js.Dynamic.literal(lowerSiblingsCounts = lowerSiblingsCounts.asInstanceOf[js.Any], node = node.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any])
    __obj.asInstanceOf[TreeNodeTreePathlowerSibl]
  }
}

