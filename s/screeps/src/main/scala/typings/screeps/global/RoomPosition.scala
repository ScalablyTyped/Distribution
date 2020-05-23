package typings.screeps.global

import org.scalablytyped.runtime.TopLevel
import typings.screeps.RoomPositionConstructor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("RoomPosition")
@js.native
class RoomPosition protected ()
  extends typings.screeps.RoomPosition {
  /**
    * You can create new RoomPosition object using its constructor.
    * @param x X position in the room.
    * @param y Y position in the room.
    * @param roomName The room name.
    */
  def this(x: Double, y: Double, roomName: String) = this()
}

@JSGlobal("RoomPosition")
@js.native
object RoomPosition extends TopLevel[RoomPositionConstructor]

