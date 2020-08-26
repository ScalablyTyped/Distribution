package typings.reactDnd.anon

import typings.dndCore.interfacesMod.DragDropManager
import typings.reactDnd.dndProviderMod.DndProviderProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Manager
  extends DndProviderProps[js.Any, js.Any] {
  var manager: DragDropManager = js.native
}

object Manager {
  @scala.inline
  def apply(manager: DragDropManager): Manager = {
    val __obj = js.Dynamic.literal(manager = manager.asInstanceOf[js.Any])
    __obj.asInstanceOf[Manager]
  }
  @scala.inline
  implicit class ManagerOps[Self <: Manager] (val x: Self) extends AnyVal {
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
    def setManager(value: DragDropManager): Self = this.set("manager", value.asInstanceOf[js.Any])
  }
  
}

