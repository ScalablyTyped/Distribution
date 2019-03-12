package typings
package reactDashBeautifulDashDndLib.reactDashBeautifulDashDndMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DraggableLocation extends js.Object {
  var droppableId: DroppableId
  var index: scala.Double
}

object DraggableLocation {
  @scala.inline
  def apply(droppableId: DroppableId, index: scala.Double): DraggableLocation = {
    val __obj = js.Dynamic.literal(droppableId = droppableId, index = index)
  
    __obj.asInstanceOf[DraggableLocation]
  }
}

