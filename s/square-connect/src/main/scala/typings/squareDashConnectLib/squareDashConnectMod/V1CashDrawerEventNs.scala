package typings
package squareDashConnectLib.squareDashConnectMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("square-connect", "V1CashDrawerEvent")
@js.native
object V1CashDrawerEventNs extends js.Object {
  @js.native
  sealed trait EventTypeEnum extends js.Object
  
  @js.native
  object EventTypeEnum extends js.Object {
    @js.native
    sealed trait CASHTENDERCANCELEDPAYMENT
      extends squareDashConnectLib.squareDashConnectMod.V1CashDrawerEventNs.EventTypeEnum
    
    @js.native
    sealed trait CASHTENDERPAYMENT
      extends squareDashConnectLib.squareDashConnectMod.V1CashDrawerEventNs.EventTypeEnum
    
    @js.native
    sealed trait CASHTENDERREFUND
      extends squareDashConnectLib.squareDashConnectMod.V1CashDrawerEventNs.EventTypeEnum
    
    @js.native
    sealed trait NOSALE
      extends squareDashConnectLib.squareDashConnectMod.V1CashDrawerEventNs.EventTypeEnum
    
    @js.native
    sealed trait OTHERTENDERCANCELEDPAYMENT
      extends squareDashConnectLib.squareDashConnectMod.V1CashDrawerEventNs.EventTypeEnum
    
    @js.native
    sealed trait OTHERTENDERPAYMENT
      extends squareDashConnectLib.squareDashConnectMod.V1CashDrawerEventNs.EventTypeEnum
    
    @js.native
    sealed trait OTHERTENDERREFUND
      extends squareDashConnectLib.squareDashConnectMod.V1CashDrawerEventNs.EventTypeEnum
    
    @js.native
    sealed trait PAIDIN
      extends squareDashConnectLib.squareDashConnectMod.V1CashDrawerEventNs.EventTypeEnum
    
    @js.native
    sealed trait PAIDOUT
      extends squareDashConnectLib.squareDashConnectMod.V1CashDrawerEventNs.EventTypeEnum
    
    /* "CASH_TENDER_CANCELED_PAYMENT" */ val CASHTENDERCANCELEDPAYMENT: CASHTENDERCANCELEDPAYMENT with java.lang.String = js.native
    /* "CASH_TENDER_PAYMENT" */ val CASHTENDERPAYMENT: CASHTENDERPAYMENT with java.lang.String = js.native
    /* "CASH_TENDER_REFUND" */ val CASHTENDERREFUND: CASHTENDERREFUND with java.lang.String = js.native
    /* "NO_SALE" */ val NOSALE: NOSALE with java.lang.String = js.native
    /* "OTHER_TENDER_CANCELED_PAYMENT" */ val OTHERTENDERCANCELEDPAYMENT: OTHERTENDERCANCELEDPAYMENT with java.lang.String = js.native
    /* "OTHER_TENDER_PAYMENT" */ val OTHERTENDERPAYMENT: OTHERTENDERPAYMENT with java.lang.String = js.native
    /* "OTHER_TENDER_REFUND" */ val OTHERTENDERREFUND: OTHERTENDERREFUND with java.lang.String = js.native
    /* "PAID_IN" */ val PAIDIN: PAIDIN with java.lang.String = js.native
    /* "PAID_OUT" */ val PAIDOUT: PAIDOUT with java.lang.String = js.native
    @JSBracketAccess
    def apply(value: java.lang.String): js.UndefOr[
        squareDashConnectLib.squareDashConnectMod.V1CashDrawerEventNs.EventTypeEnum with java.lang.String
      ] = js.native
  }
  
}

