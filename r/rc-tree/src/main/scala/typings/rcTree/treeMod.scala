package typings.rcTree

import typings.rcTree.anon.Checked
import typings.rcTree.anon.CheckedKeys
import typings.rcTree.anon.Event
import typings.rcTree.anon.EventNode
import typings.rcTree.anon.Expanded
import typings.rcTree.anon.Node
import typings.rcTree.anon.NodeDragEventParamsHTMLDi
import typings.rcTree.anon.NodeDragEventParamsHTMLDiDragNode
import typings.rcTree.anon.PartialTreeState
import typings.rcTree.anon.Pos
import typings.rcTree.contextTypesMod.NodeDragEventHandler
import typings.rcTree.contextTypesMod.NodeDragEventParams
import typings.rcTree.contextTypesMod.NodeMouseEventHandler
import typings.rcTree.contextTypesMod.NodeMouseEventParams
import typings.rcTree.interfaceMod.DataEntity
import typings.rcTree.interfaceMod.DataNode
import typings.rcTree.interfaceMod.EventDataNode
import typings.rcTree.interfaceMod.FlattenNode
import typings.rcTree.interfaceMod.IconType
import typings.rcTree.interfaceMod.Key
import typings.rcTree.interfaceMod.NodeInstance
import typings.rcTree.interfaceMod.ScrollTo
import typings.rcTree.nodeListMod.NodeListRef
import typings.rcTree.rcTreeStrings.check
import typings.rcTree.treeNodeMod.TreeNodeProps
import typings.react.mod.CSSProperties
import typings.react.mod.Component
import typings.react.mod.FC
import typings.react.mod.FocusEvent
import typings.react.mod.FocusEventHandler
import typings.react.mod.KeyboardEvent
import typings.react.mod.KeyboardEventHandler
import typings.react.mod.MouseEventHandler
import typings.react.mod.NativeMouseEvent
import typings.react.mod.ReactNode
import typings.react.mod.RefObject
import typings.std.HTMLDivElement
import typings.std.HTMLSpanElement
import typings.std.MouseEvent
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object treeMod {
  
  @JSImport("rc-tree/es/Tree", JSImport.Default)
  @js.native
  class default () extends Tree
  object default {
    
    @JSImport("rc-tree/es/Tree", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /* static member */
    @JSImport("rc-tree/es/Tree", "default.TreeNode")
    @js.native
    def TreeNode: FC[TreeNodeProps] = js.native
    @scala.inline
    def TreeNode_=(x: FC[TreeNodeProps]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("TreeNode")(x.asInstanceOf[js.Any])
    
    /* static member */
    object defaultProps {
      
      @JSImport("rc-tree/es/Tree", "default.defaultProps")
      @js.native
      val ^ : js.Any = js.native
      
      @JSImport("rc-tree/es/Tree", "default.defaultProps.autoExpandParent")
      @js.native
      def autoExpandParent: Boolean = js.native
      @scala.inline
      def autoExpandParent_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("autoExpandParent")(x.asInstanceOf[js.Any])
      
      @JSImport("rc-tree/es/Tree", "default.defaultProps.checkStrictly")
      @js.native
      def checkStrictly: Boolean = js.native
      @scala.inline
      def checkStrictly_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("checkStrictly")(x.asInstanceOf[js.Any])
      
      @JSImport("rc-tree/es/Tree", "default.defaultProps.checkable")
      @js.native
      def checkable: Boolean = js.native
      @scala.inline
      def checkable_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("checkable")(x.asInstanceOf[js.Any])
      
      @JSImport("rc-tree/es/Tree", "default.defaultProps.defaultCheckedKeys")
      @js.native
      def defaultCheckedKeys: js.Array[js.Any] = js.native
      @scala.inline
      def defaultCheckedKeys_=(x: js.Array[js.Any]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultCheckedKeys")(x.asInstanceOf[js.Any])
      
      @JSImport("rc-tree/es/Tree", "default.defaultProps.defaultExpandAll")
      @js.native
      def defaultExpandAll: Boolean = js.native
      @scala.inline
      def defaultExpandAll_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultExpandAll")(x.asInstanceOf[js.Any])
      
      @JSImport("rc-tree/es/Tree", "default.defaultProps.defaultExpandParent")
      @js.native
      def defaultExpandParent: Boolean = js.native
      @scala.inline
      def defaultExpandParent_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultExpandParent")(x.asInstanceOf[js.Any])
      
      @JSImport("rc-tree/es/Tree", "default.defaultProps.defaultExpandedKeys")
      @js.native
      def defaultExpandedKeys: js.Array[js.Any] = js.native
      @scala.inline
      def defaultExpandedKeys_=(x: js.Array[js.Any]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultExpandedKeys")(x.asInstanceOf[js.Any])
      
      @JSImport("rc-tree/es/Tree", "default.defaultProps.defaultSelectedKeys")
      @js.native
      def defaultSelectedKeys: js.Array[js.Any] = js.native
      @scala.inline
      def defaultSelectedKeys_=(x: js.Array[js.Any]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultSelectedKeys")(x.asInstanceOf[js.Any])
      
      @JSImport("rc-tree/es/Tree", "default.defaultProps.disabled")
      @js.native
      def disabled: Boolean = js.native
      @scala.inline
      def disabled_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("disabled")(x.asInstanceOf[js.Any])
      
      @JSImport("rc-tree/es/Tree", "default.defaultProps.draggable")
      @js.native
      def draggable: Boolean = js.native
      @scala.inline
      def draggable_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("draggable")(x.asInstanceOf[js.Any])
      
      @JSImport("rc-tree/es/Tree", "default.defaultProps.multiple")
      @js.native
      def multiple: Boolean = js.native
      @scala.inline
      def multiple_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("multiple")(x.asInstanceOf[js.Any])
      
      @JSImport("rc-tree/es/Tree", "default.defaultProps.prefixCls")
      @js.native
      def prefixCls: String = js.native
      @scala.inline
      def prefixCls_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("prefixCls")(x.asInstanceOf[js.Any])
      
      @JSImport("rc-tree/es/Tree", "default.defaultProps.selectable")
      @js.native
      def selectable: Boolean = js.native
      @scala.inline
      def selectable_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("selectable")(x.asInstanceOf[js.Any])
      
      @JSImport("rc-tree/es/Tree", "default.defaultProps.showIcon")
      @js.native
      def showIcon: Boolean = js.native
      @scala.inline
      def showIcon_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("showIcon")(x.asInstanceOf[js.Any])
      
      @JSImport("rc-tree/es/Tree", "default.defaultProps.showLine")
      @js.native
      def showLine: Boolean = js.native
      @scala.inline
      def showLine_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("showLine")(x.asInstanceOf[js.Any])
    }
    
    /* static member */
    @JSImport("rc-tree/es/Tree", "default.getDerivedStateFromProps")
    @js.native
    def getDerivedStateFromProps(props: TreeProps, prevState: TreeState): PartialTreeState = js.native
  }
  
  @js.native
  trait CheckInfo extends StObject {
    
    var checked: Boolean = js.native
    
    var checkedNodes: js.Array[DataNode] = js.native
    
    var checkedNodesPositions: js.UndefOr[js.Array[Pos]] = js.native
    
    var event: check = js.native
    
    var halfCheckedKeys: js.UndefOr[js.Array[Key]] = js.native
    
    var nativeEvent: MouseEvent = js.native
    
    var node: EventDataNode = js.native
  }
  object CheckInfo {
    
    @scala.inline
    def apply(
      checked: Boolean,
      checkedNodes: js.Array[DataNode],
      event: check,
      nativeEvent: MouseEvent,
      node: EventDataNode
    ): CheckInfo = {
      val __obj = js.Dynamic.literal(checked = checked.asInstanceOf[js.Any], checkedNodes = checkedNodes.asInstanceOf[js.Any], event = event.asInstanceOf[js.Any], nativeEvent = nativeEvent.asInstanceOf[js.Any], node = node.asInstanceOf[js.Any])
      __obj.asInstanceOf[CheckInfo]
    }
    
    @scala.inline
    implicit class CheckInfoMutableBuilder[Self <: CheckInfo] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setChecked(value: Boolean): Self = StObject.set(x, "checked", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCheckedNodes(value: js.Array[DataNode]): Self = StObject.set(x, "checkedNodes", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCheckedNodesPositions(value: js.Array[Pos]): Self = StObject.set(x, "checkedNodesPositions", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCheckedNodesPositionsUndefined: Self = StObject.set(x, "checkedNodesPositions", js.undefined)
      
      @scala.inline
      def setCheckedNodesPositionsVarargs(value: Pos*): Self = StObject.set(x, "checkedNodesPositions", js.Array(value :_*))
      
      @scala.inline
      def setCheckedNodesVarargs(value: DataNode*): Self = StObject.set(x, "checkedNodes", js.Array(value :_*))
      
      @scala.inline
      def setEvent(value: check): Self = StObject.set(x, "event", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHalfCheckedKeys(value: js.Array[Key]): Self = StObject.set(x, "halfCheckedKeys", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHalfCheckedKeysUndefined: Self = StObject.set(x, "halfCheckedKeys", js.undefined)
      
      @scala.inline
      def setHalfCheckedKeysVarargs(value: Key*): Self = StObject.set(x, "halfCheckedKeys", js.Array(value :_*))
      
      @scala.inline
      def setNativeEvent(value: MouseEvent): Self = StObject.set(x, "nativeEvent", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNode(value: EventDataNode): Self = StObject.set(x, "node", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Tree
    extends Component[TreeProps, TreeState, js.Any] {
    
    def cleanDragState(): Unit = js.native
    
    @JSName("componentWillUnmount")
    def componentWillUnmount_MTree(): Unit = js.native
    
    var delayedDragEnterLogic: Record[Key, Double] = js.native
    
    var destroyed: Boolean = js.native
    
    var dragNode: NodeInstance = js.native
    
    def getActiveItem(): FlattenNode = js.native
    
    def getTreeNodeRequiredProps(): CheckedKeys = js.native
    
    var listRef: RefObject[NodeListRef] = js.native
    
    def offsetActiveKey(offset: Double): Unit = js.native
    
    def onActiveChange(newActiveKey: Key): Unit = js.native
    
    var onBlur: FocusEventHandler[HTMLDivElement] = js.native
    
    var onFocus: FocusEventHandler[HTMLDivElement] = js.native
    
    var onKeyDown: KeyboardEventHandler[HTMLDivElement] = js.native
    
    def onListChangeEnd(): Unit = js.native
    
    def onListChangeStart(): Unit = js.native
    
    def onNodeCheck(
      e: typings.react.mod.MouseEvent[HTMLSpanElement, NativeMouseEvent],
      treeNode: EventDataNode,
      checked: Boolean
    ): Unit = js.native
    
    var onNodeClick: NodeMouseEventHandler[HTMLSpanElement] = js.native
    
    var onNodeContextMenu: NodeMouseEventHandler[HTMLSpanElement] = js.native
    
    var onNodeDoubleClick: NodeMouseEventHandler[HTMLSpanElement] = js.native
    
    var onNodeDragEnd: NodeDragEventHandler[HTMLDivElement] = js.native
    
    /**
      * [Legacy] Select handler is less small than node,
      * so that this will trigger when drag enter node or select handler.
      * This is a little tricky if customize css without padding.
      * Better for use mouse move event to refresh drag state.
      * But let's just keep it to avoid event trigger logic change.
      */
    var onNodeDragEnter: NodeDragEventHandler[HTMLDivElement] = js.native
    
    var onNodeDragLeave: NodeDragEventHandler[HTMLDivElement] = js.native
    
    var onNodeDragOver: NodeDragEventHandler[HTMLDivElement] = js.native
    
    var onNodeDragStart: NodeDragEventHandler[HTMLDivElement] = js.native
    
    var onNodeDrop: NodeDragEventHandler[HTMLDivElement] = js.native
    
    def onNodeExpand(e: typings.react.mod.MouseEvent[HTMLDivElement, NativeMouseEvent], treeNode: EventDataNode): Unit = js.native
    
    def onNodeLoad(treeNode: EventDataNode): js.Promise[_] = js.native
    
    var onNodeMouseEnter: NodeMouseEventHandler[HTMLSpanElement] = js.native
    
    var onNodeMouseLeave: NodeMouseEventHandler[HTMLSpanElement] = js.native
    
    var onNodeSelect: NodeMouseEventHandler[HTMLSpanElement] = js.native
    
    var scrollTo: ScrollTo = js.native
    
    /** Set uncontrolled `expandedKeys`. This will also auto update `flattenNodes`. */
    def setExpandedKeys(expandedKeys: js.Array[Key]): Unit = js.native
    
    /**
      * Only update the value which is not in props
      */
    def setUncontrolledState(state: PartialTreeState): Unit = js.native
    def setUncontrolledState(state: PartialTreeState, atomic: js.UndefOr[scala.Nothing], forceState: PartialTreeState): Unit = js.native
    def setUncontrolledState(state: PartialTreeState, atomic: Boolean): Unit = js.native
    def setUncontrolledState(state: PartialTreeState, atomic: Boolean, forceState: PartialTreeState): Unit = js.native
  }
  
  @js.native
  trait TreeProps extends StObject {
    
    var autoExpandParent: js.UndefOr[Boolean] = js.native
    
    var checkStrictly: js.UndefOr[Boolean] = js.native
    
    var checkable: js.UndefOr[Boolean | ReactNode] = js.native
    
    var checkedKeys: js.UndefOr[js.Array[Key] | Checked] = js.native
    
    var children: js.UndefOr[ReactNode] = js.native
    
    var className: js.UndefOr[String] = js.native
    
    var defaultCheckedKeys: js.UndefOr[js.Array[Key]] = js.native
    
    var defaultExpandAll: js.UndefOr[Boolean] = js.native
    
    var defaultExpandParent: js.UndefOr[Boolean] = js.native
    
    var defaultExpandedKeys: js.UndefOr[js.Array[Key]] = js.native
    
    var defaultSelectedKeys: js.UndefOr[js.Array[Key]] = js.native
    
    var disabled: js.UndefOr[Boolean] = js.native
    
    var draggable: js.UndefOr[Boolean] = js.native
    
    var expandedKeys: js.UndefOr[js.Array[Key]] = js.native
    
    var filterTreeNode: js.UndefOr[js.Function1[/* treeNode */ EventDataNode, Boolean]] = js.native
    
    var focusable: js.UndefOr[Boolean] = js.native
    
    var height: js.UndefOr[Double] = js.native
    
    var icon: js.UndefOr[IconType] = js.native
    
    var itemHeight: js.UndefOr[Double] = js.native
    
    var loadData: js.UndefOr[js.Function1[/* treeNode */ EventDataNode, js.Promise[Unit]]] = js.native
    
    var loadedKeys: js.UndefOr[js.Array[Key]] = js.native
    
    var motion: js.UndefOr[js.Any] = js.native
    
    var multiple: js.UndefOr[Boolean] = js.native
    
    /**
      * Used for `rc-tree-select` only.
      * Do not use in your production code directly since this will be refactor.
      */
    var onActiveChange: js.UndefOr[js.Function1[/* key */ Key, Unit]] = js.native
    
    var onBlur: js.UndefOr[FocusEventHandler[HTMLDivElement]] = js.native
    
    var onCheck: js.UndefOr[js.Function2[/* checked */ Checked | js.Array[Key], /* info */ CheckInfo, Unit]] = js.native
    
    var onClick: js.UndefOr[NodeMouseEventHandler[HTMLSpanElement]] = js.native
    
    var onContextMenu: js.UndefOr[MouseEventHandler[HTMLDivElement]] = js.native
    
    var onDoubleClick: js.UndefOr[NodeMouseEventHandler[HTMLSpanElement]] = js.native
    
    var onDragEnd: js.UndefOr[js.Function1[/* info */ NodeDragEventParams[HTMLDivElement], Unit]] = js.native
    
    var onDragEnter: js.UndefOr[js.Function1[/* info */ NodeDragEventParamsHTMLDi, Unit]] = js.native
    
    var onDragLeave: js.UndefOr[js.Function1[/* info */ NodeDragEventParams[HTMLDivElement], Unit]] = js.native
    
    var onDragOver: js.UndefOr[js.Function1[/* info */ NodeDragEventParams[HTMLDivElement], Unit]] = js.native
    
    var onDragStart: js.UndefOr[js.Function1[/* info */ NodeDragEventParams[HTMLDivElement], Unit]] = js.native
    
    var onDrop: js.UndefOr[js.Function1[/* info */ NodeDragEventParamsHTMLDiDragNode, Unit]] = js.native
    
    var onExpand: js.UndefOr[js.Function2[/* expandedKeys */ js.Array[Key], /* info */ Expanded, Unit]] = js.native
    
    var onFocus: js.UndefOr[FocusEventHandler[HTMLDivElement]] = js.native
    
    var onKeyDown: js.UndefOr[KeyboardEventHandler[HTMLDivElement]] = js.native
    
    var onLoad: js.UndefOr[js.Function2[/* loadedKeys */ js.Array[Key], /* info */ Node, Unit]] = js.native
    
    var onMouseEnter: js.UndefOr[js.Function1[/* info */ NodeMouseEventParams[HTMLSpanElement], Unit]] = js.native
    
    var onMouseLeave: js.UndefOr[js.Function1[/* info */ NodeMouseEventParams[HTMLSpanElement], Unit]] = js.native
    
    var onRightClick: js.UndefOr[js.Function1[/* info */ EventNode, Unit]] = js.native
    
    var onSelect: js.UndefOr[js.Function2[/* selectedKeys */ js.Array[Key], /* info */ Event, Unit]] = js.native
    
    var prefixCls: String = js.native
    
    var selectable: js.UndefOr[Boolean] = js.native
    
    var selectedKeys: js.UndefOr[js.Array[Key]] = js.native
    
    var showIcon: js.UndefOr[Boolean] = js.native
    
    var showLine: js.UndefOr[Boolean] = js.native
    
    var style: js.UndefOr[CSSProperties] = js.native
    
    var switcherIcon: js.UndefOr[IconType] = js.native
    
    var tabIndex: js.UndefOr[Double] = js.native
    
    var titleRender: js.UndefOr[js.Function1[/* node */ DataNode, ReactNode]] = js.native
    
    var treeData: js.UndefOr[js.Array[DataNode]] = js.native
    
    var virtual: js.UndefOr[Boolean] = js.native
  }
  object TreeProps {
    
    @scala.inline
    def apply(prefixCls: String): TreeProps = {
      val __obj = js.Dynamic.literal(prefixCls = prefixCls.asInstanceOf[js.Any])
      __obj.asInstanceOf[TreeProps]
    }
    
    @scala.inline
    implicit class TreePropsMutableBuilder[Self <: TreeProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAutoExpandParent(value: Boolean): Self = StObject.set(x, "autoExpandParent", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAutoExpandParentUndefined: Self = StObject.set(x, "autoExpandParent", js.undefined)
      
      @scala.inline
      def setCheckStrictly(value: Boolean): Self = StObject.set(x, "checkStrictly", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCheckStrictlyUndefined: Self = StObject.set(x, "checkStrictly", js.undefined)
      
      @scala.inline
      def setCheckable(value: Boolean | ReactNode): Self = StObject.set(x, "checkable", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCheckableUndefined: Self = StObject.set(x, "checkable", js.undefined)
      
      @scala.inline
      def setCheckedKeys(value: js.Array[Key] | Checked): Self = StObject.set(x, "checkedKeys", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCheckedKeysUndefined: Self = StObject.set(x, "checkedKeys", js.undefined)
      
      @scala.inline
      def setCheckedKeysVarargs(value: Key*): Self = StObject.set(x, "checkedKeys", js.Array(value :_*))
      
      @scala.inline
      def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      @scala.inline
      def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      @scala.inline
      def setDefaultCheckedKeys(value: js.Array[Key]): Self = StObject.set(x, "defaultCheckedKeys", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDefaultCheckedKeysUndefined: Self = StObject.set(x, "defaultCheckedKeys", js.undefined)
      
      @scala.inline
      def setDefaultCheckedKeysVarargs(value: Key*): Self = StObject.set(x, "defaultCheckedKeys", js.Array(value :_*))
      
      @scala.inline
      def setDefaultExpandAll(value: Boolean): Self = StObject.set(x, "defaultExpandAll", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDefaultExpandAllUndefined: Self = StObject.set(x, "defaultExpandAll", js.undefined)
      
      @scala.inline
      def setDefaultExpandParent(value: Boolean): Self = StObject.set(x, "defaultExpandParent", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDefaultExpandParentUndefined: Self = StObject.set(x, "defaultExpandParent", js.undefined)
      
      @scala.inline
      def setDefaultExpandedKeys(value: js.Array[Key]): Self = StObject.set(x, "defaultExpandedKeys", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDefaultExpandedKeysUndefined: Self = StObject.set(x, "defaultExpandedKeys", js.undefined)
      
      @scala.inline
      def setDefaultExpandedKeysVarargs(value: Key*): Self = StObject.set(x, "defaultExpandedKeys", js.Array(value :_*))
      
      @scala.inline
      def setDefaultSelectedKeys(value: js.Array[Key]): Self = StObject.set(x, "defaultSelectedKeys", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDefaultSelectedKeysUndefined: Self = StObject.set(x, "defaultSelectedKeys", js.undefined)
      
      @scala.inline
      def setDefaultSelectedKeysVarargs(value: Key*): Self = StObject.set(x, "defaultSelectedKeys", js.Array(value :_*))
      
      @scala.inline
      def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
      
      @scala.inline
      def setDraggable(value: Boolean): Self = StObject.set(x, "draggable", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDraggableUndefined: Self = StObject.set(x, "draggable", js.undefined)
      
      @scala.inline
      def setExpandedKeys(value: js.Array[Key]): Self = StObject.set(x, "expandedKeys", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExpandedKeysUndefined: Self = StObject.set(x, "expandedKeys", js.undefined)
      
      @scala.inline
      def setExpandedKeysVarargs(value: Key*): Self = StObject.set(x, "expandedKeys", js.Array(value :_*))
      
      @scala.inline
      def setFilterTreeNode(value: /* treeNode */ EventDataNode => Boolean): Self = StObject.set(x, "filterTreeNode", js.Any.fromFunction1(value))
      
      @scala.inline
      def setFilterTreeNodeUndefined: Self = StObject.set(x, "filterTreeNode", js.undefined)
      
      @scala.inline
      def setFocusable(value: Boolean): Self = StObject.set(x, "focusable", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFocusableUndefined: Self = StObject.set(x, "focusable", js.undefined)
      
      @scala.inline
      def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
      
      @scala.inline
      def setIcon(value: IconType): Self = StObject.set(x, "icon", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIconFunction1(value: /* props */ TreeNodeProps => ReactNode): Self = StObject.set(x, "icon", js.Any.fromFunction1(value))
      
      @scala.inline
      def setIconUndefined: Self = StObject.set(x, "icon", js.undefined)
      
      @scala.inline
      def setItemHeight(value: Double): Self = StObject.set(x, "itemHeight", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setItemHeightUndefined: Self = StObject.set(x, "itemHeight", js.undefined)
      
      @scala.inline
      def setLoadData(value: /* treeNode */ EventDataNode => js.Promise[Unit]): Self = StObject.set(x, "loadData", js.Any.fromFunction1(value))
      
      @scala.inline
      def setLoadDataUndefined: Self = StObject.set(x, "loadData", js.undefined)
      
      @scala.inline
      def setLoadedKeys(value: js.Array[Key]): Self = StObject.set(x, "loadedKeys", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLoadedKeysUndefined: Self = StObject.set(x, "loadedKeys", js.undefined)
      
      @scala.inline
      def setLoadedKeysVarargs(value: Key*): Self = StObject.set(x, "loadedKeys", js.Array(value :_*))
      
      @scala.inline
      def setMotion(value: js.Any): Self = StObject.set(x, "motion", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMotionUndefined: Self = StObject.set(x, "motion", js.undefined)
      
      @scala.inline
      def setMultiple(value: Boolean): Self = StObject.set(x, "multiple", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMultipleUndefined: Self = StObject.set(x, "multiple", js.undefined)
      
      @scala.inline
      def setOnActiveChange(value: /* key */ Key => Unit): Self = StObject.set(x, "onActiveChange", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnActiveChangeUndefined: Self = StObject.set(x, "onActiveChange", js.undefined)
      
      @scala.inline
      def setOnBlur(value: FocusEvent[HTMLDivElement] => Unit): Self = StObject.set(x, "onBlur", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnBlurUndefined: Self = StObject.set(x, "onBlur", js.undefined)
      
      @scala.inline
      def setOnCheck(value: (/* checked */ Checked | js.Array[Key], /* info */ CheckInfo) => Unit): Self = StObject.set(x, "onCheck", js.Any.fromFunction2(value))
      
      @scala.inline
      def setOnCheckUndefined: Self = StObject.set(x, "onCheck", js.undefined)
      
      @scala.inline
      def setOnClick(
        value: (/* e */ typings.react.mod.MouseEvent[HTMLSpanElement, NativeMouseEvent], /* node */ EventDataNode) => Unit
      ): Self = StObject.set(x, "onClick", js.Any.fromFunction2(value))
      
      @scala.inline
      def setOnClickUndefined: Self = StObject.set(x, "onClick", js.undefined)
      
      @scala.inline
      def setOnContextMenu(value: typings.react.mod.MouseEvent[HTMLDivElement, NativeMouseEvent] => Unit): Self = StObject.set(x, "onContextMenu", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnContextMenuUndefined: Self = StObject.set(x, "onContextMenu", js.undefined)
      
      @scala.inline
      def setOnDoubleClick(
        value: (/* e */ typings.react.mod.MouseEvent[HTMLSpanElement, NativeMouseEvent], /* node */ EventDataNode) => Unit
      ): Self = StObject.set(x, "onDoubleClick", js.Any.fromFunction2(value))
      
      @scala.inline
      def setOnDoubleClickUndefined: Self = StObject.set(x, "onDoubleClick", js.undefined)
      
      @scala.inline
      def setOnDragEnd(value: /* info */ NodeDragEventParams[HTMLDivElement] => Unit): Self = StObject.set(x, "onDragEnd", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnDragEndUndefined: Self = StObject.set(x, "onDragEnd", js.undefined)
      
      @scala.inline
      def setOnDragEnter(value: /* info */ NodeDragEventParamsHTMLDi => Unit): Self = StObject.set(x, "onDragEnter", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnDragEnterUndefined: Self = StObject.set(x, "onDragEnter", js.undefined)
      
      @scala.inline
      def setOnDragLeave(value: /* info */ NodeDragEventParams[HTMLDivElement] => Unit): Self = StObject.set(x, "onDragLeave", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnDragLeaveUndefined: Self = StObject.set(x, "onDragLeave", js.undefined)
      
      @scala.inline
      def setOnDragOver(value: /* info */ NodeDragEventParams[HTMLDivElement] => Unit): Self = StObject.set(x, "onDragOver", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnDragOverUndefined: Self = StObject.set(x, "onDragOver", js.undefined)
      
      @scala.inline
      def setOnDragStart(value: /* info */ NodeDragEventParams[HTMLDivElement] => Unit): Self = StObject.set(x, "onDragStart", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnDragStartUndefined: Self = StObject.set(x, "onDragStart", js.undefined)
      
      @scala.inline
      def setOnDrop(value: /* info */ NodeDragEventParamsHTMLDiDragNode => Unit): Self = StObject.set(x, "onDrop", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnDropUndefined: Self = StObject.set(x, "onDrop", js.undefined)
      
      @scala.inline
      def setOnExpand(value: (/* expandedKeys */ js.Array[Key], /* info */ Expanded) => Unit): Self = StObject.set(x, "onExpand", js.Any.fromFunction2(value))
      
      @scala.inline
      def setOnExpandUndefined: Self = StObject.set(x, "onExpand", js.undefined)
      
      @scala.inline
      def setOnFocus(value: FocusEvent[HTMLDivElement] => Unit): Self = StObject.set(x, "onFocus", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnFocusUndefined: Self = StObject.set(x, "onFocus", js.undefined)
      
      @scala.inline
      def setOnKeyDown(value: KeyboardEvent[HTMLDivElement] => Unit): Self = StObject.set(x, "onKeyDown", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnKeyDownUndefined: Self = StObject.set(x, "onKeyDown", js.undefined)
      
      @scala.inline
      def setOnLoad(value: (/* loadedKeys */ js.Array[Key], /* info */ Node) => Unit): Self = StObject.set(x, "onLoad", js.Any.fromFunction2(value))
      
      @scala.inline
      def setOnLoadUndefined: Self = StObject.set(x, "onLoad", js.undefined)
      
      @scala.inline
      def setOnMouseEnter(value: /* info */ NodeMouseEventParams[HTMLSpanElement] => Unit): Self = StObject.set(x, "onMouseEnter", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnMouseEnterUndefined: Self = StObject.set(x, "onMouseEnter", js.undefined)
      
      @scala.inline
      def setOnMouseLeave(value: /* info */ NodeMouseEventParams[HTMLSpanElement] => Unit): Self = StObject.set(x, "onMouseLeave", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnMouseLeaveUndefined: Self = StObject.set(x, "onMouseLeave", js.undefined)
      
      @scala.inline
      def setOnRightClick(value: /* info */ EventNode => Unit): Self = StObject.set(x, "onRightClick", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnRightClickUndefined: Self = StObject.set(x, "onRightClick", js.undefined)
      
      @scala.inline
      def setOnSelect(value: (/* selectedKeys */ js.Array[Key], /* info */ Event) => Unit): Self = StObject.set(x, "onSelect", js.Any.fromFunction2(value))
      
      @scala.inline
      def setOnSelectUndefined: Self = StObject.set(x, "onSelect", js.undefined)
      
      @scala.inline
      def setPrefixCls(value: String): Self = StObject.set(x, "prefixCls", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSelectable(value: Boolean): Self = StObject.set(x, "selectable", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSelectableUndefined: Self = StObject.set(x, "selectable", js.undefined)
      
      @scala.inline
      def setSelectedKeys(value: js.Array[Key]): Self = StObject.set(x, "selectedKeys", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSelectedKeysUndefined: Self = StObject.set(x, "selectedKeys", js.undefined)
      
      @scala.inline
      def setSelectedKeysVarargs(value: Key*): Self = StObject.set(x, "selectedKeys", js.Array(value :_*))
      
      @scala.inline
      def setShowIcon(value: Boolean): Self = StObject.set(x, "showIcon", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShowIconUndefined: Self = StObject.set(x, "showIcon", js.undefined)
      
      @scala.inline
      def setShowLine(value: Boolean): Self = StObject.set(x, "showLine", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShowLineUndefined: Self = StObject.set(x, "showLine", js.undefined)
      
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
      def setTabIndex(value: Double): Self = StObject.set(x, "tabIndex", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTabIndexUndefined: Self = StObject.set(x, "tabIndex", js.undefined)
      
      @scala.inline
      def setTitleRender(value: /* node */ DataNode => ReactNode): Self = StObject.set(x, "titleRender", js.Any.fromFunction1(value))
      
      @scala.inline
      def setTitleRenderUndefined: Self = StObject.set(x, "titleRender", js.undefined)
      
      @scala.inline
      def setTreeData(value: js.Array[DataNode]): Self = StObject.set(x, "treeData", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTreeDataUndefined: Self = StObject.set(x, "treeData", js.undefined)
      
      @scala.inline
      def setTreeDataVarargs(value: DataNode*): Self = StObject.set(x, "treeData", js.Array(value :_*))
      
      @scala.inline
      def setVirtual(value: Boolean): Self = StObject.set(x, "virtual", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVirtualUndefined: Self = StObject.set(x, "virtual", js.undefined)
    }
  }
  
  @js.native
  trait TreeState extends StObject {
    
    var activeKey: Key = js.native
    
    var checkedKeys: js.Array[Key] = js.native
    
    var dragNodesKeys: js.Array[Key] = js.native
    
    var dragOverNodeKey: Key = js.native
    
    var dragging: Boolean = js.native
    
    var dropPosition: Double = js.native
    
    var expandedKeys: js.Array[Key] = js.native
    
    var flattenNodes: js.Array[FlattenNode] = js.native
    
    var focused: Boolean = js.native
    
    var halfCheckedKeys: js.Array[Key] = js.native
    
    var keyEntities: Record[Key, DataEntity] = js.native
    
    var listChanging: Boolean = js.native
    
    var loadedKeys: js.Array[Key] = js.native
    
    var loadingKeys: js.Array[Key] = js.native
    
    var prevProps: TreeProps = js.native
    
    var selectedKeys: js.Array[Key] = js.native
    
    var treeData: js.Array[DataNode] = js.native
  }
  object TreeState {
    
    @scala.inline
    def apply(
      activeKey: Key,
      checkedKeys: js.Array[Key],
      dragNodesKeys: js.Array[Key],
      dragOverNodeKey: Key,
      dragging: Boolean,
      dropPosition: Double,
      expandedKeys: js.Array[Key],
      flattenNodes: js.Array[FlattenNode],
      focused: Boolean,
      halfCheckedKeys: js.Array[Key],
      keyEntities: Record[Key, DataEntity],
      listChanging: Boolean,
      loadedKeys: js.Array[Key],
      loadingKeys: js.Array[Key],
      prevProps: TreeProps,
      selectedKeys: js.Array[Key],
      treeData: js.Array[DataNode]
    ): TreeState = {
      val __obj = js.Dynamic.literal(activeKey = activeKey.asInstanceOf[js.Any], checkedKeys = checkedKeys.asInstanceOf[js.Any], dragNodesKeys = dragNodesKeys.asInstanceOf[js.Any], dragOverNodeKey = dragOverNodeKey.asInstanceOf[js.Any], dragging = dragging.asInstanceOf[js.Any], dropPosition = dropPosition.asInstanceOf[js.Any], expandedKeys = expandedKeys.asInstanceOf[js.Any], flattenNodes = flattenNodes.asInstanceOf[js.Any], focused = focused.asInstanceOf[js.Any], halfCheckedKeys = halfCheckedKeys.asInstanceOf[js.Any], keyEntities = keyEntities.asInstanceOf[js.Any], listChanging = listChanging.asInstanceOf[js.Any], loadedKeys = loadedKeys.asInstanceOf[js.Any], loadingKeys = loadingKeys.asInstanceOf[js.Any], prevProps = prevProps.asInstanceOf[js.Any], selectedKeys = selectedKeys.asInstanceOf[js.Any], treeData = treeData.asInstanceOf[js.Any])
      __obj.asInstanceOf[TreeState]
    }
    
    @scala.inline
    implicit class TreeStateMutableBuilder[Self <: TreeState] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setActiveKey(value: Key): Self = StObject.set(x, "activeKey", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCheckedKeys(value: js.Array[Key]): Self = StObject.set(x, "checkedKeys", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCheckedKeysVarargs(value: Key*): Self = StObject.set(x, "checkedKeys", js.Array(value :_*))
      
      @scala.inline
      def setDragNodesKeys(value: js.Array[Key]): Self = StObject.set(x, "dragNodesKeys", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDragNodesKeysVarargs(value: Key*): Self = StObject.set(x, "dragNodesKeys", js.Array(value :_*))
      
      @scala.inline
      def setDragOverNodeKey(value: Key): Self = StObject.set(x, "dragOverNodeKey", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDragging(value: Boolean): Self = StObject.set(x, "dragging", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDropPosition(value: Double): Self = StObject.set(x, "dropPosition", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExpandedKeys(value: js.Array[Key]): Self = StObject.set(x, "expandedKeys", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExpandedKeysVarargs(value: Key*): Self = StObject.set(x, "expandedKeys", js.Array(value :_*))
      
      @scala.inline
      def setFlattenNodes(value: js.Array[FlattenNode]): Self = StObject.set(x, "flattenNodes", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFlattenNodesVarargs(value: FlattenNode*): Self = StObject.set(x, "flattenNodes", js.Array(value :_*))
      
      @scala.inline
      def setFocused(value: Boolean): Self = StObject.set(x, "focused", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHalfCheckedKeys(value: js.Array[Key]): Self = StObject.set(x, "halfCheckedKeys", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHalfCheckedKeysVarargs(value: Key*): Self = StObject.set(x, "halfCheckedKeys", js.Array(value :_*))
      
      @scala.inline
      def setKeyEntities(value: Record[Key, DataEntity]): Self = StObject.set(x, "keyEntities", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setListChanging(value: Boolean): Self = StObject.set(x, "listChanging", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLoadedKeys(value: js.Array[Key]): Self = StObject.set(x, "loadedKeys", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLoadedKeysVarargs(value: Key*): Self = StObject.set(x, "loadedKeys", js.Array(value :_*))
      
      @scala.inline
      def setLoadingKeys(value: js.Array[Key]): Self = StObject.set(x, "loadingKeys", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLoadingKeysVarargs(value: Key*): Self = StObject.set(x, "loadingKeys", js.Array(value :_*))
      
      @scala.inline
      def setPrevProps(value: TreeProps): Self = StObject.set(x, "prevProps", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSelectedKeys(value: js.Array[Key]): Self = StObject.set(x, "selectedKeys", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSelectedKeysVarargs(value: Key*): Self = StObject.set(x, "selectedKeys", js.Array(value :_*))
      
      @scala.inline
      def setTreeData(value: js.Array[DataNode]): Self = StObject.set(x, "treeData", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTreeDataVarargs(value: DataNode*): Self = StObject.set(x, "treeData", js.Array(value :_*))
    }
  }
}
