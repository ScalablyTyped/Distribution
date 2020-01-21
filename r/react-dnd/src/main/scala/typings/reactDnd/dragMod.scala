package typings.reactDnd

import typings.react.mod.MutableRefObject
import typings.reactDnd.hooksApiMod.DragObjectWithType
import typings.reactDnd.hooksApiMod.DragSourceHookSpec
import typings.reactDnd.monitorsMod.DragSourceMonitor
import typings.reactDnd.sourceConnectorMod.SourceConnector
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-dnd/lib/hooks/internal/drag", JSImport.Namespace)
@js.native
object dragMod extends js.Object {
  def useDragHandler[DragObject /* <: DragObjectWithType */, DropResult, CustomProps](
    spec: MutableRefObject[DragSourceHookSpec[DragObject, DropResult, CustomProps]],
    monitor: DragSourceMonitor,
    connector: js.Any
  ): Unit = js.native
  def useDragSourceMonitor(): js.Tuple2[DragSourceMonitor, SourceConnector] = js.native
}

