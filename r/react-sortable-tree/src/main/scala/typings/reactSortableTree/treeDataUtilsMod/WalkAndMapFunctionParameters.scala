package typings.reactSortableTree.treeDataUtilsMod

import typings.reactSortableTree.mod.TreeIndex
import typings.reactSortableTree.mod.TreeItem
import typings.reactSortableTree.mod.TreeNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined react-sortable-tree.react-sortable-tree.FullTree & {  getNodeKey :react-sortable-tree.react-sortable-tree/utils/tree-data-utils.GetNodeKeyFunction,   callback :std.Function,   ignoreCollapsed :boolean | undefined} */
@js.native
trait WalkAndMapFunctionParameters extends js.Object {
  var callback: js.Function = js.native
  var getNodeKey: GetNodeKeyFunction = js.native
  var ignoreCollapsed: js.UndefOr[Boolean] = js.native
  var treeData: js.Array[TreeItem] = js.native
}

object WalkAndMapFunctionParameters {
  @scala.inline
  def apply(
    callback: js.Function,
    getNodeKey: /* data */ TreeIndex with TreeNode => String | Double,
    treeData: js.Array[TreeItem]
  ): WalkAndMapFunctionParameters = {
    val __obj = js.Dynamic.literal(callback = callback.asInstanceOf[js.Any], getNodeKey = js.Any.fromFunction1(getNodeKey), treeData = treeData.asInstanceOf[js.Any])
    __obj.asInstanceOf[WalkAndMapFunctionParameters]
  }
  @scala.inline
  implicit class WalkAndMapFunctionParametersOps[Self <: WalkAndMapFunctionParameters] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setCallback(value: js.Function): Self = this.set("callback", value.asInstanceOf[js.Any])
    @scala.inline
    def setGetNodeKey(value: /* data */ TreeIndex with TreeNode => String | Double): Self = this.set("getNodeKey", js.Any.fromFunction1(value))
    @scala.inline
    def setTreeDataVarargs(value: TreeItem*): Self = this.set("treeData", js.Array(value :_*))
    @scala.inline
    def setTreeData(value: js.Array[TreeItem]): Self = this.set("treeData", value.asInstanceOf[js.Any])
    @scala.inline
    def setIgnoreCollapsed(value: Boolean): Self = this.set("ignoreCollapsed", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIgnoreCollapsed: Self = this.set("ignoreCollapsed", js.undefined)
  }
  
}

