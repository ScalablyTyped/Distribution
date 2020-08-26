package typings.reactBeautifulDnd.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DimensionMap extends js.Object {
  var draggables: DraggableDimensionMap = js.native
  var droppables: DroppableDimensionMap = js.native
}

object DimensionMap {
  @scala.inline
  def apply(draggables: DraggableDimensionMap, droppables: DroppableDimensionMap): DimensionMap = {
    val __obj = js.Dynamic.literal(draggables = draggables.asInstanceOf[js.Any], droppables = droppables.asInstanceOf[js.Any])
    __obj.asInstanceOf[DimensionMap]
  }
  @scala.inline
  implicit class DimensionMapOps[Self <: DimensionMap] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setDraggables(value: DraggableDimensionMap): Self = this.set("draggables", value.asInstanceOf[js.Any])
    @scala.inline
    def setDroppables(value: DroppableDimensionMap): Self = this.set("droppables", value.asInstanceOf[js.Any])
  }
  
}

