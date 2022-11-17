package typings.rcTree

import typings.rcTree.anon.Checked
import typings.rcTree.anon.CheckedKeys
import typings.rcTree.anon.DragNode
import typings.rcTree.anon.DropLevelOffset
import typings.rcTree.anon.Event
import typings.rcTree.anon.EventMouseEvent
import typings.rcTree.anon.EventNode
import typings.rcTree.anon.Expanded
import typings.rcTree.anon.ExpandedKeys
import typings.rcTree.anon.Node
import typings.rcTree.anon.PartialTreeStateDataNode
import typings.rcTree.esContextTypesMod.NodeDragEventHandler
import typings.rcTree.esContextTypesMod.NodeDragEventParams
import typings.rcTree.esContextTypesMod.NodeMouseEventHandler
import typings.rcTree.esContextTypesMod.NodeMouseEventParams
import typings.rcTree.esInterfaceMod.BasicDataNode
import typings.rcTree.esInterfaceMod.DataEntity
import typings.rcTree.esInterfaceMod.DataNode
import typings.rcTree.esInterfaceMod.Direction
import typings.rcTree.esInterfaceMod.EventDataNode
import typings.rcTree.esInterfaceMod.FieldNames
import typings.rcTree.esInterfaceMod.FlattenNode
import typings.rcTree.esInterfaceMod.IconType
import typings.rcTree.esInterfaceMod.Key
import typings.rcTree.esInterfaceMod.NodeInstance
import typings.rcTree.esNodeListMod.NodeListRef
import typings.rcTree.esTreeNodeMod.TreeNodeProps
import typings.rcVirtualList.esListMod.ScrollTo
import typings.react.mod.CSSProperties
import typings.react.mod.Component
import typings.react.mod.DragEvent
import typings.react.mod.FC
import typings.react.mod.FocusEvent
import typings.react.mod.FocusEventHandler
import typings.react.mod.KeyboardEvent
import typings.react.mod.KeyboardEventHandler
import typings.react.mod.MouseEventHandler
import typings.react.mod.NativeMouseEvent
import typings.react.mod.NativeUIEvent
import typings.react.mod.ReactNode
import typings.react.mod.RefObject
import typings.react.mod.UIEvent
import typings.react.mod.UIEventHandler
import typings.react.mod.global.JSX.Element
import typings.std.HTMLDivElement
import typings.std.HTMLElement
import typings.std.HTMLSpanElement
import typings.std.MouseEvent
import typings.std.Partial
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esTreeMod {
  
  @JSImport("rc-tree/es/Tree", JSImport.Default)
  @js.native
  open class default[TreeDataType /* <: DataNode | BasicDataNode */] () extends Tree[TreeDataType]
  object default {
    
    @JSImport("rc-tree/es/Tree", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /* static member */
    @JSImport("rc-tree/es/Tree", "default.TreeNode")
    @js.native
    def TreeNode: FC[TreeNodeProps[DataNode]] = js.native
    inline def TreeNode_=(x: FC[TreeNodeProps[DataNode]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("TreeNode")(x.asInstanceOf[js.Any])
    
    /* static member */
    object defaultProps {
      
      @JSImport("rc-tree/es/Tree", "default.defaultProps")
      @js.native
      val ^ : js.Any = js.native
      
      inline def allowDrop(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("allowDrop")().asInstanceOf[Boolean]
      
      @JSImport("rc-tree/es/Tree", "default.defaultProps.autoExpandParent")
      @js.native
      def autoExpandParent: Boolean = js.native
      inline def autoExpandParent_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("autoExpandParent")(x.asInstanceOf[js.Any])
      
      @JSImport("rc-tree/es/Tree", "default.defaultProps.checkStrictly")
      @js.native
      def checkStrictly: Boolean = js.native
      inline def checkStrictly_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("checkStrictly")(x.asInstanceOf[js.Any])
      
      @JSImport("rc-tree/es/Tree", "default.defaultProps.checkable")
      @js.native
      def checkable: Boolean = js.native
      inline def checkable_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("checkable")(x.asInstanceOf[js.Any])
      
      @JSImport("rc-tree/es/Tree", "default.defaultProps.defaultCheckedKeys")
      @js.native
      def defaultCheckedKeys: js.Array[Any] = js.native
      inline def defaultCheckedKeys_=(x: js.Array[Any]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultCheckedKeys")(x.asInstanceOf[js.Any])
      
      @JSImport("rc-tree/es/Tree", "default.defaultProps.defaultExpandAll")
      @js.native
      def defaultExpandAll: Boolean = js.native
      inline def defaultExpandAll_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultExpandAll")(x.asInstanceOf[js.Any])
      
      @JSImport("rc-tree/es/Tree", "default.defaultProps.defaultExpandParent")
      @js.native
      def defaultExpandParent: Boolean = js.native
      inline def defaultExpandParent_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultExpandParent")(x.asInstanceOf[js.Any])
      
      @JSImport("rc-tree/es/Tree", "default.defaultProps.defaultExpandedKeys")
      @js.native
      def defaultExpandedKeys: js.Array[Any] = js.native
      inline def defaultExpandedKeys_=(x: js.Array[Any]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultExpandedKeys")(x.asInstanceOf[js.Any])
      
      @JSImport("rc-tree/es/Tree", "default.defaultProps.defaultSelectedKeys")
      @js.native
      def defaultSelectedKeys: js.Array[Any] = js.native
      inline def defaultSelectedKeys_=(x: js.Array[Any]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultSelectedKeys")(x.asInstanceOf[js.Any])
      
      @JSImport("rc-tree/es/Tree", "default.defaultProps.disabled")
      @js.native
      def disabled: Boolean = js.native
      inline def disabled_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("disabled")(x.asInstanceOf[js.Any])
      
      @JSImport("rc-tree/es/Tree", "default.defaultProps.draggable")
      @js.native
      def draggable: Boolean = js.native
      inline def draggable_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("draggable")(x.asInstanceOf[js.Any])
      
      @JSImport("rc-tree/es/Tree", "default.defaultProps.dropIndicatorRender")
      @js.native
      def dropIndicatorRender: js.Function1[/* param0 */ DropLevelOffset, Element] = js.native
      inline def dropIndicatorRender_=(x: js.Function1[/* param0 */ DropLevelOffset, Element]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("dropIndicatorRender")(x.asInstanceOf[js.Any])
      
      @JSImport("rc-tree/es/Tree", "default.defaultProps.expandAction")
      @js.native
      def expandAction: Boolean = js.native
      inline def expandAction_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("expandAction")(x.asInstanceOf[js.Any])
      
      @JSImport("rc-tree/es/Tree", "default.defaultProps.multiple")
      @js.native
      def multiple: Boolean = js.native
      inline def multiple_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("multiple")(x.asInstanceOf[js.Any])
      
      @JSImport("rc-tree/es/Tree", "default.defaultProps.prefixCls")
      @js.native
      def prefixCls: String = js.native
      inline def prefixCls_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("prefixCls")(x.asInstanceOf[js.Any])
      
      @JSImport("rc-tree/es/Tree", "default.defaultProps.selectable")
      @js.native
      def selectable: Boolean = js.native
      inline def selectable_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("selectable")(x.asInstanceOf[js.Any])
      
      @JSImport("rc-tree/es/Tree", "default.defaultProps.showIcon")
      @js.native
      def showIcon: Boolean = js.native
      inline def showIcon_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("showIcon")(x.asInstanceOf[js.Any])
      
      @JSImport("rc-tree/es/Tree", "default.defaultProps.showLine")
      @js.native
      def showLine: Boolean = js.native
      inline def showLine_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("showLine")(x.asInstanceOf[js.Any])
    }
    
    /* static member */
    inline def getDerivedStateFromProps(props: TreeProps[DataNode], prevState: TreeState[DataNode]): PartialTreeStateDataNode = (^.asInstanceOf[js.Dynamic].applyDynamic("getDerivedStateFromProps")(props.asInstanceOf[js.Any], prevState.asInstanceOf[js.Any])).asInstanceOf[PartialTreeStateDataNode]
  }
  
  type AllowDrop[TreeDataType /* <: BasicDataNode */] = js.Function1[/* options */ AllowDropOptions[TreeDataType], Boolean]
  
  trait AllowDropOptions[TreeDataType /* <: BasicDataNode */] extends StObject {
    
    var dragNode: TreeDataType
    
    var dropNode: TreeDataType
    
    var dropPosition: -1 | 0 | 1
  }
  object AllowDropOptions {
    
    inline def apply[TreeDataType /* <: BasicDataNode */](dragNode: TreeDataType, dropNode: TreeDataType, dropPosition: -1 | 0 | 1): AllowDropOptions[TreeDataType] = {
      val __obj = js.Dynamic.literal(dragNode = dragNode.asInstanceOf[js.Any], dropNode = dropNode.asInstanceOf[js.Any], dropPosition = dropPosition.asInstanceOf[js.Any])
      __obj.asInstanceOf[AllowDropOptions[TreeDataType]]
    }
    
    extension [Self <: AllowDropOptions[?], TreeDataType /* <: BasicDataNode */](x: Self & AllowDropOptions[TreeDataType]) {
      
      inline def setDragNode(value: TreeDataType): Self = StObject.set(x, "dragNode", value.asInstanceOf[js.Any])
      
      inline def setDropNode(value: TreeDataType): Self = StObject.set(x, "dropNode", value.asInstanceOf[js.Any])
      
      inline def setDropPosition(value: -1 | 0 | 1): Self = StObject.set(x, "dropPosition", value.asInstanceOf[js.Any])
    }
  }
  
  trait CheckInfo[TreeDataType /* <: BasicDataNode */] extends StObject {
    
    var checked: Boolean
    
    var checkedNodes: js.Array[TreeDataType]
    
    var checkedNodesPositions: js.UndefOr[js.Array[Node[TreeDataType]]] = js.undefined
    
    var event: "check"
    
    var halfCheckedKeys: js.UndefOr[js.Array[Key]] = js.undefined
    
    var nativeEvent: MouseEvent
    
    var node: EventDataNode[TreeDataType]
  }
  object CheckInfo {
    
    inline def apply[TreeDataType /* <: BasicDataNode */](
      checked: Boolean,
      checkedNodes: js.Array[TreeDataType],
      nativeEvent: MouseEvent,
      node: EventDataNode[TreeDataType]
    ): CheckInfo[TreeDataType] = {
      val __obj = js.Dynamic.literal(checked = checked.asInstanceOf[js.Any], checkedNodes = checkedNodes.asInstanceOf[js.Any], event = "check", nativeEvent = nativeEvent.asInstanceOf[js.Any], node = node.asInstanceOf[js.Any])
      __obj.asInstanceOf[CheckInfo[TreeDataType]]
    }
    
    extension [Self <: CheckInfo[?], TreeDataType /* <: BasicDataNode */](x: Self & CheckInfo[TreeDataType]) {
      
      inline def setChecked(value: Boolean): Self = StObject.set(x, "checked", value.asInstanceOf[js.Any])
      
      inline def setCheckedNodes(value: js.Array[TreeDataType]): Self = StObject.set(x, "checkedNodes", value.asInstanceOf[js.Any])
      
      inline def setCheckedNodesPositions(value: js.Array[Node[TreeDataType]]): Self = StObject.set(x, "checkedNodesPositions", value.asInstanceOf[js.Any])
      
      inline def setCheckedNodesPositionsUndefined: Self = StObject.set(x, "checkedNodesPositions", js.undefined)
      
      inline def setCheckedNodesPositionsVarargs(value: Node[TreeDataType]*): Self = StObject.set(x, "checkedNodesPositions", js.Array(value*))
      
      inline def setCheckedNodesVarargs(value: TreeDataType*): Self = StObject.set(x, "checkedNodes", js.Array(value*))
      
      inline def setEvent(value: "check"): Self = StObject.set(x, "event", value.asInstanceOf[js.Any])
      
      inline def setHalfCheckedKeys(value: js.Array[Key]): Self = StObject.set(x, "halfCheckedKeys", value.asInstanceOf[js.Any])
      
      inline def setHalfCheckedKeysUndefined: Self = StObject.set(x, "halfCheckedKeys", js.undefined)
      
      inline def setHalfCheckedKeysVarargs(value: Key*): Self = StObject.set(x, "halfCheckedKeys", js.Array(value*))
      
      inline def setNativeEvent(value: MouseEvent): Self = StObject.set(x, "nativeEvent", value.asInstanceOf[js.Any])
      
      inline def setNode(value: EventDataNode[TreeDataType]): Self = StObject.set(x, "node", value.asInstanceOf[js.Any])
    }
  }
  
  trait DraggableConfig extends StObject {
    
    var icon: js.UndefOr[ReactNode | false] = js.undefined
    
    var nodeDraggable: js.UndefOr[DraggableFn] = js.undefined
  }
  object DraggableConfig {
    
    inline def apply(): DraggableConfig = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DraggableConfig]
    }
    
    extension [Self <: DraggableConfig](x: Self) {
      
      inline def setIcon(value: ReactNode | false): Self = StObject.set(x, "icon", value.asInstanceOf[js.Any])
      
      inline def setIconUndefined: Self = StObject.set(x, "icon", js.undefined)
      
      inline def setNodeDraggable(value: /* node */ DataNode => Boolean): Self = StObject.set(x, "nodeDraggable", js.Any.fromFunction1(value))
      
      inline def setNodeDraggableUndefined: Self = StObject.set(x, "nodeDraggable", js.undefined)
    }
  }
  
  type DraggableFn = js.Function1[/* node */ DataNode, Boolean]
  
  object ExpandAction {
    
    inline def click: "click" = "click".asInstanceOf["click"]
    
    inline def doubleClick: "doubleClick" = "doubleClick".asInstanceOf["doubleClick"]
    
    inline def `false`: false = false.asInstanceOf[false]
  }
  type ExpandAction = false | "click" | "doubleClick"
  
  @js.native
  trait Tree[TreeDataType /* <: DataNode | BasicDataNode */] extends Component[TreeProps[TreeDataType], TreeState[TreeDataType], Any] {
    
    def cleanDragState(): Unit = js.native
    
    @JSName("componentDidMount")
    def componentDidMount_MTree(): Unit = js.native
    
    @JSName("componentDidUpdate")
    def componentDidUpdate_MTree(): Unit = js.native
    
    @JSName("componentWillUnmount")
    def componentWillUnmount_MTree(): Unit = js.native
    
    var currentMouseOverDroppableNodeKey: Any = js.native
    
    var delayedDragEnterLogic: Record[Key, Double] = js.native
    
    var destroyed: Boolean = js.native
    
    var dragNode: NodeInstance[TreeDataType] = js.native
    
    var dragStartMousePosition: Any = js.native
    
    def getActiveItem(): FlattenNode[TreeDataType] = js.native
    
    def getTreeNodeRequiredProps(): CheckedKeys[TreeDataType] = js.native
    
    var listRef: RefObject[NodeListRef] = js.native
    
    var loadingRetryTimes: Record[Key, Double] = js.native
    
    def offsetActiveKey(offset: Double): Unit = js.native
    
    def onActiveChange(newActiveKey: Key): Unit = js.native
    
    var onBlur: FocusEventHandler[HTMLDivElement] = js.native
    
    var onFocus: FocusEventHandler[HTMLDivElement] = js.native
    
    var onKeyDown: KeyboardEventHandler[HTMLDivElement] = js.native
    
    def onListChangeEnd(): Unit = js.native
    
    def onListChangeStart(): Unit = js.native
    
    def onNodeCheck(
      e: typings.react.mod.MouseEvent[HTMLSpanElement, NativeMouseEvent],
      treeNode: EventDataNode[TreeDataType],
      checked: Boolean
    ): Unit = js.native
    
    var onNodeClick: NodeMouseEventHandler[DataNode, HTMLSpanElement] = js.native
    
    var onNodeContextMenu: NodeMouseEventHandler[TreeDataType, HTMLSpanElement] = js.native
    
    var onNodeDoubleClick: NodeMouseEventHandler[DataNode, HTMLSpanElement] = js.native
    
    var onNodeDragEnd: NodeDragEventHandler[TreeDataType, HTMLDivElement] = js.native
    
    /**
      * [Legacy] Select handler is smaller than node,
      * so that this will trigger when drag enter node or select handler.
      * This is a little tricky if customize css without padding.
      * Better for use mouse move event to refresh drag state.
      * But let's just keep it to avoid event trigger logic change.
      */
    def onNodeDragEnter(event: DragEvent[HTMLDivElement], node: NodeInstance[TreeDataType]): Unit = js.native
    
    var onNodeDragLeave: NodeDragEventHandler[TreeDataType, HTMLDivElement] = js.native
    
    def onNodeDragOver(event: DragEvent[HTMLDivElement], node: NodeInstance[TreeDataType]): Unit = js.native
    
    var onNodeDragStart: NodeDragEventHandler[TreeDataType, HTMLDivElement] = js.native
    
    def onNodeDrop(event: DragEvent[HTMLDivElement], node: Any): Unit = js.native
    def onNodeDrop(event: DragEvent[HTMLDivElement], node: Any, outsideTree: Boolean): Unit = js.native
    
    def onNodeExpand(
      e: typings.react.mod.MouseEvent[HTMLDivElement, NativeMouseEvent],
      treeNode: EventDataNode[TreeDataType]
    ): Unit = js.native
    
    def onNodeLoad(treeNode: EventDataNode[TreeDataType]): js.Promise[Unit] = js.native
    
    var onNodeMouseEnter: NodeMouseEventHandler[TreeDataType, HTMLSpanElement] = js.native
    
    var onNodeMouseLeave: NodeMouseEventHandler[TreeDataType, HTMLSpanElement] = js.native
    
    var onNodeSelect: NodeMouseEventHandler[TreeDataType, HTMLSpanElement] = js.native
    
    def onUpdated(): Unit = js.native
    
    def onWindowDragEnd(event: Any): Unit = js.native
    
    def resetDragState(): Unit = js.native
    
    var scrollTo: ScrollTo = js.native
    
    /** Set uncontrolled `expandedKeys`. This will also auto update `flattenNodes`. */
    def setExpandedKeys(expandedKeys: js.Array[Key]): Unit = js.native
    
    /**
      * Only update the value which is not in props
      */
    def setUncontrolledState(state: Partial[TreeState[TreeDataType]]): Unit = js.native
    def setUncontrolledState(state: Partial[TreeState[TreeDataType]], atomic: Boolean): Unit = js.native
    def setUncontrolledState(
      state: Partial[TreeState[TreeDataType]],
      atomic: Boolean,
      forceState: Partial[TreeState[TreeDataType]]
    ): Unit = js.native
    def setUncontrolledState(
      state: Partial[TreeState[TreeDataType]],
      atomic: Unit,
      forceState: Partial[TreeState[TreeDataType]]
    ): Unit = js.native
    
    var triggerExpandActionExpand: NodeMouseEventHandler[DataNode, HTMLSpanElement] = js.native
  }
  
  trait TreeProps[TreeDataType /* <: BasicDataNode */] extends StObject {
    
    var activeKey: js.UndefOr[Key] = js.undefined
    
    var allowDrop: js.UndefOr[AllowDrop[TreeDataType]] = js.undefined
    
    var autoExpandParent: js.UndefOr[Boolean] = js.undefined
    
    var checkStrictly: js.UndefOr[Boolean] = js.undefined
    
    var checkable: js.UndefOr[Boolean | ReactNode] = js.undefined
    
    var checkedKeys: js.UndefOr[js.Array[Key] | Checked] = js.undefined
    
    var children: js.UndefOr[ReactNode] = js.undefined
    
    var className: js.UndefOr[String] = js.undefined
    
    var defaultCheckedKeys: js.UndefOr[js.Array[Key]] = js.undefined
    
    var defaultExpandAll: js.UndefOr[Boolean] = js.undefined
    
    var defaultExpandParent: js.UndefOr[Boolean] = js.undefined
    
    var defaultExpandedKeys: js.UndefOr[js.Array[Key]] = js.undefined
    
    var defaultSelectedKeys: js.UndefOr[js.Array[Key]] = js.undefined
    
    var direction: js.UndefOr[Direction] = js.undefined
    
    var disabled: js.UndefOr[Boolean] = js.undefined
    
    var draggable: js.UndefOr[DraggableFn | Boolean | DraggableConfig] = js.undefined
    
    var dropIndicatorRender: js.UndefOr[js.Function1[/* props */ typings.rcTree.anon.Direction, ReactNode]] = js.undefined
    
    var expandAction: js.UndefOr[ExpandAction] = js.undefined
    
    var expandedKeys: js.UndefOr[js.Array[Key]] = js.undefined
    
    var fieldNames: js.UndefOr[FieldNames] = js.undefined
    
    var filterTreeNode: js.UndefOr[js.Function1[/* treeNode */ EventDataNode[TreeDataType], Boolean]] = js.undefined
    
    var focusable: js.UndefOr[Boolean] = js.undefined
    
    var height: js.UndefOr[Double] = js.undefined
    
    var icon: js.UndefOr[IconType] = js.undefined
    
    var itemHeight: js.UndefOr[Double] = js.undefined
    
    var loadData: js.UndefOr[js.Function1[/* treeNode */ EventDataNode[TreeDataType], js.Promise[Any]]] = js.undefined
    
    var loadedKeys: js.UndefOr[js.Array[Key]] = js.undefined
    
    var motion: js.UndefOr[Any] = js.undefined
    
    var multiple: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Used for `rc-tree-select` only.
      * Do not use in your production code directly since this will be refactor.
      */
    var onActiveChange: js.UndefOr[js.Function1[/* key */ Key, Unit]] = js.undefined
    
    var onBlur: js.UndefOr[FocusEventHandler[HTMLDivElement]] = js.undefined
    
    var onCheck: js.UndefOr[
        js.Function2[/* checked */ Checked | js.Array[Key], /* info */ CheckInfo[TreeDataType], Unit]
      ] = js.undefined
    
    var onClick: js.UndefOr[NodeMouseEventHandler[DataNode, HTMLSpanElement]] = js.undefined
    
    var onContextMenu: js.UndefOr[MouseEventHandler[HTMLDivElement]] = js.undefined
    
    var onDoubleClick: js.UndefOr[NodeMouseEventHandler[DataNode, HTMLSpanElement]] = js.undefined
    
    var onDragEnd: js.UndefOr[js.Function1[/* info */ NodeDragEventParams[TreeDataType, HTMLDivElement], Unit]] = js.undefined
    
    var onDragEnter: js.UndefOr[
        js.Function1[
          /* info */ (NodeDragEventParams[TreeDataType, HTMLDivElement]) & ExpandedKeys, 
          Unit
        ]
      ] = js.undefined
    
    var onDragLeave: js.UndefOr[js.Function1[/* info */ NodeDragEventParams[TreeDataType, HTMLDivElement], Unit]] = js.undefined
    
    var onDragOver: js.UndefOr[js.Function1[/* info */ NodeDragEventParams[TreeDataType, HTMLDivElement], Unit]] = js.undefined
    
    var onDragStart: js.UndefOr[js.Function1[/* info */ NodeDragEventParams[TreeDataType, HTMLDivElement], Unit]] = js.undefined
    
    var onDrop: js.UndefOr[
        js.Function1[
          /* info */ (NodeDragEventParams[TreeDataType, HTMLDivElement]) & DragNode[TreeDataType], 
          Unit
        ]
      ] = js.undefined
    
    var onExpand: js.UndefOr[
        js.Function2[/* expandedKeys */ js.Array[Key], /* info */ Expanded[TreeDataType], Unit]
      ] = js.undefined
    
    var onFocus: js.UndefOr[FocusEventHandler[HTMLDivElement]] = js.undefined
    
    var onKeyDown: js.UndefOr[KeyboardEventHandler[HTMLDivElement]] = js.undefined
    
    var onLoad: js.UndefOr[
        js.Function2[/* loadedKeys */ js.Array[Key], /* info */ EventNode[TreeDataType], Unit]
      ] = js.undefined
    
    var onMouseEnter: js.UndefOr[
        js.Function1[/* info */ NodeMouseEventParams[TreeDataType, HTMLSpanElement], Unit]
      ] = js.undefined
    
    var onMouseLeave: js.UndefOr[
        js.Function1[/* info */ NodeMouseEventParams[TreeDataType, HTMLSpanElement], Unit]
      ] = js.undefined
    
    var onRightClick: js.UndefOr[js.Function1[/* info */ EventMouseEvent[TreeDataType], Unit]] = js.undefined
    
    var onScroll: js.UndefOr[UIEventHandler[HTMLElement]] = js.undefined
    
    var onSelect: js.UndefOr[
        js.Function2[/* selectedKeys */ js.Array[Key], /* info */ Event[TreeDataType], Unit]
      ] = js.undefined
    
    var prefixCls: String
    
    var rootClassName: js.UndefOr[String] = js.undefined
    
    var rootStyle: js.UndefOr[CSSProperties] = js.undefined
    
    var selectable: js.UndefOr[Boolean] = js.undefined
    
    var selectedKeys: js.UndefOr[js.Array[Key]] = js.undefined
    
    var showIcon: js.UndefOr[Boolean] = js.undefined
    
    var showLine: js.UndefOr[Boolean] = js.undefined
    
    var style: js.UndefOr[CSSProperties] = js.undefined
    
    var switcherIcon: js.UndefOr[IconType] = js.undefined
    
    var tabIndex: js.UndefOr[Double] = js.undefined
    
    var titleRender: js.UndefOr[js.Function1[/* node */ TreeDataType, ReactNode]] = js.undefined
    
    var treeData: js.UndefOr[js.Array[TreeDataType]] = js.undefined
    
    var virtual: js.UndefOr[Boolean] = js.undefined
  }
  object TreeProps {
    
    inline def apply[TreeDataType /* <: BasicDataNode */](prefixCls: String): TreeProps[TreeDataType] = {
      val __obj = js.Dynamic.literal(prefixCls = prefixCls.asInstanceOf[js.Any])
      __obj.asInstanceOf[TreeProps[TreeDataType]]
    }
    
    extension [Self <: TreeProps[?], TreeDataType /* <: BasicDataNode */](x: Self & TreeProps[TreeDataType]) {
      
      inline def setActiveKey(value: Key): Self = StObject.set(x, "activeKey", value.asInstanceOf[js.Any])
      
      inline def setActiveKeyUndefined: Self = StObject.set(x, "activeKey", js.undefined)
      
      inline def setAllowDrop(value: /* options */ AllowDropOptions[TreeDataType] => Boolean): Self = StObject.set(x, "allowDrop", js.Any.fromFunction1(value))
      
      inline def setAllowDropUndefined: Self = StObject.set(x, "allowDrop", js.undefined)
      
      inline def setAutoExpandParent(value: Boolean): Self = StObject.set(x, "autoExpandParent", value.asInstanceOf[js.Any])
      
      inline def setAutoExpandParentUndefined: Self = StObject.set(x, "autoExpandParent", js.undefined)
      
      inline def setCheckStrictly(value: Boolean): Self = StObject.set(x, "checkStrictly", value.asInstanceOf[js.Any])
      
      inline def setCheckStrictlyUndefined: Self = StObject.set(x, "checkStrictly", js.undefined)
      
      inline def setCheckable(value: Boolean | ReactNode): Self = StObject.set(x, "checkable", value.asInstanceOf[js.Any])
      
      inline def setCheckableUndefined: Self = StObject.set(x, "checkable", js.undefined)
      
      inline def setCheckedKeys(value: js.Array[Key] | Checked): Self = StObject.set(x, "checkedKeys", value.asInstanceOf[js.Any])
      
      inline def setCheckedKeysUndefined: Self = StObject.set(x, "checkedKeys", js.undefined)
      
      inline def setCheckedKeysVarargs(value: Key*): Self = StObject.set(x, "checkedKeys", js.Array(value*))
      
      inline def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      inline def setDefaultCheckedKeys(value: js.Array[Key]): Self = StObject.set(x, "defaultCheckedKeys", value.asInstanceOf[js.Any])
      
      inline def setDefaultCheckedKeysUndefined: Self = StObject.set(x, "defaultCheckedKeys", js.undefined)
      
      inline def setDefaultCheckedKeysVarargs(value: Key*): Self = StObject.set(x, "defaultCheckedKeys", js.Array(value*))
      
      inline def setDefaultExpandAll(value: Boolean): Self = StObject.set(x, "defaultExpandAll", value.asInstanceOf[js.Any])
      
      inline def setDefaultExpandAllUndefined: Self = StObject.set(x, "defaultExpandAll", js.undefined)
      
      inline def setDefaultExpandParent(value: Boolean): Self = StObject.set(x, "defaultExpandParent", value.asInstanceOf[js.Any])
      
      inline def setDefaultExpandParentUndefined: Self = StObject.set(x, "defaultExpandParent", js.undefined)
      
      inline def setDefaultExpandedKeys(value: js.Array[Key]): Self = StObject.set(x, "defaultExpandedKeys", value.asInstanceOf[js.Any])
      
      inline def setDefaultExpandedKeysUndefined: Self = StObject.set(x, "defaultExpandedKeys", js.undefined)
      
      inline def setDefaultExpandedKeysVarargs(value: Key*): Self = StObject.set(x, "defaultExpandedKeys", js.Array(value*))
      
      inline def setDefaultSelectedKeys(value: js.Array[Key]): Self = StObject.set(x, "defaultSelectedKeys", value.asInstanceOf[js.Any])
      
      inline def setDefaultSelectedKeysUndefined: Self = StObject.set(x, "defaultSelectedKeys", js.undefined)
      
      inline def setDefaultSelectedKeysVarargs(value: Key*): Self = StObject.set(x, "defaultSelectedKeys", js.Array(value*))
      
      inline def setDirection(value: Direction): Self = StObject.set(x, "direction", value.asInstanceOf[js.Any])
      
      inline def setDirectionUndefined: Self = StObject.set(x, "direction", js.undefined)
      
      inline def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      inline def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
      
      inline def setDraggable(value: DraggableFn | Boolean | DraggableConfig): Self = StObject.set(x, "draggable", value.asInstanceOf[js.Any])
      
      inline def setDraggableFunction1(value: /* node */ DataNode => Boolean): Self = StObject.set(x, "draggable", js.Any.fromFunction1(value))
      
      inline def setDraggableUndefined: Self = StObject.set(x, "draggable", js.undefined)
      
      inline def setDropIndicatorRender(value: /* props */ typings.rcTree.anon.Direction => ReactNode): Self = StObject.set(x, "dropIndicatorRender", js.Any.fromFunction1(value))
      
      inline def setDropIndicatorRenderUndefined: Self = StObject.set(x, "dropIndicatorRender", js.undefined)
      
      inline def setExpandAction(value: ExpandAction): Self = StObject.set(x, "expandAction", value.asInstanceOf[js.Any])
      
      inline def setExpandActionUndefined: Self = StObject.set(x, "expandAction", js.undefined)
      
      inline def setExpandedKeys(value: js.Array[Key]): Self = StObject.set(x, "expandedKeys", value.asInstanceOf[js.Any])
      
      inline def setExpandedKeysUndefined: Self = StObject.set(x, "expandedKeys", js.undefined)
      
      inline def setExpandedKeysVarargs(value: Key*): Self = StObject.set(x, "expandedKeys", js.Array(value*))
      
      inline def setFieldNames(value: FieldNames): Self = StObject.set(x, "fieldNames", value.asInstanceOf[js.Any])
      
      inline def setFieldNamesUndefined: Self = StObject.set(x, "fieldNames", js.undefined)
      
      inline def setFilterTreeNode(value: /* treeNode */ EventDataNode[TreeDataType] => Boolean): Self = StObject.set(x, "filterTreeNode", js.Any.fromFunction1(value))
      
      inline def setFilterTreeNodeUndefined: Self = StObject.set(x, "filterTreeNode", js.undefined)
      
      inline def setFocusable(value: Boolean): Self = StObject.set(x, "focusable", value.asInstanceOf[js.Any])
      
      inline def setFocusableUndefined: Self = StObject.set(x, "focusable", js.undefined)
      
      inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      inline def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
      
      inline def setIcon(value: IconType): Self = StObject.set(x, "icon", value.asInstanceOf[js.Any])
      
      inline def setIconFunction1(value: /* props */ TreeNodeProps[DataNode] => ReactNode): Self = StObject.set(x, "icon", js.Any.fromFunction1(value))
      
      inline def setIconUndefined: Self = StObject.set(x, "icon", js.undefined)
      
      inline def setItemHeight(value: Double): Self = StObject.set(x, "itemHeight", value.asInstanceOf[js.Any])
      
      inline def setItemHeightUndefined: Self = StObject.set(x, "itemHeight", js.undefined)
      
      inline def setLoadData(value: /* treeNode */ EventDataNode[TreeDataType] => js.Promise[Any]): Self = StObject.set(x, "loadData", js.Any.fromFunction1(value))
      
      inline def setLoadDataUndefined: Self = StObject.set(x, "loadData", js.undefined)
      
      inline def setLoadedKeys(value: js.Array[Key]): Self = StObject.set(x, "loadedKeys", value.asInstanceOf[js.Any])
      
      inline def setLoadedKeysUndefined: Self = StObject.set(x, "loadedKeys", js.undefined)
      
      inline def setLoadedKeysVarargs(value: Key*): Self = StObject.set(x, "loadedKeys", js.Array(value*))
      
      inline def setMotion(value: Any): Self = StObject.set(x, "motion", value.asInstanceOf[js.Any])
      
      inline def setMotionUndefined: Self = StObject.set(x, "motion", js.undefined)
      
      inline def setMultiple(value: Boolean): Self = StObject.set(x, "multiple", value.asInstanceOf[js.Any])
      
      inline def setMultipleUndefined: Self = StObject.set(x, "multiple", js.undefined)
      
      inline def setOnActiveChange(value: /* key */ Key => Unit): Self = StObject.set(x, "onActiveChange", js.Any.fromFunction1(value))
      
      inline def setOnActiveChangeUndefined: Self = StObject.set(x, "onActiveChange", js.undefined)
      
      inline def setOnBlur(value: FocusEvent[HTMLDivElement, typings.std.Element] => Unit): Self = StObject.set(x, "onBlur", js.Any.fromFunction1(value))
      
      inline def setOnBlurUndefined: Self = StObject.set(x, "onBlur", js.undefined)
      
      inline def setOnCheck(value: (/* checked */ Checked | js.Array[Key], /* info */ CheckInfo[TreeDataType]) => Unit): Self = StObject.set(x, "onCheck", js.Any.fromFunction2(value))
      
      inline def setOnCheckUndefined: Self = StObject.set(x, "onCheck", js.undefined)
      
      inline def setOnClick(
        value: (/* e */ typings.react.mod.MouseEvent[HTMLSpanElement, NativeMouseEvent], /* node */ EventDataNode[DataNode]) => Unit
      ): Self = StObject.set(x, "onClick", js.Any.fromFunction2(value))
      
      inline def setOnClickUndefined: Self = StObject.set(x, "onClick", js.undefined)
      
      inline def setOnContextMenu(value: typings.react.mod.MouseEvent[HTMLDivElement, NativeMouseEvent] => Unit): Self = StObject.set(x, "onContextMenu", js.Any.fromFunction1(value))
      
      inline def setOnContextMenuUndefined: Self = StObject.set(x, "onContextMenu", js.undefined)
      
      inline def setOnDoubleClick(
        value: (/* e */ typings.react.mod.MouseEvent[HTMLSpanElement, NativeMouseEvent], /* node */ EventDataNode[DataNode]) => Unit
      ): Self = StObject.set(x, "onDoubleClick", js.Any.fromFunction2(value))
      
      inline def setOnDoubleClickUndefined: Self = StObject.set(x, "onDoubleClick", js.undefined)
      
      inline def setOnDragEnd(value: /* info */ NodeDragEventParams[TreeDataType, HTMLDivElement] => Unit): Self = StObject.set(x, "onDragEnd", js.Any.fromFunction1(value))
      
      inline def setOnDragEndUndefined: Self = StObject.set(x, "onDragEnd", js.undefined)
      
      inline def setOnDragEnter(value: /* info */ (NodeDragEventParams[TreeDataType, HTMLDivElement]) & ExpandedKeys => Unit): Self = StObject.set(x, "onDragEnter", js.Any.fromFunction1(value))
      
      inline def setOnDragEnterUndefined: Self = StObject.set(x, "onDragEnter", js.undefined)
      
      inline def setOnDragLeave(value: /* info */ NodeDragEventParams[TreeDataType, HTMLDivElement] => Unit): Self = StObject.set(x, "onDragLeave", js.Any.fromFunction1(value))
      
      inline def setOnDragLeaveUndefined: Self = StObject.set(x, "onDragLeave", js.undefined)
      
      inline def setOnDragOver(value: /* info */ NodeDragEventParams[TreeDataType, HTMLDivElement] => Unit): Self = StObject.set(x, "onDragOver", js.Any.fromFunction1(value))
      
      inline def setOnDragOverUndefined: Self = StObject.set(x, "onDragOver", js.undefined)
      
      inline def setOnDragStart(value: /* info */ NodeDragEventParams[TreeDataType, HTMLDivElement] => Unit): Self = StObject.set(x, "onDragStart", js.Any.fromFunction1(value))
      
      inline def setOnDragStartUndefined: Self = StObject.set(x, "onDragStart", js.undefined)
      
      inline def setOnDrop(
        value: /* info */ (NodeDragEventParams[TreeDataType, HTMLDivElement]) & DragNode[TreeDataType] => Unit
      ): Self = StObject.set(x, "onDrop", js.Any.fromFunction1(value))
      
      inline def setOnDropUndefined: Self = StObject.set(x, "onDrop", js.undefined)
      
      inline def setOnExpand(value: (/* expandedKeys */ js.Array[Key], /* info */ Expanded[TreeDataType]) => Unit): Self = StObject.set(x, "onExpand", js.Any.fromFunction2(value))
      
      inline def setOnExpandUndefined: Self = StObject.set(x, "onExpand", js.undefined)
      
      inline def setOnFocus(value: FocusEvent[HTMLDivElement, typings.std.Element] => Unit): Self = StObject.set(x, "onFocus", js.Any.fromFunction1(value))
      
      inline def setOnFocusUndefined: Self = StObject.set(x, "onFocus", js.undefined)
      
      inline def setOnKeyDown(value: KeyboardEvent[HTMLDivElement] => Unit): Self = StObject.set(x, "onKeyDown", js.Any.fromFunction1(value))
      
      inline def setOnKeyDownUndefined: Self = StObject.set(x, "onKeyDown", js.undefined)
      
      inline def setOnLoad(value: (/* loadedKeys */ js.Array[Key], /* info */ EventNode[TreeDataType]) => Unit): Self = StObject.set(x, "onLoad", js.Any.fromFunction2(value))
      
      inline def setOnLoadUndefined: Self = StObject.set(x, "onLoad", js.undefined)
      
      inline def setOnMouseEnter(value: /* info */ NodeMouseEventParams[TreeDataType, HTMLSpanElement] => Unit): Self = StObject.set(x, "onMouseEnter", js.Any.fromFunction1(value))
      
      inline def setOnMouseEnterUndefined: Self = StObject.set(x, "onMouseEnter", js.undefined)
      
      inline def setOnMouseLeave(value: /* info */ NodeMouseEventParams[TreeDataType, HTMLSpanElement] => Unit): Self = StObject.set(x, "onMouseLeave", js.Any.fromFunction1(value))
      
      inline def setOnMouseLeaveUndefined: Self = StObject.set(x, "onMouseLeave", js.undefined)
      
      inline def setOnRightClick(value: /* info */ EventMouseEvent[TreeDataType] => Unit): Self = StObject.set(x, "onRightClick", js.Any.fromFunction1(value))
      
      inline def setOnRightClickUndefined: Self = StObject.set(x, "onRightClick", js.undefined)
      
      inline def setOnScroll(value: UIEvent[HTMLElement, NativeUIEvent] => Unit): Self = StObject.set(x, "onScroll", js.Any.fromFunction1(value))
      
      inline def setOnScrollUndefined: Self = StObject.set(x, "onScroll", js.undefined)
      
      inline def setOnSelect(value: (/* selectedKeys */ js.Array[Key], /* info */ Event[TreeDataType]) => Unit): Self = StObject.set(x, "onSelect", js.Any.fromFunction2(value))
      
      inline def setOnSelectUndefined: Self = StObject.set(x, "onSelect", js.undefined)
      
      inline def setPrefixCls(value: String): Self = StObject.set(x, "prefixCls", value.asInstanceOf[js.Any])
      
      inline def setRootClassName(value: String): Self = StObject.set(x, "rootClassName", value.asInstanceOf[js.Any])
      
      inline def setRootClassNameUndefined: Self = StObject.set(x, "rootClassName", js.undefined)
      
      inline def setRootStyle(value: CSSProperties): Self = StObject.set(x, "rootStyle", value.asInstanceOf[js.Any])
      
      inline def setRootStyleUndefined: Self = StObject.set(x, "rootStyle", js.undefined)
      
      inline def setSelectable(value: Boolean): Self = StObject.set(x, "selectable", value.asInstanceOf[js.Any])
      
      inline def setSelectableUndefined: Self = StObject.set(x, "selectable", js.undefined)
      
      inline def setSelectedKeys(value: js.Array[Key]): Self = StObject.set(x, "selectedKeys", value.asInstanceOf[js.Any])
      
      inline def setSelectedKeysUndefined: Self = StObject.set(x, "selectedKeys", js.undefined)
      
      inline def setSelectedKeysVarargs(value: Key*): Self = StObject.set(x, "selectedKeys", js.Array(value*))
      
      inline def setShowIcon(value: Boolean): Self = StObject.set(x, "showIcon", value.asInstanceOf[js.Any])
      
      inline def setShowIconUndefined: Self = StObject.set(x, "showIcon", js.undefined)
      
      inline def setShowLine(value: Boolean): Self = StObject.set(x, "showLine", value.asInstanceOf[js.Any])
      
      inline def setShowLineUndefined: Self = StObject.set(x, "showLine", js.undefined)
      
      inline def setStyle(value: CSSProperties): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
      
      inline def setSwitcherIcon(value: IconType): Self = StObject.set(x, "switcherIcon", value.asInstanceOf[js.Any])
      
      inline def setSwitcherIconFunction1(value: /* props */ TreeNodeProps[DataNode] => ReactNode): Self = StObject.set(x, "switcherIcon", js.Any.fromFunction1(value))
      
      inline def setSwitcherIconUndefined: Self = StObject.set(x, "switcherIcon", js.undefined)
      
      inline def setTabIndex(value: Double): Self = StObject.set(x, "tabIndex", value.asInstanceOf[js.Any])
      
      inline def setTabIndexUndefined: Self = StObject.set(x, "tabIndex", js.undefined)
      
      inline def setTitleRender(value: /* node */ TreeDataType => ReactNode): Self = StObject.set(x, "titleRender", js.Any.fromFunction1(value))
      
      inline def setTitleRenderUndefined: Self = StObject.set(x, "titleRender", js.undefined)
      
      inline def setTreeData(value: js.Array[TreeDataType]): Self = StObject.set(x, "treeData", value.asInstanceOf[js.Any])
      
      inline def setTreeDataUndefined: Self = StObject.set(x, "treeData", js.undefined)
      
      inline def setTreeDataVarargs(value: TreeDataType*): Self = StObject.set(x, "treeData", js.Array(value*))
      
      inline def setVirtual(value: Boolean): Self = StObject.set(x, "virtual", value.asInstanceOf[js.Any])
      
      inline def setVirtualUndefined: Self = StObject.set(x, "virtual", js.undefined)
    }
  }
  
  trait TreeState[TreeDataType /* <: BasicDataNode */] extends StObject {
    
    var activeKey: Key
    
    var checkedKeys: js.Array[Key]
    
    var dragChildrenKeys: js.Array[Key]
    
    var dragOverNodeKey: Key | Null
    
    var draggingNodeKey: typings.react.mod.Key
    
    var dropAllowed: Boolean
    
    var dropContainerKey: Key | Null
    
    var dropLevelOffset: Double | Null
    
    var dropPosition: -1 | 0 | 1 | Null
    
    var dropTargetKey: Key | Null
    
    var dropTargetPos: String | Null
    
    var expandedKeys: js.Array[Key]
    
    var fieldNames: FieldNames
    
    var flattenNodes: js.Array[FlattenNode[TreeDataType]]
    
    var focused: Boolean
    
    var halfCheckedKeys: js.Array[Key]
    
    var indent: Double | Null
    
    var keyEntities: Record[Key, DataEntity[TreeDataType]]
    
    var listChanging: Boolean
    
    var loadedKeys: js.Array[Key]
    
    var loadingKeys: js.Array[Key]
    
    var prevProps: TreeProps[DataNode]
    
    var selectedKeys: js.Array[Key]
    
    var treeData: js.Array[TreeDataType]
  }
  object TreeState {
    
    inline def apply[TreeDataType /* <: BasicDataNode */](
      activeKey: Key,
      checkedKeys: js.Array[Key],
      dragChildrenKeys: js.Array[Key],
      draggingNodeKey: typings.react.mod.Key,
      dropAllowed: Boolean,
      expandedKeys: js.Array[Key],
      fieldNames: FieldNames,
      flattenNodes: js.Array[FlattenNode[TreeDataType]],
      focused: Boolean,
      halfCheckedKeys: js.Array[Key],
      keyEntities: Record[Key, DataEntity[TreeDataType]],
      listChanging: Boolean,
      loadedKeys: js.Array[Key],
      loadingKeys: js.Array[Key],
      prevProps: TreeProps[DataNode],
      selectedKeys: js.Array[Key],
      treeData: js.Array[TreeDataType]
    ): TreeState[TreeDataType] = {
      val __obj = js.Dynamic.literal(activeKey = activeKey.asInstanceOf[js.Any], checkedKeys = checkedKeys.asInstanceOf[js.Any], dragChildrenKeys = dragChildrenKeys.asInstanceOf[js.Any], draggingNodeKey = draggingNodeKey.asInstanceOf[js.Any], dropAllowed = dropAllowed.asInstanceOf[js.Any], expandedKeys = expandedKeys.asInstanceOf[js.Any], fieldNames = fieldNames.asInstanceOf[js.Any], flattenNodes = flattenNodes.asInstanceOf[js.Any], focused = focused.asInstanceOf[js.Any], halfCheckedKeys = halfCheckedKeys.asInstanceOf[js.Any], keyEntities = keyEntities.asInstanceOf[js.Any], listChanging = listChanging.asInstanceOf[js.Any], loadedKeys = loadedKeys.asInstanceOf[js.Any], loadingKeys = loadingKeys.asInstanceOf[js.Any], prevProps = prevProps.asInstanceOf[js.Any], selectedKeys = selectedKeys.asInstanceOf[js.Any], treeData = treeData.asInstanceOf[js.Any], dragOverNodeKey = null, dropContainerKey = null, dropLevelOffset = null, dropPosition = null, dropTargetKey = null, dropTargetPos = null, indent = null)
      __obj.asInstanceOf[TreeState[TreeDataType]]
    }
    
    extension [Self <: TreeState[?], TreeDataType /* <: BasicDataNode */](x: Self & TreeState[TreeDataType]) {
      
      inline def setActiveKey(value: Key): Self = StObject.set(x, "activeKey", value.asInstanceOf[js.Any])
      
      inline def setCheckedKeys(value: js.Array[Key]): Self = StObject.set(x, "checkedKeys", value.asInstanceOf[js.Any])
      
      inline def setCheckedKeysVarargs(value: Key*): Self = StObject.set(x, "checkedKeys", js.Array(value*))
      
      inline def setDragChildrenKeys(value: js.Array[Key]): Self = StObject.set(x, "dragChildrenKeys", value.asInstanceOf[js.Any])
      
      inline def setDragChildrenKeysVarargs(value: Key*): Self = StObject.set(x, "dragChildrenKeys", js.Array(value*))
      
      inline def setDragOverNodeKey(value: Key): Self = StObject.set(x, "dragOverNodeKey", value.asInstanceOf[js.Any])
      
      inline def setDragOverNodeKeyNull: Self = StObject.set(x, "dragOverNodeKey", null)
      
      inline def setDraggingNodeKey(value: typings.react.mod.Key): Self = StObject.set(x, "draggingNodeKey", value.asInstanceOf[js.Any])
      
      inline def setDropAllowed(value: Boolean): Self = StObject.set(x, "dropAllowed", value.asInstanceOf[js.Any])
      
      inline def setDropContainerKey(value: Key): Self = StObject.set(x, "dropContainerKey", value.asInstanceOf[js.Any])
      
      inline def setDropContainerKeyNull: Self = StObject.set(x, "dropContainerKey", null)
      
      inline def setDropLevelOffset(value: Double): Self = StObject.set(x, "dropLevelOffset", value.asInstanceOf[js.Any])
      
      inline def setDropLevelOffsetNull: Self = StObject.set(x, "dropLevelOffset", null)
      
      inline def setDropPosition(value: -1 | 0 | 1): Self = StObject.set(x, "dropPosition", value.asInstanceOf[js.Any])
      
      inline def setDropPositionNull: Self = StObject.set(x, "dropPosition", null)
      
      inline def setDropTargetKey(value: Key): Self = StObject.set(x, "dropTargetKey", value.asInstanceOf[js.Any])
      
      inline def setDropTargetKeyNull: Self = StObject.set(x, "dropTargetKey", null)
      
      inline def setDropTargetPos(value: String): Self = StObject.set(x, "dropTargetPos", value.asInstanceOf[js.Any])
      
      inline def setDropTargetPosNull: Self = StObject.set(x, "dropTargetPos", null)
      
      inline def setExpandedKeys(value: js.Array[Key]): Self = StObject.set(x, "expandedKeys", value.asInstanceOf[js.Any])
      
      inline def setExpandedKeysVarargs(value: Key*): Self = StObject.set(x, "expandedKeys", js.Array(value*))
      
      inline def setFieldNames(value: FieldNames): Self = StObject.set(x, "fieldNames", value.asInstanceOf[js.Any])
      
      inline def setFlattenNodes(value: js.Array[FlattenNode[TreeDataType]]): Self = StObject.set(x, "flattenNodes", value.asInstanceOf[js.Any])
      
      inline def setFlattenNodesVarargs(value: FlattenNode[TreeDataType]*): Self = StObject.set(x, "flattenNodes", js.Array(value*))
      
      inline def setFocused(value: Boolean): Self = StObject.set(x, "focused", value.asInstanceOf[js.Any])
      
      inline def setHalfCheckedKeys(value: js.Array[Key]): Self = StObject.set(x, "halfCheckedKeys", value.asInstanceOf[js.Any])
      
      inline def setHalfCheckedKeysVarargs(value: Key*): Self = StObject.set(x, "halfCheckedKeys", js.Array(value*))
      
      inline def setIndent(value: Double): Self = StObject.set(x, "indent", value.asInstanceOf[js.Any])
      
      inline def setIndentNull: Self = StObject.set(x, "indent", null)
      
      inline def setKeyEntities(value: Record[Key, DataEntity[TreeDataType]]): Self = StObject.set(x, "keyEntities", value.asInstanceOf[js.Any])
      
      inline def setListChanging(value: Boolean): Self = StObject.set(x, "listChanging", value.asInstanceOf[js.Any])
      
      inline def setLoadedKeys(value: js.Array[Key]): Self = StObject.set(x, "loadedKeys", value.asInstanceOf[js.Any])
      
      inline def setLoadedKeysVarargs(value: Key*): Self = StObject.set(x, "loadedKeys", js.Array(value*))
      
      inline def setLoadingKeys(value: js.Array[Key]): Self = StObject.set(x, "loadingKeys", value.asInstanceOf[js.Any])
      
      inline def setLoadingKeysVarargs(value: Key*): Self = StObject.set(x, "loadingKeys", js.Array(value*))
      
      inline def setPrevProps(value: TreeProps[DataNode]): Self = StObject.set(x, "prevProps", value.asInstanceOf[js.Any])
      
      inline def setSelectedKeys(value: js.Array[Key]): Self = StObject.set(x, "selectedKeys", value.asInstanceOf[js.Any])
      
      inline def setSelectedKeysVarargs(value: Key*): Self = StObject.set(x, "selectedKeys", js.Array(value*))
      
      inline def setTreeData(value: js.Array[TreeDataType]): Self = StObject.set(x, "treeData", value.asInstanceOf[js.Any])
      
      inline def setTreeDataVarargs(value: TreeDataType*): Self = StObject.set(x, "treeData", js.Array(value*))
    }
  }
}
