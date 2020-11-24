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
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NodeRendererProps extends js.Object {
  
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
  implicit class NodeRendererPropsOps[Self <: NodeRendererProps] (val x: Self) extends AnyVal {
    
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
    def setCanDrag(value: Boolean): Self = this.set("canDrag", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConnectDragPreview(
      value: (/* elementOrNode */ ConnectableElement, /* options */ js.UndefOr[DragPreviewOptions]) => ReactElement | Null
    ): Self = this.set("connectDragPreview", js.Any.fromFunction2(value))
    
    @scala.inline
    def setConnectDragSource(
      value: (/* elementOrNode */ ConnectableElement, /* options */ js.UndefOr[DragSourceOptions]) => ReactElement | Null
    ): Self = this.set("connectDragSource", js.Any.fromFunction2(value))
    
    @scala.inline
    def setDidDrop(value: Boolean): Self = this.set("didDrop", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEndDrag(value: js.Any): Self = this.set("endDrag", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsDragging(value: Boolean): Self = this.set("isDragging", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsOver(value: Boolean): Self = this.set("isOver", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsSearchFocus(value: Boolean): Self = this.set("isSearchFocus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsSearchMatch(value: Boolean): Self = this.set("isSearchMatch", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setListIndex(value: Double): Self = this.set("listIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLowerSiblingCountsVarargs(value: Double*): Self = this.set("lowerSiblingCounts", js.Array(value :_*))
    
    @scala.inline
    def setLowerSiblingCounts(value: js.Array[Double]): Self = this.set("lowerSiblingCounts", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNode(value: TreeItem): Self = this.set("node", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPathVarargs(value: (String | Double)*): Self = this.set("path", js.Array(value :_*))
    
    @scala.inline
    def setPath(value: NumberOrStringArray): Self = this.set("path", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScaffoldBlockPxWidth(value: Double): Self = this.set("scaffoldBlockPxWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStartDrag(value: js.Any): Self = this.set("startDrag", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTreeId(value: String): Self = this.set("treeId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTreeIndex(value: Double): Self = this.set("treeIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setButtonsVarargs(value: Element*): Self = this.set("buttons", js.Array(value :_*))
    
    @scala.inline
    def setButtons(value: js.Array[Element]): Self = this.set("buttons", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteButtons: Self = this.set("buttons", js.undefined)
    
    @scala.inline
    def setCanDrop(value: Boolean): Self = this.set("canDrop", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCanDrop: Self = this.set("canDrop", js.undefined)
    
    @scala.inline
    def setClassName(value: String): Self = this.set("className", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClassName: Self = this.set("className", js.undefined)
    
    @scala.inline
    def setDraggedNode(value: TreeItem): Self = this.set("draggedNode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDraggedNode: Self = this.set("draggedNode", js.undefined)
    
    @scala.inline
    def setIconsVarargs(value: Element*): Self = this.set("icons", js.Array(value :_*))
    
    @scala.inline
    def setIcons(value: js.Array[Element]): Self = this.set("icons", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIcons: Self = this.set("icons", js.undefined)
    
    @scala.inline
    def setParentNode(value: TreeItem): Self = this.set("parentNode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteParentNode: Self = this.set("parentNode", js.undefined)
    
    @scala.inline
    def setRowDirection(value: ltr | rtl): Self = this.set("rowDirection", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRowDirection: Self = this.set("rowDirection", js.undefined)
    
    @scala.inline
    def setStyle(value: CSSProperties): Self = this.set("style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStyle: Self = this.set("style", js.undefined)
    
    @scala.inline
    def setSubtitle(value: /* data */ NodeData => Element): Self = this.set("subtitle", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteSubtitle: Self = this.set("subtitle", js.undefined)
    
    @scala.inline
    def setSwapDepth(value: Double): Self = this.set("swapDepth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSwapDepth: Self = this.set("swapDepth", js.undefined)
    
    @scala.inline
    def setSwapFrom(value: Double): Self = this.set("swapFrom", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSwapFrom: Self = this.set("swapFrom", js.undefined)
    
    @scala.inline
    def setSwapLength(value: Double): Self = this.set("swapLength", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSwapLength: Self = this.set("swapLength", js.undefined)
    
    @scala.inline
    def setTitle(value: /* data */ NodeData => Element): Self = this.set("title", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteTitle: Self = this.set("title", js.undefined)
    
    @scala.inline
    def setToggleChildrenVisibility(value: /* data */ NodeData => Unit): Self = this.set("toggleChildrenVisibility", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteToggleChildrenVisibility: Self = this.set("toggleChildrenVisibility", js.undefined)
  }
}
