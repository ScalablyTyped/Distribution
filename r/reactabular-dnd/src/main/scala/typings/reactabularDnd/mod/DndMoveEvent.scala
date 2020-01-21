package typings.reactabularDnd.mod

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
    val __obj = js.Dynamic.literal(sourceLabel = sourceLabel.asInstanceOf[js.Any], targetLabel = targetLabel.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[DndMoveEvent]
  }
}

