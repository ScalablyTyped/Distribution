package typings
package screepsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Remotely attacks or heals creeps, or repairs structures. Can be targeted to
  * any object in the room. However, its effectiveness highly depends on the
  * distance. Each action consumes energy.
  */
trait StructureTower
  extends OwnedStructure[STRUCTURE_TOWER]
     with AnyOwnedStructure {
  /**
    * The amount of energy containing in this structure.
    */
  var energy: scala.Double
  /**
    * The total amount of energy this structure can contain.
    */
  var energyCapacity: scala.Double
  /**
    * Remotely attack any creep in the room. Consumes 10 energy units per tick. Attack power depends on the distance to the target: from 600 hits at range 10 to 300 hits at range 40.
    * @param target The target creep.
    */
  def attack(target: Creep): ScreepsReturnCode
  /**
    * Remotely heal any creep in the room. Consumes 10 energy units per tick. Heal power depends on the distance to the target: from 400 hits at range 10 to 200 hits at range 40.
    * @param target The target creep.
    */
  def heal(target: Creep): ScreepsReturnCode
  /**
    * Remotely repair any structure in the room. Consumes 10 energy units per tick. Repair power depends on the distance to the target: from 600 hits at range 10 to 300 hits at range 40.
    * @param target The target structure.
    */
  def repair(target: Structure[StructureConstant]): ScreepsReturnCode
}

@JSGlobal("StructureTower")
@js.native
class StructureTowerCls protected () extends StructureTower {
  def this(id: java.lang.String) = this()
  /**
    * The amount of energy containing in this structure.
    */
  /* CompleteClass */
  override var energy: scala.Double = js.native
  /**
    * The total amount of energy this structure can contain.
    */
  /* CompleteClass */
  override var energyCapacity: scala.Double = js.native
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
  override var structureType: STRUCTURE_TOWER = js.native
  /**
    * Remotely attack any creep in the room. Consumes 10 energy units per tick. Attack power depends on the distance to the target: from 600 hits at range 10 to 300 hits at range 40.
    * @param target The target creep.
    */
  /* CompleteClass */
  override def attack(target: Creep): ScreepsReturnCode = js.native
  /**
    * Destroy this structure immediately.
    */
  /* CompleteClass */
  override def destroy(): ScreepsReturnCode = js.native
  /**
    * Remotely heal any creep in the room. Consumes 10 energy units per tick. Heal power depends on the distance to the target: from 400 hits at range 10 to 200 hits at range 40.
    * @param target The target creep.
    */
  /* CompleteClass */
  override def heal(target: Creep): ScreepsReturnCode = js.native
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
  /**
    * Remotely repair any structure in the room. Consumes 10 energy units per tick. Repair power depends on the distance to the target: from 600 hits at range 10 to 300 hits at range 40.
    * @param target The target structure.
    */
  /* CompleteClass */
  override def repair(target: Structure[StructureConstant]): ScreepsReturnCode = js.native
}

object StructureTower {
  @scala.inline
  def apply(
    attack: Creep => ScreepsReturnCode,
    destroy: () => ScreepsReturnCode,
    energy: scala.Double,
    energyCapacity: scala.Double,
    heal: Creep => ScreepsReturnCode,
    hits: scala.Double,
    hitsMax: scala.Double,
    id: java.lang.String,
    isActive: () => scala.Boolean,
    my: scala.Boolean,
    notifyWhenAttacked: scala.Boolean => ScreepsReturnCode,
    owner: Owner,
    pos: RoomPosition,
    repair: Structure[StructureConstant] => ScreepsReturnCode,
    room: Room,
    structureType: STRUCTURE_TOWER
  ): StructureTower = {
    val __obj = js.Dynamic.literal(attack = js.Any.fromFunction1(attack), destroy = js.Any.fromFunction0(destroy), energy = energy, energyCapacity = energyCapacity, heal = js.Any.fromFunction1(heal), hits = hits, hitsMax = hitsMax, id = id, isActive = js.Any.fromFunction0(isActive), my = my, notifyWhenAttacked = js.Any.fromFunction1(notifyWhenAttacked), owner = owner, pos = pos, repair = js.Any.fromFunction1(repair), room = room, structureType = structureType)
  
    __obj.asInstanceOf[StructureTower]
  }
}

