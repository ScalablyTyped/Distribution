package typings.reactDashDnd

import typings.react.reactMod.MutableRefObject
import typings.reactDashDnd.libCommonTargetConnectorMod.TargetConnector
import typings.reactDashDnd.libInterfacesHooksApiMod.DragObjectWithType
import typings.reactDashDnd.libInterfacesHooksApiMod.DropTargetHookSpec
import typings.reactDashDnd.libInterfacesMonitorsMod.DropTargetMonitor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-dnd/lib/hooks/internal/drop", JSImport.Namespace)
@js.native
object libHooksInternalDropMod extends js.Object {
  def useDropHandler[DragObject /* <: DragObjectWithType */, DropResult, CustomProps](
    spec: MutableRefObject[DropTargetHookSpec[DragObject, DropResult, CustomProps]],
    monitor: DropTargetMonitor,
    connector: js.Any
  ): Unit = js.native
  def useDropTargetMonitor(): js.Tuple2[DropTargetMonitor, TargetConnector] = js.native
}

