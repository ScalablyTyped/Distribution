package typings
package reactDashDndLib.libDragDropContextMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DragDropContextProviderProps[BackendContext] extends js.Object {
  @JSName("backend")
  var backend_Original: dndDashCoreLib.libInterfacesMod.BackendFactory = js.native
  var context: js.UndefOr[BackendContext] = js.native
  var debugMode: js.UndefOr[scala.Boolean] = js.native
  def backend(dragDropManager: dndDashCoreLib.libInterfacesMod.DragDropManager[_]): dndDashCoreLib.libInterfacesMod.Backend = js.native
}

