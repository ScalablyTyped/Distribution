package typings.squareDashConnect.squareDashConnectMod

import typings.squareDashConnect.squareDashConnectMod.V1OrderHistoryEntryNs.ActionEnum
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("square-connect", "V1OrderHistoryEntry")
@js.native
object V1OrderHistoryEntryNs extends js.Object {
  @js.native
  sealed trait ActionEnum extends js.Object
  
  @js.native
  object ActionEnum extends js.Object {
    @js.native
    sealed trait CANCELED extends ActionEnum
    
    @js.native
    sealed trait COMPLETED extends ActionEnum
    
    @js.native
    sealed trait DECLINED extends ActionEnum
    
    @js.native
    sealed trait EXPIRED extends ActionEnum
    
    @js.native
    sealed trait ORDER_PLACED extends ActionEnum
    
    @js.native
    sealed trait PAYMENT_RECEIVED extends ActionEnum
    
    @js.native
    sealed trait REFUNDED extends ActionEnum
    
    /* "CANCELED" */ val CANCELED: typings.squareDashConnect.squareDashConnectMod.V1OrderHistoryEntryNs.ActionEnum.CANCELED with String = js.native
    /* "COMPLETED" */ val COMPLETED: typings.squareDashConnect.squareDashConnectMod.V1OrderHistoryEntryNs.ActionEnum.COMPLETED with String = js.native
    /* "DECLINED" */ val DECLINED: typings.squareDashConnect.squareDashConnectMod.V1OrderHistoryEntryNs.ActionEnum.DECLINED with String = js.native
    /* "EXPIRED" */ val EXPIRED: typings.squareDashConnect.squareDashConnectMod.V1OrderHistoryEntryNs.ActionEnum.EXPIRED with String = js.native
    /* "ORDER_PLACED" */ val ORDER_PLACED: typings.squareDashConnect.squareDashConnectMod.V1OrderHistoryEntryNs.ActionEnum.ORDER_PLACED with String = js.native
    /* "PAYMENT_RECEIVED" */ val PAYMENT_RECEIVED: typings.squareDashConnect.squareDashConnectMod.V1OrderHistoryEntryNs.ActionEnum.PAYMENT_RECEIVED with String = js.native
    /* "REFUNDED" */ val REFUNDED: typings.squareDashConnect.squareDashConnectMod.V1OrderHistoryEntryNs.ActionEnum.REFUNDED with String = js.native
    @JSBracketAccess
    def apply(value: String): js.UndefOr[ActionEnum with String] = js.native
  }
  
}

