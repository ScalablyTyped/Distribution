package typings.rcTree.treeNodeMod

import typings.rcTree.interfaceMod.DataNode
import typings.rcTree.interfaceMod.IconType
import typings.rcTree.interfaceMod.Key
import typings.react.mod.CSSProperties
import typings.react.mod.MouseEvent
import typings.react.mod.MouseEventHandler
import typings.react.mod.NativeMouseEvent
import typings.react.mod.ReactNode
import typings.react.mod.Ref
import typings.std.HTMLDivElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TreeNodeProps extends js.Object {
  var active: js.UndefOr[Boolean] = js.native
  var checkable: js.UndefOr[Boolean] = js.native
  var checked: js.UndefOr[Boolean] = js.native
  var children: js.UndefOr[ReactNode] = js.native
  var className: js.UndefOr[String] = js.native
  /** New added in Tree for easy data access */
  var data: js.UndefOr[DataNode] = js.native
  var disableCheckbox: js.UndefOr[Boolean] = js.native
  var disabled: js.UndefOr[Boolean] = js.native
  var domRef: js.UndefOr[Ref[HTMLDivElement]] = js.native
  var dragOver: js.UndefOr[Boolean] = js.native
  var dragOverGapBottom: js.UndefOr[Boolean] = js.native
  var dragOverGapTop: js.UndefOr[Boolean] = js.native
  var eventKey: js.UndefOr[Key] = js.native
  var expanded: js.UndefOr[Boolean] = js.native
  var halfChecked: js.UndefOr[Boolean] = js.native
  var icon: js.UndefOr[IconType] = js.native
  var isEnd: js.UndefOr[js.Array[Boolean]] = js.native
  var isLeaf: js.UndefOr[Boolean] = js.native
  var isStart: js.UndefOr[js.Array[Boolean]] = js.native
  var loaded: js.UndefOr[Boolean] = js.native
  var loading: js.UndefOr[Boolean] = js.native
  var onMouseMove: js.UndefOr[MouseEventHandler[HTMLDivElement]] = js.native
  var pos: js.UndefOr[String] = js.native
  var prefixCls: js.UndefOr[String] = js.native
  var selectable: js.UndefOr[Boolean] = js.native
  var selected: js.UndefOr[Boolean] = js.native
  var style: js.UndefOr[CSSProperties] = js.native
  var switcherIcon: js.UndefOr[IconType] = js.native
  var title: js.UndefOr[ReactNode | (js.Function1[/* data */ DataNode, ReactNode])] = js.native
}

object TreeNodeProps {
  @scala.inline
  def apply(): TreeNodeProps = {
    val __obj = js.Dynamic.literal()
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
    def setActive(value: Boolean): Self = this.set("active", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteActive: Self = this.set("active", js.undefined)
    @scala.inline
    def setCheckable(value: Boolean): Self = this.set("checkable", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCheckable: Self = this.set("checkable", js.undefined)
    @scala.inline
    def setChecked(value: Boolean): Self = this.set("checked", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteChecked: Self = this.set("checked", js.undefined)
    @scala.inline
    def setChildren(value: ReactNode): Self = this.set("children", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteChildren: Self = this.set("children", js.undefined)
    @scala.inline
    def setClassName(value: String): Self = this.set("className", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteClassName: Self = this.set("className", js.undefined)
    @scala.inline
    def setData(value: DataNode): Self = this.set("data", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteData: Self = this.set("data", js.undefined)
    @scala.inline
    def setDisableCheckbox(value: Boolean): Self = this.set("disableCheckbox", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDisableCheckbox: Self = this.set("disableCheckbox", js.undefined)
    @scala.inline
    def setDisabled(value: Boolean): Self = this.set("disabled", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDisabled: Self = this.set("disabled", js.undefined)
    @scala.inline
    def setDomRefFunction1(value: /* instance */ HTMLDivElement | Null => Unit): Self = this.set("domRef", js.Any.fromFunction1(value))
    @scala.inline
    def setDomRef(value: Ref[HTMLDivElement]): Self = this.set("domRef", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDomRef: Self = this.set("domRef", js.undefined)
    @scala.inline
    def setDomRefNull: Self = this.set("domRef", null)
    @scala.inline
    def setDragOver(value: Boolean): Self = this.set("dragOver", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDragOver: Self = this.set("dragOver", js.undefined)
    @scala.inline
    def setDragOverGapBottom(value: Boolean): Self = this.set("dragOverGapBottom", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDragOverGapBottom: Self = this.set("dragOverGapBottom", js.undefined)
    @scala.inline
    def setDragOverGapTop(value: Boolean): Self = this.set("dragOverGapTop", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDragOverGapTop: Self = this.set("dragOverGapTop", js.undefined)
    @scala.inline
    def setEventKey(value: Key): Self = this.set("eventKey", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEventKey: Self = this.set("eventKey", js.undefined)
    @scala.inline
    def setExpanded(value: Boolean): Self = this.set("expanded", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExpanded: Self = this.set("expanded", js.undefined)
    @scala.inline
    def setHalfChecked(value: Boolean): Self = this.set("halfChecked", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHalfChecked: Self = this.set("halfChecked", js.undefined)
    @scala.inline
    def setIconFunction1(value: /* props */ TreeNodeProps => ReactNode): Self = this.set("icon", js.Any.fromFunction1(value))
    @scala.inline
    def setIcon(value: IconType): Self = this.set("icon", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIcon: Self = this.set("icon", js.undefined)
    @scala.inline
    def setIsEndVarargs(value: Boolean*): Self = this.set("isEnd", js.Array(value :_*))
    @scala.inline
    def setIsEnd(value: js.Array[Boolean]): Self = this.set("isEnd", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIsEnd: Self = this.set("isEnd", js.undefined)
    @scala.inline
    def setIsLeaf(value: Boolean): Self = this.set("isLeaf", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIsLeaf: Self = this.set("isLeaf", js.undefined)
    @scala.inline
    def setIsStartVarargs(value: Boolean*): Self = this.set("isStart", js.Array(value :_*))
    @scala.inline
    def setIsStart(value: js.Array[Boolean]): Self = this.set("isStart", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIsStart: Self = this.set("isStart", js.undefined)
    @scala.inline
    def setLoaded(value: Boolean): Self = this.set("loaded", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLoaded: Self = this.set("loaded", js.undefined)
    @scala.inline
    def setLoading(value: Boolean): Self = this.set("loading", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLoading: Self = this.set("loading", js.undefined)
    @scala.inline
    def setOnMouseMove(value: MouseEvent[HTMLDivElement, NativeMouseEvent] => Unit): Self = this.set("onMouseMove", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnMouseMove: Self = this.set("onMouseMove", js.undefined)
    @scala.inline
    def setPos(value: String): Self = this.set("pos", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePos: Self = this.set("pos", js.undefined)
    @scala.inline
    def setPrefixCls(value: String): Self = this.set("prefixCls", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePrefixCls: Self = this.set("prefixCls", js.undefined)
    @scala.inline
    def setSelectable(value: Boolean): Self = this.set("selectable", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSelectable: Self = this.set("selectable", js.undefined)
    @scala.inline
    def setSelected(value: Boolean): Self = this.set("selected", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSelected: Self = this.set("selected", js.undefined)
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
    def setTitleFunction1(value: /* data */ DataNode => ReactNode): Self = this.set("title", js.Any.fromFunction1(value))
    @scala.inline
    def setTitle(value: ReactNode | (js.Function1[/* data */ DataNode, ReactNode])): Self = this.set("title", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTitle: Self = this.set("title", js.undefined)
  }
  
}

