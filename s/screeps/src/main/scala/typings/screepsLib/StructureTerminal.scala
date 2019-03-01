package typings
package screepsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Sends any resources to a Terminal in another room.
  */
@js.native
trait StructureTerminal
  extends OwnedStructure[STRUCTURE_TERMINAL]
     with AnyOwnedStructure {
  /**
    * The remaining amount of ticks while this terminal cannot be used to make StructureTerminal.send or Game.market.deal calls.
    */
  var cooldown: scala.Double = js.native
  /**
    * An object with the storage contents. Each object key is one of the RESOURCE_* constants, values are resources amounts.
    */
  var store: StoreDefinition = js.native
  /**
    * The total amount of resources the storage can contain.
    */
  var storeCapacity: scala.Double = js.native
  /**
    * Sends resource to a Terminal in another room with the specified name.
    * @param resourceType One of the RESOURCE_* constants.
    * @param amount The amount of resources to be sent. The minimum amount is 100.
    * @param destination The name of the target room. You don't have to gain visibility in this room.
    * @param description The description of the transaction. It is visible to the recipient. The maximum length is 100 characters.
    */
  def send(resourceType: ResourceConstant, amount: scala.Double, destination: java.lang.String): ScreepsReturnCode = js.native
  def send(
    resourceType: ResourceConstant,
    amount: scala.Double,
    destination: java.lang.String,
    description: java.lang.String
  ): ScreepsReturnCode = js.native
}

