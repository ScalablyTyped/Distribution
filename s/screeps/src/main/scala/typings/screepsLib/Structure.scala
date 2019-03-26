package typings
package screepsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Parent object for structure classes
  */
trait Structure[T /* <: StructureConstant */] extends RoomObject {
  /**
    * The current amount of hit points of the structure.
    */
  var hits: scala.Double
  /**
    * The total amount of hit points of the structure.
    */
  var hitsMax: scala.Double
  /**
    * A unique object identifier. You can use Game.getObjectById method to retrieve an object instance by its id.
    */
  var id: java.lang.String
  /**
    * If you can get an instance of a Structure, you can see it.
    * If you can see the Structure, you can see the room it's in.
    */
  @JSName("room")
  var room_Structure: Room
  /**
    * One of the STRUCTURE_* constants.
    */
  var structureType: T
  /**
    * Destroy this structure immediately.
    */
  def destroy(): ScreepsReturnCode
  /**
    * Check whether this structure can be used. If the room controller level is not enough, then this method will return false, and the structure will be highlighted with red in the game.
    */
  def isActive(): scala.Boolean
  /**
    * Toggle auto notification when the structure is under attack. The notification will be sent to your account email. Turned on by default.
    * @param enabled Whether to enable notification or disable.
    */
  def notifyWhenAttacked(enabled: scala.Boolean): ScreepsReturnCode
}

@JSGlobal("Structure")
@js.native
class StructureCls protected () extends Structure[StructureConstant] {
  def this(id: java.lang.String) = this()
  /**
    * The current amount of hit points of the structure.
    */
  /* CompleteClass */
  override var hits: scala.Double = js.native
  /**
    * The total amount of hit points of the structure.
    */
  /* CompleteClass */
  override var hitsMax: scala.Double = js.native
  /**
    * A unique object identifier. You can use Game.getObjectById method to retrieve an object instance by its id.
    */
  /* CompleteClass */
  override var id: java.lang.String = js.native
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
  /**
    * If you can get an instance of a Structure, you can see it.
    * If you can see the Structure, you can see the room it's in.
    */
  /* CompleteClass */
  @JSName("room")
  override var room_Structure: Room = js.native
  /**
    * One of the STRUCTURE_* constants.
    */
  /* CompleteClass */
  override var structureType: StructureConstant = js.native
  /**
    * Destroy this structure immediately.
    */
  /* CompleteClass */
  override def destroy(): ScreepsReturnCode = js.native
  /**
    * Check whether this structure can be used. If the room controller level is not enough, then this method will return false, and the structure will be highlighted with red in the game.
    */
  /* CompleteClass */
  override def isActive(): scala.Boolean = js.native
  /**
    * Toggle auto notification when the structure is under attack. The notification will be sent to your account email. Turned on by default.
    * @param enabled Whether to enable notification or disable.
    */
  /* CompleteClass */
  override def notifyWhenAttacked(enabled: scala.Boolean): ScreepsReturnCode = js.native
}

object Structure {
  @scala.inline
  def apply[T /* <: StructureConstant */](
    destroy: () => ScreepsReturnCode,
    hits: scala.Double,
    hitsMax: scala.Double,
    id: java.lang.String,
    isActive: () => scala.Boolean,
    notifyWhenAttacked: scala.Boolean => ScreepsReturnCode,
    pos: RoomPosition,
    room: Room,
    structureType: T
  ): Structure[T] = {
    val __obj = js.Dynamic.literal(destroy = js.Any.fromFunction0(destroy), hits = hits, hitsMax = hitsMax, id = id, isActive = js.Any.fromFunction0(isActive), notifyWhenAttacked = js.Any.fromFunction1(notifyWhenAttacked), pos = pos, room = room, structureType = structureType.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Structure[T]]
  }
}

