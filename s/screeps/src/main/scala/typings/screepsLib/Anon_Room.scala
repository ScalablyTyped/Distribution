package typings
package screepsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Room extends js.Object {
  // EVENT_EXIT
  var room: java.lang.String
  var x: scala.Double
  var y: scala.Double
}

object Anon_Room {
  @scala.inline
  def apply(room: java.lang.String, x: scala.Double, y: scala.Double): Anon_Room = {
    val __obj = js.Dynamic.literal(room = room, x = x, y = y)
  
    __obj.asInstanceOf[Anon_Room]
  }
}

