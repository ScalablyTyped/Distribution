package typings.primereact.treeNodeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TreeNode extends js.Object {
  var children: js.Array[TreeNode] = js.native
  var className: js.UndefOr[String] = js.native
  var data: js.UndefOr[js.Any] = js.native
  var draggable: js.UndefOr[Boolean] = js.native
  var droppable: js.UndefOr[Boolean] = js.native
  var icon: js.UndefOr[String] = js.native
  var key: js.UndefOr[js.Any] = js.native
  var label: js.UndefOr[String] = js.native
  var leaf: js.UndefOr[Boolean] = js.native
  var selectable: js.UndefOr[Boolean] = js.native
  var style: js.UndefOr[js.Object] = js.native
}

object TreeNode {
  @scala.inline
  def apply(children: js.Array[TreeNode]): TreeNode = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any])
    __obj.asInstanceOf[TreeNode]
  }
  @scala.inline
  implicit class TreeNodeOps[Self <: TreeNode] (val x: Self) extends AnyVal {
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
    def setChildrenVarargs(value: TreeNode*): Self = this.set("children", js.Array(value :_*))
    @scala.inline
    def setChildren(value: js.Array[TreeNode]): Self = this.set("children", value.asInstanceOf[js.Any])
    @scala.inline
    def setClassName(value: String): Self = this.set("className", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteClassName: Self = this.set("className", js.undefined)
    @scala.inline
    def setData(value: js.Any): Self = this.set("data", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteData: Self = this.set("data", js.undefined)
    @scala.inline
    def setDraggable(value: Boolean): Self = this.set("draggable", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDraggable: Self = this.set("draggable", js.undefined)
    @scala.inline
    def setDroppable(value: Boolean): Self = this.set("droppable", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDroppable: Self = this.set("droppable", js.undefined)
    @scala.inline
    def setIcon(value: String): Self = this.set("icon", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIcon: Self = this.set("icon", js.undefined)
    @scala.inline
    def setKey(value: js.Any): Self = this.set("key", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKey: Self = this.set("key", js.undefined)
    @scala.inline
    def setLabel(value: String): Self = this.set("label", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLabel: Self = this.set("label", js.undefined)
    @scala.inline
    def setLeaf(value: Boolean): Self = this.set("leaf", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLeaf: Self = this.set("leaf", js.undefined)
    @scala.inline
    def setSelectable(value: Boolean): Self = this.set("selectable", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSelectable: Self = this.set("selectable", js.undefined)
    @scala.inline
    def setStyle(value: js.Object): Self = this.set("style", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStyle: Self = this.set("style", js.undefined)
  }
  
}

