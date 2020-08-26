package typings.reactSortableTree.anon

import typings.reactSortableTree.mod.NumberOrStringArray
import typings.reactSortableTree.mod.TreeIndex
import typings.reactSortableTree.mod.TreeItem
import typings.reactSortableTree.mod.TreeNode
import typings.reactSortableTree.treeDataUtilsMod.GetNodeKeyFunction
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined react-sortable-tree.react-sortable-tree.FullTree & react-sortable-tree.react-sortable-tree.TreePath & {  newNode :std.Function | any,   getNodeKey :react-sortable-tree.react-sortable-tree/utils/tree-data-utils.GetNodeKeyFunction,   ignoreCollapsed :boolean | undefined} */
@js.native
trait FullTreeTreePathnewNodeFu extends js.Object {
  var getNodeKey: GetNodeKeyFunction = js.native
  var ignoreCollapsed: js.UndefOr[Boolean] = js.native
  var newNode: js.Function | js.Any = js.native
  var path: NumberOrStringArray = js.native
  var treeData: js.Array[TreeItem] = js.native
}

object FullTreeTreePathnewNodeFu {
  @scala.inline
  def apply(
    getNodeKey: /* data */ TreeIndex with TreeNode => String | Double,
    newNode: js.Function | js.Any,
    path: NumberOrStringArray,
    treeData: js.Array[TreeItem]
  ): FullTreeTreePathnewNodeFu = {
    val __obj = js.Dynamic.literal(getNodeKey = js.Any.fromFunction1(getNodeKey), newNode = newNode.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], treeData = treeData.asInstanceOf[js.Any])
    __obj.asInstanceOf[FullTreeTreePathnewNodeFu]
  }
  @scala.inline
  implicit class FullTreeTreePathnewNodeFuOps[Self <: FullTreeTreePathnewNodeFu] (val x: Self) extends AnyVal {
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
    def setGetNodeKey(value: /* data */ TreeIndex with TreeNode => String | Double): Self = this.set("getNodeKey", js.Any.fromFunction1(value))
    @scala.inline
    def setNewNode(value: js.Function | js.Any): Self = this.set("newNode", value.asInstanceOf[js.Any])
    @scala.inline
    def setPathVarargs(value: (String | Double)*): Self = this.set("path", js.Array(value :_*))
    @scala.inline
    def setPath(value: NumberOrStringArray): Self = this.set("path", value.asInstanceOf[js.Any])
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

