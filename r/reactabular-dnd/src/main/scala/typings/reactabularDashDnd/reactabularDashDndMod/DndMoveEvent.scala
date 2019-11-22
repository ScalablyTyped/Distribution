package typings.reactabularDashDnd.reactabularDashDndMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DndMoveEvent extends js.Object {
  var sourceLabel: String
  var targetLabel: String
}

object DndMoveEvent {
  @scala.inline
  def apply(sourceLabel: String, targetLabel: String): DndMoveEvent = {
    val __obj = js.Dynamic.literal(sourceLabel = sourceLabel, targetLabel = targetLabel)
  
    __obj.asInstanceOf[DndMoveEvent]
  }
}

