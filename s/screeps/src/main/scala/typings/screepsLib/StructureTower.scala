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

object StructureTower {
  @scala.inline
  def apply(
    attack: js.Function1[Creep, ScreepsReturnCode],
    destroy: js.Function0[ScreepsReturnCode],
    energy: scala.Double,
    energyCapacity: scala.Double,
    heal: js.Function1[Creep, ScreepsReturnCode],
    hits: scala.Double,
    hitsMax: scala.Double,
    id: java.lang.String,
    isActive: js.Function0[scala.Boolean],
    my: scala.Boolean,
    notifyWhenAttacked: js.Function1[scala.Boolean, ScreepsReturnCode],
    owner: Owner,
    pos: RoomPosition,
    repair: js.Function1[Structure[StructureConstant], ScreepsReturnCode],
    room: Room,
    structureType: STRUCTURE_TOWER
  ): StructureTower = {
    val __obj = js.Dynamic.literal(attack = attack, destroy = destroy, energy = energy, energyCapacity = energyCapacity, heal = heal, hits = hits, hitsMax = hitsMax, id = id, isActive = isActive, my = my, notifyWhenAttacked = notifyWhenAttacked, owner = owner, pos = pos, repair = repair, room = room, structureType = structureType)
  
    __obj.asInstanceOf[StructureTower]
  }
}

