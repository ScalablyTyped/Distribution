package typings
package reactDashSortableDashTreeLib.reactDashSortableDashTreeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TreeRendererProps extends js.Object {
  var canDrop: js.UndefOr[scala.Boolean] = js.native
  var children: js.Array[reactLib.reactMod.Global.JSXNs.Element] = js.native
  // Drop target
  @JSName("connectDropTarget")
  var connectDropTarget_Original: reactDashDndLib.libCjsInterfacesClassApiMod.ConnectDropTarget = js.native
  var draggedNode: js.UndefOr[TreeItem] = js.native
  var isOver: scala.Boolean = js.native
  var listIndex: scala.Double = js.native
  var lowerSiblingCounts: js.Array[scala.Double] = js.native
  var node: TreeItem = js.native
  var path: reactDashSortableDashTreeLib.NumberOrStringArray = js.native
  var scaffoldBlockPxWidth: scala.Double = js.native
  var swapDepth: js.UndefOr[scala.Double] = js.native
  var swapFrom: js.UndefOr[scala.Double] = js.native
  var swapLength: js.UndefOr[scala.Double] = js.native
  var treeId: java.lang.String = js.native
  var treeIndex: scala.Double = js.native
  // Drop target
  def connectDropTarget[Props](elementOrNode: reactDashDndLib.libCjsInterfacesClassApiMod.ConnectedElement): reactLib.reactMod.ReactNs.ReactElement[Props] = js.native
  // used in dndManager
  def getPrevRow(): FlatDataItem | scala.Null = js.native
}

