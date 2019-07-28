package typings.squareDashConnect.squareDashConnectMod

import typings.squareDashConnect.squareDashConnectMod.InventoryChangeNs.TypeEnum
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("square-connect", "InventoryChange")
@js.native
object InventoryChangeNs extends js.Object {
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
    
    /* "ADJUSTMENT" */ val ADJUSTMENT: typings.squareDashConnect.squareDashConnectMod.InventoryChangeNs.TypeEnum.ADJUSTMENT with String = js.native
    /* "PHYSICAL_COUNT" */ val PHYSICAL_COUNT: typings.squareDashConnect.squareDashConnectMod.InventoryChangeNs.TypeEnum.PHYSICAL_COUNT with String = js.native
    /* "TRANSFER" */ val TRANSFER: typings.squareDashConnect.squareDashConnectMod.InventoryChangeNs.TypeEnum.TRANSFER with String = js.native
    @JSBracketAccess
    def apply(value: String): js.UndefOr[TypeEnum with String] = js.native
  }
  
}

