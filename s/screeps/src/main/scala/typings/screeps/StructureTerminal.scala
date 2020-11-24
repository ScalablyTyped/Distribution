package typings.screeps

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Sends any resources to a Terminal in another room.
  */
@js.native
trait StructureTerminal
  extends OwnedStructure[STRUCTURE_TERMINAL]
     with AnyOwnedStructure
     with AnyStoreStructure
     with ConcreteStructure[js.Any] {
  
  /**
    * The remaining amount of ticks while this terminal cannot be used to make StructureTerminal.send or Game.market.deal calls.
    */
  var cooldown: Double = js.native
  
  /**
    * Sends resource to a Terminal in another room with the specified name.
    * @param resourceType One of the RESOURCE_* constants.
    * @param amount The amount of resources to be sent.
    * @param destination The name of the target room. You don't have to gain visibility in this room.
    * @param description The description of the transaction. It is visible to the recipient. The maximum length is 100 characters.
    */
  def send(resourceType: ResourceConstant, amount: Double, destination: String): ScreepsReturnCode = js.native
  def send(resourceType: ResourceConstant, amount: Double, destination: String, description: String): ScreepsReturnCode = js.native
  
  /**
    * A Store object that contains cargo of this structure.
    */
  var store: StoreDefinition = js.native
  
  /**
    * The total amount of resources the storage can contain.
    * @deprecated An alias for .store.getCapacity().
    */
  var storeCapacity: Double = js.native
}
