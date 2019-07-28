package typings.reactDashDnd

import typings.reactDashDnd.libInterfacesConnectorsMod.ConnectDragPreview
import typings.reactDashDnd.libInterfacesConnectorsMod.ConnectDragSource
import typings.reactDashDnd.libInterfacesConnectorsMod.ConnectDropTarget
import typings.reactDashDnd.libInterfacesHooksApiMod.DragObjectWithType
import typings.reactDashDnd.libInterfacesHooksApiMod.DragSourceHookSpec
import typings.reactDashDnd.libInterfacesHooksApiMod.DropTargetHookSpec
import typings.reactDashDnd.libInterfacesMonitorsMod.DragLayerMonitor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-dnd/lib/hooks", JSImport.Namespace)
@js.native
object libHooksMod extends js.Object {
  def useDrag[DragObject /* <: DragObjectWithType */, DropResult, CollectedProps](spec: DragSourceHookSpec[DragObject, DropResult, CollectedProps]): js.Tuple3[CollectedProps, ConnectDragSource, ConnectDragPreview] = js.native
  def useDragLayer[CollectedProps](collect: js.Function1[/* monitor */ DragLayerMonitor, CollectedProps]): CollectedProps = js.native
  def useDrop[DragObject /* <: DragObjectWithType */, DropResult, CollectedProps](spec: DropTargetHookSpec[DragObject, DropResult, CollectedProps]): js.Tuple2[CollectedProps, ConnectDropTarget] = js.native
}

