package typings.squareDashConnect.squareDashConnectMod

import typings.squareDashConnect.squareDashConnectMod.V1CashDrawerEventNs.EventTypeEnum
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
    sealed trait CASH_TENDER_CANCELED_PAYMENT extends EventTypeEnum
    
    @js.native
    sealed trait CASH_TENDER_PAYMENT extends EventTypeEnum
    
    @js.native
    sealed trait CASH_TENDER_REFUND extends EventTypeEnum
    
    @js.native
    sealed trait NO_SALE extends EventTypeEnum
    
    @js.native
    sealed trait OTHER_TENDER_CANCELED_PAYMENT extends EventTypeEnum
    
    @js.native
    sealed trait OTHER_TENDER_PAYMENT extends EventTypeEnum
    
    @js.native
    sealed trait OTHER_TENDER_REFUND extends EventTypeEnum
    
    @js.native
    sealed trait PAID_IN extends EventTypeEnum
    
    @js.native
    sealed trait PAID_OUT extends EventTypeEnum
    
    /* "CASH_TENDER_CANCELED_PAYMENT" */ val CASH_TENDER_CANCELED_PAYMENT: typings.squareDashConnect.squareDashConnectMod.V1CashDrawerEventNs.EventTypeEnum.CASH_TENDER_CANCELED_PAYMENT with String = js.native
    /* "CASH_TENDER_PAYMENT" */ val CASH_TENDER_PAYMENT: typings.squareDashConnect.squareDashConnectMod.V1CashDrawerEventNs.EventTypeEnum.CASH_TENDER_PAYMENT with String = js.native
    /* "CASH_TENDER_REFUND" */ val CASH_TENDER_REFUND: typings.squareDashConnect.squareDashConnectMod.V1CashDrawerEventNs.EventTypeEnum.CASH_TENDER_REFUND with String = js.native
    /* "NO_SALE" */ val NO_SALE: typings.squareDashConnect.squareDashConnectMod.V1CashDrawerEventNs.EventTypeEnum.NO_SALE with String = js.native
    /* "OTHER_TENDER_CANCELED_PAYMENT" */ val OTHER_TENDER_CANCELED_PAYMENT: typings.squareDashConnect.squareDashConnectMod.V1CashDrawerEventNs.EventTypeEnum.OTHER_TENDER_CANCELED_PAYMENT with String = js.native
    /* "OTHER_TENDER_PAYMENT" */ val OTHER_TENDER_PAYMENT: typings.squareDashConnect.squareDashConnectMod.V1CashDrawerEventNs.EventTypeEnum.OTHER_TENDER_PAYMENT with String = js.native
    /* "OTHER_TENDER_REFUND" */ val OTHER_TENDER_REFUND: typings.squareDashConnect.squareDashConnectMod.V1CashDrawerEventNs.EventTypeEnum.OTHER_TENDER_REFUND with String = js.native
    /* "PAID_IN" */ val PAID_IN: typings.squareDashConnect.squareDashConnectMod.V1CashDrawerEventNs.EventTypeEnum.PAID_IN with String = js.native
    /* "PAID_OUT" */ val PAID_OUT: typings.squareDashConnect.squareDashConnectMod.V1CashDrawerEventNs.EventTypeEnum.PAID_OUT with String = js.native
    @JSBracketAccess
    def apply(value: String): js.UndefOr[EventTypeEnum with String] = js.native
  }
  
}

