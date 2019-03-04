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
    destroy: js.Function0[ScreepsReturnCode],
    hits: scala.Double,
    hitsMax: scala.Double,
    id: java.lang.String,
    isActive: js.Function0[scala.Boolean],
    my: scala.Boolean,
    notifyWhenAttacked: js.Function1[scala.Boolean, ScreepsReturnCode],
    owner: Owner,
    pos: RoomPosition,
    power: scala.Double,
    room: Room,
    structureType: STRUCTURE_POWER_BANK,
    ticksToDecay: scala.Double
  ): StructurePowerBank = {
    val __obj = js.Dynamic.literal(destroy = destroy, hits = hits, hitsMax = hitsMax, id = id, isActive = isActive, my = my, notifyWhenAttacked = notifyWhenAttacked, owner = owner, pos = pos, power = power, room = room, structureType = structureType, ticksToDecay = ticksToDecay)
  
    __obj.asInstanceOf[StructurePowerBank]
  }
}

