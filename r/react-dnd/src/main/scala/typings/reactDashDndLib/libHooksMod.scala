package typings
package reactDashDndLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-dnd/lib/hooks", JSImport.Namespace)
@js.native
object libHooksMod extends js.Object {
  def useDrag[DragObject /* <: reactDashDndLib.libInterfacesHooksApiMod.DragObjectWithType */, DropResult, CollectedProps](
    spec: reactDashDndLib.libInterfacesHooksApiMod.DragSourceHookSpec[DragObject, DropResult, CollectedProps]
  ): js.Tuple3[
    CollectedProps, 
    reactDashDndLib.libInterfacesConnectorsMod.ConnectDragSource, 
    reactDashDndLib.libInterfacesConnectorsMod.ConnectDragPreview
  ] = js.native
  def useDragLayer[CollectedProps](
    collect: js.Function1[
      /* monitor */ reactDashDndLib.libInterfacesMonitorsMod.DragLayerMonitor, 
      CollectedProps
    ]
  ): CollectedProps = js.native
  def useDrop[DragObject /* <: reactDashDndLib.libInterfacesHooksApiMod.DragObjectWithType */, DropResult, CollectedProps](
    spec: reactDashDndLib.libInterfacesHooksApiMod.DropTargetHookSpec[DragObject, DropResult, CollectedProps]
  ): js.Tuple2[CollectedProps, reactDashDndLib.libInterfacesConnectorsMod.ConnectDropTarget] = js.native
}

