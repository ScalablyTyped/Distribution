package typings
package reactDashDndLib.libCjsDragDropContextMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DragDropContextProviderProps[BackendContext] extends js.Object {
  @JSName("backend")
  var backend_Original: dndDashCoreLib.libCjsInterfacesMod.BackendFactory = js.native
  var context: js.UndefOr[BackendContext] = js.native
  var debugMode: js.UndefOr[scala.Boolean] = js.native
  def backend(dragDropManager: dndDashCoreLib.libCjsInterfacesMod.DragDropManager[_]): dndDashCoreLib.libCjsInterfacesMod.Backend = js.native
}

