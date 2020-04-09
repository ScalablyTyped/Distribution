package typings.screeps

import typings.screeps.screepsStrings.novice
import typings.screeps.screepsStrings.respawn
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RoomStatusTemporary extends RoomStatus {
  var status: novice | respawn
  var timestamp: Double
}

object RoomStatusTemporary {
  @scala.inline
  def apply(status: novice | respawn, timestamp: Double): RoomStatusTemporary = {
    val __obj = js.Dynamic.literal(status = status.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[RoomStatusTemporary]
  }
}

