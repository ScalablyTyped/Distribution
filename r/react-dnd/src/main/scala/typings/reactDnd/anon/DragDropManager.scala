package typings.reactDnd.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DragDropManager extends js.Object {
  var dragDropManager: typings.dndCore.interfacesMod.DragDropManager
}

object DragDropManager {
  @scala.inline
  def apply(dragDropManager: typings.dndCore.interfacesMod.DragDropManager): DragDropManager = {
    val __obj = js.Dynamic.literal(dragDropManager = dragDropManager.asInstanceOf[js.Any])
    __obj.asInstanceOf[DragDropManager]
  }
}

