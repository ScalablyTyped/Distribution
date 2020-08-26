package typings.reactSortableTree.anon

import typings.reactSortableTree.mod.TreeIndex
import typings.reactSortableTree.mod.TreeItem
import typings.reactSortableTree.mod.TreeNode
import typings.reactSortableTree.treeDataUtilsMod.GetNodeKeyFunction
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined react-sortable-tree.react-sortable-tree.FullTree & {  newNode :react-sortable-tree.react-sortable-tree.TreeItem,   parentKey :number | string | undefined,   getNodeKey :react-sortable-tree.react-sortable-tree/utils/tree-data-utils.GetNodeKeyFunction,   ignoreCollapsed :boolean | undefined,   expandParent :boolean | undefined,   addAsFirstChild :boolean | undefined} */
@js.native
trait FullTreenewNodeTreeItempa extends js.Object {
  var addAsFirstChild: js.UndefOr[Boolean] = js.native
  var expandParent: js.UndefOr[Boolean] = js.native
  var getNodeKey: GetNodeKeyFunction = js.native
  var ignoreCollapsed: js.UndefOr[Boolean] = js.native
  var newNode: TreeItem = js.native
  var parentKey: js.UndefOr[Double | String] = js.native
  var treeData: js.Array[TreeItem] = js.native
}

object FullTreenewNodeTreeItempa {
  @scala.inline
  def apply(
    getNodeKey: /* data */ TreeIndex with TreeNode => String | Double,
    newNode: TreeItem,
    treeData: js.Array[TreeItem]
  ): FullTreenewNodeTreeItempa = {
    val __obj = js.Dynamic.literal(getNodeKey = js.Any.fromFunction1(getNodeKey), newNode = newNode.asInstanceOf[js.Any], treeData = treeData.asInstanceOf[js.Any])
    __obj.asInstanceOf[FullTreenewNodeTreeItempa]
  }
  @scala.inline
  implicit class FullTreenewNodeTreeItempaOps[Self <: FullTreenewNodeTreeItempa] (val x: Self) extends AnyVal {
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
    def setNewNode(value: TreeItem): Self = this.set("newNode", value.asInstanceOf[js.Any])
    @scala.inline
    def setTreeDataVarargs(value: TreeItem*): Self = this.set("treeData", js.Array(value :_*))
    @scala.inline
    def setTreeData(value: js.Array[TreeItem]): Self = this.set("treeData", value.asInstanceOf[js.Any])
    @scala.inline
    def setAddAsFirstChild(value: Boolean): Self = this.set("addAsFirstChild", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAddAsFirstChild: Self = this.set("addAsFirstChild", js.undefined)
    @scala.inline
    def setExpandParent(value: Boolean): Self = this.set("expandParent", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExpandParent: Self = this.set("expandParent", js.undefined)
    @scala.inline
    def setIgnoreCollapsed(value: Boolean): Self = this.set("ignoreCollapsed", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIgnoreCollapsed: Self = this.set("ignoreCollapsed", js.undefined)
    @scala.inline
    def setParentKey(value: Double | String): Self = this.set("parentKey", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteParentKey: Self = this.set("parentKey", js.undefined)
  }
  
}

