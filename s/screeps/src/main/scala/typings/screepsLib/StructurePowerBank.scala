package typings
package screepsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Non-player structure. Contains power resource which can be obtained by destroying the structure. Hits the attacker creep back on each attack.
  */
trait StructurePowerBank
  extends OwnedStructure[STRUCTURE_POWER_BANK]
     with AnyOwnedStructure {
  /**
    * The amount of power containing.
    */
  var power: scala.Double
  /**
    * The amount of game ticks when this structure will disappear.
    */
  var ticksToDecay: scala.Double
}

object StructurePowerBank {
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
    power: scala.Double,
    room: Room,
    structureType: STRUCTURE_POWER_BANK,
    ticksToDecay: scala.Double
  ): StructurePowerBank = {
    val __obj = js.Dynamic.literal(destroy = js.Any.fromFunction0(destroy), hits = hits, hitsMax = hitsMax, id = id, isActive = js.Any.fromFunction0(isActive), my = my, notifyWhenAttacked = js.Any.fromFunction1(notifyWhenAttacked), owner = owner, pos = pos, power = power, room = room, structureType = structureType, ticksToDecay = ticksToDecay)
  
    __obj.asInstanceOf[StructurePowerBank]
  }
}

