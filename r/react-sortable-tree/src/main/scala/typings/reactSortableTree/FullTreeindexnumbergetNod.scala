package typings.reactSortableTree

import typings.reactSortableTree.mod.TreeIndex
import typings.reactSortableTree.mod.TreeItem
import typings.reactSortableTree.mod.TreeNode
import typings.reactSortableTree.treeDataUtilsMod.GetNodeKeyFunction
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined react-sortable-tree.react-sortable-tree.FullTree & {  index  :number,   getNodeKey  :react-sortable-tree.react-sortable-tree/utils/tree-data-utils.GetNodeKeyFunction} */
trait FullTreeindexnumbergetNod extends js.Object {
  var getNodeKey: GetNodeKeyFunction
  var index: Double
  var treeData: js.Array[TreeItem]
}

object FullTreeindexnumbergetNod {
  @scala.inline
  def apply(
    getNodeKey: /* data */ TreeIndex with TreeNode => String | Double,
    index: Double,
    treeData: js.Array[TreeItem]
  ): FullTreeindexnumbergetNod = {
    val __obj = js.Dynamic.literal(getNodeKey = js.Any.fromFunction1(getNodeKey), index = index.asInstanceOf[js.Any], treeData = treeData.asInstanceOf[js.Any])
    __obj.asInstanceOf[FullTreeindexnumbergetNod]
  }
}

