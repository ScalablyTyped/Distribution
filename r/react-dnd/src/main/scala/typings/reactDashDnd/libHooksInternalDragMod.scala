package typings.reactDashDnd

import typings.react.reactMod.MutableRefObject
import typings.reactDashDnd.libCommonSourceConnectorMod.SourceConnector
import typings.reactDashDnd.libInterfacesHooksApiMod.DragObjectWithType
import typings.reactDashDnd.libInterfacesHooksApiMod.DragSourceHookSpec
import typings.reactDashDnd.libInterfacesMonitorsMod.DragSourceMonitor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-dnd/lib/hooks/internal/drag", JSImport.Namespace)
@js.native
object libHooksInternalDragMod extends js.Object {
  def useDragHandler[DragObject /* <: DragObjectWithType */, DropResult, CustomProps](
    spec: MutableRefObject[DragSourceHookSpec[DragObject, DropResult, CustomProps]],
    monitor: DragSourceMonitor,
    connector: js.Any
  ): Unit = js.native
  def useDragSourceMonitor(): js.Tuple2[DragSourceMonitor, SourceConnector] = js.native
}

