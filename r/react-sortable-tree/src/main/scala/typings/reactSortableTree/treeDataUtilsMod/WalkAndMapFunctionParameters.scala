package typings.reactSortableTree.treeDataUtilsMod

import typings.reactSortableTree.mod.TreeIndex
import typings.reactSortableTree.mod.TreeItem
import typings.reactSortableTree.mod.TreeNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined react-sortable-tree.react-sortable-tree.FullTree & {  getNodeKey  :react-sortable-tree.react-sortable-tree/utils/tree-data-utils.GetNodeKeyFunction,   callback  :std.Function,   ignoreCollapsed ? :boolean} */
trait WalkAndMapFunctionParameters extends js.Object {
  var callback: js.Function
  var getNodeKey: GetNodeKeyFunction
  var ignoreCollapsed: js.UndefOr[Boolean] = js.undefined
  var treeData: js.Array[TreeItem]
}

object WalkAndMapFunctionParameters {
  @scala.inline
  def apply(
    callback: js.Function,
    getNodeKey: /* data */ TreeIndex with TreeNode => String | Double,
    treeData: js.Array[TreeItem],
    ignoreCollapsed: js.UndefOr[Boolean] = js.undefined
  ): WalkAndMapFunctionParameters = {
    val __obj = js.Dynamic.literal(callback = callback.asInstanceOf[js.Any], getNodeKey = js.Any.fromFunction1(getNodeKey), treeData = treeData.asInstanceOf[js.Any])
    if (!js.isUndefined(ignoreCollapsed)) __obj.updateDynamic("ignoreCollapsed")(ignoreCollapsed.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[WalkAndMapFunctionParameters]
  }
}

