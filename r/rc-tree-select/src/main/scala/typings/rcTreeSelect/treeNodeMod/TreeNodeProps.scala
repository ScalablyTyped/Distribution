package typings.rcTreeSelect.treeNodeMod

import typings.rcTreeSelect.interfaceMod.Key
import typings.react.mod.ReactNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined parent std.Omit<rc-tree-select.rc-tree-select/es/interface.DataNode, 'children'> */
@js.native
trait TreeNodeProps extends js.Object {
  var checkable: js.UndefOr[Boolean] = js.native
  var children: js.UndefOr[ReactNode] = js.native
  var disableCheckbox: js.UndefOr[Boolean] = js.native
  var disabled: js.UndefOr[Boolean] = js.native
  var key: js.UndefOr[Key] = js.native
  var label: js.UndefOr[ReactNode] = js.native
  var title: js.UndefOr[ReactNode] = js.native
  var value: Key = js.native
}

object TreeNodeProps {
  @scala.inline
  def apply(value: Key): TreeNodeProps = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[TreeNodeProps]
  }
  @scala.inline
  implicit class TreeNodePropsOps[Self <: TreeNodeProps] (val x: Self) extends AnyVal {
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
    def setValue(value: Key): Self = this.set("value", value.asInstanceOf[js.Any])
    @scala.inline
    def setCheckable(value: Boolean): Self = this.set("checkable", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCheckable: Self = this.set("checkable", js.undefined)
    @scala.inline
    def setChildren(value: ReactNode): Self = this.set("children", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteChildren: Self = this.set("children", js.undefined)
    @scala.inline
    def setDisableCheckbox(value: Boolean): Self = this.set("disableCheckbox", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDisableCheckbox: Self = this.set("disableCheckbox", js.undefined)
    @scala.inline
    def setDisabled(value: Boolean): Self = this.set("disabled", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDisabled: Self = this.set("disabled", js.undefined)
    @scala.inline
    def setKey(value: Key): Self = this.set("key", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKey: Self = this.set("key", js.undefined)
    @scala.inline
    def setLabel(value: ReactNode): Self = this.set("label", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLabel: Self = this.set("label", js.undefined)
    @scala.inline
    def setTitle(value: ReactNode): Self = this.set("title", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTitle: Self = this.set("title", js.undefined)
  }
  
}

