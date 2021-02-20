package typings.reactSortableTree.mod

import typings.react.mod.CSSProperties
import typings.react.mod.ReactElement
import typings.react.mod.global.JSX.Element
import typings.reactDnd.connectorsMod.ConnectDragPreview
import typings.reactDnd.connectorsMod.ConnectDragSource
import typings.reactDnd.connectorsMod.ConnectableElement
import typings.reactDnd.optionsMod.DragPreviewOptions
import typings.reactDnd.optionsMod.DragSourceOptions
import typings.reactSortableTree.reactSortableTreeStrings.ltr
import typings.reactSortableTree.reactSortableTreeStrings.rtl
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NodeRendererProps extends StObject {
  
  var buttons: js.UndefOr[js.Array[Element]] = js.native
  
  var canDrag: Boolean = js.native
  
  var canDrop: js.UndefOr[Boolean] = js.native
  
  var className: js.UndefOr[String] = js.native
  
  var connectDragPreview: ConnectDragPreview = js.native
  
  var connectDragSource: ConnectDragSource = js.native
  
  var didDrop: Boolean = js.native
  
  var draggedNode: js.UndefOr[TreeItem] = js.native
  
  var endDrag: js.Any = js.native
  
  var icons: js.UndefOr[js.Array[Element]] = js.native
  
  var isDragging: Boolean = js.native
  
  var isOver: Boolean = js.native
  
  var isSearchFocus: Boolean = js.native
  
  var isSearchMatch: Boolean = js.native
  
  var listIndex: Double = js.native
  
  var lowerSiblingCounts: js.Array[Double] = js.native
  
  var node: TreeItem = js.native
  
  var parentNode: js.UndefOr[TreeItem] = js.native
  
  var path: NumberOrStringArray = js.native
  
  var rowDirection: js.UndefOr[ltr | rtl] = js.native
  
  var scaffoldBlockPxWidth: Double = js.native
  
  var startDrag: js.Any = js.native
  
  var style: js.UndefOr[CSSProperties] = js.native
  
  var subtitle: js.UndefOr[js.Function1[/* data */ NodeData, Element]] = js.native
  
  var swapDepth: js.UndefOr[Double] = js.native
  
  var swapFrom: js.UndefOr[Double] = js.native
  
  var swapLength: js.UndefOr[Double] = js.native
  
  var title: js.UndefOr[js.Function1[/* data */ NodeData, Element]] = js.native
  
  var toggleChildrenVisibility: js.UndefOr[js.Function1[/* data */ NodeData, Unit]] = js.native
  
  var treeId: String = js.native
  
  var treeIndex: Double = js.native
}
object NodeRendererProps {
  
  @scala.inline
  def apply(
    canDrag: Boolean,
    connectDragPreview: (/* elementOrNode */ ConnectableElement, /* options */ js.UndefOr[DragPreviewOptions]) => ReactElement | Null,
    connectDragSource: (/* elementOrNode */ ConnectableElement, /* options */ js.UndefOr[DragSourceOptions]) => ReactElement | Null,
    didDrop: Boolean,
    endDrag: js.Any,
    isDragging: Boolean,
    isOver: Boolean,
    isSearchFocus: Boolean,
    isSearchMatch: Boolean,
    listIndex: Double,
    lowerSiblingCounts: js.Array[Double],
    node: TreeItem,
    path: NumberOrStringArray,
    scaffoldBlockPxWidth: Double,
    startDrag: js.Any,
    treeId: String,
    treeIndex: Double
  ): NodeRendererProps = {
    val __obj = js.Dynamic.literal(canDrag = canDrag.asInstanceOf[js.Any], connectDragPreview = js.Any.fromFunction2(connectDragPreview), connectDragSource = js.Any.fromFunction2(connectDragSource), didDrop = didDrop.asInstanceOf[js.Any], endDrag = endDrag.asInstanceOf[js.Any], isDragging = isDragging.asInstanceOf[js.Any], isOver = isOver.asInstanceOf[js.Any], isSearchFocus = isSearchFocus.asInstanceOf[js.Any], isSearchMatch = isSearchMatch.asInstanceOf[js.Any], listIndex = listIndex.asInstanceOf[js.Any], lowerSiblingCounts = lowerSiblingCounts.asInstanceOf[js.Any], node = node.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], scaffoldBlockPxWidth = scaffoldBlockPxWidth.asInstanceOf[js.Any], startDrag = startDrag.asInstanceOf[js.Any], treeId = treeId.asInstanceOf[js.Any], treeIndex = treeIndex.asInstanceOf[js.Any])
    __obj.asInstanceOf[NodeRendererProps]
  }
  
  @scala.inline
  implicit class NodeRendererPropsMutableBuilder[Self <: NodeRendererProps] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setButtons(value: js.Array[Element]): Self = StObject.set(x, "buttons", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setButtonsUndefined: Self = StObject.set(x, "buttons", js.undefined)
    
    @scala.inline
    def setButtonsVarargs(value: Element*): Self = StObject.set(x, "buttons", js.Array(value :_*))
    
    @scala.inline
    def setCanDrag(value: Boolean): Self = StObject.set(x, "canDrag", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCanDrop(value: Boolean): Self = StObject.set(x, "canDrop", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCanDropUndefined: Self = StObject.set(x, "canDrop", js.undefined)
    
    @scala.inline
    def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
    
    @scala.inline
    def setConnectDragPreview(
      value: (/* elementOrNode */ ConnectableElement, /* options */ js.UndefOr[DragPreviewOptions]) => ReactElement | Null
    ): Self = StObject.set(x, "connectDragPreview", js.Any.fromFunction2(value))
    
    @scala.inline
    def setConnectDragSource(
      value: (/* elementOrNode */ ConnectableElement, /* options */ js.UndefOr[DragSourceOptions]) => ReactElement | Null
    ): Self = StObject.set(x, "connectDragSource", js.Any.fromFunction2(value))
    
    @scala.inline
    def setDidDrop(value: Boolean): Self = StObject.set(x, "didDrop", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDraggedNode(value: TreeItem): Self = StObject.set(x, "draggedNode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDraggedNodeUndefined: Self = StObject.set(x, "draggedNode", js.undefined)
    
    @scala.inline
    def setEndDrag(value: js.Any): Self = StObject.set(x, "endDrag", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIcons(value: js.Array[Element]): Self = StObject.set(x, "icons", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIconsUndefined: Self = StObject.set(x, "icons", js.undefined)
    
    @scala.inline
    def setIconsVarargs(value: Element*): Self = StObject.set(x, "icons", js.Array(value :_*))
    
    @scala.inline
    def setIsDragging(value: Boolean): Self = StObject.set(x, "isDragging", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsOver(value: Boolean): Self = StObject.set(x, "isOver", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsSearchFocus(value: Boolean): Self = StObject.set(x, "isSearchFocus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsSearchMatch(value: Boolean): Self = StObject.set(x, "isSearchMatch", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setListIndex(value: Double): Self = StObject.set(x, "listIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLowerSiblingCounts(value: js.Array[Double]): Self = StObject.set(x, "lowerSiblingCounts", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLowerSiblingCountsVarargs(value: Double*): Self = StObject.set(x, "lowerSiblingCounts", js.Array(value :_*))
    
    @scala.inline
    def setNode(value: TreeItem): Self = StObject.set(x, "node", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParentNode(value: TreeItem): Self = StObject.set(x, "parentNode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParentNodeUndefined: Self = StObject.set(x, "parentNode", js.undefined)
    
    @scala.inline
    def setPath(value: NumberOrStringArray): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPathVarargs(value: (String | Double)*): Self = StObject.set(x, "path", js.Array(value :_*))
    
    @scala.inline
    def setRowDirection(value: ltr | rtl): Self = StObject.set(x, "rowDirection", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRowDirectionUndefined: Self = StObject.set(x, "rowDirection", js.undefined)
    
    @scala.inline
    def setScaffoldBlockPxWidth(value: Double): Self = StObject.set(x, "scaffoldBlockPxWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStartDrag(value: js.Any): Self = StObject.set(x, "startDrag", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStyle(value: CSSProperties): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    
    @scala.inline
    def setSubtitle(value: /* data */ NodeData => Element): Self = StObject.set(x, "subtitle", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSubtitleUndefined: Self = StObject.set(x, "subtitle", js.undefined)
    
    @scala.inline
    def setSwapDepth(value: Double): Self = StObject.set(x, "swapDepth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSwapDepthUndefined: Self = StObject.set(x, "swapDepth", js.undefined)
    
    @scala.inline
    def setSwapFrom(value: Double): Self = StObject.set(x, "swapFrom", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSwapFromUndefined: Self = StObject.set(x, "swapFrom", js.undefined)
    
    @scala.inline
    def setSwapLength(value: Double): Self = StObject.set(x, "swapLength", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSwapLengthUndefined: Self = StObject.set(x, "swapLength", js.undefined)
    
    @scala.inline
    def setTitle(value: /* data */ NodeData => Element): Self = StObject.set(x, "title", js.Any.fromFunction1(value))
    
    @scala.inline
    def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    
    @scala.inline
    def setToggleChildrenVisibility(value: /* data */ NodeData => Unit): Self = StObject.set(x, "toggleChildrenVisibility", js.Any.fromFunction1(value))
    
    @scala.inline
    def setToggleChildrenVisibilityUndefined: Self = StObject.set(x, "toggleChildrenVisibility", js.undefined)
    
    @scala.inline
    def setTreeId(value: String): Self = StObject.set(x, "treeId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTreeIndex(value: Double): Self = StObject.set(x, "treeIndex", value.asInstanceOf[js.Any])
  }
}
