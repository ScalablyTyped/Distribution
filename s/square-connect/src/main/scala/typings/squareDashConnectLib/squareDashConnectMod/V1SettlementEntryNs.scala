package typings
package squareDashConnectLib.squareDashConnectMod

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
    sealed trait ADJUSTMENT
      extends squareDashConnectLib.squareDashConnectMod.V1SettlementEntryNs.TypeEnum
    
    @js.native
    sealed trait BALANCE_CHARGE
      extends squareDashConnectLib.squareDashConnectMod.V1SettlementEntryNs.TypeEnum
    
    @js.native
    sealed trait CHARGE
      extends squareDashConnectLib.squareDashConnectMod.V1SettlementEntryNs.TypeEnum
    
    @js.native
    sealed trait FREE_PROCESSING
      extends squareDashConnectLib.squareDashConnectMod.V1SettlementEntryNs.TypeEnum
    
    @js.native
    sealed trait HOLD_ADJUSTMENT
      extends squareDashConnectLib.squareDashConnectMod.V1SettlementEntryNs.TypeEnum
    
    @js.native
    sealed trait INCENTED_PAYMENT
      extends squareDashConnectLib.squareDashConnectMod.V1SettlementEntryNs.TypeEnum
    
    @js.native
    sealed trait OTHER
      extends squareDashConnectLib.squareDashConnectMod.V1SettlementEntryNs.TypeEnum
    
    @js.native
    sealed trait PAID_SERVICE_FEE
      extends squareDashConnectLib.squareDashConnectMod.V1SettlementEntryNs.TypeEnum
    
    @js.native
    sealed trait PAID_SERVICE_FEE_REFUND
      extends squareDashConnectLib.squareDashConnectMod.V1SettlementEntryNs.TypeEnum
    
    @js.native
    sealed trait REDEMPTION_CODE
      extends squareDashConnectLib.squareDashConnectMod.V1SettlementEntryNs.TypeEnum
    
    @js.native
    sealed trait REFUND
      extends squareDashConnectLib.squareDashConnectMod.V1SettlementEntryNs.TypeEnum
    
    @js.native
    sealed trait RETURNED_ACH_ENTRY
      extends squareDashConnectLib.squareDashConnectMod.V1SettlementEntryNs.TypeEnum
    
    @js.native
    sealed trait RETURNED_PAYOUT
      extends squareDashConnectLib.squareDashConnectMod.V1SettlementEntryNs.TypeEnum
    
    @js.native
    sealed trait RETURNED_SQUARE_275
      extends squareDashConnectLib.squareDashConnectMod.V1SettlementEntryNs.TypeEnum
    
    @js.native
    sealed trait SQUARE_275
      extends squareDashConnectLib.squareDashConnectMod.V1SettlementEntryNs.TypeEnum
    
    @js.native
    sealed trait SQUARE_CAPITAL_ADVANCE
      extends squareDashConnectLib.squareDashConnectMod.V1SettlementEntryNs.TypeEnum
    
    @js.native
    sealed trait SQUARE_CAPITAL_PAYMENT
      extends squareDashConnectLib.squareDashConnectMod.V1SettlementEntryNs.TypeEnum
    
    @js.native
    sealed trait SQUARE_CAPITAL_REVERSED_PAYMENT
      extends squareDashConnectLib.squareDashConnectMod.V1SettlementEntryNs.TypeEnum
    
    @js.native
    sealed trait SQUARE_CARD
      extends squareDashConnectLib.squareDashConnectMod.V1SettlementEntryNs.TypeEnum
    
    @js.native
    sealed trait SUBSCRIPTION_FEE
      extends squareDashConnectLib.squareDashConnectMod.V1SettlementEntryNs.TypeEnum
    
    @js.native
    sealed trait SUBSCRIPTION_FEE_REFUND
      extends squareDashConnectLib.squareDashConnectMod.V1SettlementEntryNs.TypeEnum
    
    /* "ADJUSTMENT" */ val ADJUSTMENT: ADJUSTMENT with java.lang.String = js.native
    /* "BALANCE_CHARGE" */ val BALANCE_CHARGE: BALANCE_CHARGE with java.lang.String = js.native
    /* "CHARGE" */ val CHARGE: CHARGE with java.lang.String = js.native
    /* "FREE_PROCESSING" */ val FREE_PROCESSING: FREE_PROCESSING with java.lang.String = js.native
    /* "HOLD_ADJUSTMENT" */ val HOLD_ADJUSTMENT: HOLD_ADJUSTMENT with java.lang.String = js.native
    /* "INCENTED_PAYMENT" */ val INCENTED_PAYMENT: INCENTED_PAYMENT with java.lang.String = js.native
    /* "OTHER" */ val OTHER: OTHER with java.lang.String = js.native
    /* "PAID_SERVICE_FEE" */ val PAID_SERVICE_FEE: PAID_SERVICE_FEE with java.lang.String = js.native
    /* "PAID_SERVICE_FEE_REFUND" */ val PAID_SERVICE_FEE_REFUND: PAID_SERVICE_FEE_REFUND with java.lang.String = js.native
    /* "REDEMPTION_CODE" */ val REDEMPTION_CODE: REDEMPTION_CODE with java.lang.String = js.native
    /* "REFUND" */ val REFUND: REFUND with java.lang.String = js.native
    /* "RETURNED_ACH_ENTRY" */ val RETURNED_ACH_ENTRY: RETURNED_ACH_ENTRY with java.lang.String = js.native
    /* "RETURNED_PAYOUT" */ val RETURNED_PAYOUT: RETURNED_PAYOUT with java.lang.String = js.native
    /* "RETURNED_SQUARE_275" */ val RETURNED_SQUARE_275: RETURNED_SQUARE_275 with java.lang.String = js.native
    /* "SQUARE_275" */ val SQUARE_275: SQUARE_275 with java.lang.String = js.native
    /* "SQUARE_CAPITAL_ADVANCE" */ val SQUARE_CAPITAL_ADVANCE: SQUARE_CAPITAL_ADVANCE with java.lang.String = js.native
    /* "SQUARE_CAPITAL_PAYMENT" */ val SQUARE_CAPITAL_PAYMENT: SQUARE_CAPITAL_PAYMENT with java.lang.String = js.native
    /* "SQUARE_CAPITAL_REVERSED_PAYMENT" */ val SQUARE_CAPITAL_REVERSED_PAYMENT: SQUARE_CAPITAL_REVERSED_PAYMENT with java.lang.String = js.native
    /* "SQUARE_CARD" */ val SQUARE_CARD: SQUARE_CARD with java.lang.String = js.native
    /* "SUBSCRIPTION_FEE" */ val SUBSCRIPTION_FEE: SUBSCRIPTION_FEE with java.lang.String = js.native
    /* "SUBSCRIPTION_FEE_REFUND" */ val SUBSCRIPTION_FEE_REFUND: SUBSCRIPTION_FEE_REFUND with java.lang.String = js.native
    @JSBracketAccess
    def apply(value: java.lang.String): js.UndefOr[
        squareDashConnectLib.squareDashConnectMod.V1SettlementEntryNs.TypeEnum with java.lang.String
      ] = js.native
  }
  
}

