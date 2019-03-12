package typings
package screepsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Non-player structure. Contains power resource which can be obtained by
  * destroying the structure. Hits the attacker creep back on each attack.
  */
trait StructurePowerSpawn
  extends OwnedStructure[STRUCTURE_POWER_SPAWN]
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
    * The amount of power containing in this structure.
    */
  var power: scala.Double
  /**
    * The total amount of power this structure can contain.
    */
  var powerCapacity: scala.Double
  /**
    * Create a power creep. Currently in development
    * @param name The name of the power creep.
    */
  def createPowerCreep(name: java.lang.String): ScreepsReturnCode
  /**
    * Register power resource units into your account. Registered power allows to develop power creeps skills. Consumes 1 power resource unit and 50 energy resource units.
    */
  def processPower(): ScreepsReturnCode
}

object StructurePowerSpawn {
  @scala.inline
  def apply(
    createPowerCreep: java.lang.String => ScreepsReturnCode,
    destroy: () => ScreepsReturnCode,
    energy: scala.Double,
    energyCapacity: scala.Double,
    hits: scala.Double,
    hitsMax: scala.Double,
    id: java.lang.String,
    isActive: () => scala.Boolean,
    my: scala.Boolean,
    notifyWhenAttacked: scala.Boolean => ScreepsReturnCode,
    owner: Owner,
    pos: RoomPosition,
    power: scala.Double,
    powerCapacity: scala.Double,
    processPower: () => ScreepsReturnCode,
    room: Room,
    structureType: STRUCTURE_POWER_SPAWN
  ): StructurePowerSpawn = {
    val __obj = js.Dynamic.literal(createPowerCreep = js.Any.fromFunction1(createPowerCreep), destroy = js.Any.fromFunction0(destroy), energy = energy, energyCapacity = energyCapacity, hits = hits, hitsMax = hitsMax, id = id, isActive = js.Any.fromFunction0(isActive), my = my, notifyWhenAttacked = js.Any.fromFunction1(notifyWhenAttacked), owner = owner, pos = pos, power = power, powerCapacity = powerCapacity, processPower = js.Any.fromFunction0(processPower), room = room, structureType = structureType)
  
    __obj.asInstanceOf[StructurePowerSpawn]
  }
}

