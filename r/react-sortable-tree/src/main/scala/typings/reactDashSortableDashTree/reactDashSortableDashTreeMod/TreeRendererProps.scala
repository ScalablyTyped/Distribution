package typings.reactDashSortableDashTree.reactDashSortableDashTreeMod

import typings.react.reactMod.Global.JSXNs.Element
import typings.reactDashSortableDashTree.NumberOrStringArray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TreeRendererProps extends js.Object {
  var canDrop: js.UndefOr[Boolean] = js.undefined
  var children: js.Array[Element]
  // Drop target
  var connectDropTarget: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify ConnectDropTarget */ js.Any
  var draggedNode: js.UndefOr[TreeItem] = js.undefined
  var isOver: Boolean
  var listIndex: Double
  var lowerSiblingCounts: js.Array[Double]
  var node: TreeItem
  var path: NumberOrStringArray
  var scaffoldBlockPxWidth: Double
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
    connectDropTarget: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify ConnectDropTarget */ js.Any,
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
    swapDepth: Int | Double = null,
    swapFrom: Int | Double = null,
    swapLength: Int | Double = null
  ): TreeRendererProps = {
    val __obj = js.Dynamic.literal(children = children, connectDropTarget = connectDropTarget, getPrevRow = js.Any.fromFunction0(getPrevRow), isOver = isOver, listIndex = listIndex, lowerSiblingCounts = lowerSiblingCounts, node = node, path = path, scaffoldBlockPxWidth = scaffoldBlockPxWidth, treeId = treeId, treeIndex = treeIndex)
    if (!js.isUndefined(canDrop)) __obj.updateDynamic("canDrop")(canDrop)
    if (draggedNode != null) __obj.updateDynamic("draggedNode")(draggedNode)
    if (swapDepth != null) __obj.updateDynamic("swapDepth")(swapDepth.asInstanceOf[js.Any])
    if (swapFrom != null) __obj.updateDynamic("swapFrom")(swapFrom.asInstanceOf[js.Any])
    if (swapLength != null) __obj.updateDynamic("swapLength")(swapLength.asInstanceOf[js.Any])
    __obj.asInstanceOf[TreeRendererProps]
  }
}

