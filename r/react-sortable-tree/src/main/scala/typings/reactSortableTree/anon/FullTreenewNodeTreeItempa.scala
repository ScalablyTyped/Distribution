package typings.reactSortableTree.anon

import typings.reactSortableTree.mod.TreeIndex
import typings.reactSortableTree.mod.TreeItem
import typings.reactSortableTree.mod.TreeNode
import typings.reactSortableTree.treeDataUtilsMod.GetNodeKeyFunction
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined react-sortable-tree.react-sortable-tree.FullTree & {  newNode  :react-sortable-tree.react-sortable-tree.TreeItem,   parentKey ? :number | string,   getNodeKey  :react-sortable-tree.react-sortable-tree/utils/tree-data-utils.GetNodeKeyFunction,   ignoreCollapsed ? :boolean,   expandParent ? :boolean,   addAsFirstChild ? :boolean} */
trait FullTreenewNodeTreeItempa extends js.Object {
  var addAsFirstChild: js.UndefOr[Boolean] = js.undefined
  var expandParent: js.UndefOr[Boolean] = js.undefined
  var getNodeKey: GetNodeKeyFunction
  var ignoreCollapsed: js.UndefOr[Boolean] = js.undefined
  var newNode: TreeItem
  var parentKey: js.UndefOr[Double | String] = js.undefined
  var treeData: js.Array[TreeItem]
}

object FullTreenewNodeTreeItempa {
  @scala.inline
  def apply(
    getNodeKey: /* data */ TreeIndex with TreeNode => String | Double,
    newNode: TreeItem,
    treeData: js.Array[TreeItem],
    addAsFirstChild: js.UndefOr[Boolean] = js.undefined,
    expandParent: js.UndefOr[Boolean] = js.undefined,
    ignoreCollapsed: js.UndefOr[Boolean] = js.undefined,
    parentKey: Double | String = null
  ): FullTreenewNodeTreeItempa = {
    val __obj = js.Dynamic.literal(getNodeKey = js.Any.fromFunction1(getNodeKey), newNode = newNode.asInstanceOf[js.Any], treeData = treeData.asInstanceOf[js.Any])
    if (!js.isUndefined(addAsFirstChild)) __obj.updateDynamic("addAsFirstChild")(addAsFirstChild.get.asInstanceOf[js.Any])
    if (!js.isUndefined(expandParent)) __obj.updateDynamic("expandParent")(expandParent.get.asInstanceOf[js.Any])
    if (!js.isUndefined(ignoreCollapsed)) __obj.updateDynamic("ignoreCollapsed")(ignoreCollapsed.get.asInstanceOf[js.Any])
    if (parentKey != null) __obj.updateDynamic("parentKey")(parentKey.asInstanceOf[js.Any])
    __obj.asInstanceOf[FullTreenewNodeTreeItempa]
  }
}

