package typings.screeps

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait _HasRoomPosition extends js.Object {
  var pos: RoomPosition
}

object _HasRoomPosition {
  @scala.inline
  def apply(pos: RoomPosition): _HasRoomPosition = {
    val __obj = js.Dynamic.literal(pos = pos.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[_HasRoomPosition]
  }
}

