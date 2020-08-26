package typings.screeps

import typings.screeps.anon.StoreRESOURCEENERGYRESOUR
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Non-player structure. Contains power resource which can be obtained by
  * destroying the structure. Hits the attacker creep back on each attack.
  */
@js.native
trait StructurePowerSpawn
  extends OwnedStructure[STRUCTURE_POWER_SPAWN]
     with AnyOwnedStructure
     with AnyStoreStructure
     with ConcreteStructure[js.Any] {
  /**
    * The amount of energy containing in this structure.
    * @deprecated An alias for .store[RESOURCE_ENERGY].
    */
  var energy: Double = js.native
  /**
    * The total amount of energy this structure can contain.
    * @deprecated An alias for .store.getCapacity(RESOURCE_ENERGY).
    */
  var energyCapacity: Double = js.native
  /**
    * The amount of power containing in this structure.
    * @deprecated An alias for .store[RESOURCE_POWER].
    */
  var power: Double = js.native
  /**
    * The total amount of power this structure can contain.
    * @deprecated An alias for .store.getCapacity(RESOURCE_POWER).
    */
  var powerCapacity: Double = js.native
  /**
    *
    */
  var store: StoreRESOURCEENERGYRESOUR = js.native
  /**
    * Register power resource units into your account. Registered power allows to develop power creeps skills. Consumes 1 power resource unit and 50 energy resource units.
    */
  def processPower(): ScreepsReturnCode = js.native
}

object StructurePowerSpawn {
  @scala.inline
  def apply(
    destroy: () => ScreepsReturnCode,
    effects: js.Array[RoomObjectEffect],
    energy: Double,
    energyCapacity: Double,
    hits: Double,
    hitsMax: Double,
    id: Id[StructurePowerSpawn],
    isActive: () => Boolean,
    my: Boolean,
    notifyWhenAttacked: Boolean => ScreepsReturnCode,
    pos: RoomPosition,
    power: Double,
    powerCapacity: Double,
    processPower: () => ScreepsReturnCode,
    room: Room,
    store: StoreRESOURCEENERGYRESOUR,
    structureType: STRUCTURE_POWER_SPAWN
  ): StructurePowerSpawn = {
    val __obj = js.Dynamic.literal(destroy = js.Any.fromFunction0(destroy), effects = effects.asInstanceOf[js.Any], energy = energy.asInstanceOf[js.Any], energyCapacity = energyCapacity.asInstanceOf[js.Any], hits = hits.asInstanceOf[js.Any], hitsMax = hitsMax.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], isActive = js.Any.fromFunction0(isActive), my = my.asInstanceOf[js.Any], notifyWhenAttacked = js.Any.fromFunction1(notifyWhenAttacked), pos = pos.asInstanceOf[js.Any], power = power.asInstanceOf[js.Any], powerCapacity = powerCapacity.asInstanceOf[js.Any], processPower = js.Any.fromFunction0(processPower), room = room.asInstanceOf[js.Any], store = store.asInstanceOf[js.Any], structureType = structureType.asInstanceOf[js.Any])
    __obj.asInstanceOf[StructurePowerSpawn]
  }
  @scala.inline
  implicit class StructurePowerSpawnOps[Self <: StructurePowerSpawn] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setEnergy(value: Double): Self = this.set("energy", value.asInstanceOf[js.Any])
    @scala.inline
    def setEnergyCapacity(value: Double): Self = this.set("energyCapacity", value.asInstanceOf[js.Any])
    @scala.inline
    def setPower(value: Double): Self = this.set("power", value.asInstanceOf[js.Any])
    @scala.inline
    def setPowerCapacity(value: Double): Self = this.set("powerCapacity", value.asInstanceOf[js.Any])
    @scala.inline
    def setProcessPower(value: () => ScreepsReturnCode): Self = this.set("processPower", js.Any.fromFunction0(value))
    @scala.inline
    def setStore(value: StoreRESOURCEENERGYRESOUR): Self = this.set("store", value.asInstanceOf[js.Any])
  }
  
}

