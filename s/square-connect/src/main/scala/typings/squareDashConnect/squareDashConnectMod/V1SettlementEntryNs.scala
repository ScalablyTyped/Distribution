package typings.squareDashConnect.squareDashConnectMod

import typings.squareDashConnect.squareDashConnectMod.V1SettlementEntryNs.TypeEnum
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("square-connect", "V1SettlementEntry")
@js.native
object V1SettlementEntryNs extends js.Object {
  @js.native
  sealed trait TypeEnum extends js.Object
  
  @js.native
  object TypeEnum extends js.Object {
    @js.native
    sealed trait ADJUSTMENT extends TypeEnum
    
    @js.native
    sealed trait BALANCE_CHARGE extends TypeEnum
    
    @js.native
    sealed trait CHARGE extends TypeEnum
    
    @js.native
    sealed trait FREE_PROCESSING extends TypeEnum
    
    @js.native
    sealed trait HOLD_ADJUSTMENT extends TypeEnum
    
    @js.native
    sealed trait INCENTED_PAYMENT extends TypeEnum
    
    @js.native
    sealed trait OTHER extends TypeEnum
    
    @js.native
    sealed trait PAID_SERVICE_FEE extends TypeEnum
    
    @js.native
    sealed trait PAID_SERVICE_FEE_REFUND extends TypeEnum
    
    @js.native
    sealed trait REDEMPTION_CODE extends TypeEnum
    
    @js.native
    sealed trait REFUND extends TypeEnum
    
    @js.native
    sealed trait RETURNED_ACH_ENTRY extends TypeEnum
    
    @js.native
    sealed trait RETURNED_PAYOUT extends TypeEnum
    
    @js.native
    sealed trait RETURNED_SQUARE_275 extends TypeEnum
    
    @js.native
    sealed trait SQUARE_275 extends TypeEnum
    
    @js.native
    sealed trait SQUARE_CAPITAL_ADVANCE extends TypeEnum
    
    @js.native
    sealed trait SQUARE_CAPITAL_PAYMENT extends TypeEnum
    
    @js.native
    sealed trait SQUARE_CAPITAL_REVERSED_PAYMENT extends TypeEnum
    
    @js.native
    sealed trait SQUARE_CARD extends TypeEnum
    
    @js.native
    sealed trait SUBSCRIPTION_FEE extends TypeEnum
    
    @js.native
    sealed trait SUBSCRIPTION_FEE_REFUND extends TypeEnum
    
    /* "ADJUSTMENT" */ val ADJUSTMENT: typings.squareDashConnect.squareDashConnectMod.V1SettlementEntryNs.TypeEnum.ADJUSTMENT with String = js.native
    /* "BALANCE_CHARGE" */ val BALANCE_CHARGE: typings.squareDashConnect.squareDashConnectMod.V1SettlementEntryNs.TypeEnum.BALANCE_CHARGE with String = js.native
    /* "CHARGE" */ val CHARGE: typings.squareDashConnect.squareDashConnectMod.V1SettlementEntryNs.TypeEnum.CHARGE with String = js.native
    /* "FREE_PROCESSING" */ val FREE_PROCESSING: typings.squareDashConnect.squareDashConnectMod.V1SettlementEntryNs.TypeEnum.FREE_PROCESSING with String = js.native
    /* "HOLD_ADJUSTMENT" */ val HOLD_ADJUSTMENT: typings.squareDashConnect.squareDashConnectMod.V1SettlementEntryNs.TypeEnum.HOLD_ADJUSTMENT with String = js.native
    /* "INCENTED_PAYMENT" */ val INCENTED_PAYMENT: typings.squareDashConnect.squareDashConnectMod.V1SettlementEntryNs.TypeEnum.INCENTED_PAYMENT with String = js.native
    /* "OTHER" */ val OTHER: typings.squareDashConnect.squareDashConnectMod.V1SettlementEntryNs.TypeEnum.OTHER with String = js.native
    /* "PAID_SERVICE_FEE" */ val PAID_SERVICE_FEE: typings.squareDashConnect.squareDashConnectMod.V1SettlementEntryNs.TypeEnum.PAID_SERVICE_FEE with String = js.native
    /* "PAID_SERVICE_FEE_REFUND" */ val PAID_SERVICE_FEE_REFUND: typings.squareDashConnect.squareDashConnectMod.V1SettlementEntryNs.TypeEnum.PAID_SERVICE_FEE_REFUND with String = js.native
    /* "REDEMPTION_CODE" */ val REDEMPTION_CODE: typings.squareDashConnect.squareDashConnectMod.V1SettlementEntryNs.TypeEnum.REDEMPTION_CODE with String = js.native
    /* "REFUND" */ val REFUND: typings.squareDashConnect.squareDashConnectMod.V1SettlementEntryNs.TypeEnum.REFUND with String = js.native
    /* "RETURNED_ACH_ENTRY" */ val RETURNED_ACH_ENTRY: typings.squareDashConnect.squareDashConnectMod.V1SettlementEntryNs.TypeEnum.RETURNED_ACH_ENTRY with String = js.native
    /* "RETURNED_PAYOUT" */ val RETURNED_PAYOUT: typings.squareDashConnect.squareDashConnectMod.V1SettlementEntryNs.TypeEnum.RETURNED_PAYOUT with String = js.native
    /* "RETURNED_SQUARE_275" */ val RETURNED_SQUARE_275: typings.squareDashConnect.squareDashConnectMod.V1SettlementEntryNs.TypeEnum.RETURNED_SQUARE_275 with String = js.native
    /* "SQUARE_275" */ val SQUARE_275: typings.squareDashConnect.squareDashConnectMod.V1SettlementEntryNs.TypeEnum.SQUARE_275 with String = js.native
    /* "SQUARE_CAPITAL_ADVANCE" */ val SQUARE_CAPITAL_ADVANCE: typings.squareDashConnect.squareDashConnectMod.V1SettlementEntryNs.TypeEnum.SQUARE_CAPITAL_ADVANCE with String = js.native
    /* "SQUARE_CAPITAL_PAYMENT" */ val SQUARE_CAPITAL_PAYMENT: typings.squareDashConnect.squareDashConnectMod.V1SettlementEntryNs.TypeEnum.SQUARE_CAPITAL_PAYMENT with String = js.native
    /* "SQUARE_CAPITAL_REVERSED_PAYMENT" */ val SQUARE_CAPITAL_REVERSED_PAYMENT: typings.squareDashConnect.squareDashConnectMod.V1SettlementEntryNs.TypeEnum.SQUARE_CAPITAL_REVERSED_PAYMENT with String = js.native
    /* "SQUARE_CARD" */ val SQUARE_CARD: typings.squareDashConnect.squareDashConnectMod.V1SettlementEntryNs.TypeEnum.SQUARE_CARD with String = js.native
    /* "SUBSCRIPTION_FEE" */ val SUBSCRIPTION_FEE: typings.squareDashConnect.squareDashConnectMod.V1SettlementEntryNs.TypeEnum.SUBSCRIPTION_FEE with String = js.native
    /* "SUBSCRIPTION_FEE_REFUND" */ val SUBSCRIPTION_FEE_REFUND: typings.squareDashConnect.squareDashConnectMod.V1SettlementEntryNs.TypeEnum.SUBSCRIPTION_FEE_REFUND with String = js.native
    @JSBracketAccess
    def apply(value: String): js.UndefOr[TypeEnum with String] = js.native
  }
  
}

