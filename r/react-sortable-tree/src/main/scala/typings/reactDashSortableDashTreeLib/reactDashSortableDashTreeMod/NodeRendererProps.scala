package typings
package reactDashSortableDashTreeLib.reactDashSortableDashTreeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NodeRendererProps extends js.Object {
  var buttons: js.UndefOr[js.Array[reactLib.reactMod.Global.JSXNs.Element]] = js.native
  var canDrag: scala.Boolean = js.native
  var canDrop: js.UndefOr[scala.Boolean] = js.native
  var className: js.UndefOr[java.lang.String] = js.native
  @JSName("connectDragPreview")
  var connectDragPreview_Original: reactDashDndLib.libCjsInterfacesClassApiMod.ConnectDragPreview = js.native
  @JSName("connectDragSource")
  var connectDragSource_Original: reactDashDndLib.libCjsInterfacesClassApiMod.ConnectDragSource = js.native
  var didDrop: scala.Boolean = js.native
  var draggedNode: js.UndefOr[TreeItem] = js.native
  var endDrag: js.Any = js.native
  var icons: js.UndefOr[js.Array[reactLib.reactMod.Global.JSXNs.Element]] = js.native
  var isDragging: scala.Boolean = js.native
  var isOver: scala.Boolean = js.native
  var isSearchFocus: scala.Boolean = js.native
  var isSearchMatch: scala.Boolean = js.native
  var listIndex: scala.Double = js.native
  var lowerSiblingCounts: js.Array[scala.Double] = js.native
  var node: TreeItem = js.native
  var parentNode: js.UndefOr[TreeItem] = js.native
  var path: reactDashSortableDashTreeLib.NumberOrStringArray = js.native
  var scaffoldBlockPxWidth: scala.Double = js.native
  var startDrag: js.Any = js.native
  var style: js.UndefOr[reactLib.reactMod.ReactNs.CSSProperties] = js.native
  var subtitle: js.UndefOr[js.Function1[/* data */ NodeData, reactLib.reactMod.Global.JSXNs.Element]] = js.native
  var swapDepth: js.UndefOr[scala.Double] = js.native
  var swapFrom: js.UndefOr[scala.Double] = js.native
  var swapLength: js.UndefOr[scala.Double] = js.native
  var title: js.UndefOr[js.Function1[/* data */ NodeData, reactLib.reactMod.Global.JSXNs.Element]] = js.native
  var toggleChildrenVisibility: js.UndefOr[js.Function1[/* data */ NodeData, scala.Unit]] = js.native
  var treeId: java.lang.String = js.native
  var treeIndex: scala.Double = js.native
  def connectDragPreview(elementOrNode: reactDashDndLib.libCjsInterfacesClassApiMod.ConnectableElement): reactLib.reactMod.ReactNs.ReactElement[_] | scala.Null = js.native
  def connectDragPreview(
    elementOrNode: reactDashDndLib.libCjsInterfacesClassApiMod.ConnectableElement,
    options: reactDashDndLib.libCjsInterfacesOptionsMod.DragPreviewOptions
  ): reactLib.reactMod.ReactNs.ReactElement[_] | scala.Null = js.native
  def connectDragSource(elementOrNode: reactDashDndLib.libCjsInterfacesClassApiMod.ConnectableElement): reactLib.reactMod.ReactNs.ReactElement[_] | scala.Null = js.native
  def connectDragSource(
    elementOrNode: reactDashDndLib.libCjsInterfacesClassApiMod.ConnectableElement,
    options: reactDashDndLib.libCjsInterfacesOptionsMod.DragSourceOptions
  ): reactLib.reactMod.ReactNs.ReactElement[_] | scala.Null = js.native
}

