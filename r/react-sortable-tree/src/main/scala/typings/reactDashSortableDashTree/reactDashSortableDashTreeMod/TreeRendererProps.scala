package typings.reactDashSortableDashTree.reactDashSortableDashTreeMod

import typings.react.reactMod.CSSProperties
import typings.react.reactMod.Global.JSX.Element
import typings.react.reactMod.ReactElement
import typings.reactDashDnd.libInterfacesConnectorsMod.ConnectDropTarget
import typings.reactDashDnd.libInterfacesConnectorsMod.ConnectableElement
import typings.reactDashSortableDashTree.NumberOrStringArray
import typings.reactDashSortableDashTree.reactDashSortableDashTreeStrings.ltr
import typings.reactDashSortableDashTree.reactDashSortableDashTreeStrings.rtl
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TreeRendererProps extends js.Object {
  var canDrop: js.UndefOr[Boolean] = js.undefined
  var children: js.Array[Element]
  // Drop target
  var connectDropTarget: ConnectDropTarget
  var draggedNode: js.UndefOr[TreeItem] = js.undefined
  var isOver: Boolean
  var listIndex: Double
  var lowerSiblingCounts: js.Array[Double]
  var node: TreeItem
  var path: NumberOrStringArray
  var rowDirection: js.UndefOr[ltr | rtl] = js.undefined
  var scaffoldBlockPxWidth: Double
  var style: js.UndefOr[CSSProperties] = js.undefined
  var swapDepth: js.UndefOr[Double] = js.undefined
  var swapFrom: js.UndefOr[Double] = js.undefined
  var swapLength: js.UndefOr[Double] = js.undefined
  var treeId: String
  var treeIndex: Double
  // used in dndManager
  def getPrevRow(): FlatDataItem | Null
}

object TreeRendererProps {
  @scala.inline
  def apply(
    children: js.Array[Element],
    connectDropTarget: (/* elementOrNode */ ConnectableElement, /* options */ js.UndefOr[js.Any]) => ReactElement | Null,
    getPrevRow: () => FlatDataItem | Null,
    isOver: Boolean,
    listIndex: Double,
    lowerSiblingCounts: js.Array[Double],
    node: TreeItem,
    path: NumberOrStringArray,
    scaffoldBlockPxWidth: Double,
    treeId: String,
    treeIndex: Double,
    canDrop: js.UndefOr[Boolean] = js.undefined,
    draggedNode: TreeItem = null,
    rowDirection: ltr | rtl = null,
    style: CSSProperties = null,
    swapDepth: Int | Double = null,
    swapFrom: Int | Double = null,
    swapLength: Int | Double = null
  ): TreeRendererProps = {
    val __obj = js.Dynamic.literal(children = children, connectDropTarget = js.Any.fromFunction2(connectDropTarget), getPrevRow = js.Any.fromFunction0(getPrevRow), isOver = isOver, listIndex = listIndex, lowerSiblingCounts = lowerSiblingCounts, node = node, path = path, scaffoldBlockPxWidth = scaffoldBlockPxWidth, treeId = treeId, treeIndex = treeIndex)
    if (!js.isUndefined(canDrop)) __obj.updateDynamic("canDrop")(canDrop)
    if (draggedNode != null) __obj.updateDynamic("draggedNode")(draggedNode)
    if (rowDirection != null) __obj.updateDynamic("rowDirection")(rowDirection.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style)
    if (swapDepth != null) __obj.updateDynamic("swapDepth")(swapDepth.asInstanceOf[js.Any])
    if (swapFrom != null) __obj.updateDynamic("swapFrom")(swapFrom.asInstanceOf[js.Any])
    if (swapLength != null) __obj.updateDynamic("swapLength")(swapLength.asInstanceOf[js.Any])
    __obj.asInstanceOf[TreeRendererProps]
  }
}

