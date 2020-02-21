package typings.reactBeautifulDnd.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DroppablePublish extends js.Object {
  var droppableId: DroppableId
  var scroll: Position
}

object DroppablePublish {
  @scala.inline
  def apply(droppableId: DroppableId, scroll: Position): DroppablePublish = {
    val __obj = js.Dynamic.literal(droppableId = droppableId.asInstanceOf[js.Any], scroll = scroll.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[DroppablePublish]
  }
}

