package typings.reactDnd

import typings.dndCore.interfacesMod.DragDropManager
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonDragDropManager extends js.Object {
  var dragDropManager: DragDropManager
}

object AnonDragDropManager {
  @scala.inline
  def apply(dragDropManager: DragDropManager): AnonDragDropManager = {
    val __obj = js.Dynamic.literal(dragDropManager = dragDropManager.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonDragDropManager]
  }
}

