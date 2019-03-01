package typings
package screepsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait _HasRoomPosition extends js.Object {
  var pos: RoomPosition
}

object _HasRoomPosition {
  @scala.inline
  def apply(pos: RoomPosition): _HasRoomPosition = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("pos")(pos)
    __obj.asInstanceOf[_HasRoomPosition]
  }
}

