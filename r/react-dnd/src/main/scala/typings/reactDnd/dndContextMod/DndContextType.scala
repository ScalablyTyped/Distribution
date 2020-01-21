package typings.reactDnd.dndContextMod

import typings.dndCore.interfacesMod.DragDropManager
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DndContextType extends js.Object {
  var dragDropManager: js.UndefOr[DragDropManager] = js.undefined
}

object DndContextType {
  @scala.inline
  def apply(dragDropManager: DragDropManager = null): DndContextType = {
    val __obj = js.Dynamic.literal()
    if (dragDropManager != null) __obj.updateDynamic("dragDropManager")(dragDropManager.asInstanceOf[js.Any])
    __obj.asInstanceOf[DndContextType]
  }
}

