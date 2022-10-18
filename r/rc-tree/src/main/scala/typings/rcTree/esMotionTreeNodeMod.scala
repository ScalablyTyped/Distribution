package typings.rcTree

import org.scalablytyped.runtime.Shortcut
import typings.rcTree.esInterfaceMod.DataNode
import typings.rcTree.esInterfaceMod.FlattenNode
import typings.rcTree.esInterfaceMod.IconType
import typings.rcTree.esInterfaceMod.Key
import typings.rcTree.esTreeNodeMod.TreeNodeProps
import typings.rcTree.esUtilsTreeUtilMod.TreeNodeRequiredProps
import typings.rcTree.rcTreeStrings.hide
import typings.rcTree.rcTreeStrings.show
import typings.react.mod.CSSProperties
import typings.react.mod.ForwardRefExoticComponent
import typings.react.mod.MouseEvent
import typings.react.mod.MouseEventHandler
import typings.react.mod.NativeMouseEvent
import typings.react.mod.ReactNode
import typings.react.mod.RefAttributes
import typings.std.HTMLDivElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esMotionTreeNodeMod extends Shortcut {
  
  @JSImport("rc-tree/es/MotionTreeNode", JSImport.Default)
  @js.native
  val default: ForwardRefExoticComponent[MotionTreeNodeProps & RefAttributes[HTMLDivElement]] = js.native
  
  /* Inlined parent std.Omit<rc-tree.rc-tree/es/TreeNode.TreeNodeProps<rc-tree.rc-tree/es/interface.DataNode>, 'domRef'> */
  trait MotionTreeNodeProps extends StObject {
    
    var active: Boolean
    
    var checkable: js.UndefOr[Boolean] = js.undefined
    
    var checked: js.UndefOr[Boolean] = js.undefined
    
    var children: js.UndefOr[ReactNode] = js.undefined
    
    var className: js.UndefOr[String] = js.undefined
    
    var data: js.UndefOr[DataNode] = js.undefined
    
    var disableCheckbox: js.UndefOr[Boolean] = js.undefined
    
    var disabled: js.UndefOr[Boolean] = js.undefined
    
    var dragOver: js.UndefOr[Boolean] = js.undefined
    
    var dragOverGapBottom: js.UndefOr[Boolean] = js.undefined
    
    var dragOverGapTop: js.UndefOr[Boolean] = js.undefined
    
    var eventKey: js.UndefOr[Key] = js.undefined
    
    var expanded: js.UndefOr[Boolean] = js.undefined
    
    var halfChecked: js.UndefOr[Boolean] = js.undefined
    
    var icon: js.UndefOr[IconType] = js.undefined
    
    var id: js.UndefOr[String] = js.undefined
    
    var isEnd: js.UndefOr[js.Array[Boolean]] = js.undefined
    
    var isLeaf: js.UndefOr[Boolean] = js.undefined
    
    var isStart: js.UndefOr[js.Array[Boolean]] = js.undefined
    
    var loaded: js.UndefOr[Boolean] = js.undefined
    
    var loading: js.UndefOr[Boolean] = js.undefined
    
    var motion: js.UndefOr[Any] = js.undefined
    
    var motionNodes: js.UndefOr[js.Array[FlattenNode[DataNode]]] = js.undefined
    
    var motionType: js.UndefOr[show | hide] = js.undefined
    
    def onMotionEnd(): Unit
    
    def onMotionStart(): Unit
    
    var onMouseMove: js.UndefOr[MouseEventHandler[HTMLDivElement]] = js.undefined
    
    var pos: js.UndefOr[String] = js.undefined
    
    var prefixCls: js.UndefOr[String] = js.undefined
    
    var selectable: js.UndefOr[Boolean] = js.undefined
    
    var selected: js.UndefOr[Boolean] = js.undefined
    
    var style: js.UndefOr[CSSProperties] = js.undefined
    
    var switcherIcon: js.UndefOr[IconType] = js.undefined
    
    var title: js.UndefOr[ReactNode | (js.Function1[/* data */ DataNode, ReactNode])] = js.undefined
    
    var treeNodeRequiredProps: TreeNodeRequiredProps[DataNode]
  }
  object MotionTreeNodeProps {
    
    inline def apply(
      active: Boolean,
      onMotionEnd: () => Unit,
      onMotionStart: () => Unit,
      treeNodeRequiredProps: TreeNodeRequiredProps[DataNode]
    ): MotionTreeNodeProps = {
      val __obj = js.Dynamic.literal(active = active.asInstanceOf[js.Any], onMotionEnd = js.Any.fromFunction0(onMotionEnd), onMotionStart = js.Any.fromFunction0(onMotionStart), treeNodeRequiredProps = treeNodeRequiredProps.asInstanceOf[js.Any])
      __obj.asInstanceOf[MotionTreeNodeProps]
    }
    
    extension [Self <: MotionTreeNodeProps](x: Self) {
      
      inline def setActive(value: Boolean): Self = StObject.set(x, "active", value.asInstanceOf[js.Any])
      
      inline def setCheckable(value: Boolean): Self = StObject.set(x, "checkable", value.asInstanceOf[js.Any])
      
      inline def setCheckableUndefined: Self = StObject.set(x, "checkable", js.undefined)
      
      inline def setChecked(value: Boolean): Self = StObject.set(x, "checked", value.asInstanceOf[js.Any])
      
      inline def setCheckedUndefined: Self = StObject.set(x, "checked", js.undefined)
      
      inline def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      inline def setData(value: DataNode): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
      
      inline def setDisableCheckbox(value: Boolean): Self = StObject.set(x, "disableCheckbox", value.asInstanceOf[js.Any])
      
      inline def setDisableCheckboxUndefined: Self = StObject.set(x, "disableCheckbox", js.undefined)
      
      inline def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      inline def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
      
      inline def setDragOver(value: Boolean): Self = StObject.set(x, "dragOver", value.asInstanceOf[js.Any])
      
      inline def setDragOverGapBottom(value: Boolean): Self = StObject.set(x, "dragOverGapBottom", value.asInstanceOf[js.Any])
      
      inline def setDragOverGapBottomUndefined: Self = StObject.set(x, "dragOverGapBottom", js.undefined)
      
      inline def setDragOverGapTop(value: Boolean): Self = StObject.set(x, "dragOverGapTop", value.asInstanceOf[js.Any])
      
      inline def setDragOverGapTopUndefined: Self = StObject.set(x, "dragOverGapTop", js.undefined)
      
      inline def setDragOverUndefined: Self = StObject.set(x, "dragOver", js.undefined)
      
      inline def setEventKey(value: Key): Self = StObject.set(x, "eventKey", value.asInstanceOf[js.Any])
      
      inline def setEventKeyUndefined: Self = StObject.set(x, "eventKey", js.undefined)
      
      inline def setExpanded(value: Boolean): Self = StObject.set(x, "expanded", value.asInstanceOf[js.Any])
      
      inline def setExpandedUndefined: Self = StObject.set(x, "expanded", js.undefined)
      
      inline def setHalfChecked(value: Boolean): Self = StObject.set(x, "halfChecked", value.asInstanceOf[js.Any])
      
      inline def setHalfCheckedUndefined: Self = StObject.set(x, "halfChecked", js.undefined)
      
      inline def setIcon(value: IconType): Self = StObject.set(x, "icon", value.asInstanceOf[js.Any])
      
      inline def setIconFunction1(value: /* props */ TreeNodeProps[DataNode] => ReactNode): Self = StObject.set(x, "icon", js.Any.fromFunction1(value))
      
      inline def setIconUndefined: Self = StObject.set(x, "icon", js.undefined)
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
      
      inline def setIsEnd(value: js.Array[Boolean]): Self = StObject.set(x, "isEnd", value.asInstanceOf[js.Any])
      
      inline def setIsEndUndefined: Self = StObject.set(x, "isEnd", js.undefined)
      
      inline def setIsEndVarargs(value: Boolean*): Self = StObject.set(x, "isEnd", js.Array(value*))
      
      inline def setIsLeaf(value: Boolean): Self = StObject.set(x, "isLeaf", value.asInstanceOf[js.Any])
      
      inline def setIsLeafUndefined: Self = StObject.set(x, "isLeaf", js.undefined)
      
      inline def setIsStart(value: js.Array[Boolean]): Self = StObject.set(x, "isStart", value.asInstanceOf[js.Any])
      
      inline def setIsStartUndefined: Self = StObject.set(x, "isStart", js.undefined)
      
      inline def setIsStartVarargs(value: Boolean*): Self = StObject.set(x, "isStart", js.Array(value*))
      
      inline def setLoaded(value: Boolean): Self = StObject.set(x, "loaded", value.asInstanceOf[js.Any])
      
      inline def setLoadedUndefined: Self = StObject.set(x, "loaded", js.undefined)
      
      inline def setLoading(value: Boolean): Self = StObject.set(x, "loading", value.asInstanceOf[js.Any])
      
      inline def setLoadingUndefined: Self = StObject.set(x, "loading", js.undefined)
      
      inline def setMotion(value: Any): Self = StObject.set(x, "motion", value.asInstanceOf[js.Any])
      
      inline def setMotionNodes(value: js.Array[FlattenNode[DataNode]]): Self = StObject.set(x, "motionNodes", value.asInstanceOf[js.Any])
      
      inline def setMotionNodesUndefined: Self = StObject.set(x, "motionNodes", js.undefined)
      
      inline def setMotionNodesVarargs(value: FlattenNode[DataNode]*): Self = StObject.set(x, "motionNodes", js.Array(value*))
      
      inline def setMotionType(value: show | hide): Self = StObject.set(x, "motionType", value.asInstanceOf[js.Any])
      
      inline def setMotionTypeUndefined: Self = StObject.set(x, "motionType", js.undefined)
      
      inline def setMotionUndefined: Self = StObject.set(x, "motion", js.undefined)
      
      inline def setOnMotionEnd(value: () => Unit): Self = StObject.set(x, "onMotionEnd", js.Any.fromFunction0(value))
      
      inline def setOnMotionStart(value: () => Unit): Self = StObject.set(x, "onMotionStart", js.Any.fromFunction0(value))
      
      inline def setOnMouseMove(value: MouseEvent[HTMLDivElement, NativeMouseEvent] => Unit): Self = StObject.set(x, "onMouseMove", js.Any.fromFunction1(value))
      
      inline def setOnMouseMoveUndefined: Self = StObject.set(x, "onMouseMove", js.undefined)
      
      inline def setPos(value: String): Self = StObject.set(x, "pos", value.asInstanceOf[js.Any])
      
      inline def setPosUndefined: Self = StObject.set(x, "pos", js.undefined)
      
      inline def setPrefixCls(value: String): Self = StObject.set(x, "prefixCls", value.asInstanceOf[js.Any])
      
      inline def setPrefixClsUndefined: Self = StObject.set(x, "prefixCls", js.undefined)
      
      inline def setSelectable(value: Boolean): Self = StObject.set(x, "selectable", value.asInstanceOf[js.Any])
      
      inline def setSelectableUndefined: Self = StObject.set(x, "selectable", js.undefined)
      
      inline def setSelected(value: Boolean): Self = StObject.set(x, "selected", value.asInstanceOf[js.Any])
      
      inline def setSelectedUndefined: Self = StObject.set(x, "selected", js.undefined)
      
      inline def setStyle(value: CSSProperties): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
      
      inline def setSwitcherIcon(value: IconType): Self = StObject.set(x, "switcherIcon", value.asInstanceOf[js.Any])
      
      inline def setSwitcherIconFunction1(value: /* props */ TreeNodeProps[DataNode] => ReactNode): Self = StObject.set(x, "switcherIcon", js.Any.fromFunction1(value))
      
      inline def setSwitcherIconUndefined: Self = StObject.set(x, "switcherIcon", js.undefined)
      
      inline def setTitle(value: ReactNode | (js.Function1[/* data */ DataNode, ReactNode])): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      inline def setTitleFunction1(value: /* data */ DataNode => ReactNode): Self = StObject.set(x, "title", js.Any.fromFunction1(value))
      
      inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
      
      inline def setTreeNodeRequiredProps(value: TreeNodeRequiredProps[DataNode]): Self = StObject.set(x, "treeNodeRequiredProps", value.asInstanceOf[js.Any])
    }
  }
  
  type _To = ForwardRefExoticComponent[MotionTreeNodeProps & RefAttributes[HTMLDivElement]]
  
  /* This means you don't have to write `default`, but can instead just say `esMotionTreeNodeMod.foo` */
  override def _to: ForwardRefExoticComponent[MotionTreeNodeProps & RefAttributes[HTMLDivElement]] = default
}
