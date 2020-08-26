package typings.reactDnd.dndContextMod

import typings.dndCore.interfacesMod.DragDropManager
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DndContextType extends js.Object {
  var dragDropManager: js.UndefOr[DragDropManager] = js.native
}

object DndContextType {
  @scala.inline
  def apply(): DndContextType = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DndContextType]
  }
  @scala.inline
  implicit class DndContextTypeOps[Self <: DndContextType] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setDragDropManager(value: DragDropManager): Self = this.set("dragDropManager", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDragDropManager: Self = this.set("dragDropManager", js.undefined)
  }
  
}

