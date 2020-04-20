package typings.screeps

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonRoom extends js.Object {
  var room: String
  var x: Double
  var y: Double
}

object AnonRoom {
  @scala.inline
  def apply(room: String, x: Double, y: Double): AnonRoom = {
    val __obj = js.Dynamic.literal(room = room.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonRoom]
  }
}

