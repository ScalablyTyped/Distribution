package typings.rcTree.anon

import typings.rcTree.interfaceMod.DataNode
import typings.rcTree.interfaceMod.IconType
import typings.rcTree.treeNodeMod.TreeNodeProps
import typings.react.mod.CSSProperties
import typings.react.mod.MouseEvent
import typings.react.mod.MouseEventHandler
import typings.react.mod.NativeMouseEvent
import typings.react.mod.ReactNode
import typings.react.mod.Ref
import typings.std.HTMLDivElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Readonly<rc-tree.rc-tree/es/TreeNode.TreeNodeProps> */
@js.native
trait ReadonlyTreeNodeProps extends StObject {
  
  val active: js.UndefOr[Boolean] = js.native
  
  val checkable: js.UndefOr[Boolean] = js.native
  
  val checked: js.UndefOr[Boolean] = js.native
  
  val children: js.UndefOr[ReactNode] = js.native
  
  val className: js.UndefOr[String] = js.native
  
  val data: js.UndefOr[DataNode] = js.native
  
  val disableCheckbox: js.UndefOr[Boolean] = js.native
  
  val disabled: js.UndefOr[Boolean] = js.native
  
  val domRef: js.UndefOr[Ref[HTMLDivElement]] = js.native
  
  val dragOver: js.UndefOr[Boolean] = js.native
  
  val dragOverGapBottom: js.UndefOr[Boolean] = js.native
  
  val dragOverGapTop: js.UndefOr[Boolean] = js.native
  
  val eventKey: js.UndefOr[typings.rcTree.interfaceMod.Key] = js.native
  
  val expanded: js.UndefOr[Boolean] = js.native
  
  val halfChecked: js.UndefOr[Boolean] = js.native
  
  val icon: js.UndefOr[IconType] = js.native
  
  val isEnd: js.UndefOr[js.Array[Boolean]] = js.native
  
  val isLeaf: js.UndefOr[Boolean] = js.native
  
  val isStart: js.UndefOr[js.Array[Boolean]] = js.native
  
  val loaded: js.UndefOr[Boolean] = js.native
  
  val loading: js.UndefOr[Boolean] = js.native
  
  val onMouseMove: js.UndefOr[MouseEventHandler[HTMLDivElement]] = js.native
  
  val pos: js.UndefOr[String] = js.native
  
  val prefixCls: js.UndefOr[String] = js.native
  
  val selectable: js.UndefOr[Boolean] = js.native
  
  val selected: js.UndefOr[Boolean] = js.native
  
  val style: js.UndefOr[CSSProperties] = js.native
  
  val switcherIcon: js.UndefOr[IconType] = js.native
  
  val title: js.UndefOr[ReactNode | (js.Function1[/* data */ DataNode, ReactNode])] = js.native
}
object ReadonlyTreeNodeProps {
  
  @scala.inline
  def apply(): ReadonlyTreeNodeProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ReadonlyTreeNodeProps]
  }
  
  @scala.inline
  implicit class ReadonlyTreeNodePropsMutableBuilder[Self <: ReadonlyTreeNodeProps] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setActive(value: Boolean): Self = StObject.set(x, "active", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setActiveUndefined: Self = StObject.set(x, "active", js.undefined)
    
    @scala.inline
    def setCheckable(value: Boolean): Self = StObject.set(x, "checkable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCheckableUndefined: Self = StObject.set(x, "checkable", js.undefined)
    
    @scala.inline
    def setChecked(value: Boolean): Self = StObject.set(x, "checked", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCheckedUndefined: Self = StObject.set(x, "checked", js.undefined)
    
    @scala.inline
    def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
    
    @scala.inline
    def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
    
    @scala.inline
    def setData(value: DataNode): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
    
    @scala.inline
    def setDisableCheckbox(value: Boolean): Self = StObject.set(x, "disableCheckbox", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisableCheckboxUndefined: Self = StObject.set(x, "disableCheckbox", js.undefined)
    
    @scala.inline
    def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
    
    @scala.inline
    def setDomRef(value: Ref[HTMLDivElement]): Self = StObject.set(x, "domRef", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDomRefFunction1(value: /* instance */ HTMLDivElement | Null => Unit): Self = StObject.set(x, "domRef", js.Any.fromFunction1(value))
    
    @scala.inline
    def setDomRefNull: Self = StObject.set(x, "domRef", null)
    
    @scala.inline
    def setDomRefUndefined: Self = StObject.set(x, "domRef", js.undefined)
    
    @scala.inline
    def setDragOver(value: Boolean): Self = StObject.set(x, "dragOver", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDragOverGapBottom(value: Boolean): Self = StObject.set(x, "dragOverGapBottom", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDragOverGapBottomUndefined: Self = StObject.set(x, "dragOverGapBottom", js.undefined)
    
    @scala.inline
    def setDragOverGapTop(value: Boolean): Self = StObject.set(x, "dragOverGapTop", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDragOverGapTopUndefined: Self = StObject.set(x, "dragOverGapTop", js.undefined)
    
    @scala.inline
    def setDragOverUndefined: Self = StObject.set(x, "dragOver", js.undefined)
    
    @scala.inline
    def setEventKey(value: typings.rcTree.interfaceMod.Key): Self = StObject.set(x, "eventKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEventKeyUndefined: Self = StObject.set(x, "eventKey", js.undefined)
    
    @scala.inline
    def setExpanded(value: Boolean): Self = StObject.set(x, "expanded", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExpandedUndefined: Self = StObject.set(x, "expanded", js.undefined)
    
    @scala.inline
    def setHalfChecked(value: Boolean): Self = StObject.set(x, "halfChecked", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHalfCheckedUndefined: Self = StObject.set(x, "halfChecked", js.undefined)
    
    @scala.inline
    def setIcon(value: IconType): Self = StObject.set(x, "icon", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIconFunction1(value: /* props */ TreeNodeProps => ReactNode): Self = StObject.set(x, "icon", js.Any.fromFunction1(value))
    
    @scala.inline
    def setIconUndefined: Self = StObject.set(x, "icon", js.undefined)
    
    @scala.inline
    def setIsEnd(value: js.Array[Boolean]): Self = StObject.set(x, "isEnd", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsEndUndefined: Self = StObject.set(x, "isEnd", js.undefined)
    
    @scala.inline
    def setIsEndVarargs(value: Boolean*): Self = StObject.set(x, "isEnd", js.Array(value :_*))
    
    @scala.inline
    def setIsLeaf(value: Boolean): Self = StObject.set(x, "isLeaf", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsLeafUndefined: Self = StObject.set(x, "isLeaf", js.undefined)
    
    @scala.inline
    def setIsStart(value: js.Array[Boolean]): Self = StObject.set(x, "isStart", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsStartUndefined: Self = StObject.set(x, "isStart", js.undefined)
    
    @scala.inline
    def setIsStartVarargs(value: Boolean*): Self = StObject.set(x, "isStart", js.Array(value :_*))
    
    @scala.inline
    def setLoaded(value: Boolean): Self = StObject.set(x, "loaded", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLoadedUndefined: Self = StObject.set(x, "loaded", js.undefined)
    
    @scala.inline
    def setLoading(value: Boolean): Self = StObject.set(x, "loading", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLoadingUndefined: Self = StObject.set(x, "loading", js.undefined)
    
    @scala.inline
    def setOnMouseMove(value: MouseEvent[HTMLDivElement, NativeMouseEvent] => Unit): Self = StObject.set(x, "onMouseMove", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnMouseMoveUndefined: Self = StObject.set(x, "onMouseMove", js.undefined)
    
    @scala.inline
    def setPos(value: String): Self = StObject.set(x, "pos", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPosUndefined: Self = StObject.set(x, "pos", js.undefined)
    
    @scala.inline
    def setPrefixCls(value: String): Self = StObject.set(x, "prefixCls", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrefixClsUndefined: Self = StObject.set(x, "prefixCls", js.undefined)
    
    @scala.inline
    def setSelectable(value: Boolean): Self = StObject.set(x, "selectable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelectableUndefined: Self = StObject.set(x, "selectable", js.undefined)
    
    @scala.inline
    def setSelected(value: Boolean): Self = StObject.set(x, "selected", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelectedUndefined: Self = StObject.set(x, "selected", js.undefined)
    
    @scala.inline
    def setStyle(value: CSSProperties): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    
    @scala.inline
    def setSwitcherIcon(value: IconType): Self = StObject.set(x, "switcherIcon", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSwitcherIconFunction1(value: /* props */ TreeNodeProps => ReactNode): Self = StObject.set(x, "switcherIcon", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSwitcherIconUndefined: Self = StObject.set(x, "switcherIcon", js.undefined)
    
    @scala.inline
    def setTitle(value: ReactNode | (js.Function1[/* data */ DataNode, ReactNode])): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTitleFunction1(value: /* data */ DataNode => ReactNode): Self = StObject.set(x, "title", js.Any.fromFunction1(value))
    
    @scala.inline
    def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
  }
}
