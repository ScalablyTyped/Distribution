package typings.rcTree

import org.scalablytyped.runtime.Shortcut
import typings.rcTree.anon.DragNodeHighlight
import typings.rcTree.esContextTypesMod.TreeContextProps
import typings.rcTree.esInterfaceMod.BasicDataNode
import typings.rcTree.esInterfaceMod.DataNode
import typings.rcTree.esInterfaceMod.IconType
import typings.rcTree.esInterfaceMod.Key
import typings.rcTree.rcTreeStrings.close
import typings.rcTree.rcTreeStrings.open
import typings.react.mod.CSSProperties
import typings.react.mod.Component
import typings.react.mod.DragEvent
import typings.react.mod.FC
import typings.react.mod.MouseEventHandler
import typings.react.mod.NativeMouseEvent
import typings.react.mod.ReactElement
import typings.react.mod.ReactFragment
import typings.react.mod.ReactNode
import typings.react.mod.Ref
import typings.react.mod.global.JSX.Element
import typings.std.HTMLDivElement
import typings.std.HTMLSpanElement
import typings.std.MouseEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esTreeNodeMod extends Shortcut {
  
  @JSImport("rc-tree/es/TreeNode", JSImport.Default)
  @js.native
  val default: FC[TreeNodeProps[DataNode]] = js.native
  
  @JSImport("rc-tree/es/TreeNode", "InternalTreeNode")
  @js.native
  open class InternalTreeNode protected () extends Component[InternalTreeNodeProps, TreeNodeState, Any] {
    def this(props: InternalTreeNodeProps) = this()
    /**
      * @deprecated
      * @see https://legacy.reactjs.org/docs/legacy-context.html
      */
    def this(props: InternalTreeNodeProps, context: Any) = this()
    
    @JSName("componentDidMount")
    def componentDidMount_MInternalTreeNode(): Unit = js.native
    
    @JSName("componentDidUpdate")
    def componentDidUpdate_MInternalTreeNode(): Unit = js.native
    
    def getNodeState(): close | open = js.native
    
    def hasChildren(): Boolean = js.native
    
    def isCheckable(): String | Double | Boolean | ReactElement | ReactFragment = js.native
    
    def isDisabled(): Boolean = js.native
    
    def isDraggable(): Boolean = js.native
    
    def isLeaf(): Boolean = js.native
    
    def isSelectable(): Boolean = js.native
    
    def onCheck(e: typings.react.mod.MouseEvent[HTMLSpanElement, MouseEvent]): Unit = js.native
    
    def onContextMenu(e: typings.react.mod.MouseEvent[HTMLSpanElement, MouseEvent]): Unit = js.native
    
    def onDragEnd(e: DragEvent[HTMLDivElement]): Unit = js.native
    
    def onDragEnter(e: DragEvent[HTMLDivElement]): Unit = js.native
    
    def onDragLeave(e: DragEvent[HTMLDivElement]): Unit = js.native
    
    def onDragOver(e: DragEvent[HTMLDivElement]): Unit = js.native
    
    def onDragStart(e: DragEvent[HTMLDivElement]): Unit = js.native
    
    def onDrop(e: DragEvent[HTMLDivElement]): Unit = js.native
    
    var onExpand: MouseEventHandler[HTMLDivElement] = js.native
    
    def onMouseEnter(e: typings.react.mod.MouseEvent[HTMLSpanElement, MouseEvent]): Unit = js.native
    
    def onMouseLeave(e: typings.react.mod.MouseEvent[HTMLSpanElement, MouseEvent]): Unit = js.native
    
    def onSelect(e: typings.react.mod.MouseEvent[HTMLSpanElement, MouseEvent]): Unit = js.native
    
    def onSelectorClick(e: typings.react.mod.MouseEvent[HTMLSpanElement, MouseEvent]): Unit = js.native
    
    def onSelectorDoubleClick(e: typings.react.mod.MouseEvent[HTMLSpanElement, MouseEvent]): Unit = js.native
    
    def renderCheckbox(): Element = js.native
    
    def renderDragHandler(): Element = js.native
    
    def renderDropIndicator(): ReactNode = js.native
    
    def renderIcon(): Element = js.native
    
    def renderSelector(): Element = js.native
    
    def renderSwitcher(): Element = js.native
    
    def renderSwitcherIconDom(isLeaf: Boolean): ReactNode = js.native
    
    var selectHandle: HTMLSpanElement = js.native
    
    def setSelectHandle(node: Any): Unit = js.native
    
    @JSName("state")
    var state_InternalTreeNode: DragNodeHighlight = js.native
    
    def syncLoadData(props: Any): Unit = js.native
  }
  
  trait InternalTreeNodeProps
    extends StObject
       with TreeNodeProps[DataNode] {
    
    var context: js.UndefOr[TreeContextProps[DataNode]] = js.undefined
  }
  object InternalTreeNodeProps {
    
    inline def apply(): InternalTreeNodeProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[InternalTreeNodeProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: InternalTreeNodeProps] (val x: Self) extends AnyVal {
      
      inline def setContext(value: TreeContextProps[DataNode]): Self = StObject.set(x, "context", value.asInstanceOf[js.Any])
      
      inline def setContextUndefined: Self = StObject.set(x, "context", js.undefined)
    }
  }
  
  trait TreeNodeProps[TreeDataType /* <: BasicDataNode */] extends StObject {
    
    var active: js.UndefOr[Boolean] = js.undefined
    
    var checkable: js.UndefOr[Boolean] = js.undefined
    
    var checked: js.UndefOr[Boolean] = js.undefined
    
    var children: js.UndefOr[ReactNode] = js.undefined
    
    var className: js.UndefOr[String] = js.undefined
    
    /** New added in Tree for easy data access */
    var data: js.UndefOr[TreeDataType] = js.undefined
    
    var disableCheckbox: js.UndefOr[Boolean] = js.undefined
    
    var disabled: js.UndefOr[Boolean] = js.undefined
    
    var domRef: js.UndefOr[Ref[HTMLDivElement]] = js.undefined
    
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
    
    var onMouseMove: js.UndefOr[MouseEventHandler[HTMLDivElement]] = js.undefined
    
    var pos: js.UndefOr[String] = js.undefined
    
    var prefixCls: js.UndefOr[String] = js.undefined
    
    var selectable: js.UndefOr[Boolean] = js.undefined
    
    var selected: js.UndefOr[Boolean] = js.undefined
    
    var style: js.UndefOr[CSSProperties] = js.undefined
    
    var switcherIcon: js.UndefOr[IconType] = js.undefined
    
    var title: js.UndefOr[ReactNode | (js.Function1[/* data */ TreeDataType, ReactNode])] = js.undefined
  }
  object TreeNodeProps {
    
    inline def apply[TreeDataType /* <: BasicDataNode */](): TreeNodeProps[TreeDataType] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TreeNodeProps[TreeDataType]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: TreeNodeProps[?], TreeDataType /* <: BasicDataNode */] (val x: Self & TreeNodeProps[TreeDataType]) extends AnyVal {
      
      inline def setActive(value: Boolean): Self = StObject.set(x, "active", value.asInstanceOf[js.Any])
      
      inline def setActiveUndefined: Self = StObject.set(x, "active", js.undefined)
      
      inline def setCheckable(value: Boolean): Self = StObject.set(x, "checkable", value.asInstanceOf[js.Any])
      
      inline def setCheckableUndefined: Self = StObject.set(x, "checkable", js.undefined)
      
      inline def setChecked(value: Boolean): Self = StObject.set(x, "checked", value.asInstanceOf[js.Any])
      
      inline def setCheckedUndefined: Self = StObject.set(x, "checked", js.undefined)
      
      inline def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      inline def setData(value: TreeDataType): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
      
      inline def setDisableCheckbox(value: Boolean): Self = StObject.set(x, "disableCheckbox", value.asInstanceOf[js.Any])
      
      inline def setDisableCheckboxUndefined: Self = StObject.set(x, "disableCheckbox", js.undefined)
      
      inline def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      inline def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
      
      inline def setDomRef(value: Ref[HTMLDivElement]): Self = StObject.set(x, "domRef", value.asInstanceOf[js.Any])
      
      inline def setDomRefFunction1(value: /* instance */ HTMLDivElement | Null => Unit): Self = StObject.set(x, "domRef", js.Any.fromFunction1(value))
      
      inline def setDomRefNull: Self = StObject.set(x, "domRef", null)
      
      inline def setDomRefUndefined: Self = StObject.set(x, "domRef", js.undefined)
      
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
      
      inline def setOnMouseMove(value: typings.react.mod.MouseEvent[HTMLDivElement, NativeMouseEvent] => Unit): Self = StObject.set(x, "onMouseMove", js.Any.fromFunction1(value))
      
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
      
      inline def setTitle(value: ReactNode | (js.Function1[/* data */ TreeDataType, ReactNode])): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      inline def setTitleFunction1(value: /* data */ TreeDataType => ReactNode): Self = StObject.set(x, "title", js.Any.fromFunction1(value))
      
      inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    }
  }
  
  trait TreeNodeState extends StObject {
    
    var dragNodeHighlight: Boolean
  }
  object TreeNodeState {
    
    inline def apply(dragNodeHighlight: Boolean): TreeNodeState = {
      val __obj = js.Dynamic.literal(dragNodeHighlight = dragNodeHighlight.asInstanceOf[js.Any])
      __obj.asInstanceOf[TreeNodeState]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: TreeNodeState] (val x: Self) extends AnyVal {
      
      inline def setDragNodeHighlight(value: Boolean): Self = StObject.set(x, "dragNodeHighlight", value.asInstanceOf[js.Any])
    }
  }
  
  type _To = FC[TreeNodeProps[DataNode]]
  
  /* This means you don't have to write `default`, but can instead just say `esTreeNodeMod.foo` */
  override def _to: FC[TreeNodeProps[DataNode]] = default
}
