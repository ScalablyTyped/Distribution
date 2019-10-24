package typings.reactDashSortableDashTree.reactDashSortableDashTreeMod

import typings.react.reactMod.CSSProperties
import typings.react.reactMod._Global_.JSX.Element
import typings.reactDashSortableDashTree.NumberOrStringArray
import typings.reactDashSortableDashTree.reactDashSortableDashTreeStrings.ltr
import typings.reactDashSortableDashTree.reactDashSortableDashTreeStrings.rtl
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NodeRendererProps extends js.Object {
  var buttons: js.UndefOr[js.Array[Element]] = js.undefined
  var canDrag: Boolean
  var canDrop: js.UndefOr[Boolean] = js.undefined
  var className: js.UndefOr[String] = js.undefined
  var connectDragPreview: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify ConnectDragPreview */ js.Any
  var connectDragSource: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify ConnectDragSource */ js.Any
  var didDrop: Boolean
  var draggedNode: js.UndefOr[TreeItem] = js.undefined
  var endDrag: js.Any
  var icons: js.UndefOr[js.Array[Element]] = js.undefined
  var isDragging: Boolean
  var isOver: Boolean
  var isSearchFocus: Boolean
  var isSearchMatch: Boolean
  var listIndex: Double
  var lowerSiblingCounts: js.Array[Double]
  var node: TreeItem
  var parentNode: js.UndefOr[TreeItem] = js.undefined
  var path: NumberOrStringArray
  var rowDirection: js.UndefOr[ltr | rtl] = js.undefined
  var scaffoldBlockPxWidth: Double
  var startDrag: js.Any
  var style: js.UndefOr[CSSProperties] = js.undefined
  var subtitle: js.UndefOr[js.Function1[/* data */ NodeData, Element]] = js.undefined
  var swapDepth: js.UndefOr[Double] = js.undefined
  var swapFrom: js.UndefOr[Double] = js.undefined
  var swapLength: js.UndefOr[Double] = js.undefined
  var title: js.UndefOr[js.Function1[/* data */ NodeData, Element]] = js.undefined
  var toggleChildrenVisibility: js.UndefOr[js.Function1[/* data */ NodeData, Unit]] = js.undefined
  var treeId: String
  var treeIndex: Double
}

object NodeRendererProps {
  @scala.inline
  def apply(
    canDrag: Boolean,
    connectDragPreview: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify ConnectDragPreview */ js.Any,
    connectDragSource: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify ConnectDragSource */ js.Any,
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
    treeIndex: Double,
    buttons: js.Array[Element] = null,
    canDrop: js.UndefOr[Boolean] = js.undefined,
    className: String = null,
    draggedNode: TreeItem = null,
    icons: js.Array[Element] = null,
    parentNode: TreeItem = null,
    rowDirection: ltr | rtl = null,
    style: CSSProperties = null,
    subtitle: /* data */ NodeData => Element = null,
    swapDepth: Int | Double = null,
    swapFrom: Int | Double = null,
    swapLength: Int | Double = null,
    title: /* data */ NodeData => Element = null,
    toggleChildrenVisibility: /* data */ NodeData => Unit = null
  ): NodeRendererProps = {
    val __obj = js.Dynamic.literal(canDrag = canDrag, connectDragPreview = connectDragPreview, connectDragSource = connectDragSource, didDrop = didDrop, endDrag = endDrag, isDragging = isDragging, isOver = isOver, isSearchFocus = isSearchFocus, isSearchMatch = isSearchMatch, listIndex = listIndex, lowerSiblingCounts = lowerSiblingCounts, node = node, path = path, scaffoldBlockPxWidth = scaffoldBlockPxWidth, startDrag = startDrag, treeId = treeId, treeIndex = treeIndex)
    if (buttons != null) __obj.updateDynamic("buttons")(buttons)
    if (!js.isUndefined(canDrop)) __obj.updateDynamic("canDrop")(canDrop)
    if (className != null) __obj.updateDynamic("className")(className)
    if (draggedNode != null) __obj.updateDynamic("draggedNode")(draggedNode)
    if (icons != null) __obj.updateDynamic("icons")(icons)
    if (parentNode != null) __obj.updateDynamic("parentNode")(parentNode)
    if (rowDirection != null) __obj.updateDynamic("rowDirection")(rowDirection.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style)
    if (subtitle != null) __obj.updateDynamic("subtitle")(js.Any.fromFunction1(subtitle))
    if (swapDepth != null) __obj.updateDynamic("swapDepth")(swapDepth.asInstanceOf[js.Any])
    if (swapFrom != null) __obj.updateDynamic("swapFrom")(swapFrom.asInstanceOf[js.Any])
    if (swapLength != null) __obj.updateDynamic("swapLength")(swapLength.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(js.Any.fromFunction1(title))
    if (toggleChildrenVisibility != null) __obj.updateDynamic("toggleChildrenVisibility")(js.Any.fromFunction1(toggleChildrenVisibility))
    __obj.asInstanceOf[NodeRendererProps]
  }
}

