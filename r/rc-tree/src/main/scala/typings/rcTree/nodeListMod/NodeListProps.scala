package typings.rcTree.nodeListMod

import typings.rcTree.interfaceMod.DataEntity
import typings.rcTree.interfaceMod.FlattenNode
import typings.rcTree.interfaceMod.Key
import typings.react.mod.CSSProperties
import typings.react.mod.FocusEvent
import typings.react.mod.FocusEventHandler
import typings.react.mod.KeyboardEvent
import typings.react.mod.KeyboardEventHandler
import typings.std.HTMLDivElement
import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NodeListProps extends js.Object {
  var activeItem: FlattenNode = js.native
  var checkable: js.UndefOr[Boolean] = js.native
  var checkedKeys: js.Array[Key] = js.native
  var data: js.Array[FlattenNode] = js.native
  var disabled: js.UndefOr[Boolean] = js.native
  var dragOverNodeKey: Key = js.native
  var dragging: Boolean = js.native
  var dropPosition: Double = js.native
  var expandedKeys: js.Array[Key] = js.native
  var focusable: js.UndefOr[Boolean] = js.native
  var focused: js.UndefOr[Boolean] = js.native
  var halfCheckedKeys: js.Array[Key] = js.native
  var height: Double = js.native
  var itemHeight: Double = js.native
  var keyEntities: Record[Key, DataEntity] = js.native
  var loadedKeys: js.Array[Key] = js.native
  var loadingKeys: js.Array[Key] = js.native
  var motion: js.Any = js.native
  var onBlur: js.UndefOr[FocusEventHandler[HTMLDivElement]] = js.native
  var onFocus: js.UndefOr[FocusEventHandler[HTMLDivElement]] = js.native
  var onKeyDown: js.UndefOr[KeyboardEventHandler[HTMLDivElement]] = js.native
  var prefixCls: String = js.native
  var selectable: js.UndefOr[Boolean] = js.native
  var selectedKeys: js.Array[Key] = js.native
  var style: CSSProperties = js.native
  var tabIndex: Double = js.native
  var virtual: js.UndefOr[Boolean] = js.native
  def onActiveChange(key: Key): Unit = js.native
  def onListChangeEnd(): Unit = js.native
  def onListChangeStart(): Unit = js.native
}

object NodeListProps {
  @scala.inline
  def apply(
    activeItem: FlattenNode,
    checkedKeys: js.Array[Key],
    data: js.Array[FlattenNode],
    dragOverNodeKey: Key,
    dragging: Boolean,
    dropPosition: Double,
    expandedKeys: js.Array[Key],
    halfCheckedKeys: js.Array[Key],
    height: Double,
    itemHeight: Double,
    keyEntities: Record[Key, DataEntity],
    loadedKeys: js.Array[Key],
    loadingKeys: js.Array[Key],
    motion: js.Any,
    onActiveChange: Key => Unit,
    onListChangeEnd: () => Unit,
    onListChangeStart: () => Unit,
    prefixCls: String,
    selectedKeys: js.Array[Key],
    style: CSSProperties,
    tabIndex: Double
  ): NodeListProps = {
    val __obj = js.Dynamic.literal(activeItem = activeItem.asInstanceOf[js.Any], checkedKeys = checkedKeys.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any], dragOverNodeKey = dragOverNodeKey.asInstanceOf[js.Any], dragging = dragging.asInstanceOf[js.Any], dropPosition = dropPosition.asInstanceOf[js.Any], expandedKeys = expandedKeys.asInstanceOf[js.Any], halfCheckedKeys = halfCheckedKeys.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], itemHeight = itemHeight.asInstanceOf[js.Any], keyEntities = keyEntities.asInstanceOf[js.Any], loadedKeys = loadedKeys.asInstanceOf[js.Any], loadingKeys = loadingKeys.asInstanceOf[js.Any], motion = motion.asInstanceOf[js.Any], onActiveChange = js.Any.fromFunction1(onActiveChange), onListChangeEnd = js.Any.fromFunction0(onListChangeEnd), onListChangeStart = js.Any.fromFunction0(onListChangeStart), prefixCls = prefixCls.asInstanceOf[js.Any], selectedKeys = selectedKeys.asInstanceOf[js.Any], style = style.asInstanceOf[js.Any], tabIndex = tabIndex.asInstanceOf[js.Any])
    __obj.asInstanceOf[NodeListProps]
  }
  @scala.inline
  implicit class NodeListPropsOps[Self <: NodeListProps] (val x: Self) extends AnyVal {
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
    def setActiveItem(value: FlattenNode): Self = this.set("activeItem", value.asInstanceOf[js.Any])
    @scala.inline
    def setCheckedKeysVarargs(value: Key*): Self = this.set("checkedKeys", js.Array(value :_*))
    @scala.inline
    def setCheckedKeys(value: js.Array[Key]): Self = this.set("checkedKeys", value.asInstanceOf[js.Any])
    @scala.inline
    def setDataVarargs(value: FlattenNode*): Self = this.set("data", js.Array(value :_*))
    @scala.inline
    def setData(value: js.Array[FlattenNode]): Self = this.set("data", value.asInstanceOf[js.Any])
    @scala.inline
    def setDragOverNodeKey(value: Key): Self = this.set("dragOverNodeKey", value.asInstanceOf[js.Any])
    @scala.inline
    def setDragging(value: Boolean): Self = this.set("dragging", value.asInstanceOf[js.Any])
    @scala.inline
    def setDropPosition(value: Double): Self = this.set("dropPosition", value.asInstanceOf[js.Any])
    @scala.inline
    def setExpandedKeysVarargs(value: Key*): Self = this.set("expandedKeys", js.Array(value :_*))
    @scala.inline
    def setExpandedKeys(value: js.Array[Key]): Self = this.set("expandedKeys", value.asInstanceOf[js.Any])
    @scala.inline
    def setHalfCheckedKeysVarargs(value: Key*): Self = this.set("halfCheckedKeys", js.Array(value :_*))
    @scala.inline
    def setHalfCheckedKeys(value: js.Array[Key]): Self = this.set("halfCheckedKeys", value.asInstanceOf[js.Any])
    @scala.inline
    def setHeight(value: Double): Self = this.set("height", value.asInstanceOf[js.Any])
    @scala.inline
    def setItemHeight(value: Double): Self = this.set("itemHeight", value.asInstanceOf[js.Any])
    @scala.inline
    def setKeyEntities(value: Record[Key, DataEntity]): Self = this.set("keyEntities", value.asInstanceOf[js.Any])
    @scala.inline
    def setLoadedKeysVarargs(value: Key*): Self = this.set("loadedKeys", js.Array(value :_*))
    @scala.inline
    def setLoadedKeys(value: js.Array[Key]): Self = this.set("loadedKeys", value.asInstanceOf[js.Any])
    @scala.inline
    def setLoadingKeysVarargs(value: Key*): Self = this.set("loadingKeys", js.Array(value :_*))
    @scala.inline
    def setLoadingKeys(value: js.Array[Key]): Self = this.set("loadingKeys", value.asInstanceOf[js.Any])
    @scala.inline
    def setMotion(value: js.Any): Self = this.set("motion", value.asInstanceOf[js.Any])
    @scala.inline
    def setOnActiveChange(value: Key => Unit): Self = this.set("onActiveChange", js.Any.fromFunction1(value))
    @scala.inline
    def setOnListChangeEnd(value: () => Unit): Self = this.set("onListChangeEnd", js.Any.fromFunction0(value))
    @scala.inline
    def setOnListChangeStart(value: () => Unit): Self = this.set("onListChangeStart", js.Any.fromFunction0(value))
    @scala.inline
    def setPrefixCls(value: String): Self = this.set("prefixCls", value.asInstanceOf[js.Any])
    @scala.inline
    def setSelectedKeysVarargs(value: Key*): Self = this.set("selectedKeys", js.Array(value :_*))
    @scala.inline
    def setSelectedKeys(value: js.Array[Key]): Self = this.set("selectedKeys", value.asInstanceOf[js.Any])
    @scala.inline
    def setStyle(value: CSSProperties): Self = this.set("style", value.asInstanceOf[js.Any])
    @scala.inline
    def setTabIndex(value: Double): Self = this.set("tabIndex", value.asInstanceOf[js.Any])
    @scala.inline
    def setCheckable(value: Boolean): Self = this.set("checkable", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCheckable: Self = this.set("checkable", js.undefined)
    @scala.inline
    def setDisabled(value: Boolean): Self = this.set("disabled", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDisabled: Self = this.set("disabled", js.undefined)
    @scala.inline
    def setFocusable(value: Boolean): Self = this.set("focusable", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFocusable: Self = this.set("focusable", js.undefined)
    @scala.inline
    def setFocused(value: Boolean): Self = this.set("focused", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFocused: Self = this.set("focused", js.undefined)
    @scala.inline
    def setOnBlur(value: FocusEvent[HTMLDivElement] => Unit): Self = this.set("onBlur", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnBlur: Self = this.set("onBlur", js.undefined)
    @scala.inline
    def setOnFocus(value: FocusEvent[HTMLDivElement] => Unit): Self = this.set("onFocus", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnFocus: Self = this.set("onFocus", js.undefined)
    @scala.inline
    def setOnKeyDown(value: KeyboardEvent[HTMLDivElement] => Unit): Self = this.set("onKeyDown", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnKeyDown: Self = this.set("onKeyDown", js.undefined)
    @scala.inline
    def setSelectable(value: Boolean): Self = this.set("selectable", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSelectable: Self = this.set("selectable", js.undefined)
    @scala.inline
    def setVirtual(value: Boolean): Self = this.set("virtual", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVirtual: Self = this.set("virtual", js.undefined)
  }
  
}

