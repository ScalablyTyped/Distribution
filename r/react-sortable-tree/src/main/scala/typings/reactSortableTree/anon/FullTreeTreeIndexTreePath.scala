package typings.reactSortableTree.anon

import typings.reactSortableTree.mod.NumberOrStringArray
import typings.reactSortableTree.mod.TreeItem
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined react-sortable-tree.react-sortable-tree.FullTree & react-sortable-tree.react-sortable-tree.TreeIndex & react-sortable-tree.react-sortable-tree.TreePath & {  parentNode :react-sortable-tree.react-sortable-tree.TreeItem} */
@js.native
trait FullTreeTreeIndexTreePath extends js.Object {
  var parentNode: TreeItem = js.native
  var path: NumberOrStringArray = js.native
  var treeData: js.Array[TreeItem] = js.native
  var treeIndex: Double = js.native
}

object FullTreeTreeIndexTreePath {
  @scala.inline
  def apply(parentNode: TreeItem, path: NumberOrStringArray, treeData: js.Array[TreeItem], treeIndex: Double): FullTreeTreeIndexTreePath = {
    val __obj = js.Dynamic.literal(parentNode = parentNode.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], treeData = treeData.asInstanceOf[js.Any], treeIndex = treeIndex.asInstanceOf[js.Any])
    __obj.asInstanceOf[FullTreeTreeIndexTreePath]
  }
  @scala.inline
  implicit class FullTreeTreeIndexTreePathOps[Self <: FullTreeTreeIndexTreePath] (val x: Self) extends AnyVal {
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
    def setParentNode(value: TreeItem): Self = this.set("parentNode", value.asInstanceOf[js.Any])
    @scala.inline
    def setPathVarargs(value: (String | Double)*): Self = this.set("path", js.Array(value :_*))
    @scala.inline
    def setPath(value: NumberOrStringArray): Self = this.set("path", value.asInstanceOf[js.Any])
    @scala.inline
    def setTreeDataVarargs(value: TreeItem*): Self = this.set("treeData", js.Array(value :_*))
    @scala.inline
    def setTreeData(value: js.Array[TreeItem]): Self = this.set("treeData", value.asInstanceOf[js.Any])
    @scala.inline
    def setTreeIndex(value: Double): Self = this.set("treeIndex", value.asInstanceOf[js.Any])
  }
  
}

