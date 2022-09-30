package typings.rcTree

import typings.rcTree.anon.DropPosition
import typings.rcTree.interfaceMod.BasicDataNode
import typings.rcTree.interfaceMod.DataEntity
import typings.rcTree.interfaceMod.DataNode
import typings.rcTree.interfaceMod.Direction
import typings.rcTree.interfaceMod.EventDataNode
import typings.rcTree.interfaceMod.IconType
import typings.rcTree.interfaceMod.Key
import typings.rcTree.interfaceMod.NodeInstance
import typings.rcTree.rcTreeInts.`-1`
import typings.rcTree.rcTreeInts.`0`
import typings.rcTree.rcTreeInts.`1`
import typings.rcTree.treeMod.DraggableConfig
import typings.rcTree.treeNodeMod.TreeNodeProps
import typings.react.mod.Context
import typings.react.mod.DragEvent
import typings.react.mod.MouseEvent
import typings.react.mod.NativeMouseEvent
import typings.react.mod.ReactNode
import typings.std.HTMLSpanElement
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object contextTypesMod {
  
  @JSImport("rc-tree/es/contextTypes", "TreeContext")
  @js.native
  val TreeContext: Context[TreeContextProps[Any] | Null] = js.native
  
  type NodeDragEventHandler[TreeDataType /* <: BasicDataNode */, T] = js.Function3[
    /* e */ DragEvent[T], 
    /* node */ NodeInstance[TreeDataType], 
    /* outsideTree */ js.UndefOr[Boolean], 
    Unit
  ]
  
  trait NodeDragEventParams[TreeDataType /* <: BasicDataNode */, T] extends StObject {
    
    var event: DragEvent[T]
    
    var node: EventDataNode[TreeDataType]
  }
  object NodeDragEventParams {
    
    inline def apply[TreeDataType /* <: BasicDataNode */, T](event: DragEvent[T], node: EventDataNode[TreeDataType]): NodeDragEventParams[TreeDataType, T] = {
      val __obj = js.Dynamic.literal(event = event.asInstanceOf[js.Any], node = node.asInstanceOf[js.Any])
      __obj.asInstanceOf[NodeDragEventParams[TreeDataType, T]]
    }
    
    extension [Self <: NodeDragEventParams[?, ?], TreeDataType /* <: BasicDataNode */, T](x: Self & (NodeDragEventParams[TreeDataType, T])) {
      
      inline def setEvent(value: DragEvent[T]): Self = StObject.set(x, "event", value.asInstanceOf[js.Any])
      
      inline def setNode(value: EventDataNode[TreeDataType]): Self = StObject.set(x, "node", value.asInstanceOf[js.Any])
    }
  }
  
  type NodeMouseEventHandler[TreeDataType /* <: BasicDataNode */, T] = js.Function2[
    /* e */ MouseEvent[T, NativeMouseEvent], 
    /* node */ EventDataNode[TreeDataType], 
    Unit
  ]
  
  trait NodeMouseEventParams[TreeDataType /* <: BasicDataNode */, T] extends StObject {
    
    var event: MouseEvent[T, NativeMouseEvent]
    
    var node: EventDataNode[TreeDataType]
  }
  object NodeMouseEventParams {
    
    inline def apply[TreeDataType /* <: BasicDataNode */, T](event: MouseEvent[T, NativeMouseEvent], node: EventDataNode[TreeDataType]): NodeMouseEventParams[TreeDataType, T] = {
      val __obj = js.Dynamic.literal(event = event.asInstanceOf[js.Any], node = node.asInstanceOf[js.Any])
      __obj.asInstanceOf[NodeMouseEventParams[TreeDataType, T]]
    }
    
    extension [Self <: NodeMouseEventParams[?, ?], TreeDataType /* <: BasicDataNode */, T](x: Self & (NodeMouseEventParams[TreeDataType, T])) {
      
      inline def setEvent(value: MouseEvent[T, NativeMouseEvent]): Self = StObject.set(x, "event", value.asInstanceOf[js.Any])
      
      inline def setNode(value: EventDataNode[TreeDataType]): Self = StObject.set(x, "node", value.asInstanceOf[js.Any])
    }
  }
  
  trait TreeContextProps[TreeDataType /* <: BasicDataNode */] extends StObject {
    
    var checkStrictly: Boolean
    
    var checkable: Boolean | ReactNode
    
    var direction: Direction
    
    var disabled: Boolean
    
    var dragOverNodeKey: Key | Null
    
    var draggable: js.UndefOr[DraggableConfig] = js.undefined
    
    var draggingNodeKey: js.UndefOr[typings.react.mod.Key] = js.undefined
    
    var dropContainerKey: Key | Null
    
    def dropIndicatorRender(props: DropPosition): ReactNode
    
    var dropLevelOffset: js.UndefOr[Double] = js.undefined
    
    var dropPosition: `-1` | `0` | `1` | Null
    
    var dropTargetKey: Key | Null
    
    def filterTreeNode(treeNode: EventDataNode[TreeDataType]): Boolean
    
    var icon: IconType
    
    var indent: Double | Null
    
    var keyEntities: Record[Key, DataEntity[Any]]
    
    def loadData(treeNode: EventDataNode[TreeDataType]): js.Promise[Unit]
    
    def onNodeCheck(
      e: MouseEvent[HTMLSpanElement, NativeMouseEvent],
      treeNode: EventDataNode[TreeDataType],
      checked: Boolean
    ): Unit
    
    var onNodeClick: NodeMouseEventHandler[TreeDataType, HTMLSpanElement]
    
    var onNodeContextMenu: NodeMouseEventHandler[TreeDataType, HTMLSpanElement]
    
    var onNodeDoubleClick: NodeMouseEventHandler[TreeDataType, HTMLSpanElement]
    
    var onNodeDragEnd: NodeDragEventHandler[Any, Any]
    
    var onNodeDragEnter: NodeDragEventHandler[Any, Any]
    
    var onNodeDragLeave: NodeDragEventHandler[Any, Any]
    
    var onNodeDragOver: NodeDragEventHandler[Any, Any]
    
    var onNodeDragStart: NodeDragEventHandler[Any, Any]
    
    var onNodeDrop: NodeDragEventHandler[Any, Any]
    
    var onNodeExpand: NodeMouseEventHandler[TreeDataType, HTMLSpanElement]
    
    def onNodeLoad(treeNode: EventDataNode[TreeDataType]): Unit
    
    var onNodeMouseEnter: NodeMouseEventHandler[TreeDataType, HTMLSpanElement]
    
    var onNodeMouseLeave: NodeMouseEventHandler[TreeDataType, HTMLSpanElement]
    
    var onNodeSelect: NodeMouseEventHandler[TreeDataType, HTMLSpanElement]
    
    var prefixCls: String
    
    var selectable: Boolean
    
    var showIcon: Boolean
    
    var switcherIcon: IconType
    
    var titleRender: js.UndefOr[js.Function1[/* node */ Any, ReactNode]] = js.undefined
  }
  object TreeContextProps {
    
    inline def apply[TreeDataType /* <: BasicDataNode */](
      checkStrictly: Boolean,
      disabled: Boolean,
      dropIndicatorRender: DropPosition => ReactNode,
      filterTreeNode: EventDataNode[TreeDataType] => Boolean,
      keyEntities: Record[Key, DataEntity[Any]],
      loadData: EventDataNode[TreeDataType] => js.Promise[Unit],
      onNodeCheck: (MouseEvent[HTMLSpanElement, NativeMouseEvent], EventDataNode[TreeDataType], Boolean) => Unit,
      onNodeClick: (/* e */ MouseEvent[HTMLSpanElement, NativeMouseEvent], /* node */ EventDataNode[TreeDataType]) => Unit,
      onNodeContextMenu: (/* e */ MouseEvent[HTMLSpanElement, NativeMouseEvent], /* node */ EventDataNode[TreeDataType]) => Unit,
      onNodeDoubleClick: (/* e */ MouseEvent[HTMLSpanElement, NativeMouseEvent], /* node */ EventDataNode[TreeDataType]) => Unit,
      onNodeDragEnd: (/* e */ DragEvent[Any], /* node */ NodeInstance[Any], /* outsideTree */ js.UndefOr[Boolean]) => Unit,
      onNodeDragEnter: (/* e */ DragEvent[Any], /* node */ NodeInstance[Any], /* outsideTree */ js.UndefOr[Boolean]) => Unit,
      onNodeDragLeave: (/* e */ DragEvent[Any], /* node */ NodeInstance[Any], /* outsideTree */ js.UndefOr[Boolean]) => Unit,
      onNodeDragOver: (/* e */ DragEvent[Any], /* node */ NodeInstance[Any], /* outsideTree */ js.UndefOr[Boolean]) => Unit,
      onNodeDragStart: (/* e */ DragEvent[Any], /* node */ NodeInstance[Any], /* outsideTree */ js.UndefOr[Boolean]) => Unit,
      onNodeDrop: (/* e */ DragEvent[Any], /* node */ NodeInstance[Any], /* outsideTree */ js.UndefOr[Boolean]) => Unit,
      onNodeExpand: (/* e */ MouseEvent[HTMLSpanElement, NativeMouseEvent], /* node */ EventDataNode[TreeDataType]) => Unit,
      onNodeLoad: EventDataNode[TreeDataType] => Unit,
      onNodeMouseEnter: (/* e */ MouseEvent[HTMLSpanElement, NativeMouseEvent], /* node */ EventDataNode[TreeDataType]) => Unit,
      onNodeMouseLeave: (/* e */ MouseEvent[HTMLSpanElement, NativeMouseEvent], /* node */ EventDataNode[TreeDataType]) => Unit,
      onNodeSelect: (/* e */ MouseEvent[HTMLSpanElement, NativeMouseEvent], /* node */ EventDataNode[TreeDataType]) => Unit,
      prefixCls: String,
      selectable: Boolean,
      showIcon: Boolean
    ): TreeContextProps[TreeDataType] = {
      val __obj = js.Dynamic.literal(checkStrictly = checkStrictly.asInstanceOf[js.Any], disabled = disabled.asInstanceOf[js.Any], dropIndicatorRender = js.Any.fromFunction1(dropIndicatorRender), filterTreeNode = js.Any.fromFunction1(filterTreeNode), keyEntities = keyEntities.asInstanceOf[js.Any], loadData = js.Any.fromFunction1(loadData), onNodeCheck = js.Any.fromFunction3(onNodeCheck), onNodeClick = js.Any.fromFunction2(onNodeClick), onNodeContextMenu = js.Any.fromFunction2(onNodeContextMenu), onNodeDoubleClick = js.Any.fromFunction2(onNodeDoubleClick), onNodeDragEnd = js.Any.fromFunction3(onNodeDragEnd), onNodeDragEnter = js.Any.fromFunction3(onNodeDragEnter), onNodeDragLeave = js.Any.fromFunction3(onNodeDragLeave), onNodeDragOver = js.Any.fromFunction3(onNodeDragOver), onNodeDragStart = js.Any.fromFunction3(onNodeDragStart), onNodeDrop = js.Any.fromFunction3(onNodeDrop), onNodeExpand = js.Any.fromFunction2(onNodeExpand), onNodeLoad = js.Any.fromFunction1(onNodeLoad), onNodeMouseEnter = js.Any.fromFunction2(onNodeMouseEnter), onNodeMouseLeave = js.Any.fromFunction2(onNodeMouseLeave), onNodeSelect = js.Any.fromFunction2(onNodeSelect), prefixCls = prefixCls.asInstanceOf[js.Any], selectable = selectable.asInstanceOf[js.Any], showIcon = showIcon.asInstanceOf[js.Any], dragOverNodeKey = null, dropContainerKey = null, dropPosition = null, dropTargetKey = null, indent = null)
      __obj.asInstanceOf[TreeContextProps[TreeDataType]]
    }
    
    extension [Self <: TreeContextProps[?], TreeDataType /* <: BasicDataNode */](x: Self & TreeContextProps[TreeDataType]) {
      
      inline def setCheckStrictly(value: Boolean): Self = StObject.set(x, "checkStrictly", value.asInstanceOf[js.Any])
      
      inline def setCheckable(value: Boolean | ReactNode): Self = StObject.set(x, "checkable", value.asInstanceOf[js.Any])
      
      inline def setCheckableUndefined: Self = StObject.set(x, "checkable", js.undefined)
      
      inline def setDirection(value: Direction): Self = StObject.set(x, "direction", value.asInstanceOf[js.Any])
      
      inline def setDirectionUndefined: Self = StObject.set(x, "direction", js.undefined)
      
      inline def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      inline def setDragOverNodeKey(value: Key): Self = StObject.set(x, "dragOverNodeKey", value.asInstanceOf[js.Any])
      
      inline def setDragOverNodeKeyNull: Self = StObject.set(x, "dragOverNodeKey", null)
      
      inline def setDraggable(value: DraggableConfig): Self = StObject.set(x, "draggable", value.asInstanceOf[js.Any])
      
      inline def setDraggableUndefined: Self = StObject.set(x, "draggable", js.undefined)
      
      inline def setDraggingNodeKey(value: typings.react.mod.Key): Self = StObject.set(x, "draggingNodeKey", value.asInstanceOf[js.Any])
      
      inline def setDraggingNodeKeyUndefined: Self = StObject.set(x, "draggingNodeKey", js.undefined)
      
      inline def setDropContainerKey(value: Key): Self = StObject.set(x, "dropContainerKey", value.asInstanceOf[js.Any])
      
      inline def setDropContainerKeyNull: Self = StObject.set(x, "dropContainerKey", null)
      
      inline def setDropIndicatorRender(value: DropPosition => ReactNode): Self = StObject.set(x, "dropIndicatorRender", js.Any.fromFunction1(value))
      
      inline def setDropLevelOffset(value: Double): Self = StObject.set(x, "dropLevelOffset", value.asInstanceOf[js.Any])
      
      inline def setDropLevelOffsetUndefined: Self = StObject.set(x, "dropLevelOffset", js.undefined)
      
      inline def setDropPosition(value: `-1` | `0` | `1`): Self = StObject.set(x, "dropPosition", value.asInstanceOf[js.Any])
      
      inline def setDropPositionNull: Self = StObject.set(x, "dropPosition", null)
      
      inline def setDropTargetKey(value: Key): Self = StObject.set(x, "dropTargetKey", value.asInstanceOf[js.Any])
      
      inline def setDropTargetKeyNull: Self = StObject.set(x, "dropTargetKey", null)
      
      inline def setFilterTreeNode(value: EventDataNode[TreeDataType] => Boolean): Self = StObject.set(x, "filterTreeNode", js.Any.fromFunction1(value))
      
      inline def setIcon(value: IconType): Self = StObject.set(x, "icon", value.asInstanceOf[js.Any])
      
      inline def setIconFunction1(value: /* props */ TreeNodeProps[DataNode] => ReactNode): Self = StObject.set(x, "icon", js.Any.fromFunction1(value))
      
      inline def setIconUndefined: Self = StObject.set(x, "icon", js.undefined)
      
      inline def setIndent(value: Double): Self = StObject.set(x, "indent", value.asInstanceOf[js.Any])
      
      inline def setIndentNull: Self = StObject.set(x, "indent", null)
      
      inline def setKeyEntities(value: Record[Key, DataEntity[Any]]): Self = StObject.set(x, "keyEntities", value.asInstanceOf[js.Any])
      
      inline def setLoadData(value: EventDataNode[TreeDataType] => js.Promise[Unit]): Self = StObject.set(x, "loadData", js.Any.fromFunction1(value))
      
      inline def setOnNodeCheck(
        value: (MouseEvent[HTMLSpanElement, NativeMouseEvent], EventDataNode[TreeDataType], Boolean) => Unit
      ): Self = StObject.set(x, "onNodeCheck", js.Any.fromFunction3(value))
      
      inline def setOnNodeClick(
        value: (/* e */ MouseEvent[HTMLSpanElement, NativeMouseEvent], /* node */ EventDataNode[TreeDataType]) => Unit
      ): Self = StObject.set(x, "onNodeClick", js.Any.fromFunction2(value))
      
      inline def setOnNodeContextMenu(
        value: (/* e */ MouseEvent[HTMLSpanElement, NativeMouseEvent], /* node */ EventDataNode[TreeDataType]) => Unit
      ): Self = StObject.set(x, "onNodeContextMenu", js.Any.fromFunction2(value))
      
      inline def setOnNodeDoubleClick(
        value: (/* e */ MouseEvent[HTMLSpanElement, NativeMouseEvent], /* node */ EventDataNode[TreeDataType]) => Unit
      ): Self = StObject.set(x, "onNodeDoubleClick", js.Any.fromFunction2(value))
      
      inline def setOnNodeDragEnd(
        value: (/* e */ DragEvent[Any], /* node */ NodeInstance[Any], /* outsideTree */ js.UndefOr[Boolean]) => Unit
      ): Self = StObject.set(x, "onNodeDragEnd", js.Any.fromFunction3(value))
      
      inline def setOnNodeDragEnter(
        value: (/* e */ DragEvent[Any], /* node */ NodeInstance[Any], /* outsideTree */ js.UndefOr[Boolean]) => Unit
      ): Self = StObject.set(x, "onNodeDragEnter", js.Any.fromFunction3(value))
      
      inline def setOnNodeDragLeave(
        value: (/* e */ DragEvent[Any], /* node */ NodeInstance[Any], /* outsideTree */ js.UndefOr[Boolean]) => Unit
      ): Self = StObject.set(x, "onNodeDragLeave", js.Any.fromFunction3(value))
      
      inline def setOnNodeDragOver(
        value: (/* e */ DragEvent[Any], /* node */ NodeInstance[Any], /* outsideTree */ js.UndefOr[Boolean]) => Unit
      ): Self = StObject.set(x, "onNodeDragOver", js.Any.fromFunction3(value))
      
      inline def setOnNodeDragStart(
        value: (/* e */ DragEvent[Any], /* node */ NodeInstance[Any], /* outsideTree */ js.UndefOr[Boolean]) => Unit
      ): Self = StObject.set(x, "onNodeDragStart", js.Any.fromFunction3(value))
      
      inline def setOnNodeDrop(
        value: (/* e */ DragEvent[Any], /* node */ NodeInstance[Any], /* outsideTree */ js.UndefOr[Boolean]) => Unit
      ): Self = StObject.set(x, "onNodeDrop", js.Any.fromFunction3(value))
      
      inline def setOnNodeExpand(
        value: (/* e */ MouseEvent[HTMLSpanElement, NativeMouseEvent], /* node */ EventDataNode[TreeDataType]) => Unit
      ): Self = StObject.set(x, "onNodeExpand", js.Any.fromFunction2(value))
      
      inline def setOnNodeLoad(value: EventDataNode[TreeDataType] => Unit): Self = StObject.set(x, "onNodeLoad", js.Any.fromFunction1(value))
      
      inline def setOnNodeMouseEnter(
        value: (/* e */ MouseEvent[HTMLSpanElement, NativeMouseEvent], /* node */ EventDataNode[TreeDataType]) => Unit
      ): Self = StObject.set(x, "onNodeMouseEnter", js.Any.fromFunction2(value))
      
      inline def setOnNodeMouseLeave(
        value: (/* e */ MouseEvent[HTMLSpanElement, NativeMouseEvent], /* node */ EventDataNode[TreeDataType]) => Unit
      ): Self = StObject.set(x, "onNodeMouseLeave", js.Any.fromFunction2(value))
      
      inline def setOnNodeSelect(
        value: (/* e */ MouseEvent[HTMLSpanElement, NativeMouseEvent], /* node */ EventDataNode[TreeDataType]) => Unit
      ): Self = StObject.set(x, "onNodeSelect", js.Any.fromFunction2(value))
      
      inline def setPrefixCls(value: String): Self = StObject.set(x, "prefixCls", value.asInstanceOf[js.Any])
      
      inline def setSelectable(value: Boolean): Self = StObject.set(x, "selectable", value.asInstanceOf[js.Any])
      
      inline def setShowIcon(value: Boolean): Self = StObject.set(x, "showIcon", value.asInstanceOf[js.Any])
      
      inline def setSwitcherIcon(value: IconType): Self = StObject.set(x, "switcherIcon", value.asInstanceOf[js.Any])
      
      inline def setSwitcherIconFunction1(value: /* props */ TreeNodeProps[DataNode] => ReactNode): Self = StObject.set(x, "switcherIcon", js.Any.fromFunction1(value))
      
      inline def setSwitcherIconUndefined: Self = StObject.set(x, "switcherIcon", js.undefined)
      
      inline def setTitleRender(value: /* node */ Any => ReactNode): Self = StObject.set(x, "titleRender", js.Any.fromFunction1(value))
      
      inline def setTitleRenderUndefined: Self = StObject.set(x, "titleRender", js.undefined)
    }
  }
}
