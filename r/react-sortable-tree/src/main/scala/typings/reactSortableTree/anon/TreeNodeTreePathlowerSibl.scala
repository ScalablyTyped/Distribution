package typings.reactSortableTree.anon

import typings.reactSortableTree.mod.NumberOrStringArray
import typings.reactSortableTree.mod.TreeItem
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined react-sortable-tree.react-sortable-tree.TreeNode & react-sortable-tree.react-sortable-tree.TreePath & {  lowerSiblingsCounts :std.Array<number>} */
@js.native
trait TreeNodeTreePathlowerSibl extends js.Object {
  var lowerSiblingsCounts: js.Array[Double] = js.native
  var node: TreeItem = js.native
  var path: NumberOrStringArray = js.native
}

object TreeNodeTreePathlowerSibl {
  @scala.inline
  def apply(lowerSiblingsCounts: js.Array[Double], node: TreeItem, path: NumberOrStringArray): TreeNodeTreePathlowerSibl = {
    val __obj = js.Dynamic.literal(lowerSiblingsCounts = lowerSiblingsCounts.asInstanceOf[js.Any], node = node.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any])
    __obj.asInstanceOf[TreeNodeTreePathlowerSibl]
  }
  @scala.inline
  implicit class TreeNodeTreePathlowerSiblOps[Self <: TreeNodeTreePathlowerSibl] (val x: Self) extends AnyVal {
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
    def setLowerSiblingsCountsVarargs(value: Double*): Self = this.set("lowerSiblingsCounts", js.Array(value :_*))
    @scala.inline
    def setLowerSiblingsCounts(value: js.Array[Double]): Self = this.set("lowerSiblingsCounts", value.asInstanceOf[js.Any])
    @scala.inline
    def setNode(value: TreeItem): Self = this.set("node", value.asInstanceOf[js.Any])
    @scala.inline
    def setPathVarargs(value: (String | Double)*): Self = this.set("path", js.Array(value :_*))
    @scala.inline
    def setPath(value: NumberOrStringArray): Self = this.set("path", value.asInstanceOf[js.Any])
  }
  
}

