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
    sealed trait AMERICANEXPRESS
      extends squareDashConnectLib.squareDashConnectMod.V1TenderNs.CardBrandEnum
    
    @js.native
    sealed trait CHINAUNIONPAY
      extends squareDashConnectLib.squareDashConnectMod.V1TenderNs.CardBrandEnum
    
    @js.native
    sealed trait DISCOVER
      extends squareDashConnectLib.squareDashConnectMod.V1TenderNs.CardBrandEnum
    
    @js.native
    sealed trait DISCOVERDINERS
      extends squareDashConnectLib.squareDashConnectMod.V1TenderNs.CardBrandEnum
    
    @js.native
    sealed trait JCB
      extends squareDashConnectLib.squareDashConnectMod.V1TenderNs.CardBrandEnum
    
    @js.native
    sealed trait MASTERCARD
      extends squareDashConnectLib.squareDashConnectMod.V1TenderNs.CardBrandEnum
    
    @js.native
    sealed trait OTHERBRAND
      extends squareDashConnectLib.squareDashConnectMod.V1TenderNs.CardBrandEnum
    
    @js.native
    sealed trait SQUAREGIFTCARD
      extends squareDashConnectLib.squareDashConnectMod.V1TenderNs.CardBrandEnum
    
    @js.native
    sealed trait VISA
      extends squareDashConnectLib.squareDashConnectMod.V1TenderNs.CardBrandEnum
    
    /* "AMERICAN_EXPRESS" */ val AMERICANEXPRESS: AMERICANEXPRESS with java.lang.String = js.native
    /* "CHINA_UNIONPAY" */ val CHINAUNIONPAY: CHINAUNIONPAY with java.lang.String = js.native
    /* "DISCOVER" */ val DISCOVER: DISCOVER with java.lang.String = js.native
    /* "DISCOVER_DINERS" */ val DISCOVERDINERS: DISCOVERDINERS with java.lang.String = js.native
    /* "JCB" */ val JCB: JCB with java.lang.String = js.native
    /* "MASTERCARD" */ val MASTERCARD: MASTERCARD with java.lang.String = js.native
    /* "OTHER_BRAND" */ val OTHERBRAND: OTHERBRAND with java.lang.String = js.native
    /* "SQUARE_GIFT_CARD" */ val SQUAREGIFTCARD: SQUAREGIFTCARD with java.lang.String = js.native
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
    sealed trait SQUARECASH
      extends squareDashConnectLib.squareDashConnectMod.V1TenderNs.EntryMethodEnum
    
    @js.native
    sealed trait SQUAREWALLET
      extends squareDashConnectLib.squareDashConnectMod.V1TenderNs.EntryMethodEnum
    
    @js.native
    sealed trait SWIPED
      extends squareDashConnectLib.squareDashConnectMod.V1TenderNs.EntryMethodEnum
    
    @js.native
    sealed trait WEBFORM
      extends squareDashConnectLib.squareDashConnectMod.V1TenderNs.EntryMethodEnum
    
    /* "MANUAL" */ val MANUAL: MANUAL with java.lang.String = js.native
    /* "OTHER" */ val OTHER: OTHER with java.lang.String = js.native
    /* "SCANNED" */ val SCANNED: SCANNED with java.lang.String = js.native
    /* "SQUARE_CASH" */ val SQUARECASH: SQUARECASH with java.lang.String = js.native
    /* "SQUARE_WALLET" */ val SQUAREWALLET: SQUAREWALLET with java.lang.String = js.native
    /* "SWIPED" */ val SWIPED: SWIPED with java.lang.String = js.native
    /* "WEB_FORM" */ val WEBFORM: WEBFORM with java.lang.String = js.native
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
    sealed trait CREDITCARD
      extends squareDashConnectLib.squareDashConnectMod.V1TenderNs.TypeEnum
    
    @js.native
    sealed trait NOSALE
      extends squareDashConnectLib.squareDashConnectMod.V1TenderNs.TypeEnum
    
    @js.native
    sealed trait OTHER
      extends squareDashConnectLib.squareDashConnectMod.V1TenderNs.TypeEnum
    
    @js.native
    sealed trait SQUAREGIFTCARD
      extends squareDashConnectLib.squareDashConnectMod.V1TenderNs.TypeEnum
    
    @js.native
    sealed trait SQUAREWALLET
      extends squareDashConnectLib.squareDashConnectMod.V1TenderNs.TypeEnum
    
    @js.native
    sealed trait THIRDPARTYCARD
      extends squareDashConnectLib.squareDashConnectMod.V1TenderNs.TypeEnum
    
    @js.native
    sealed trait UNKNOWN
      extends squareDashConnectLib.squareDashConnectMod.V1TenderNs.TypeEnum
    
    /* "CASH" */ val CASH: CASH with java.lang.String = js.native
    /* "CREDIT_CARD" */ val CREDITCARD: CREDITCARD with java.lang.String = js.native
    /* "NO_SALE" */ val NOSALE: NOSALE with java.lang.String = js.native
    /* "OTHER" */ val OTHER: OTHER with java.lang.String = js.native
    /* "SQUARE_GIFT_CARD" */ val SQUAREGIFTCARD: SQUAREGIFTCARD with java.lang.String = js.native
    /* "SQUARE_WALLET" */ val SQUAREWALLET: SQUAREWALLET with java.lang.String = js.native
    /* "THIRD_PARTY_CARD" */ val THIRDPARTYCARD: THIRDPARTYCARD with java.lang.String = js.native
    /* "UNKNOWN" */ val UNKNOWN: UNKNOWN with java.lang.String = js.native
    @JSBracketAccess
    def apply(value: java.lang.String): js.UndefOr[
        squareDashConnectLib.squareDashConnectMod.V1TenderNs.TypeEnum with java.lang.String
      ] = js.native
  }
  
}

