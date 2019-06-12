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
    sealed trait CASH_TENDER_CANCELED_PAYMENT
      extends squareDashConnectLib.squareDashConnectMod.V1CashDrawerEventNs.EventTypeEnum
    
    @js.native
    sealed trait CASH_TENDER_PAYMENT
      extends squareDashConnectLib.squareDashConnectMod.V1CashDrawerEventNs.EventTypeEnum
    
    @js.native
    sealed trait CASH_TENDER_REFUND
      extends squareDashConnectLib.squareDashConnectMod.V1CashDrawerEventNs.EventTypeEnum
    
    @js.native
    sealed trait NO_SALE
      extends squareDashConnectLib.squareDashConnectMod.V1CashDrawerEventNs.EventTypeEnum
    
    @js.native
    sealed trait OTHER_TENDER_CANCELED_PAYMENT
      extends squareDashConnectLib.squareDashConnectMod.V1CashDrawerEventNs.EventTypeEnum
    
    @js.native
    sealed trait OTHER_TENDER_PAYMENT
      extends squareDashConnectLib.squareDashConnectMod.V1CashDrawerEventNs.EventTypeEnum
    
    @js.native
    sealed trait OTHER_TENDER_REFUND
      extends squareDashConnectLib.squareDashConnectMod.V1CashDrawerEventNs.EventTypeEnum
    
    @js.native
    sealed trait PAID_IN
      extends squareDashConnectLib.squareDashConnectMod.V1CashDrawerEventNs.EventTypeEnum
    
    @js.native
    sealed trait PAID_OUT
      extends squareDashConnectLib.squareDashConnectMod.V1CashDrawerEventNs.EventTypeEnum
    
    /* "CASH_TENDER_CANCELED_PAYMENT" */ val CASH_TENDER_CANCELED_PAYMENT: CASH_TENDER_CANCELED_PAYMENT with java.lang.String = js.native
    /* "CASH_TENDER_PAYMENT" */ val CASH_TENDER_PAYMENT: CASH_TENDER_PAYMENT with java.lang.String = js.native
    /* "CASH_TENDER_REFUND" */ val CASH_TENDER_REFUND: CASH_TENDER_REFUND with java.lang.String = js.native
    /* "NO_SALE" */ val NO_SALE: NO_SALE with java.lang.String = js.native
    /* "OTHER_TENDER_CANCELED_PAYMENT" */ val OTHER_TENDER_CANCELED_PAYMENT: OTHER_TENDER_CANCELED_PAYMENT with java.lang.String = js.native
    /* "OTHER_TENDER_PAYMENT" */ val OTHER_TENDER_PAYMENT: OTHER_TENDER_PAYMENT with java.lang.String = js.native
    /* "OTHER_TENDER_REFUND" */ val OTHER_TENDER_REFUND: OTHER_TENDER_REFUND with java.lang.String = js.native
    /* "PAID_IN" */ val PAID_IN: PAID_IN with java.lang.String = js.native
    /* "PAID_OUT" */ val PAID_OUT: PAID_OUT with java.lang.String = js.native
    @JSBracketAccess
    def apply(value: java.lang.String): js.UndefOr[
        squareDashConnectLib.squareDashConnectMod.V1CashDrawerEventNs.EventTypeEnum with java.lang.String
      ] = js.native
  }
  
}

