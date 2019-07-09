package typings
package reactDashDndLib.libCommonDndProviderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DndProviderProps[BackendContext, BackendOptions] extends js.Object {
  var backend: js.UndefOr[dndDashCoreLib.libInterfacesMod.BackendFactory] = js.undefined
  var context: js.UndefOr[BackendContext] = js.undefined
  var debugMode: js.UndefOr[scala.Boolean] = js.undefined
  var manager: js.UndefOr[dndDashCoreLib.libInterfacesMod.DragDropManager] = js.undefined
  var options: js.UndefOr[BackendOptions] = js.undefined
}

object DndProviderProps {
  @scala.inline
  def apply[BackendContext, BackendOptions](
    backend: dndDashCoreLib.libInterfacesMod.BackendFactory = null,
    context: BackendContext = null,
    debugMode: js.UndefOr[scala.Boolean] = js.undefined,
    manager: dndDashCoreLib.libInterfacesMod.DragDropManager = null,
    options: BackendOptions = null
  ): DndProviderProps[BackendContext, BackendOptions] = {
    val __obj = js.Dynamic.literal()
    if (backend != null) __obj.updateDynamic("backend")(backend)
    if (context != null) __obj.updateDynamic("context")(context.asInstanceOf[js.Any])
    if (!js.isUndefined(debugMode)) __obj.updateDynamic("debugMode")(debugMode)
    if (manager != null) __obj.updateDynamic("manager")(manager)
    if (options != null) __obj.updateDynamic("options")(options.asInstanceOf[js.Any])
    __obj.asInstanceOf[DndProviderProps[BackendContext, BackendOptions]]
  }
}

