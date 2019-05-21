package typings
package reactDashSortableDashTreeLib.reactDashSortableDashTreeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NodeRendererProps extends js.Object {
  var buttons: js.UndefOr[js.Array[reactLib.reactMod.Global.JSXNs.Element]] = js.undefined
  var canDrag: scala.Boolean
  var canDrop: js.UndefOr[scala.Boolean] = js.undefined
  var className: js.UndefOr[java.lang.String] = js.undefined
  var connectDragPreview: reactDashDndLib.libCjsInterfacesClassApiMod.ConnectDragPreview
  var connectDragSource: reactDashDndLib.libCjsInterfacesClassApiMod.ConnectDragSource
  var didDrop: scala.Boolean
  var draggedNode: js.UndefOr[TreeItem] = js.undefined
  var endDrag: js.Any
  var icons: js.UndefOr[js.Array[reactLib.reactMod.Global.JSXNs.Element]] = js.undefined
  var isDragging: scala.Boolean
  var isOver: scala.Boolean
  var isSearchFocus: scala.Boolean
  var isSearchMatch: scala.Boolean
  var listIndex: scala.Double
  var lowerSiblingCounts: js.Array[scala.Double]
  var node: TreeItem
  var parentNode: js.UndefOr[TreeItem] = js.undefined
  var path: reactDashSortableDashTreeLib.NumberOrStringArray
  var scaffoldBlockPxWidth: scala.Double
  var startDrag: js.Any
  var style: js.UndefOr[reactLib.reactMod.CSSProperties] = js.undefined
  var subtitle: js.UndefOr[js.Function1[/* data */ NodeData, reactLib.reactMod.Global.JSXNs.Element]] = js.undefined
  var swapDepth: js.UndefOr[scala.Double] = js.undefined
  var swapFrom: js.UndefOr[scala.Double] = js.undefined
  var swapLength: js.UndefOr[scala.Double] = js.undefined
  var title: js.UndefOr[js.Function1[/* data */ NodeData, reactLib.reactMod.Global.JSXNs.Element]] = js.undefined
  var toggleChildrenVisibility: js.UndefOr[js.Function1[/* data */ NodeData, scala.Unit]] = js.undefined
  var treeId: java.lang.String
  var treeIndex: scala.Double
}

object NodeRendererProps {
  @scala.inline
  def apply(
    canDrag: scala.Boolean,
    connectDragPreview: reactDashDndLib.libCjsInterfacesClassApiMod.ConnectDragPreview,
    connectDragSource: reactDashDndLib.libCjsInterfacesClassApiMod.ConnectDragSource,
    didDrop: scala.Boolean,
    endDrag: js.Any,
    isDragging: scala.Boolean,
    isOver: scala.Boolean,
    isSearchFocus: scala.Boolean,
    isSearchMatch: scala.Boolean,
    listIndex: scala.Double,
    lowerSiblingCounts: js.Array[scala.Double],
    node: TreeItem,
    path: reactDashSortableDashTreeLib.NumberOrStringArray,
    scaffoldBlockPxWidth: scala.Double,
    startDrag: js.Any,
    treeId: java.lang.String,
    treeIndex: scala.Double,
    buttons: js.Array[reactLib.reactMod.Global.JSXNs.Element] = null,
    canDrop: js.UndefOr[scala.Boolean] = js.undefined,
    className: java.lang.String = null,
    draggedNode: TreeItem = null,
    icons: js.Array[reactLib.reactMod.Global.JSXNs.Element] = null,
    parentNode: TreeItem = null,
    style: reactLib.reactMod.CSSProperties = null,
    subtitle: /* data */ NodeData => reactLib.reactMod.Global.JSXNs.Element = null,
    swapDepth: scala.Int | scala.Double = null,
    swapFrom: scala.Int | scala.Double = null,
    swapLength: scala.Int | scala.Double = null,
    title: /* data */ NodeData => reactLib.reactMod.Global.JSXNs.Element = null,
    toggleChildrenVisibility: /* data */ NodeData => scala.Unit = null
  ): NodeRendererProps = {
    val __obj = js.Dynamic.literal(canDrag = canDrag, connectDragPreview = connectDragPreview, connectDragSource = connectDragSource, didDrop = didDrop, endDrag = endDrag, isDragging = isDragging, isOver = isOver, isSearchFocus = isSearchFocus, isSearchMatch = isSearchMatch, listIndex = listIndex, lowerSiblingCounts = lowerSiblingCounts, node = node, path = path, scaffoldBlockPxWidth = scaffoldBlockPxWidth, startDrag = startDrag, treeId = treeId, treeIndex = treeIndex)
    if (buttons != null) __obj.updateDynamic("buttons")(buttons)
    if (!js.isUndefined(canDrop)) __obj.updateDynamic("canDrop")(canDrop)
    if (className != null) __obj.updateDynamic("className")(className)
    if (draggedNode != null) __obj.updateDynamic("draggedNode")(draggedNode)
    if (icons != null) __obj.updateDynamic("icons")(icons)
    if (parentNode != null) __obj.updateDynamic("parentNode")(parentNode)
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

