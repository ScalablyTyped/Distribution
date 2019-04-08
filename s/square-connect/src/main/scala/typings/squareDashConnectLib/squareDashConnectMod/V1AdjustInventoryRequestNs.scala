package typings
package squareDashConnectLib.squareDashConnectMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("square-connect", "V1AdjustInventoryRequest")
@js.native
object V1AdjustInventoryRequestNs extends js.Object {
  @js.native
  sealed trait AdjustmentTypeEnum extends js.Object
  
  @js.native
  object AdjustmentTypeEnum extends js.Object {
    @js.native
    sealed trait MANUALADJUST
      extends squareDashConnectLib.squareDashConnectMod.V1AdjustInventoryRequestNs.AdjustmentTypeEnum
    
    @js.native
    sealed trait RECEIVESTOCK
      extends squareDashConnectLib.squareDashConnectMod.V1AdjustInventoryRequestNs.AdjustmentTypeEnum
    
    @js.native
    sealed trait SALE
      extends squareDashConnectLib.squareDashConnectMod.V1AdjustInventoryRequestNs.AdjustmentTypeEnum
    
    /* "MANUAL_ADJUST" */ val MANUALADJUST: MANUALADJUST with java.lang.String = js.native
    /* "RECEIVE_STOCK" */ val RECEIVESTOCK: RECEIVESTOCK with java.lang.String = js.native
    /* "SALE" */ val SALE: SALE with java.lang.String = js.native
    @JSBracketAccess
    def apply(value: java.lang.String): js.UndefOr[
        squareDashConnectLib.squareDashConnectMod.V1AdjustInventoryRequestNs.AdjustmentTypeEnum with java.lang.String
      ] = js.native
  }
  
}

