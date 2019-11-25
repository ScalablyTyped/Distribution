package typings.reactDashDnd

import typings.dndDashCore.libInterfacesMod.Backend
import typings.dndDashCore.libInterfacesMod.BackendFactory
import typings.dndDashCore.libInterfacesMod.DragDropManager
import typings.reactDashDnd.libCommonDndProviderMod.DndProviderProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Backend[BackendContext, BackendOptions] extends DndProviderProps[BackendContext, BackendOptions] {
  var backend: BackendFactory
  var context: js.UndefOr[BackendContext] = js.undefined
  var debugMode: js.UndefOr[Boolean] = js.undefined
  var options: js.UndefOr[BackendOptions] = js.undefined
}

object Anon_Backend {
  @scala.inline
  def apply[BackendContext, BackendOptions](
    backend: (/* manager */ DragDropManager, /* globalContext */ js.UndefOr[js.Any], /* configuration */ js.UndefOr[js.Any]) => Backend,
    context: BackendContext = null,
    debugMode: js.UndefOr[Boolean] = js.undefined,
    options: BackendOptions = null
  ): Anon_Backend[BackendContext, BackendOptions] = {
    val __obj = js.Dynamic.literal(backend = js.Any.fromFunction3(backend))
    if (context != null) __obj.updateDynamic("context")(context.asInstanceOf[js.Any])
    if (!js.isUndefined(debugMode)) __obj.updateDynamic("debugMode")(debugMode.asInstanceOf[js.Any])
    if (options != null) __obj.updateDynamic("options")(options.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Backend[BackendContext, BackendOptions]]
  }
}

