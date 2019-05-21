package typings
package reactDashDndLib.libCjsDragDropContextMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DragDropContextProviderProps[BackendContext] extends js.Object {
  var backend: dndDashCoreLib.libCjsInterfacesMod.BackendFactory
  var context: js.UndefOr[BackendContext] = js.undefined
  var debugMode: js.UndefOr[scala.Boolean] = js.undefined
}

object DragDropContextProviderProps {
  @scala.inline
  def apply[BackendContext](
    backend: dndDashCoreLib.libCjsInterfacesMod.BackendFactory,
    context: BackendContext = null,
    debugMode: js.UndefOr[scala.Boolean] = js.undefined
  ): DragDropContextProviderProps[BackendContext] = {
    val __obj = js.Dynamic.literal(backend = backend)
    if (context != null) __obj.updateDynamic("context")(context.asInstanceOf[js.Any])
    if (!js.isUndefined(debugMode)) __obj.updateDynamic("debugMode")(debugMode)
    __obj.asInstanceOf[DragDropContextProviderProps[BackendContext]]
  }
}

