package typings.screeps.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Room extends js.Object {
  var room: String
  var x: Double
  var y: Double
}

object Room {
  @scala.inline
  def apply(room: String, x: Double, y: Double): Room = {
    val __obj = js.Dynamic.literal(room = room.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
    __obj.asInstanceOf[Room]
  }
}

