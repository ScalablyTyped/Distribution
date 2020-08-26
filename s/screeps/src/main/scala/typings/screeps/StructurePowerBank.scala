package typings.screeps

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Non-player structure. Contains power resource which can be obtained by destroying the structure. Hits the attacker creep back on each attack.
  */
@js.native
trait StructurePowerBank
  extends OwnedStructure[STRUCTURE_POWER_BANK]
     with AnyOwnedStructure
     with ConcreteStructure[js.Any] {
  /**
    * The amount of power containing.
    */
  var power: Double = js.native
  /**
    * The amount of game ticks when this structure will disappear.
    */
  var ticksToDecay: Double = js.native
}

object StructurePowerBank {
  @scala.inline
  def apply(
    destroy: () => ScreepsReturnCode,
    effects: js.Array[RoomObjectEffect],
    hits: Double,
    hitsMax: Double,
    id: Id[StructurePowerBank],
    isActive: () => Boolean,
    my: Boolean,
    notifyWhenAttacked: Boolean => ScreepsReturnCode,
    pos: RoomPosition,
    power: Double,
    room: Room,
    structureType: STRUCTURE_POWER_BANK,
    ticksToDecay: Double
  ): StructurePowerBank = {
    val __obj = js.Dynamic.literal(destroy = js.Any.fromFunction0(destroy), effects = effects.asInstanceOf[js.Any], hits = hits.asInstanceOf[js.Any], hitsMax = hitsMax.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], isActive = js.Any.fromFunction0(isActive), my = my.asInstanceOf[js.Any], notifyWhenAttacked = js.Any.fromFunction1(notifyWhenAttacked), pos = pos.asInstanceOf[js.Any], power = power.asInstanceOf[js.Any], room = room.asInstanceOf[js.Any], structureType = structureType.asInstanceOf[js.Any], ticksToDecay = ticksToDecay.asInstanceOf[js.Any])
    __obj.asInstanceOf[StructurePowerBank]
  }
  @scala.inline
  implicit class StructurePowerBankOps[Self <: StructurePowerBank] (val x: Self) extends AnyVal {
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
    def setPower(value: Double): Self = this.set("power", value.asInstanceOf[js.Any])
    @scala.inline
    def setTicksToDecay(value: Double): Self = this.set("ticksToDecay", value.asInstanceOf[js.Any])
  }
  
}

