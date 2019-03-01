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
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("room")(room)
    __obj.updateDynamic("x")(x)
    __obj.updateDynamic("y")(y)
    __obj.asInstanceOf[Anon_Room]
  }
}

