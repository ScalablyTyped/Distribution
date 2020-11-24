package typings.screeps

import typings.screeps.anon.StoreRESOURCEENERGYfalse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Remotely transfers energy to another Link in the same room.
  */
@js.native
trait StructureLink
  extends OwnedStructure[STRUCTURE_LINK]
     with AnyOwnedStructure
     with AnyStoreStructure
     with ConcreteStructure[js.Any] {
  
  /**
    * The amount of game ticks the link has to wait until the next transfer is possible.
    */
  var cooldown: Double = js.native
  
  /**
    * The amount of energy containing in the link.
    * @deprecated An alias for .store[RESOURCE_ENERGY].
    */
  var energy: Double = js.native
  
  /**
    * The total amount of energy the link can contain.
    * @deprecated An alias for .store.getCapacity(RESOURCE_ENERGY).
    */
  var energyCapacity: Double = js.native
  
  /**
    * A Store object that contains cargo of this structure.
    */
  var store: StoreRESOURCEENERGYfalse = js.native
  
  /**
    * Transfer energy from the link to another link or a creep.
    *
    * If the target is a creep, it has to be at adjacent square to the link.
    *
    * If the target is a link, it can be at any location in the same room.
    *
    * Remote transfer process implies 3% energy loss and cooldown delay depending on the distance.
    * @param target The target object.
    * @param amount The amount of energy to be transferred. If omitted, all the available energy is used.
    */
  def transferEnergy(target: Creep): ScreepsReturnCode = js.native
  def transferEnergy(target: Creep, amount: Double): ScreepsReturnCode = js.native
  def transferEnergy(target: StructureLink): ScreepsReturnCode = js.native
  def transferEnergy(target: StructureLink, amount: Double): ScreepsReturnCode = js.native
}
