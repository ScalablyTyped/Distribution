package typings.reactDashDnd

import typings.dndDashCore.libInterfacesMod.DragDropManager
import typings.dndDashCore.libInterfacesMod.Identifier
import typings.dndDashCore.libInterfacesMod.Listener
import typings.dndDashCore.libInterfacesMod.Unsubscribe
import typings.reactDashDnd.libInterfacesMonitorsMod.DragSourceMonitor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-dnd/lib/common/DragSourceMonitorImpl", JSImport.Namespace)
@js.native
object libCommonDragSourceMonitorImplMod extends js.Object {
  @js.native
  class DragSourceMonitorImpl protected () extends DragSourceMonitor {
    def this(manager: DragDropManager) = this()
    var internalMonitor: js.Any = js.native
    var sourceId: js.Any = js.native
    def canDragSource(sourceId: Identifier): Boolean = js.native
    def canDropOnTarget(targetId: Identifier): Boolean = js.native
    def getSourceId(): Identifier | Null = js.native
    def isDraggingSource(sourceId: Identifier): Boolean = js.native
    def isOverTarget(targetId: Identifier): Boolean = js.native
    def isOverTarget(targetId: Identifier, options: Anon_Shallow): Boolean = js.native
    def isSourcePublic(): Boolean | Null = js.native
    def subscribeToOffsetChange(listener: Listener): Unsubscribe = js.native
    def subscribeToStateChange(listener: Listener, options: Anon_HandlerIds): Unsubscribe = js.native
  }
  
}

