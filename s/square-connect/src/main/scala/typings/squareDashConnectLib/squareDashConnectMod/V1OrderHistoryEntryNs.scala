package typings
package squareDashConnectLib.squareDashConnectMod

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
    sealed trait CANCELED
      extends squareDashConnectLib.squareDashConnectMod.V1OrderHistoryEntryNs.ActionEnum
    
    @js.native
    sealed trait COMPLETED
      extends squareDashConnectLib.squareDashConnectMod.V1OrderHistoryEntryNs.ActionEnum
    
    @js.native
    sealed trait DECLINED
      extends squareDashConnectLib.squareDashConnectMod.V1OrderHistoryEntryNs.ActionEnum
    
    @js.native
    sealed trait EXPIRED
      extends squareDashConnectLib.squareDashConnectMod.V1OrderHistoryEntryNs.ActionEnum
    
    @js.native
    sealed trait ORDERPLACED
      extends squareDashConnectLib.squareDashConnectMod.V1OrderHistoryEntryNs.ActionEnum
    
    @js.native
    sealed trait PAYMENTRECEIVED
      extends squareDashConnectLib.squareDashConnectMod.V1OrderHistoryEntryNs.ActionEnum
    
    @js.native
    sealed trait REFUNDED
      extends squareDashConnectLib.squareDashConnectMod.V1OrderHistoryEntryNs.ActionEnum
    
    /* "CANCELED" */ val CANCELED: CANCELED with java.lang.String = js.native
    /* "COMPLETED" */ val COMPLETED: COMPLETED with java.lang.String = js.native
    /* "DECLINED" */ val DECLINED: DECLINED with java.lang.String = js.native
    /* "EXPIRED" */ val EXPIRED: EXPIRED with java.lang.String = js.native
    /* "ORDER_PLACED" */ val ORDERPLACED: ORDERPLACED with java.lang.String = js.native
    /* "PAYMENT_RECEIVED" */ val PAYMENTRECEIVED: PAYMENTRECEIVED with java.lang.String = js.native
    /* "REFUNDED" */ val REFUNDED: REFUNDED with java.lang.String = js.native
    @JSBracketAccess
    def apply(value: java.lang.String): js.UndefOr[
        squareDashConnectLib.squareDashConnectMod.V1OrderHistoryEntryNs.ActionEnum with java.lang.String
      ] = js.native
  }
  
}

