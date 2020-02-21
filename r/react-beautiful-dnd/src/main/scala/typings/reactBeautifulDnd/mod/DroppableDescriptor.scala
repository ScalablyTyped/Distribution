package typings.reactBeautifulDnd.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DroppableDescriptor extends js.Object {
  var id: DroppableId
  var mode: DroppableMode
  var `type`: TypeId
}

object DroppableDescriptor {
  @scala.inline
  def apply(id: DroppableId, mode: DroppableMode, `type`: TypeId): DroppableDescriptor = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], mode = mode.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[DroppableDescriptor]
  }
}

