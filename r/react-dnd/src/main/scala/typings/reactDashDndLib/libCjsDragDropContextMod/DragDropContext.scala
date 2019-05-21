package typings
package reactDashDndLib.libCjsDragDropContextMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DragDropContext[BC] extends js.Object {
  var dragDropManager: js.UndefOr[dndDashCoreLib.libCjsInterfacesMod.DragDropManager[BC]] = js.undefined
}

object DragDropContext {
  @scala.inline
  def apply[BC](dragDropManager: dndDashCoreLib.libCjsInterfacesMod.DragDropManager[BC] = null): DragDropContext[BC] = {
    val __obj = js.Dynamic.literal()
    if (dragDropManager != null) __obj.updateDynamic("dragDropManager")(dragDropManager)
    __obj.asInstanceOf[DragDropContext[BC]]
  }
}

