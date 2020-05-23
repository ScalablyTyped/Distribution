package typings.reactDnd.anon

import typings.reactDnd.dndProviderMod.DndProviderProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Manager
  extends DndProviderProps[js.Any, js.Any] {
  var manager: typings.dndCore.interfacesMod.DragDropManager
}

object Manager {
  @scala.inline
  def apply(manager: typings.dndCore.interfacesMod.DragDropManager): Manager = {
    val __obj = js.Dynamic.literal(manager = manager.asInstanceOf[js.Any])
    __obj.asInstanceOf[Manager]
  }
}

