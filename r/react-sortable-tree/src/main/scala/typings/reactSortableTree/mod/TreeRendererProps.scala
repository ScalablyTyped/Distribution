package typings.reactSortableTree.mod

import typings.react.mod.CSSProperties
import typings.react.mod.ReactElement
import typings.react.mod.global.JSX.Element
import typings.reactDnd.connectorsMod.ConnectDropTarget
import typings.reactDnd.connectorsMod.ConnectableElement
import typings.reactSortableTree.reactSortableTreeStrings.ltr
import typings.reactSortableTree.reactSortableTreeStrings.rtl
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
    swapDepth: js.UndefOr[Double] = js.undefined,
    swapFrom: js.UndefOr[Double] = js.undefined,
    swapLength: js.UndefOr[Double] = js.undefined
  ): TreeRendererProps = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any], connectDropTarget = js.Any.fromFunction2(connectDropTarget), getPrevRow = js.Any.fromFunction0(getPrevRow), isOver = isOver.asInstanceOf[js.Any], listIndex = listIndex.asInstanceOf[js.Any], lowerSiblingCounts = lowerSiblingCounts.asInstanceOf[js.Any], node = node.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], scaffoldBlockPxWidth = scaffoldBlockPxWidth.asInstanceOf[js.Any], treeId = treeId.asInstanceOf[js.Any], treeIndex = treeIndex.asInstanceOf[js.Any])
    if (!js.isUndefined(canDrop)) __obj.updateDynamic("canDrop")(canDrop.get.asInstanceOf[js.Any])
    if (draggedNode != null) __obj.updateDynamic("draggedNode")(draggedNode.asInstanceOf[js.Any])
    if (rowDirection != null) __obj.updateDynamic("rowDirection")(rowDirection.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (!js.isUndefined(swapDepth)) __obj.updateDynamic("swapDepth")(swapDepth.get.asInstanceOf[js.Any])
    if (!js.isUndefined(swapFrom)) __obj.updateDynamic("swapFrom")(swapFrom.get.asInstanceOf[js.Any])
    if (!js.isUndefined(swapLength)) __obj.updateDynamic("swapLength")(swapLength.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[TreeRendererProps]
  }
}

