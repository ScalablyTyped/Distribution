package typings.screeps

import typings.screeps.anon.StoreRESOURCEENERGYfalse
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
     with AnyOwnedStructure
     with AnyStoreStructure
     with ConcreteStructure[js.Any] {
  /**
    * The amount of energy containing in this structure.
    * @deprecated An alias for .store[RESOURCE_ENERGY].
    */
  var energy: Double
  /**
    * The total amount of energy this structure can contain.
    * @deprecated An alias for .store.getCapacity(RESOURCE_ENERGY).
    */
  var energyCapacity: Double
  /**
    * A Store object that contains cargo of this structure.
    */
  var store: StoreRESOURCEENERGYfalse
  /**
    * Remotely attack any creep in the room. Consumes 10 energy units per tick. Attack power depends on the distance to the target: from 600 hits at range 10 to 300 hits at range 40.
    * @param target The target creep.
    */
  def attack(target: AnyCreep): ScreepsReturnCode
  /**
    * Remotely heal any creep in the room. Consumes 10 energy units per tick. Heal power depends on the distance to the target: from 400 hits at range 10 to 200 hits at range 40.
    * @param target The target creep.
    */
  def heal(target: AnyCreep): ScreepsReturnCode
  /**
    * Remotely repair any structure in the room. Consumes 10 energy units per tick. Repair power depends on the distance to the target: from 600 hits at range 10 to 300 hits at range 40.
    * @param target The target structure.
    */
  def repair(target: Structure[StructureConstant]): ScreepsReturnCode
}

object StructureTower {
  @scala.inline
  def apply(
    attack: AnyCreep => ScreepsReturnCode,
    destroy: () => ScreepsReturnCode,
    effects: js.Array[RoomObjectEffect],
    energy: Double,
    energyCapacity: Double,
    heal: AnyCreep => ScreepsReturnCode,
    hits: Double,
    hitsMax: Double,
    id: Id[StructureTower],
    isActive: () => Boolean,
    my: Boolean,
    notifyWhenAttacked: Boolean => ScreepsReturnCode,
    pos: RoomPosition,
    repair: Structure[StructureConstant] => ScreepsReturnCode,
    room: Room,
    store: StoreRESOURCEENERGYfalse,
    structureType: STRUCTURE_TOWER,
    owner: Owner = null
  ): StructureTower = {
    val __obj = js.Dynamic.literal(attack = js.Any.fromFunction1(attack), destroy = js.Any.fromFunction0(destroy), effects = effects.asInstanceOf[js.Any], energy = energy.asInstanceOf[js.Any], energyCapacity = energyCapacity.asInstanceOf[js.Any], heal = js.Any.fromFunction1(heal), hits = hits.asInstanceOf[js.Any], hitsMax = hitsMax.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], isActive = js.Any.fromFunction0(isActive), my = my.asInstanceOf[js.Any], notifyWhenAttacked = js.Any.fromFunction1(notifyWhenAttacked), pos = pos.asInstanceOf[js.Any], repair = js.Any.fromFunction1(repair), room = room.asInstanceOf[js.Any], store = store.asInstanceOf[js.Any], structureType = structureType.asInstanceOf[js.Any])
    if (owner != null) __obj.updateDynamic("owner")(owner.asInstanceOf[js.Any])
    __obj.asInstanceOf[StructureTower]
  }
}

