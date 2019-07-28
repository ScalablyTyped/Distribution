package typings.screeps

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Room extends js.Object {
  // EVENT_EXIT
  var room: String
  var x: Double
  var y: Double
}

object Anon_Room {
  @scala.inline
  def apply(room: String, x: Double, y: Double): Anon_Room = {
    val __obj = js.Dynamic.literal(room = room, x = x, y = y)
  
    __obj.asInstanceOf[Anon_Room]
  }
}

