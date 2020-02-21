package typings.reactBeautifulDnd.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Published extends js.Object {
  var additions: js.Array[DraggableDimension]
  var modified: js.Array[DroppablePublish]
  var removals: js.Array[DraggableId]
}

object Published {
  @scala.inline
  def apply(
    additions: js.Array[DraggableDimension],
    modified: js.Array[DroppablePublish],
    removals: js.Array[DraggableId]
  ): Published = {
    val __obj = js.Dynamic.literal(additions = additions.asInstanceOf[js.Any], modified = modified.asInstanceOf[js.Any], removals = removals.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Published]
  }
}

