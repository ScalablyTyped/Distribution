package typings
package squareDashConnectLib.squareDashConnectMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("square-connect", "V1Tender")
@js.native
object V1TenderNs extends js.Object {
  @js.native
  sealed trait CardBrandEnum extends js.Object
  
  @js.native
  sealed trait EntryMethodEnum extends js.Object
  
  @js.native
  sealed trait TypeEnum extends js.Object
  
  @js.native
  object CardBrandEnum extends js.Object {
    @js.native
    sealed trait AMERICAN_EXPRESS
      extends squareDashConnectLib.squareDashConnectMod.V1TenderNs.CardBrandEnum
    
    @js.native
    sealed trait CHINA_UNIONPAY
      extends squareDashConnectLib.squareDashConnectMod.V1TenderNs.CardBrandEnum
    
    @js.native
    sealed trait DISCOVER
      extends squareDashConnectLib.squareDashConnectMod.V1TenderNs.CardBrandEnum
    
    @js.native
    sealed trait DISCOVER_DINERS
      extends squareDashConnectLib.squareDashConnectMod.V1TenderNs.CardBrandEnum
    
    @js.native
    sealed trait JCB
      extends squareDashConnectLib.squareDashConnectMod.V1TenderNs.CardBrandEnum
    
    @js.native
    sealed trait MASTERCARD
      extends squareDashConnectLib.squareDashConnectMod.V1TenderNs.CardBrandEnum
    
    @js.native
    sealed trait OTHER_BRAND
      extends squareDashConnectLib.squareDashConnectMod.V1TenderNs.CardBrandEnum
    
    @js.native
    sealed trait SQUARE_GIFT_CARD
      extends squareDashConnectLib.squareDashConnectMod.V1TenderNs.CardBrandEnum
    
    @js.native
    sealed trait VISA
      extends squareDashConnectLib.squareDashConnectMod.V1TenderNs.CardBrandEnum
    
    /* "AMERICAN_EXPRESS" */ val AMERICAN_EXPRESS: AMERICAN_EXPRESS with java.lang.String = js.native
    /* "CHINA_UNIONPAY" */ val CHINA_UNIONPAY: CHINA_UNIONPAY with java.lang.String = js.native
    /* "DISCOVER" */ val DISCOVER: DISCOVER with java.lang.String = js.native
    /* "DISCOVER_DINERS" */ val DISCOVER_DINERS: DISCOVER_DINERS with java.lang.String = js.native
    /* "JCB" */ val JCB: JCB with java.lang.String = js.native
    /* "MASTERCARD" */ val MASTERCARD: MASTERCARD with java.lang.String = js.native
    /* "OTHER_BRAND" */ val OTHER_BRAND: OTHER_BRAND with java.lang.String = js.native
    /* "SQUARE_GIFT_CARD" */ val SQUARE_GIFT_CARD: SQUARE_GIFT_CARD with java.lang.String = js.native
    /* "VISA" */ val VISA: VISA with java.lang.String = js.native
    @JSBracketAccess
    def apply(value: java.lang.String): js.UndefOr[
        squareDashConnectLib.squareDashConnectMod.V1TenderNs.CardBrandEnum with java.lang.String
      ] = js.native
  }
  
  @js.native
  object EntryMethodEnum extends js.Object {
    @js.native
    sealed trait MANUAL
      extends squareDashConnectLib.squareDashConnectMod.V1TenderNs.EntryMethodEnum
    
    @js.native
    sealed trait OTHER
      extends squareDashConnectLib.squareDashConnectMod.V1TenderNs.EntryMethodEnum
    
    @js.native
    sealed trait SCANNED
      extends squareDashConnectLib.squareDashConnectMod.V1TenderNs.EntryMethodEnum
    
    @js.native
    sealed trait SQUARE_CASH
      extends squareDashConnectLib.squareDashConnectMod.V1TenderNs.EntryMethodEnum
    
    @js.native
    sealed trait SQUARE_WALLET
      extends squareDashConnectLib.squareDashConnectMod.V1TenderNs.EntryMethodEnum
    
    @js.native
    sealed trait SWIPED
      extends squareDashConnectLib.squareDashConnectMod.V1TenderNs.EntryMethodEnum
    
    @js.native
    sealed trait WEB_FORM
      extends squareDashConnectLib.squareDashConnectMod.V1TenderNs.EntryMethodEnum
    
    /* "MANUAL" */ val MANUAL: MANUAL with java.lang.String = js.native
    /* "OTHER" */ val OTHER: OTHER with java.lang.String = js.native
    /* "SCANNED" */ val SCANNED: SCANNED with java.lang.String = js.native
    /* "SQUARE_CASH" */ val SQUARE_CASH: SQUARE_CASH with java.lang.String = js.native
    /* "SQUARE_WALLET" */ val SQUARE_WALLET: SQUARE_WALLET with java.lang.String = js.native
    /* "SWIPED" */ val SWIPED: SWIPED with java.lang.String = js.native
    /* "WEB_FORM" */ val WEB_FORM: WEB_FORM with java.lang.String = js.native
    @JSBracketAccess
    def apply(value: java.lang.String): js.UndefOr[
        squareDashConnectLib.squareDashConnectMod.V1TenderNs.EntryMethodEnum with java.lang.String
      ] = js.native
  }
  
  @js.native
  object TypeEnum extends js.Object {
    @js.native
    sealed trait CASH
      extends squareDashConnectLib.squareDashConnectMod.V1TenderNs.TypeEnum
    
    @js.native
    sealed trait CREDIT_CARD
      extends squareDashConnectLib.squareDashConnectMod.V1TenderNs.TypeEnum
    
    @js.native
    sealed trait NO_SALE
      extends squareDashConnectLib.squareDashConnectMod.V1TenderNs.TypeEnum
    
    @js.native
    sealed trait OTHER
      extends squareDashConnectLib.squareDashConnectMod.V1TenderNs.TypeEnum
    
    @js.native
    sealed trait SQUARE_GIFT_CARD
      extends squareDashConnectLib.squareDashConnectMod.V1TenderNs.TypeEnum
    
    @js.native
    sealed trait SQUARE_WALLET
      extends squareDashConnectLib.squareDashConnectMod.V1TenderNs.TypeEnum
    
    @js.native
    sealed trait THIRD_PARTY_CARD
      extends squareDashConnectLib.squareDashConnectMod.V1TenderNs.TypeEnum
    
    @js.native
    sealed trait UNKNOWN
      extends squareDashConnectLib.squareDashConnectMod.V1TenderNs.TypeEnum
    
    /* "CASH" */ val CASH: CASH with java.lang.String = js.native
    /* "CREDIT_CARD" */ val CREDIT_CARD: CREDIT_CARD with java.lang.String = js.native
    /* "NO_SALE" */ val NO_SALE: NO_SALE with java.lang.String = js.native
    /* "OTHER" */ val OTHER: OTHER with java.lang.String = js.native
    /* "SQUARE_GIFT_CARD" */ val SQUARE_GIFT_CARD: SQUARE_GIFT_CARD with java.lang.String = js.native
    /* "SQUARE_WALLET" */ val SQUARE_WALLET: SQUARE_WALLET with java.lang.String = js.native
    /* "THIRD_PARTY_CARD" */ val THIRD_PARTY_CARD: THIRD_PARTY_CARD with java.lang.String = js.native
    /* "UNKNOWN" */ val UNKNOWN: UNKNOWN with java.lang.String = js.native
    @JSBracketAccess
    def apply(value: java.lang.String): js.UndefOr[
        squareDashConnectLib.squareDashConnectMod.V1TenderNs.TypeEnum with java.lang.String
      ] = js.native
  }
  
}

