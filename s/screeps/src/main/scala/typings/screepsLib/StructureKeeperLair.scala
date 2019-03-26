package typings
package screepsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Non-player structure. Spawns NPC Source Keepers that guards energy sources
  * and minerals in some rooms. This structure cannot be destroyed.
  */
trait StructureKeeperLair
  extends OwnedStructure[STRUCTURE_KEEPER_LAIR]
     with AnyOwnedStructure {
  /**
    * Time to spawning of the next Source Keeper.
    */
  var ticksToSpawn: js.UndefOr[scala.Double] = js.undefined
}

@JSGlobal("StructureKeeperLair")
@js.native
class StructureKeeperLairCls protected () extends StructureKeeperLair {
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
    * Whether this is your own structure. Walls and roads don't have this property as they are considered neutral structures.
    */
  /* CompleteClass */
  override var my: scala.Boolean = js.native
  /**
    * An object with the structure’s owner info (if present) containing the following properties: username
    */
  /* CompleteClass */
  override var owner: Owner = js.native
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
  override var structureType: STRUCTURE_KEEPER_LAIR = js.native
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

object StructureKeeperLair {
  @scala.inline
  def apply(
    destroy: () => ScreepsReturnCode,
    hits: scala.Double,
    hitsMax: scala.Double,
    id: java.lang.String,
    isActive: () => scala.Boolean,
    my: scala.Boolean,
    notifyWhenAttacked: scala.Boolean => ScreepsReturnCode,
    owner: Owner,
    pos: RoomPosition,
    room: Room,
    structureType: STRUCTURE_KEEPER_LAIR,
    ticksToSpawn: scala.Int | scala.Double = null
  ): StructureKeeperLair = {
    val __obj = js.Dynamic.literal(destroy = js.Any.fromFunction0(destroy), hits = hits, hitsMax = hitsMax, id = id, isActive = js.Any.fromFunction0(isActive), my = my, notifyWhenAttacked = js.Any.fromFunction1(notifyWhenAttacked), owner = owner, pos = pos, room = room, structureType = structureType)
    if (ticksToSpawn != null) __obj.updateDynamic("ticksToSpawn")(ticksToSpawn.asInstanceOf[js.Any])
    __obj.asInstanceOf[StructureKeeperLair]
  }
}

