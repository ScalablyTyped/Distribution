package typings.reactSortableTree.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FullTree extends js.Object {
  var treeData: js.Array[TreeItem] = js.native
}

object FullTree {
  @scala.inline
  def apply(treeData: js.Array[TreeItem]): FullTree = {
    val __obj = js.Dynamic.literal(treeData = treeData.asInstanceOf[js.Any])
    __obj.asInstanceOf[FullTree]
  }
  @scala.inline
  implicit class FullTreeOps[Self <: FullTree] (val x: Self) extends AnyVal {
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
    def setTreeDataVarargs(value: TreeItem*): Self = this.set("treeData", js.Array(value :_*))
    @scala.inline
    def setTreeData(value: js.Array[TreeItem]): Self = this.set("treeData", value.asInstanceOf[js.Any])
  }
  
}

