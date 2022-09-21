package typings.screeps

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Contains up to 2,000 resource units. Can be constructed in neutral rooms. Decays for 5,000 hits per 100 ticks.
  */
trait StructureContainer
  extends StObject
     with Structure[STRUCTURE_CONTAINER]
     with AnyStoreStructure
     with AnyStructure
     with ConcreteStructure[Any] {
  
  /**
    * An object with the structure contents. Each object key is one of the RESOURCE_* constants, values are resources
    * amounts. Use _.sum(structure.store) to get the total amount of contents
    */
  var store: StoreDefinition
  
  /**
    * The total amount of resources the structure can contain.
    * @deprecated An alias for .store.getCapacity().
    */
  var storeCapacity: Double
  
  /**
    * The amount of game ticks when this container will lose some hit points.
    */
  var ticksToDecay: Double
}
object StructureContainer {
  
  inline def apply(
    destroy: () => ScreepsReturnCode,
    effects: js.Array[RoomObjectEffect],
    hits: Double,
    hitsMax: Double,
    id: Id[StructureContainer],
    isActive: () => Boolean,
    notifyWhenAttacked: Boolean => ScreepsReturnCode,
    pos: RoomPosition,
    room: Room,
    store: StoreDefinition,
    storeCapacity: Double,
    structureType: STRUCTURE_CONTAINER,
    ticksToDecay: Double
  ): StructureContainer = {
    val __obj = js.Dynamic.literal(destroy = js.Any.fromFunction0(destroy), effects = effects.asInstanceOf[js.Any], hits = hits.asInstanceOf[js.Any], hitsMax = hitsMax.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], isActive = js.Any.fromFunction0(isActive), notifyWhenAttacked = js.Any.fromFunction1(notifyWhenAttacked), pos = pos.asInstanceOf[js.Any], room = room.asInstanceOf[js.Any], store = store.asInstanceOf[js.Any], storeCapacity = storeCapacity.asInstanceOf[js.Any], structureType = structureType.asInstanceOf[js.Any], ticksToDecay = ticksToDecay.asInstanceOf[js.Any])
    __obj.asInstanceOf[StructureContainer]
  }
  
  extension [Self <: StructureContainer](x: Self) {
    
    inline def setStore(value: StoreDefinition): Self = StObject.set(x, "store", value.asInstanceOf[js.Any])
    
    inline def setStoreCapacity(value: Double): Self = StObject.set(x, "storeCapacity", value.asInstanceOf[js.Any])
    
    inline def setTicksToDecay(value: Double): Self = StObject.set(x, "ticksToDecay", value.asInstanceOf[js.Any])
  }
}
