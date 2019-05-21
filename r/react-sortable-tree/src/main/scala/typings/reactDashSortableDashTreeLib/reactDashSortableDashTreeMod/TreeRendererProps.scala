package typings
package reactDashSortableDashTreeLib.reactDashSortableDashTreeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TreeRendererProps extends js.Object {
  var canDrop: js.UndefOr[scala.Boolean] = js.undefined
  var children: js.Array[reactLib.reactMod.Global.JSXNs.Element]
  // Drop target
  var connectDropTarget: reactDashDndLib.libCjsInterfacesClassApiMod.ConnectDropTarget
  var draggedNode: js.UndefOr[TreeItem] = js.undefined
  var isOver: scala.Boolean
  var listIndex: scala.Double
  var lowerSiblingCounts: js.Array[scala.Double]
  var node: TreeItem
  var path: reactDashSortableDashTreeLib.NumberOrStringArray
  var scaffoldBlockPxWidth: scala.Double
  var swapDepth: js.UndefOr[scala.Double] = js.undefined
  var swapFrom: js.UndefOr[scala.Double] = js.undefined
  var swapLength: js.UndefOr[scala.Double] = js.undefined
  var treeId: java.lang.String
  var treeIndex: scala.Double
  // used in dndManager
  def getPrevRow(): FlatDataItem | scala.Null
}

object TreeRendererProps {
  @scala.inline
  def apply(
    children: js.Array[reactLib.reactMod.Global.JSXNs.Element],
    connectDropTarget: reactDashDndLib.libCjsInterfacesClassApiMod.ConnectDropTarget,
    getPrevRow: () => FlatDataItem | scala.Null,
    isOver: scala.Boolean,
    listIndex: scala.Double,
    lowerSiblingCounts: js.Array[scala.Double],
    node: TreeItem,
    path: reactDashSortableDashTreeLib.NumberOrStringArray,
    scaffoldBlockPxWidth: scala.Double,
    treeId: java.lang.String,
    treeIndex: scala.Double,
    canDrop: js.UndefOr[scala.Boolean] = js.undefined,
    draggedNode: TreeItem = null,
    swapDepth: scala.Int | scala.Double = null,
    swapFrom: scala.Int | scala.Double = null,
    swapLength: scala.Int | scala.Double = null
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

