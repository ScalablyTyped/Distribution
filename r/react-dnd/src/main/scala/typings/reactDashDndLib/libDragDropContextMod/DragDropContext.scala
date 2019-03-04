package typings
package reactDashDndLib.libDragDropContextMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DragDropContext[BC] extends js.Object {
  var dragDropManager: js.UndefOr[dndDashCoreLib.libInterfacesMod.DragDropManager[BC]]
}

object DragDropContext {
  @scala.inline
  def apply[BC](dragDropManager: dndDashCoreLib.libInterfacesMod.DragDropManager[BC] = null): DragDropContext[BC] = {
    val __obj = js.Dynamic.literal()
    if (dragDropManager != null) __obj.updateDynamic("dragDropManager")(dragDropManager)
    __obj.asInstanceOf[DragDropContext[BC]]
  }
}

