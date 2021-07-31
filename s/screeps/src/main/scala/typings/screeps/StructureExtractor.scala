package typings.screeps

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Allows to harvest mineral deposits.
  */
trait StructureExtractor
  extends StObject
     with OwnedStructure[STRUCTURE_EXTRACTOR]
     with AnyOwnedStructure
     with ConcreteStructure[js.Any] {
  
  /**
    * The amount of game ticks until the next harvest action is possible.
    */
  var cooldown: Double
}
object StructureExtractor {
  
  @scala.inline
  def apply(
    cooldown: Double,
    destroy: () => ScreepsReturnCode,
    effects: js.Array[RoomObjectEffect],
    hits: Double,
    hitsMax: Double,
    id: Id[StructureExtractor],
    isActive: () => Boolean,
    my: Boolean,
    notifyWhenAttacked: Boolean => ScreepsReturnCode,
    pos: RoomPosition,
    room: Room,
    structureType: STRUCTURE_EXTRACTOR
  ): StructureExtractor = {
    val __obj = js.Dynamic.literal(cooldown = cooldown.asInstanceOf[js.Any], destroy = js.Any.fromFunction0(destroy), effects = effects.asInstanceOf[js.Any], hits = hits.asInstanceOf[js.Any], hitsMax = hitsMax.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], isActive = js.Any.fromFunction0(isActive), my = my.asInstanceOf[js.Any], notifyWhenAttacked = js.Any.fromFunction1(notifyWhenAttacked), pos = pos.asInstanceOf[js.Any], room = room.asInstanceOf[js.Any], structureType = structureType.asInstanceOf[js.Any])
    __obj.asInstanceOf[StructureExtractor]
  }
  
  @scala.inline
  implicit class StructureExtractorMutableBuilder[Self <: StructureExtractor] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCooldown(value: Double): Self = StObject.set(x, "cooldown", value.asInstanceOf[js.Any])
  }
}
