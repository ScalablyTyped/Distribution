package typings.screeps

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HasRoomPosition extends js.Object {
  var pos: RoomPosition
}

object HasRoomPosition {
  @scala.inline
  def apply(pos: RoomPosition): HasRoomPosition = {
    val __obj = js.Dynamic.literal(pos = pos.asInstanceOf[js.Any])
    __obj.asInstanceOf[HasRoomPosition]
  }
}

