package typings.reactDashDnd

import typings.dndDashCore.libInterfacesMod.DragDropManager
import typings.dndDashCore.libInterfacesMod.Listener
import typings.dndDashCore.libInterfacesMod.Unsubscribe
import typings.reactDashDnd.libInterfacesMonitorsMod.DropTargetMonitor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-dnd/lib/common/DropTargetMonitorImpl", JSImport.Namespace)
@js.native
object libCommonDropTargetMonitorImplMod extends js.Object {
  @js.native
  class DropTargetMonitorImpl protected () extends DropTargetMonitor {
    def this(manager: DragDropManager) = this()
    var internalMonitor: js.Any = js.native
    var targetId: js.Any = js.native
    def subscribeToStateChange(listener: Listener, options: Anon_HandlerIds): Unsubscribe = js.native
  }
  
}

