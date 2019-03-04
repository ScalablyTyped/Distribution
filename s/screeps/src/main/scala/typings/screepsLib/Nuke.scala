package typings
package screepsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A nuke landing position. This object cannot be removed or modified. You can find incoming nukes in the room using the FIND_NUKES constant.
  */
trait Nuke extends RoomObject {
  /**
    * A unique object identifier. You can use Game.getObjectById method to retrieve an object instance by its id.
    */
  var id: java.lang.String
  /**
    * The name of the room where this nuke has been launched from.
    */
  var launchRoomName: java.lang.String
  /**
    * The remaining landing time.
    */
  var timeToLand: scala.Double
}

object Nuke {
  @scala.inline
  def apply(
    id: java.lang.String,
    launchRoomName: java.lang.String,
    pos: RoomPosition,
    timeToLand: scala.Double,
    room: Room = null
  ): Nuke = {
    val __obj = js.Dynamic.literal(id = id, launchRoomName = launchRoomName, pos = pos, timeToLand = timeToLand)
    if (room != null) __obj.updateDynamic("room")(room)
    __obj.asInstanceOf[Nuke]
  }
}

