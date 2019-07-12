package typings
package reactDashDndLib.libCommonDndContextMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DndContextType extends js.Object {
  var dragDropManager: js.UndefOr[dndDashCoreLib.libInterfacesMod.DragDropManager] = js.undefined
}

object DndContextType {
  @scala.inline
  def apply(dragDropManager: dndDashCoreLib.libInterfacesMod.DragDropManager = null): DndContextType = {
    val __obj = js.Dynamic.literal()
    if (dragDropManager != null) __obj.updateDynamic("dragDropManager")(dragDropManager)
    __obj.asInstanceOf[DndContextType]
  }
}

