package typings.screeps

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("StructureTower")
@js.native
class StructureTowerCls protected () extends StructureTower {
  def this(id: Id[StructureTower]) = this()
  /**
    * Applied effects, an array of objects with the following properties:
    */
  /* CompleteClass */
  override var effects: js.Array[RoomObjectEffect] = js.native
  /**
    * The amount of energy containing in this structure.
    * @deprecated An alias for .store[RESOURCE_ENERGY].
    */
  /* CompleteClass */
  override var energy: Double = js.native
  /**
    * The total amount of energy this structure can contain.
    * @deprecated An alias for .store.getCapacity(RESOURCE_ENERGY).
    */
  /* CompleteClass */
  override var energyCapacity: Double = js.native
  /**
    * The current amount of hit points of the structure.
    */
  /* CompleteClass */
  override var hits: Double = js.native
  /**
    * The total amount of hit points of the structure.
    */
  /* CompleteClass */
  override var hitsMax: Double = js.native
  /**
    * A unique object identifier. You can use Game.getObjectById method to retrieve an object instance by its id.
    */
  /* CompleteClass */
  override var id: Id[this.type] = js.native
  /**
    * An object representing the position of this object in the room.
    */
  /* CompleteClass */
  override var pos: RoomPosition = js.native
  /**
    * If you can get an instance of a Structure, you can see it.
    * If you can see the Structure, you can see the room it's in.
    */
  /* CompleteClass */
  @JSName("room")
  override var room_Structure: Room = js.native
  /**
    * A Store object that contains cargo of this structure.
    */
  /* CompleteClass */
  override var store: StoreRESOURCEENERGYfalse = js.native
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
  override def attack(target: AnyCreep): ScreepsReturnCode = js.native
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
  override def heal(target: AnyCreep): ScreepsReturnCode = js.native
  /**
    * Check whether this structure can be used. If the room controller level is not enough, then this method will return false, and the structure will be highlighted with red in the game.
    */
  /* CompleteClass */
  override def isActive(): Boolean = js.native
  /**
    * Toggle auto notification when the structure is under attack. The notification will be sent to your account email. Turned on by default.
    * @param enabled Whether to enable notification or disable.
    */
  /* CompleteClass */
  override def notifyWhenAttacked(enabled: Boolean): ScreepsReturnCode = js.native
  /**
    * Remotely repair any structure in the room. Consumes 10 energy units per tick. Repair power depends on the distance to the target: from 600 hits at range 10 to 300 hits at range 40.
    * @param target The target structure.
    */
  /* CompleteClass */
  override def repair(target: Structure[StructureConstant]): ScreepsReturnCode = js.native
}

