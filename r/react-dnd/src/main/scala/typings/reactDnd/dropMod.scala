package typings.reactDnd

import typings.react.mod.MutableRefObject
import typings.reactDnd.hooksApiMod.DragObjectWithType
import typings.reactDnd.hooksApiMod.DropTargetHookSpec
import typings.reactDnd.monitorsMod.DropTargetMonitor
import typings.reactDnd.targetConnectorMod.TargetConnector
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-dnd/lib/hooks/internal/drop", JSImport.Namespace)
@js.native
object dropMod extends js.Object {
  def useDropHandler[DragObject /* <: DragObjectWithType */, DropResult, CustomProps](
    spec: MutableRefObject[DropTargetHookSpec[DragObject, DropResult, CustomProps]],
    monitor: DropTargetMonitor,
    connector: js.Any
  ): Unit = js.native
  def useDropTargetMonitor(): js.Tuple2[DropTargetMonitor, TargetConnector] = js.native
}

