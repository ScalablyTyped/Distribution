package typings.reactDashDnd

import typings.dndDashCore.libInterfacesMod.DragDropManager
import typings.reactDashDnd.libCommonDndProviderMod.DndProviderProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Manager
  extends DndProviderProps[js.Any, js.Any] {
  var manager: DragDropManager
}

object Anon_Manager {
  @scala.inline
  def apply(manager: DragDropManager): Anon_Manager = {
    val __obj = js.Dynamic.literal(manager = manager.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_Manager]
  }
}

