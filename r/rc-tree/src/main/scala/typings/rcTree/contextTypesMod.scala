package typings.rcTree

import typings.rcTree.interfaceMod.DataEntity
import typings.rcTree.interfaceMod.DataNode
import typings.rcTree.interfaceMod.EventDataNode
import typings.rcTree.interfaceMod.IconType
import typings.rcTree.interfaceMod.Key
import typings.rcTree.interfaceMod.NodeInstance
import typings.rcTree.treeNodeMod.TreeNodeProps
import typings.react.mod.Context
import typings.react.mod.MouseEvent
import typings.react.mod.NativeMouseEvent
import typings.react.mod.ReactNode
import typings.std.HTMLDivElement
import typings.std.HTMLSpanElement
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object contextTypesMod {
  
  @JSImport("rc-tree/es/contextTypes", "TreeContext")
  @js.native
  val TreeContext: Context[TreeContextProps | Null] = js.native
  
  type NodeDragEventHandler[T] = js.Function2[/* e */ MouseEvent[T, NativeMouseEvent], /* node */ NodeInstance, Unit]
  
  trait NodeDragEventParams[T] extends StObject {
    
    var event: MouseEvent[T, NativeMouseEvent]
    
    var node: EventDataNode
  }
  object NodeDragEventParams {
    
    @scala.inline
    def apply[T](event: MouseEvent[T, NativeMouseEvent], node: EventDataNode): NodeDragEventParams[T] = {
      val __obj = js.Dynamic.literal(event = event.asInstanceOf[js.Any], node = node.asInstanceOf[js.Any])
      __obj.asInstanceOf[NodeDragEventParams[T]]
    }
    
    @scala.inline
    implicit class NodeDragEventParamsMutableBuilder[Self <: NodeDragEventParams[?], T] (val x: Self & NodeDragEventParams[T]) extends AnyVal {
      
      @scala.inline
      def setEvent(value: MouseEvent[T, NativeMouseEvent]): Self = StObject.set(x, "event", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNode(value: EventDataNode): Self = StObject.set(x, "node", value.asInstanceOf[js.Any])
    }
  }
  
  type NodeMouseEventHandler[T] = js.Function2[/* e */ MouseEvent[T, NativeMouseEvent], /* node */ EventDataNode, Unit]
  
  trait NodeMouseEventParams[T] extends StObject {
    
    var event: MouseEvent[T, NativeMouseEvent]
    
    var node: EventDataNode
  }
  object NodeMouseEventParams {
    
    @scala.inline
    def apply[T](event: MouseEvent[T, NativeMouseEvent], node: EventDataNode): NodeMouseEventParams[T] = {
      val __obj = js.Dynamic.literal(event = event.asInstanceOf[js.Any], node = node.asInstanceOf[js.Any])
      __obj.asInstanceOf[NodeMouseEventParams[T]]
    }
    
    @scala.inline
    implicit class NodeMouseEventParamsMutableBuilder[Self <: NodeMouseEventParams[?], T] (val x: Self & NodeMouseEventParams[T]) extends AnyVal {
      
      @scala.inline
      def setEvent(value: MouseEvent[T, NativeMouseEvent]): Self = StObject.set(x, "event", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNode(value: EventDataNode): Self = StObject.set(x, "node", value.asInstanceOf[js.Any])
    }
  }
  
  trait TreeContextProps extends StObject {
    
    var checkStrictly: Boolean
    
    var checkable: Boolean | ReactNode
    
    var disabled: Boolean
    
    var draggable: Boolean
    
    def filterTreeNode(treeNode: EventDataNode): Boolean
    
    var icon: IconType
    
    var keyEntities: Record[Key, DataEntity]
    
    def loadData(treeNode: EventDataNode): js.Promise[Unit]
    
    def onNodeCheck(e: MouseEvent[HTMLSpanElement, NativeMouseEvent], treeNode: EventDataNode, checked: Boolean): Unit
    
    var onNodeClick: NodeMouseEventHandler[HTMLSpanElement]
    
    var onNodeContextMenu: NodeMouseEventHandler[HTMLSpanElement]
    
    var onNodeDoubleClick: NodeMouseEventHandler[HTMLSpanElement]
    
    var onNodeDragEnd: NodeDragEventHandler[HTMLDivElement]
    
    var onNodeDragEnter: NodeDragEventHandler[HTMLDivElement]
    
    var onNodeDragLeave: NodeDragEventHandler[HTMLDivElement]
    
    var onNodeDragOver: NodeDragEventHandler[HTMLDivElement]
    
    var onNodeDragStart: NodeDragEventHandler[HTMLDivElement]
    
    var onNodeDrop: NodeDragEventHandler[HTMLDivElement]
    
    var onNodeExpand: NodeMouseEventHandler[HTMLSpanElement]
    
    def onNodeLoad(treeNode: EventDataNode): Unit
    
    var onNodeMouseEnter: NodeMouseEventHandler[HTMLSpanElement]
    
    var onNodeMouseLeave: NodeMouseEventHandler[HTMLSpanElement]
    
    var onNodeSelect: NodeMouseEventHandler[HTMLSpanElement]
    
    var prefixCls: String
    
    var selectable: Boolean
    
    var showIcon: Boolean
    
    var switcherIcon: IconType
    
    var titleRender: js.UndefOr[js.Function1[/* node */ DataNode, ReactNode]] = js.undefined
  }
  object TreeContextProps {
    
    @scala.inline
    def apply(
      checkStrictly: Boolean,
      disabled: Boolean,
      draggable: Boolean,
      filterTreeNode: EventDataNode => Boolean,
      keyEntities: Record[Key, DataEntity],
      loadData: EventDataNode => js.Promise[Unit],
      onNodeCheck: (MouseEvent[HTMLSpanElement, NativeMouseEvent], EventDataNode, Boolean) => Unit,
      onNodeClick: (/* e */ MouseEvent[HTMLSpanElement, NativeMouseEvent], /* node */ EventDataNode) => Unit,
      onNodeContextMenu: (/* e */ MouseEvent[HTMLSpanElement, NativeMouseEvent], /* node */ EventDataNode) => Unit,
      onNodeDoubleClick: (/* e */ MouseEvent[HTMLSpanElement, NativeMouseEvent], /* node */ EventDataNode) => Unit,
      onNodeDragEnd: (/* e */ MouseEvent[HTMLDivElement, NativeMouseEvent], /* node */ NodeInstance) => Unit,
      onNodeDragEnter: (/* e */ MouseEvent[HTMLDivElement, NativeMouseEvent], /* node */ NodeInstance) => Unit,
      onNodeDragLeave: (/* e */ MouseEvent[HTMLDivElement, NativeMouseEvent], /* node */ NodeInstance) => Unit,
      onNodeDragOver: (/* e */ MouseEvent[HTMLDivElement, NativeMouseEvent], /* node */ NodeInstance) => Unit,
      onNodeDragStart: (/* e */ MouseEvent[HTMLDivElement, NativeMouseEvent], /* node */ NodeInstance) => Unit,
      onNodeDrop: (/* e */ MouseEvent[HTMLDivElement, NativeMouseEvent], /* node */ NodeInstance) => Unit,
      onNodeExpand: (/* e */ MouseEvent[HTMLSpanElement, NativeMouseEvent], /* node */ EventDataNode) => Unit,
      onNodeLoad: EventDataNode => Unit,
      onNodeMouseEnter: (/* e */ MouseEvent[HTMLSpanElement, NativeMouseEvent], /* node */ EventDataNode) => Unit,
      onNodeMouseLeave: (/* e */ MouseEvent[HTMLSpanElement, NativeMouseEvent], /* node */ EventDataNode) => Unit,
      onNodeSelect: (/* e */ MouseEvent[HTMLSpanElement, NativeMouseEvent], /* node */ EventDataNode) => Unit,
      prefixCls: String,
      selectable: Boolean,
      showIcon: Boolean
    ): TreeContextProps = {
      val __obj = js.Dynamic.literal(checkStrictly = checkStrictly.asInstanceOf[js.Any], disabled = disabled.asInstanceOf[js.Any], draggable = draggable.asInstanceOf[js.Any], filterTreeNode = js.Any.fromFunction1(filterTreeNode), keyEntities = keyEntities.asInstanceOf[js.Any], loadData = js.Any.fromFunction1(loadData), onNodeCheck = js.Any.fromFunction3(onNodeCheck), onNodeClick = js.Any.fromFunction2(onNodeClick), onNodeContextMenu = js.Any.fromFunction2(onNodeContextMenu), onNodeDoubleClick = js.Any.fromFunction2(onNodeDoubleClick), onNodeDragEnd = js.Any.fromFunction2(onNodeDragEnd), onNodeDragEnter = js.Any.fromFunction2(onNodeDragEnter), onNodeDragLeave = js.Any.fromFunction2(onNodeDragLeave), onNodeDragOver = js.Any.fromFunction2(onNodeDragOver), onNodeDragStart = js.Any.fromFunction2(onNodeDragStart), onNodeDrop = js.Any.fromFunction2(onNodeDrop), onNodeExpand = js.Any.fromFunction2(onNodeExpand), onNodeLoad = js.Any.fromFunction1(onNodeLoad), onNodeMouseEnter = js.Any.fromFunction2(onNodeMouseEnter), onNodeMouseLeave = js.Any.fromFunction2(onNodeMouseLeave), onNodeSelect = js.Any.fromFunction2(onNodeSelect), prefixCls = prefixCls.asInstanceOf[js.Any], selectable = selectable.asInstanceOf[js.Any], showIcon = showIcon.asInstanceOf[js.Any])
      __obj.asInstanceOf[TreeContextProps]
    }
    
    @scala.inline
    implicit class TreeContextPropsMutableBuilder[Self <: TreeContextProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCheckStrictly(value: Boolean): Self = StObject.set(x, "checkStrictly", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCheckable(value: Boolean | ReactNode): Self = StObject.set(x, "checkable", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCheckableUndefined: Self = StObject.set(x, "checkable", js.undefined)
      
      @scala.inline
      def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDraggable(value: Boolean): Self = StObject.set(x, "draggable", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFilterTreeNode(value: EventDataNode => Boolean): Self = StObject.set(x, "filterTreeNode", js.Any.fromFunction1(value))
      
      @scala.inline
      def setIcon(value: IconType): Self = StObject.set(x, "icon", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIconFunction1(value: /* props */ TreeNodeProps => ReactNode): Self = StObject.set(x, "icon", js.Any.fromFunction1(value))
      
      @scala.inline
      def setIconUndefined: Self = StObject.set(x, "icon", js.undefined)
      
      @scala.inline
      def setKeyEntities(value: Record[Key, DataEntity]): Self = StObject.set(x, "keyEntities", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLoadData(value: EventDataNode => js.Promise[Unit]): Self = StObject.set(x, "loadData", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnNodeCheck(value: (MouseEvent[HTMLSpanElement, NativeMouseEvent], EventDataNode, Boolean) => Unit): Self = StObject.set(x, "onNodeCheck", js.Any.fromFunction3(value))
      
      @scala.inline
      def setOnNodeClick(value: (/* e */ MouseEvent[HTMLSpanElement, NativeMouseEvent], /* node */ EventDataNode) => Unit): Self = StObject.set(x, "onNodeClick", js.Any.fromFunction2(value))
      
      @scala.inline
      def setOnNodeContextMenu(value: (/* e */ MouseEvent[HTMLSpanElement, NativeMouseEvent], /* node */ EventDataNode) => Unit): Self = StObject.set(x, "onNodeContextMenu", js.Any.fromFunction2(value))
      
      @scala.inline
      def setOnNodeDoubleClick(value: (/* e */ MouseEvent[HTMLSpanElement, NativeMouseEvent], /* node */ EventDataNode) => Unit): Self = StObject.set(x, "onNodeDoubleClick", js.Any.fromFunction2(value))
      
      @scala.inline
      def setOnNodeDragEnd(value: (/* e */ MouseEvent[HTMLDivElement, NativeMouseEvent], /* node */ NodeInstance) => Unit): Self = StObject.set(x, "onNodeDragEnd", js.Any.fromFunction2(value))
      
      @scala.inline
      def setOnNodeDragEnter(value: (/* e */ MouseEvent[HTMLDivElement, NativeMouseEvent], /* node */ NodeInstance) => Unit): Self = StObject.set(x, "onNodeDragEnter", js.Any.fromFunction2(value))
      
      @scala.inline
      def setOnNodeDragLeave(value: (/* e */ MouseEvent[HTMLDivElement, NativeMouseEvent], /* node */ NodeInstance) => Unit): Self = StObject.set(x, "onNodeDragLeave", js.Any.fromFunction2(value))
      
      @scala.inline
      def setOnNodeDragOver(value: (/* e */ MouseEvent[HTMLDivElement, NativeMouseEvent], /* node */ NodeInstance) => Unit): Self = StObject.set(x, "onNodeDragOver", js.Any.fromFunction2(value))
      
      @scala.inline
      def setOnNodeDragStart(value: (/* e */ MouseEvent[HTMLDivElement, NativeMouseEvent], /* node */ NodeInstance) => Unit): Self = StObject.set(x, "onNodeDragStart", js.Any.fromFunction2(value))
      
      @scala.inline
      def setOnNodeDrop(value: (/* e */ MouseEvent[HTMLDivElement, NativeMouseEvent], /* node */ NodeInstance) => Unit): Self = StObject.set(x, "onNodeDrop", js.Any.fromFunction2(value))
      
      @scala.inline
      def setOnNodeExpand(value: (/* e */ MouseEvent[HTMLSpanElement, NativeMouseEvent], /* node */ EventDataNode) => Unit): Self = StObject.set(x, "onNodeExpand", js.Any.fromFunction2(value))
      
      @scala.inline
      def setOnNodeLoad(value: EventDataNode => Unit): Self = StObject.set(x, "onNodeLoad", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnNodeMouseEnter(value: (/* e */ MouseEvent[HTMLSpanElement, NativeMouseEvent], /* node */ EventDataNode) => Unit): Self = StObject.set(x, "onNodeMouseEnter", js.Any.fromFunction2(value))
      
      @scala.inline
      def setOnNodeMouseLeave(value: (/* e */ MouseEvent[HTMLSpanElement, NativeMouseEvent], /* node */ EventDataNode) => Unit): Self = StObject.set(x, "onNodeMouseLeave", js.Any.fromFunction2(value))
      
      @scala.inline
      def setOnNodeSelect(value: (/* e */ MouseEvent[HTMLSpanElement, NativeMouseEvent], /* node */ EventDataNode) => Unit): Self = StObject.set(x, "onNodeSelect", js.Any.fromFunction2(value))
      
      @scala.inline
      def setPrefixCls(value: String): Self = StObject.set(x, "prefixCls", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSelectable(value: Boolean): Self = StObject.set(x, "selectable", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShowIcon(value: Boolean): Self = StObject.set(x, "showIcon", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSwitcherIcon(value: IconType): Self = StObject.set(x, "switcherIcon", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSwitcherIconFunction1(value: /* props */ TreeNodeProps => ReactNode): Self = StObject.set(x, "switcherIcon", js.Any.fromFunction1(value))
      
      @scala.inline
      def setSwitcherIconUndefined: Self = StObject.set(x, "switcherIcon", js.undefined)
      
      @scala.inline
      def setTitleRender(value: /* node */ DataNode => ReactNode): Self = StObject.set(x, "titleRender", js.Any.fromFunction1(value))
      
      @scala.inline
      def setTitleRenderUndefined: Self = StObject.set(x, "titleRender", js.undefined)
    }
  }
}
