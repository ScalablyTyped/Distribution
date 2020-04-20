package typings.reactBeautifulDnd.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DimensionMap extends js.Object {
  var draggables: DraggableDimensionMap
  var droppables: DroppableDimensionMap
}

object DimensionMap {
  @scala.inline
  def apply(draggables: DraggableDimensionMap, droppables: DroppableDimensionMap): DimensionMap = {
    val __obj = js.Dynamic.literal(draggables = draggables.asInstanceOf[js.Any], droppables = droppables.asInstanceOf[js.Any])
    __obj.asInstanceOf[DimensionMap]
  }
}

