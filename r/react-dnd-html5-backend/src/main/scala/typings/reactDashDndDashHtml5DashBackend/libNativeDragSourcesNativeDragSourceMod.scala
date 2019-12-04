package typings.reactDashDndDashHtml5DashBackend

import typings.dndDashCore.libInterfacesMod.DragDropMonitor
import typings.reactDashDndDashHtml5DashBackend.libNativeDragSourcesNativeTypesConfigMod.NativeItemConfig
import typings.std.DataTransfer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-dnd-html5-backend/lib/NativeDragSources/NativeDragSource", JSImport.Namespace)
@js.native
object libNativeDragSourcesNativeDragSourceMod extends js.Object {
  @js.native
  class NativeDragSource protected () extends js.Object {
    def this(config: NativeItemConfig) = this()
    var config: js.Any = js.native
    var initializeExposedProperties: js.Any = js.native
    var item: js.Any = js.native
    def beginDrag(): js.Any = js.native
    def canDrag(): Boolean = js.native
    def endDrag(): Unit = js.native
    def isDragging(monitor: DragDropMonitor, handle: String): Boolean = js.native
    def loadDataTransfer(): Unit = js.native
    def loadDataTransfer(dataTransfer: DataTransfer): Unit = js.native
  }
  
}

