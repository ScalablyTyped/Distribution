package typings.screeps

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Non-player structure. Contains power resource which can be obtained by destroying the structure. Hits the attacker creep back on each attack.
  */
trait StructurePowerBank
  extends StObject
     with OwnedStructure[STRUCTURE_POWER_BANK]
     with AnyOwnedStructure {
  
  /**
    * The amount of power containing.
    */
  var power: Double
  
  /**
    * The amount of game ticks when this structure will disappear.
    */
  var ticksToDecay: Double
}
object StructurePowerBank {
  
  inline def apply(
    destroy: () => ScreepsReturnCode,
    effects: js.Array[RoomObjectEffect],
    hits: Double,
    hitsMax: Double,
    id: Id[StructurePowerBank],
    isActive: () => Boolean,
    my: Boolean,
    notifyWhenAttacked: Boolean => ScreepsReturnCode,
    owner: /* import warning: importer.ImportType#apply Failed type conversion: T extends screeps.STRUCTURE_CONTROLLER ? screeps.Owner | undefined : screeps.Owner */ js.Any,
    pos: RoomPosition,
    power: Double,
    room: Room,
    structureType: STRUCTURE_POWER_BANK,
    ticksToDecay: Double
  ): StructurePowerBank = {
    val __obj = js.Dynamic.literal(destroy = js.Any.fromFunction0(destroy), effects = effects.asInstanceOf[js.Any], hits = hits.asInstanceOf[js.Any], hitsMax = hitsMax.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], isActive = js.Any.fromFunction0(isActive), my = my.asInstanceOf[js.Any], notifyWhenAttacked = js.Any.fromFunction1(notifyWhenAttacked), owner = owner.asInstanceOf[js.Any], pos = pos.asInstanceOf[js.Any], power = power.asInstanceOf[js.Any], room = room.asInstanceOf[js.Any], structureType = structureType.asInstanceOf[js.Any], ticksToDecay = ticksToDecay.asInstanceOf[js.Any])
    __obj.asInstanceOf[StructurePowerBank]
  }
  
  extension [Self <: StructurePowerBank](x: Self) {
    
    inline def setPower(value: Double): Self = StObject.set(x, "power", value.asInstanceOf[js.Any])
    
    inline def setTicksToDecay(value: Double): Self = StObject.set(x, "ticksToDecay", value.asInstanceOf[js.Any])
  }
}
