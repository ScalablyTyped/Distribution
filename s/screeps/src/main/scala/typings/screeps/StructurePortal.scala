package typings.screeps

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A non-player structure.
  * Instantly teleports your creeps to a distant room acting as a room exit tile.
  * Portals appear randomly in the central room of each sector.
  */
trait StructurePortal
  extends StObject
     with Structure[STRUCTURE_PORTAL]
     with AnyStructure
     with ConcreteStructure[js.Any] {
  
  /**
    * If this is an inter-room portal, then this property contains a RoomPosition object leading to the point in the destination room.
    * If this is an inter-shard portal, then this property contains an object with shard and room string properties.
    * Exact coordinates are undetermined, the creep will appear at any free spot in the destination room.
    */
  var destination: RoomPosition | typings.screeps.anon.Shard
  
  /**
    * The amount of game ticks when the portal disappears, or undefined when the portal is stable.
    */
  var ticksToDecay: js.UndefOr[Double] = js.undefined
}
object StructurePortal {
  
  inline def apply(
    destination: RoomPosition | typings.screeps.anon.Shard,
    destroy: () => ScreepsReturnCode,
    effects: js.Array[RoomObjectEffect],
    hits: Double,
    hitsMax: Double,
    id: Id[StructurePortal],
    isActive: () => Boolean,
    notifyWhenAttacked: Boolean => ScreepsReturnCode,
    pos: RoomPosition,
    room: Room,
    structureType: STRUCTURE_PORTAL
  ): StructurePortal = {
    val __obj = js.Dynamic.literal(destination = destination.asInstanceOf[js.Any], destroy = js.Any.fromFunction0(destroy), effects = effects.asInstanceOf[js.Any], hits = hits.asInstanceOf[js.Any], hitsMax = hitsMax.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], isActive = js.Any.fromFunction0(isActive), notifyWhenAttacked = js.Any.fromFunction1(notifyWhenAttacked), pos = pos.asInstanceOf[js.Any], room = room.asInstanceOf[js.Any], structureType = structureType.asInstanceOf[js.Any])
    __obj.asInstanceOf[StructurePortal]
  }
  
  extension [Self <: StructurePortal](x: Self) {
    
    inline def setDestination(value: RoomPosition | typings.screeps.anon.Shard): Self = StObject.set(x, "destination", value.asInstanceOf[js.Any])
    
    inline def setTicksToDecay(value: Double): Self = StObject.set(x, "ticksToDecay", value.asInstanceOf[js.Any])
    
    inline def setTicksToDecayUndefined: Self = StObject.set(x, "ticksToDecay", js.undefined)
  }
}
