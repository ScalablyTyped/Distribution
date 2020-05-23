package typings.reactSortableTree.anon

import typings.reactSortableTree.mod.NumberOrStringArray
import typings.reactSortableTree.mod.TreeItem
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined react-sortable-tree.react-sortable-tree.FullTree & react-sortable-tree.react-sortable-tree.TreeIndex & react-sortable-tree.react-sortable-tree.TreePath & {  parentNode  :react-sortable-tree.react-sortable-tree.TreeItem} */
trait FullTreeTreeIndexTreePath extends js.Object {
  var parentNode: TreeItem
  var path: NumberOrStringArray
  var treeData: js.Array[TreeItem]
  var treeIndex: Double
}

object FullTreeTreeIndexTreePath {
  @scala.inline
  def apply(parentNode: TreeItem, path: NumberOrStringArray, treeData: js.Array[TreeItem], treeIndex: Double): FullTreeTreeIndexTreePath = {
    val __obj = js.Dynamic.literal(parentNode = parentNode.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], treeData = treeData.asInstanceOf[js.Any], treeIndex = treeIndex.asInstanceOf[js.Any])
    __obj.asInstanceOf[FullTreeTreeIndexTreePath]
  }
}

