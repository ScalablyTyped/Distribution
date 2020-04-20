package typings.screeps

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonPosRange extends js.Object {
  var pos: RoomPosition
  var range: Double
}

object AnonPosRange {
  @scala.inline
  def apply(pos: RoomPosition, range: Double): AnonPosRange = {
    val __obj = js.Dynamic.literal(pos = pos.asInstanceOf[js.Any], range = range.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonPosRange]
  }
}

