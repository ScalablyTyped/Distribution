package typings.screeps

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonPos extends js.Object {
  var pos: RoomPosition
}

object AnonPos {
  @scala.inline
  def apply(pos: RoomPosition): AnonPos = {
    val __obj = js.Dynamic.literal(pos = pos.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonPos]
  }
}

