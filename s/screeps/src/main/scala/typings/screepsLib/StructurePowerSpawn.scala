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
    createPowerCreep: js.Function1[java.lang.String, ScreepsReturnCode],
    destroy: js.Function0[ScreepsReturnCode],
    energy: scala.Double,
    energyCapacity: scala.Double,
    hits: scala.Double,
    hitsMax: scala.Double,
    id: java.lang.String,
    isActive: js.Function0[scala.Boolean],
    my: scala.Boolean,
    notifyWhenAttacked: js.Function1[scala.Boolean, ScreepsReturnCode],
    owner: Owner,
    pos: RoomPosition,
    power: scala.Double,
    powerCapacity: scala.Double,
    processPower: js.Function0[ScreepsReturnCode],
    room: Room,
    structureType: STRUCTURE_POWER_SPAWN
  ): StructurePowerSpawn = {
    val __obj = js.Dynamic.literal(createPowerCreep = createPowerCreep, destroy = destroy, energy = energy, energyCapacity = energyCapacity, hits = hits, hitsMax = hitsMax, id = id, isActive = isActive, my = my, notifyWhenAttacked = notifyWhenAttacked, owner = owner, pos = pos, power = power, powerCapacity = powerCapacity, processPower = processPower, room = room, structureType = structureType)
  
    __obj.asInstanceOf[StructurePowerSpawn]
  }
}

