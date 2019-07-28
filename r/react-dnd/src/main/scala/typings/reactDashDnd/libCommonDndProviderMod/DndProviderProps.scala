package typings.reactDashDnd.libCommonDndProviderMod

import typings.dndDashCore.libInterfacesMod.BackendFactory
import typings.dndDashCore.libInterfacesMod.DragDropManager
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DndProviderProps[BackendContext, BackendOptions] extends js.Object {
  var backend: js.UndefOr[BackendFactory] = js.undefined
  var context: js.UndefOr[BackendContext] = js.undefined
  var debugMode: js.UndefOr[Boolean] = js.undefined
  var manager: js.UndefOr[DragDropManager] = js.undefined
  var options: js.UndefOr[BackendOptions] = js.undefined
}

object DndProviderProps {
  @scala.inline
  def apply[BackendContext, BackendOptions](
    backend: BackendFactory = null,
    context: BackendContext = null,
    debugMode: js.UndefOr[Boolean] = js.undefined,
    manager: DragDropManager = null,
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

