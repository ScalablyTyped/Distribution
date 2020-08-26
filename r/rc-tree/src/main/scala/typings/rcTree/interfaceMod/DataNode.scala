package typings.rcTree.interfaceMod

import typings.rcTree.treeNodeMod.TreeNodeProps
import typings.react.mod.CSSProperties
import typings.react.mod.ReactNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DataNode extends js.Object {
  var checkable: js.UndefOr[Boolean] = js.native
  var children: js.UndefOr[js.Array[DataNode]] = js.native
  /** Set style of TreeNode. This is not recommend if you don't have any force requirement */
  var className: js.UndefOr[String] = js.native
  var disableCheckbox: js.UndefOr[Boolean] = js.native
  var disabled: js.UndefOr[Boolean] = js.native
  var icon: js.UndefOr[IconType] = js.native
  var isLeaf: js.UndefOr[Boolean] = js.native
  var key: String | Double = js.native
  var selectable: js.UndefOr[Boolean] = js.native
  var style: js.UndefOr[CSSProperties] = js.native
  var switcherIcon: js.UndefOr[IconType] = js.native
  var title: js.UndefOr[ReactNode] = js.native
}

object DataNode {
  @scala.inline
  def apply(key: String | Double): DataNode = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any])
    __obj.asInstanceOf[DataNode]
  }
  @scala.inline
  implicit class DataNodeOps[Self <: DataNode] (val x: Self) extends AnyVal {
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
    def setKey(value: String | Double): Self = this.set("key", value.asInstanceOf[js.Any])
    @scala.inline
    def setCheckable(value: Boolean): Self = this.set("checkable", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCheckable: Self = this.set("checkable", js.undefined)
    @scala.inline
    def setChildrenVarargs(value: DataNode*): Self = this.set("children", js.Array(value :_*))
    @scala.inline
    def setChildren(value: js.Array[DataNode]): Self = this.set("children", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteChildren: Self = this.set("children", js.undefined)
    @scala.inline
    def setClassName(value: String): Self = this.set("className", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteClassName: Self = this.set("className", js.undefined)
    @scala.inline
    def setDisableCheckbox(value: Boolean): Self = this.set("disableCheckbox", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDisableCheckbox: Self = this.set("disableCheckbox", js.undefined)
    @scala.inline
    def setDisabled(value: Boolean): Self = this.set("disabled", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDisabled: Self = this.set("disabled", js.undefined)
    @scala.inline
    def setIconFunction1(value: /* props */ TreeNodeProps => ReactNode): Self = this.set("icon", js.Any.fromFunction1(value))
    @scala.inline
    def setIcon(value: IconType): Self = this.set("icon", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIcon: Self = this.set("icon", js.undefined)
    @scala.inline
    def setIsLeaf(value: Boolean): Self = this.set("isLeaf", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIsLeaf: Self = this.set("isLeaf", js.undefined)
    @scala.inline
    def setSelectable(value: Boolean): Self = this.set("selectable", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSelectable: Self = this.set("selectable", js.undefined)
    @scala.inline
    def setStyle(value: CSSProperties): Self = this.set("style", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStyle: Self = this.set("style", js.undefined)
    @scala.inline
    def setSwitcherIconFunction1(value: /* props */ TreeNodeProps => ReactNode): Self = this.set("switcherIcon", js.Any.fromFunction1(value))
    @scala.inline
    def setSwitcherIcon(value: IconType): Self = this.set("switcherIcon", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSwitcherIcon: Self = this.set("switcherIcon", js.undefined)
    @scala.inline
    def setTitle(value: ReactNode): Self = this.set("title", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTitle: Self = this.set("title", js.undefined)
  }
  
}

