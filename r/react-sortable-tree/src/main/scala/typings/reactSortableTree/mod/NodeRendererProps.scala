package typings.reactSortableTree.mod

import typings.react.mod.CSSProperties
import typings.react.mod.ReactElement
import typings.react.mod.global.JSX.Element
import typings.reactDnd.distTypesConnectorsMod.ConnectDragPreview
import typings.reactDnd.distTypesConnectorsMod.ConnectDragSource
import typings.reactDnd.distTypesConnectorsMod.ConnectableElement
import typings.reactDnd.distTypesOptionsMod.DragPreviewOptions
import typings.reactDnd.distTypesOptionsMod.DragSourceOptions
import typings.reactSortableTree.reactSortableTreeStrings.ltr
import typings.reactSortableTree.reactSortableTreeStrings.rtl
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NodeRendererProps[T] extends StObject {
  
  var buttons: js.UndefOr[js.Array[Element]] = js.undefined
  
  var canDrag: Boolean
  
  var canDrop: js.UndefOr[Boolean] = js.undefined
  
  var className: js.UndefOr[String] = js.undefined
  
  var connectDragPreview: ConnectDragPreview
  
  var connectDragSource: ConnectDragSource
  
  var didDrop: Boolean
  
  var draggedNode: js.UndefOr[TreeItem[T]] = js.undefined
  
  var endDrag: Any
  
  var icons: js.UndefOr[js.Array[Element]] = js.undefined
  
  var isDragging: Boolean
  
  var isOver: Boolean
  
  var isSearchFocus: Boolean
  
  var isSearchMatch: Boolean
  
  var listIndex: Double
  
  var lowerSiblingCounts: js.Array[Double]
  
  var node: TreeItem[T]
  
  var parentNode: js.UndefOr[TreeItem[T]] = js.undefined
  
  var path: NumberOrStringArray
  
  var rowDirection: js.UndefOr[ltr | rtl] = js.undefined
  
  var scaffoldBlockPxWidth: Double
  
  var startDrag: Any
  
  var style: js.UndefOr[CSSProperties] = js.undefined
  
  var subtitle: js.UndefOr[js.Function1[/* data */ NodeData[T], Element]] = js.undefined
  
  var swapDepth: js.UndefOr[Double] = js.undefined
  
  var swapFrom: js.UndefOr[Double] = js.undefined
  
  var swapLength: js.UndefOr[Double] = js.undefined
  
  var title: js.UndefOr[js.Function1[/* data */ NodeData[T], Element]] = js.undefined
  
  var toggleChildrenVisibility: js.UndefOr[js.Function1[/* data */ NodeData[T], Unit]] = js.undefined
  
  var treeId: String
  
  var treeIndex: Double
}
object NodeRendererProps {
  
  inline def apply[T](
    canDrag: Boolean,
    connectDragPreview: (/* elementOrNode */ ConnectableElement, /* options */ js.UndefOr[DragPreviewOptions]) => ReactElement | Null,
    connectDragSource: (/* elementOrNode */ ConnectableElement, /* options */ js.UndefOr[DragSourceOptions]) => ReactElement | Null,
    didDrop: Boolean,
    endDrag: Any,
    isDragging: Boolean,
    isOver: Boolean,
    isSearchFocus: Boolean,
    isSearchMatch: Boolean,
    listIndex: Double,
    lowerSiblingCounts: js.Array[Double],
    node: TreeItem[T],
    path: NumberOrStringArray,
    scaffoldBlockPxWidth: Double,
    startDrag: Any,
    treeId: String,
    treeIndex: Double
  ): NodeRendererProps[T] = {
    val __obj = js.Dynamic.literal(canDrag = canDrag.asInstanceOf[js.Any], connectDragPreview = js.Any.fromFunction2(connectDragPreview), connectDragSource = js.Any.fromFunction2(connectDragSource), didDrop = didDrop.asInstanceOf[js.Any], endDrag = endDrag.asInstanceOf[js.Any], isDragging = isDragging.asInstanceOf[js.Any], isOver = isOver.asInstanceOf[js.Any], isSearchFocus = isSearchFocus.asInstanceOf[js.Any], isSearchMatch = isSearchMatch.asInstanceOf[js.Any], listIndex = listIndex.asInstanceOf[js.Any], lowerSiblingCounts = lowerSiblingCounts.asInstanceOf[js.Any], node = node.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], scaffoldBlockPxWidth = scaffoldBlockPxWidth.asInstanceOf[js.Any], startDrag = startDrag.asInstanceOf[js.Any], treeId = treeId.asInstanceOf[js.Any], treeIndex = treeIndex.asInstanceOf[js.Any])
    __obj.asInstanceOf[NodeRendererProps[T]]
  }
  
  extension [Self <: NodeRendererProps[?], T](x: Self & NodeRendererProps[T]) {
    
    inline def setButtons(value: js.Array[Element]): Self = StObject.set(x, "buttons", value.asInstanceOf[js.Any])
    
    inline def setButtonsUndefined: Self = StObject.set(x, "buttons", js.undefined)
    
    inline def setButtonsVarargs(value: Element*): Self = StObject.set(x, "buttons", js.Array(value*))
    
    inline def setCanDrag(value: Boolean): Self = StObject.set(x, "canDrag", value.asInstanceOf[js.Any])
    
    inline def setCanDrop(value: Boolean): Self = StObject.set(x, "canDrop", value.asInstanceOf[js.Any])
    
    inline def setCanDropUndefined: Self = StObject.set(x, "canDrop", js.undefined)
    
    inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
    
    inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
    
    inline def setConnectDragPreview(
      value: (/* elementOrNode */ ConnectableElement, /* options */ js.UndefOr[DragPreviewOptions]) => ReactElement | Null
    ): Self = StObject.set(x, "connectDragPreview", js.Any.fromFunction2(value))
    
    inline def setConnectDragSource(
      value: (/* elementOrNode */ ConnectableElement, /* options */ js.UndefOr[DragSourceOptions]) => ReactElement | Null
    ): Self = StObject.set(x, "connectDragSource", js.Any.fromFunction2(value))
    
    inline def setDidDrop(value: Boolean): Self = StObject.set(x, "didDrop", value.asInstanceOf[js.Any])
    
    inline def setDraggedNode(value: TreeItem[T]): Self = StObject.set(x, "draggedNode", value.asInstanceOf[js.Any])
    
    inline def setDraggedNodeUndefined: Self = StObject.set(x, "draggedNode", js.undefined)
    
    inline def setEndDrag(value: Any): Self = StObject.set(x, "endDrag", value.asInstanceOf[js.Any])
    
    inline def setIcons(value: js.Array[Element]): Self = StObject.set(x, "icons", value.asInstanceOf[js.Any])
    
    inline def setIconsUndefined: Self = StObject.set(x, "icons", js.undefined)
    
    inline def setIconsVarargs(value: Element*): Self = StObject.set(x, "icons", js.Array(value*))
    
    inline def setIsDragging(value: Boolean): Self = StObject.set(x, "isDragging", value.asInstanceOf[js.Any])
    
    inline def setIsOver(value: Boolean): Self = StObject.set(x, "isOver", value.asInstanceOf[js.Any])
    
    inline def setIsSearchFocus(value: Boolean): Self = StObject.set(x, "isSearchFocus", value.asInstanceOf[js.Any])
    
    inline def setIsSearchMatch(value: Boolean): Self = StObject.set(x, "isSearchMatch", value.asInstanceOf[js.Any])
    
    inline def setListIndex(value: Double): Self = StObject.set(x, "listIndex", value.asInstanceOf[js.Any])
    
    inline def setLowerSiblingCounts(value: js.Array[Double]): Self = StObject.set(x, "lowerSiblingCounts", value.asInstanceOf[js.Any])
    
    inline def setLowerSiblingCountsVarargs(value: Double*): Self = StObject.set(x, "lowerSiblingCounts", js.Array(value*))
    
    inline def setNode(value: TreeItem[T]): Self = StObject.set(x, "node", value.asInstanceOf[js.Any])
    
    inline def setParentNode(value: TreeItem[T]): Self = StObject.set(x, "parentNode", value.asInstanceOf[js.Any])
    
    inline def setParentNodeUndefined: Self = StObject.set(x, "parentNode", js.undefined)
    
    inline def setPath(value: NumberOrStringArray): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setPathVarargs(value: (String | Double)*): Self = StObject.set(x, "path", js.Array(value*))
    
    inline def setRowDirection(value: ltr | rtl): Self = StObject.set(x, "rowDirection", value.asInstanceOf[js.Any])
    
    inline def setRowDirectionUndefined: Self = StObject.set(x, "rowDirection", js.undefined)
    
    inline def setScaffoldBlockPxWidth(value: Double): Self = StObject.set(x, "scaffoldBlockPxWidth", value.asInstanceOf[js.Any])
    
    inline def setStartDrag(value: Any): Self = StObject.set(x, "startDrag", value.asInstanceOf[js.Any])
    
    inline def setStyle(value: CSSProperties): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
    
    inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    
    inline def setSubtitle(value: /* data */ NodeData[T] => Element): Self = StObject.set(x, "subtitle", js.Any.fromFunction1(value))
    
    inline def setSubtitleUndefined: Self = StObject.set(x, "subtitle", js.undefined)
    
    inline def setSwapDepth(value: Double): Self = StObject.set(x, "swapDepth", value.asInstanceOf[js.Any])
    
    inline def setSwapDepthUndefined: Self = StObject.set(x, "swapDepth", js.undefined)
    
    inline def setSwapFrom(value: Double): Self = StObject.set(x, "swapFrom", value.asInstanceOf[js.Any])
    
    inline def setSwapFromUndefined: Self = StObject.set(x, "swapFrom", js.undefined)
    
    inline def setSwapLength(value: Double): Self = StObject.set(x, "swapLength", value.asInstanceOf[js.Any])
    
    inline def setSwapLengthUndefined: Self = StObject.set(x, "swapLength", js.undefined)
    
    inline def setTitle(value: /* data */ NodeData[T] => Element): Self = StObject.set(x, "title", js.Any.fromFunction1(value))
    
    inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    
    inline def setToggleChildrenVisibility(value: /* data */ NodeData[T] => Unit): Self = StObject.set(x, "toggleChildrenVisibility", js.Any.fromFunction1(value))
    
    inline def setToggleChildrenVisibilityUndefined: Self = StObject.set(x, "toggleChildrenVisibility", js.undefined)
    
    inline def setTreeId(value: String): Self = StObject.set(x, "treeId", value.asInstanceOf[js.Any])
    
    inline def setTreeIndex(value: Double): Self = StObject.set(x, "treeIndex", value.asInstanceOf[js.Any])
  }
}
