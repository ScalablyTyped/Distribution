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
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("destroy")(destroy)
    __obj.updateDynamic("hits")(hits)
    __obj.updateDynamic("hitsMax")(hitsMax)
    __obj.updateDynamic("id")(id)
    __obj.updateDynamic("isActive")(isActive)
    __obj.updateDynamic("my")(my)
    __obj.updateDynamic("notifyWhenAttacked")(notifyWhenAttacked)
    __obj.updateDynamic("owner")(owner)
    __obj.updateDynamic("pos")(pos)
    __obj.updateDynamic("power")(power)
    __obj.updateDynamic("room")(room)
    __obj.updateDynamic("structureType")(structureType)
    __obj.updateDynamic("ticksToDecay")(ticksToDecay)
    __obj.asInstanceOf[StructurePowerBank]
  }
}

