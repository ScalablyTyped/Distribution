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
    sealed trait BALANCECHARGE
      extends squareDashConnectLib.squareDashConnectMod.V1SettlementEntryNs.TypeEnum
    
    @js.native
    sealed trait CHARGE
      extends squareDashConnectLib.squareDashConnectMod.V1SettlementEntryNs.TypeEnum
    
    @js.native
    sealed trait FREEPROCESSING
      extends squareDashConnectLib.squareDashConnectMod.V1SettlementEntryNs.TypeEnum
    
    @js.native
    sealed trait HOLDADJUSTMENT
      extends squareDashConnectLib.squareDashConnectMod.V1SettlementEntryNs.TypeEnum
    
    @js.native
    sealed trait INCENTEDPAYMENT
      extends squareDashConnectLib.squareDashConnectMod.V1SettlementEntryNs.TypeEnum
    
    @js.native
    sealed trait OTHER
      extends squareDashConnectLib.squareDashConnectMod.V1SettlementEntryNs.TypeEnum
    
    @js.native
    sealed trait PAIDSERVICEFEE
      extends squareDashConnectLib.squareDashConnectMod.V1SettlementEntryNs.TypeEnum
    
    @js.native
    sealed trait PAIDSERVICEFEEREFUND
      extends squareDashConnectLib.squareDashConnectMod.V1SettlementEntryNs.TypeEnum
    
    @js.native
    sealed trait REDEMPTIONCODE
      extends squareDashConnectLib.squareDashConnectMod.V1SettlementEntryNs.TypeEnum
    
    @js.native
    sealed trait REFUND
      extends squareDashConnectLib.squareDashConnectMod.V1SettlementEntryNs.TypeEnum
    
    @js.native
    sealed trait RETURNEDACHENTRY
      extends squareDashConnectLib.squareDashConnectMod.V1SettlementEntryNs.TypeEnum
    
    @js.native
    sealed trait RETURNEDPAYOUT
      extends squareDashConnectLib.squareDashConnectMod.V1SettlementEntryNs.TypeEnum
    
    @js.native
    sealed trait RETURNEDSQUARE275
      extends squareDashConnectLib.squareDashConnectMod.V1SettlementEntryNs.TypeEnum
    
    @js.native
    sealed trait SQUARE275
      extends squareDashConnectLib.squareDashConnectMod.V1SettlementEntryNs.TypeEnum
    
    @js.native
    sealed trait SQUARECAPITALADVANCE
      extends squareDashConnectLib.squareDashConnectMod.V1SettlementEntryNs.TypeEnum
    
    @js.native
    sealed trait SQUARECAPITALPAYMENT
      extends squareDashConnectLib.squareDashConnectMod.V1SettlementEntryNs.TypeEnum
    
    @js.native
    sealed trait SQUARECAPITALREVERSEDPAYMENT
      extends squareDashConnectLib.squareDashConnectMod.V1SettlementEntryNs.TypeEnum
    
    @js.native
    sealed trait SQUARECARD
      extends squareDashConnectLib.squareDashConnectMod.V1SettlementEntryNs.TypeEnum
    
    @js.native
    sealed trait SUBSCRIPTIONFEE
      extends squareDashConnectLib.squareDashConnectMod.V1SettlementEntryNs.TypeEnum
    
    @js.native
    sealed trait SUBSCRIPTIONFEEREFUND
      extends squareDashConnectLib.squareDashConnectMod.V1SettlementEntryNs.TypeEnum
    
    /* "ADJUSTMENT" */ val ADJUSTMENT: ADJUSTMENT with java.lang.String = js.native
    /* "BALANCE_CHARGE" */ val BALANCECHARGE: BALANCECHARGE with java.lang.String = js.native
    /* "CHARGE" */ val CHARGE: CHARGE with java.lang.String = js.native
    /* "FREE_PROCESSING" */ val FREEPROCESSING: FREEPROCESSING with java.lang.String = js.native
    /* "HOLD_ADJUSTMENT" */ val HOLDADJUSTMENT: HOLDADJUSTMENT with java.lang.String = js.native
    /* "INCENTED_PAYMENT" */ val INCENTEDPAYMENT: INCENTEDPAYMENT with java.lang.String = js.native
    /* "OTHER" */ val OTHER: OTHER with java.lang.String = js.native
    /* "PAID_SERVICE_FEE" */ val PAIDSERVICEFEE: PAIDSERVICEFEE with java.lang.String = js.native
    /* "PAID_SERVICE_FEE_REFUND" */ val PAIDSERVICEFEEREFUND: PAIDSERVICEFEEREFUND with java.lang.String = js.native
    /* "REDEMPTION_CODE" */ val REDEMPTIONCODE: REDEMPTIONCODE with java.lang.String = js.native
    /* "REFUND" */ val REFUND: REFUND with java.lang.String = js.native
    /* "RETURNED_ACH_ENTRY" */ val RETURNEDACHENTRY: RETURNEDACHENTRY with java.lang.String = js.native
    /* "RETURNED_PAYOUT" */ val RETURNEDPAYOUT: RETURNEDPAYOUT with java.lang.String = js.native
    /* "RETURNED_SQUARE_275" */ val RETURNEDSQUARE275: RETURNEDSQUARE275 with java.lang.String = js.native
    /* "SQUARE_275" */ val SQUARE275: SQUARE275 with java.lang.String = js.native
    /* "SQUARE_CAPITAL_ADVANCE" */ val SQUARECAPITALADVANCE: SQUARECAPITALADVANCE with java.lang.String = js.native
    /* "SQUARE_CAPITAL_PAYMENT" */ val SQUARECAPITALPAYMENT: SQUARECAPITALPAYMENT with java.lang.String = js.native
    /* "SQUARE_CAPITAL_REVERSED_PAYMENT" */ val SQUARECAPITALREVERSEDPAYMENT: SQUARECAPITALREVERSEDPAYMENT with java.lang.String = js.native
    /* "SQUARE_CARD" */ val SQUARECARD: SQUARECARD with java.lang.String = js.native
    /* "SUBSCRIPTION_FEE" */ val SUBSCRIPTIONFEE: SUBSCRIPTIONFEE with java.lang.String = js.native
    /* "SUBSCRIPTION_FEE_REFUND" */ val SUBSCRIPTIONFEEREFUND: SUBSCRIPTIONFEEREFUND with java.lang.String = js.native
    @JSBracketAccess
    def apply(value: java.lang.String): js.UndefOr[
        squareDashConnectLib.squareDashConnectMod.V1SettlementEntryNs.TypeEnum with java.lang.String
      ] = js.native
  }
  
}

