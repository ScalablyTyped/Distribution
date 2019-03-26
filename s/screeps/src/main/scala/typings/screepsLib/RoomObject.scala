package typings
package screepsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Any object with a position in a room. Almost all game objects prototypes
  * are derived from RoomObject.
  */
trait RoomObject extends js.Object {
  /**
    * An object representing the position of this object in the room.
    */
  var pos: RoomPosition
  /**
    * The link to the Room object. May be undefined in case if an object is a
    * flag or a construction site and is placed in a room that is not visible
    * to you.
    */
  var room: js.UndefOr[Room]
}

@JSGlobal("RoomObject")
@js.native
class RoomObjectCls protected () extends RoomObject {
  def this(x: scala.Double, y: scala.Double, roomName: java.lang.String) = this()
  /**
    * An object representing the position of this object in the room.
    */
  /* CompleteClass */
  override var pos: RoomPosition = js.native
  /**
    * The link to the Room object. May be undefined in case if an object is a
    * flag or a construction site and is placed in a room that is not visible
    * to you.
    */
  /* CompleteClass */
  override var room: js.UndefOr[Room] = js.native
}

object RoomObject {
  @scala.inline
  def apply(pos: RoomPosition, room: Room = null): RoomObject = {
    val __obj = js.Dynamic.literal(pos = pos)
    if (room != null) __obj.updateDynamic("room")(room)
    __obj.asInstanceOf[RoomObject]
  }
}

