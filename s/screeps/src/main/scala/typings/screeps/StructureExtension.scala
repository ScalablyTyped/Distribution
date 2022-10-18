package typings.screeps

import typings.screeps.anon.StoreRESOURCEENERGYfalse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Contains energy which can be spent on spawning bigger creeps. Extensions can
  * be placed anywhere in the room, any spawns will be able to use them regardless
  * of distance.
  */
trait StructureExtension
  extends StObject
     with OwnedStructure[STRUCTURE_EXTENSION]
     with AnyOwnedStructure
     with AnyStoreStructure {
  
  /**
    * The amount of energy containing in the extension.
    * @deprecated An alias for .store[RESOURCE_ENERGY].
    */
  var energy: Double
  
  /**
    * The total amount of energy the extension can contain.
    * @deprecated An alias for .store.getCapacity(RESOURCE_ENERGY).
    */
  var energyCapacity: Double
  
  /**
    * A Store object that contains cargo of this structure.
    */
  var store: StoreRESOURCEENERGYfalse
}
object StructureExtension {
  
  inline def apply(
    destroy: () => ScreepsReturnCode,
    effects: js.Array[RoomObjectEffect],
    energy: Double,
    energyCapacity: Double,
    hits: Double,
    hitsMax: Double,
    id: Id[StructureExtension],
    isActive: () => Boolean,
    my: Boolean,
    notifyWhenAttacked: Boolean => ScreepsReturnCode,
    owner: /* import warning: importer.ImportType#apply Failed type conversion: T extends screeps.STRUCTURE_CONTROLLER ? screeps.Owner | undefined : screeps.Owner */ js.Any,
    pos: RoomPosition,
    room: Room,
    store: StoreRESOURCEENERGYfalse,
    structureType: STRUCTURE_EXTENSION
  ): StructureExtension = {
    val __obj = js.Dynamic.literal(destroy = js.Any.fromFunction0(destroy), effects = effects.asInstanceOf[js.Any], energy = energy.asInstanceOf[js.Any], energyCapacity = energyCapacity.asInstanceOf[js.Any], hits = hits.asInstanceOf[js.Any], hitsMax = hitsMax.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], isActive = js.Any.fromFunction0(isActive), my = my.asInstanceOf[js.Any], notifyWhenAttacked = js.Any.fromFunction1(notifyWhenAttacked), owner = owner.asInstanceOf[js.Any], pos = pos.asInstanceOf[js.Any], room = room.asInstanceOf[js.Any], store = store.asInstanceOf[js.Any], structureType = structureType.asInstanceOf[js.Any])
    __obj.asInstanceOf[StructureExtension]
  }
  
  extension [Self <: StructureExtension](x: Self) {
    
    inline def setEnergy(value: Double): Self = StObject.set(x, "energy", value.asInstanceOf[js.Any])
    
    inline def setEnergyCapacity(value: Double): Self = StObject.set(x, "energyCapacity", value.asInstanceOf[js.Any])
    
    inline def setStore(value: StoreRESOURCEENERGYfalse): Self = StObject.set(x, "store", value.asInstanceOf[js.Any])
  }
}
