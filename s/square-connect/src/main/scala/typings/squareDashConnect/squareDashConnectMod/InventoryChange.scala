package typings.squareDashConnect.squareDashConnectMod

import typings.squareDashConnect.squareDashConnectMod.InventoryChange.TypeEnum
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("square-connect", "InventoryChange")
@js.native
class InventoryChange () extends js.Object {
  /**
    * Contains details about the inventory adjustment when `type` is `ADJUSTMENT` and unset for all other types.
    */
  var adjustment: js.UndefOr[InventoryAdjustment] = js.native
  /**
    * Contains details about the physical count when `type` is `PHYSICAL_COUNT` and unset for all other types.
    */
  var physical_count: js.UndefOr[InventoryPhysicalCount] = js.native
  /**
    * Contains details about the inventory transfer when `type` is `TRANSFER` and unset for all other types.
    */
  var transfer: js.UndefOr[InventoryTransfer] = js.native
  /**
    * Indicates how the inventory change was applied.
    * See [InventoryChangeType](#type-inventorychangetype) for possible values.
    */
  var `type`: js.UndefOr[TypeEnum] = js.native
}

@JSImport("square-connect", "InventoryChange")
@js.native
object InventoryChange extends js.Object {
  @js.native
  sealed trait TypeEnum extends js.Object
  
  @js.native
  object TypeEnum extends js.Object {
    @js.native
    sealed trait ADJUSTMENT extends TypeEnum
    
    @js.native
    sealed trait PHYSICAL_COUNT extends TypeEnum
    
    @js.native
    sealed trait TRANSFER extends TypeEnum
    
    /* "ADJUSTMENT" */ val ADJUSTMENT: typings.squareDashConnect.squareDashConnectMod.InventoryChange.TypeEnum.ADJUSTMENT with String = js.native
    /* "PHYSICAL_COUNT" */ val PHYSICAL_COUNT: typings.squareDashConnect.squareDashConnectMod.InventoryChange.TypeEnum.PHYSICAL_COUNT with String = js.native
    /* "TRANSFER" */ val TRANSFER: typings.squareDashConnect.squareDashConnectMod.InventoryChange.TypeEnum.TRANSFER with String = js.native
    @JSBracketAccess
    def apply(value: String): js.UndefOr[TypeEnum with String] = js.native
  }
  
}

