package typings.screeps

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Room extends js.Object {
  var room: String
  var x: Double
  var y: Double
}

object Anon_Room {
  @scala.inline
  def apply(room: String, x: Double, y: Double): Anon_Room = {
    val __obj = js.Dynamic.literal(room = room.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_Room]
  }
}

