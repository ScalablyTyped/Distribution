package typings.screeps

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Any object with a position in a room. Almost all game objects prototypes
  * are derived from RoomObject.
  */
trait RoomObject extends js.Object {
  /**
    * Applied effects, an array of objects with the following properties:
    */
  var effects: js.Array[RoomObjectEffect]
  /**
    * An object representing the position of this object in the room.
    */
  var pos: RoomPosition
  /**
    * The link to the Room object. May be undefined in case if an object is a
    * flag or a construction site and is placed in a room that is not visible
    * to you.
    */
  var room: js.UndefOr[Room] = js.undefined
}

object RoomObject {
  @scala.inline
  def apply(effects: js.Array[RoomObjectEffect], pos: RoomPosition, room: Room = null): RoomObject = {
    val __obj = js.Dynamic.literal(effects = effects.asInstanceOf[js.Any], pos = pos.asInstanceOf[js.Any])
    if (room != null) __obj.updateDynamic("room")(room.asInstanceOf[js.Any])
    __obj.asInstanceOf[RoomObject]
  }
}

