package typings
package squareDashConnectLib.squareDashConnectMod

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
    sealed trait ADJUSTMENT
      extends squareDashConnectLib.squareDashConnectMod.InventoryChangeNs.TypeEnum
    
    @js.native
    sealed trait PHYSICAL_COUNT
      extends squareDashConnectLib.squareDashConnectMod.InventoryChangeNs.TypeEnum
    
    @js.native
    sealed trait TRANSFER
      extends squareDashConnectLib.squareDashConnectMod.InventoryChangeNs.TypeEnum
    
    /* "ADJUSTMENT" */ val ADJUSTMENT: ADJUSTMENT with java.lang.String = js.native
    /* "PHYSICAL_COUNT" */ val PHYSICAL_COUNT: PHYSICAL_COUNT with java.lang.String = js.native
    /* "TRANSFER" */ val TRANSFER: TRANSFER with java.lang.String = js.native
    @JSBracketAccess
    def apply(value: java.lang.String): js.UndefOr[
        squareDashConnectLib.squareDashConnectMod.InventoryChangeNs.TypeEnum with java.lang.String
      ] = js.native
  }
  
}

