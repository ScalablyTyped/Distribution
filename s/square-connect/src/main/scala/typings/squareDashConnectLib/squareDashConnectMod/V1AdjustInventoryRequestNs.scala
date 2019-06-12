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
    sealed trait MANUAL_ADJUST
      extends squareDashConnectLib.squareDashConnectMod.V1AdjustInventoryRequestNs.AdjustmentTypeEnum
    
    @js.native
    sealed trait RECEIVE_STOCK
      extends squareDashConnectLib.squareDashConnectMod.V1AdjustInventoryRequestNs.AdjustmentTypeEnum
    
    @js.native
    sealed trait SALE
      extends squareDashConnectLib.squareDashConnectMod.V1AdjustInventoryRequestNs.AdjustmentTypeEnum
    
    /* "MANUAL_ADJUST" */ val MANUAL_ADJUST: MANUAL_ADJUST with java.lang.String = js.native
    /* "RECEIVE_STOCK" */ val RECEIVE_STOCK: RECEIVE_STOCK with java.lang.String = js.native
    /* "SALE" */ val SALE: SALE with java.lang.String = js.native
    @JSBracketAccess
    def apply(value: java.lang.String): js.UndefOr[
        squareDashConnectLib.squareDashConnectMod.V1AdjustInventoryRequestNs.AdjustmentTypeEnum with java.lang.String
      ] = js.native
  }
  
}

