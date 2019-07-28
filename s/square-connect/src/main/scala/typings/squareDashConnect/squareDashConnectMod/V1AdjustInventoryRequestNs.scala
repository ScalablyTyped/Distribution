package typings.squareDashConnect.squareDashConnectMod

import typings.squareDashConnect.squareDashConnectMod.V1AdjustInventoryRequestNs.AdjustmentTypeEnum
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
    sealed trait MANUAL_ADJUST extends AdjustmentTypeEnum
    
    @js.native
    sealed trait RECEIVE_STOCK extends AdjustmentTypeEnum
    
    @js.native
    sealed trait SALE extends AdjustmentTypeEnum
    
    /* "MANUAL_ADJUST" */ val MANUAL_ADJUST: typings.squareDashConnect.squareDashConnectMod.V1AdjustInventoryRequestNs.AdjustmentTypeEnum.MANUAL_ADJUST with String = js.native
    /* "RECEIVE_STOCK" */ val RECEIVE_STOCK: typings.squareDashConnect.squareDashConnectMod.V1AdjustInventoryRequestNs.AdjustmentTypeEnum.RECEIVE_STOCK with String = js.native
    /* "SALE" */ val SALE: typings.squareDashConnect.squareDashConnectMod.V1AdjustInventoryRequestNs.AdjustmentTypeEnum.SALE with String = js.native
    @JSBracketAccess
    def apply(value: String): js.UndefOr[AdjustmentTypeEnum with String] = js.native
  }
  
}

