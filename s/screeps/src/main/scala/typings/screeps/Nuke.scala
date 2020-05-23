package typings.screeps

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
  var id: Id[this.type]
  /**
    * The name of the room where this nuke has been launched from.
    */
  var launchRoomName: String
  /**
    * The remaining landing time.
    */
  var timeToLand: Double
}

object Nuke {
  @scala.inline
  def apply(
    effects: js.Array[RoomObjectEffect],
    id: Id[Nuke],
    launchRoomName: String,
    pos: RoomPosition,
    timeToLand: Double,
    room: Room = null
  ): Nuke = {
    val __obj = js.Dynamic.literal(effects = effects.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], launchRoomName = launchRoomName.asInstanceOf[js.Any], pos = pos.asInstanceOf[js.Any], timeToLand = timeToLand.asInstanceOf[js.Any])
    if (room != null) __obj.updateDynamic("room")(room.asInstanceOf[js.Any])
    __obj.asInstanceOf[Nuke]
  }
}

