package typings.reactSortableTree

import typings.reactSortableTree.mod.TreeIndex
import typings.reactSortableTree.mod.TreeItem
import typings.reactSortableTree.mod.TreeNode
import typings.reactSortableTree.treeDataUtilsMod.GetNodeKeyFunction
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined react-sortable-tree.react-sortable-tree.FullTree & {  depth  :number,   newNode  :react-sortable-tree.react-sortable-tree.TreeItem,   minimumTreeIndex  :number,   ignoreCollapsed ? :boolean,   expandParent ? :boolean,   getNodeKey  :react-sortable-tree.react-sortable-tree/utils/tree-data-utils.GetNodeKeyFunction} */
trait FullTreedepthnumbernewNod extends js.Object {
  var depth: Double
  var expandParent: js.UndefOr[Boolean] = js.undefined
  var getNodeKey: GetNodeKeyFunction
  var ignoreCollapsed: js.UndefOr[Boolean] = js.undefined
  var minimumTreeIndex: Double
  var newNode: TreeItem
  var treeData: js.Array[TreeItem]
}

object FullTreedepthnumbernewNod {
  @scala.inline
  def apply(
    depth: Double,
    getNodeKey: /* data */ TreeIndex with TreeNode => String | Double,
    minimumTreeIndex: Double,
    newNode: TreeItem,
    treeData: js.Array[TreeItem],
    expandParent: js.UndefOr[Boolean] = js.undefined,
    ignoreCollapsed: js.UndefOr[Boolean] = js.undefined
  ): FullTreedepthnumbernewNod = {
    val __obj = js.Dynamic.literal(depth = depth.asInstanceOf[js.Any], getNodeKey = js.Any.fromFunction1(getNodeKey), minimumTreeIndex = minimumTreeIndex.asInstanceOf[js.Any], newNode = newNode.asInstanceOf[js.Any], treeData = treeData.asInstanceOf[js.Any])
    if (!js.isUndefined(expandParent)) __obj.updateDynamic("expandParent")(expandParent.asInstanceOf[js.Any])
    if (!js.isUndefined(ignoreCollapsed)) __obj.updateDynamic("ignoreCollapsed")(ignoreCollapsed.asInstanceOf[js.Any])
    __obj.asInstanceOf[FullTreedepthnumbernewNod]
  }
}

