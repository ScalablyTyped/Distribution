package typings
package reactDashDndLib.libCjsDragDropContextMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DragDropContextProviderProps[BackendContext] extends js.Object {
  var backend: js.UndefOr[dndDashCoreLib.libCjsInterfacesMod.BackendFactory] = js.undefined
  var context: js.UndefOr[BackendContext] = js.undefined
  var debugMode: js.UndefOr[scala.Boolean] = js.undefined
  var manager: js.UndefOr[dndDashCoreLib.libCjsInterfacesMod.DragDropManager[BackendContext]] = js.undefined
}

object DragDropContextProviderProps {
  @scala.inline
  def apply[BackendContext](
    backend: dndDashCoreLib.libCjsInterfacesMod.BackendFactory = null,
    context: BackendContext = null,
    debugMode: js.UndefOr[scala.Boolean] = js.undefined,
    manager: dndDashCoreLib.libCjsInterfacesMod.DragDropManager[BackendContext] = null
  ): DragDropContextProviderProps[BackendContext] = {
    val __obj = js.Dynamic.literal()
    if (backend != null) __obj.updateDynamic("backend")(backend)
    if (context != null) __obj.updateDynamic("context")(context.asInstanceOf[js.Any])
    if (!js.isUndefined(debugMode)) __obj.updateDynamic("debugMode")(debugMode)
    if (manager != null) __obj.updateDynamic("manager")(manager)
    __obj.asInstanceOf[DragDropContextProviderProps[BackendContext]]
  }
}

