package typings
package reactDashDndLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_DragDropManager[BackendContext] extends js.Object {
  var dragDropManager: dndDashCoreLib.libCjsInterfacesMod.DragDropManager[js.UndefOr[BackendContext]]
}

object Anon_DragDropManager {
  @scala.inline
  def apply[BackendContext](dragDropManager: dndDashCoreLib.libCjsInterfacesMod.DragDropManager[js.UndefOr[BackendContext]]): Anon_DragDropManager[BackendContext] = {
    val __obj = js.Dynamic.literal(dragDropManager = dragDropManager)
  
    __obj.asInstanceOf[Anon_DragDropManager[BackendContext]]
  }
}

