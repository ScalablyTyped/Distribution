package typings.screeps

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait HasRoomPosition extends js.Object {
  var pos: RoomPosition = js.native
}

object HasRoomPosition {
  @scala.inline
  def apply(pos: RoomPosition): HasRoomPosition = {
    val __obj = js.Dynamic.literal(pos = pos.asInstanceOf[js.Any])
    __obj.asInstanceOf[HasRoomPosition]
  }
  @scala.inline
  implicit class HasRoomPositionOps[Self <: HasRoomPosition] (val x: Self) extends AnyVal {
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
    def setPos(value: RoomPosition): Self = this.set("pos", value.asInstanceOf[js.Any])
  }
  
}

