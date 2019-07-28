package typings.squareDashConnect.squareDashConnectMod

import typings.squareDashConnect.squareDashConnectMod.V1TenderNs.CardBrandEnum
import typings.squareDashConnect.squareDashConnectMod.V1TenderNs.EntryMethodEnum
import typings.squareDashConnect.squareDashConnectMod.V1TenderNs.TypeEnum
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
    sealed trait AMERICAN_EXPRESS extends CardBrandEnum
    
    @js.native
    sealed trait CHINA_UNIONPAY extends CardBrandEnum
    
    @js.native
    sealed trait DISCOVER extends CardBrandEnum
    
    @js.native
    sealed trait DISCOVER_DINERS extends CardBrandEnum
    
    @js.native
    sealed trait JCB extends CardBrandEnum
    
    @js.native
    sealed trait MASTERCARD extends CardBrandEnum
    
    @js.native
    sealed trait OTHER_BRAND extends CardBrandEnum
    
    @js.native
    sealed trait SQUARE_GIFT_CARD extends CardBrandEnum
    
    @js.native
    sealed trait VISA extends CardBrandEnum
    
    /* "AMERICAN_EXPRESS" */ val AMERICAN_EXPRESS: typings.squareDashConnect.squareDashConnectMod.V1TenderNs.CardBrandEnum.AMERICAN_EXPRESS with String = js.native
    /* "CHINA_UNIONPAY" */ val CHINA_UNIONPAY: typings.squareDashConnect.squareDashConnectMod.V1TenderNs.CardBrandEnum.CHINA_UNIONPAY with String = js.native
    /* "DISCOVER" */ val DISCOVER: typings.squareDashConnect.squareDashConnectMod.V1TenderNs.CardBrandEnum.DISCOVER with String = js.native
    /* "DISCOVER_DINERS" */ val DISCOVER_DINERS: typings.squareDashConnect.squareDashConnectMod.V1TenderNs.CardBrandEnum.DISCOVER_DINERS with String = js.native
    /* "JCB" */ val JCB: typings.squareDashConnect.squareDashConnectMod.V1TenderNs.CardBrandEnum.JCB with String = js.native
    /* "MASTERCARD" */ val MASTERCARD: typings.squareDashConnect.squareDashConnectMod.V1TenderNs.CardBrandEnum.MASTERCARD with String = js.native
    /* "OTHER_BRAND" */ val OTHER_BRAND: typings.squareDashConnect.squareDashConnectMod.V1TenderNs.CardBrandEnum.OTHER_BRAND with String = js.native
    /* "SQUARE_GIFT_CARD" */ val SQUARE_GIFT_CARD: typings.squareDashConnect.squareDashConnectMod.V1TenderNs.CardBrandEnum.SQUARE_GIFT_CARD with String = js.native
    /* "VISA" */ val VISA: typings.squareDashConnect.squareDashConnectMod.V1TenderNs.CardBrandEnum.VISA with String = js.native
    @JSBracketAccess
    def apply(value: String): js.UndefOr[CardBrandEnum with String] = js.native
  }
  
  @js.native
  object EntryMethodEnum extends js.Object {
    @js.native
    sealed trait MANUAL extends EntryMethodEnum
    
    @js.native
    sealed trait OTHER extends EntryMethodEnum
    
    @js.native
    sealed trait SCANNED extends EntryMethodEnum
    
    @js.native
    sealed trait SQUARE_CASH extends EntryMethodEnum
    
    @js.native
    sealed trait SQUARE_WALLET extends EntryMethodEnum
    
    @js.native
    sealed trait SWIPED extends EntryMethodEnum
    
    @js.native
    sealed trait WEB_FORM extends EntryMethodEnum
    
    /* "MANUAL" */ val MANUAL: typings.squareDashConnect.squareDashConnectMod.V1TenderNs.EntryMethodEnum.MANUAL with String = js.native
    /* "OTHER" */ val OTHER: typings.squareDashConnect.squareDashConnectMod.V1TenderNs.EntryMethodEnum.OTHER with String = js.native
    /* "SCANNED" */ val SCANNED: typings.squareDashConnect.squareDashConnectMod.V1TenderNs.EntryMethodEnum.SCANNED with String = js.native
    /* "SQUARE_CASH" */ val SQUARE_CASH: typings.squareDashConnect.squareDashConnectMod.V1TenderNs.EntryMethodEnum.SQUARE_CASH with String = js.native
    /* "SQUARE_WALLET" */ val SQUARE_WALLET: typings.squareDashConnect.squareDashConnectMod.V1TenderNs.EntryMethodEnum.SQUARE_WALLET with String = js.native
    /* "SWIPED" */ val SWIPED: typings.squareDashConnect.squareDashConnectMod.V1TenderNs.EntryMethodEnum.SWIPED with String = js.native
    /* "WEB_FORM" */ val WEB_FORM: typings.squareDashConnect.squareDashConnectMod.V1TenderNs.EntryMethodEnum.WEB_FORM with String = js.native
    @JSBracketAccess
    def apply(value: String): js.UndefOr[EntryMethodEnum with String] = js.native
  }
  
  @js.native
  object TypeEnum extends js.Object {
    @js.native
    sealed trait CASH extends TypeEnum
    
    @js.native
    sealed trait CREDIT_CARD extends TypeEnum
    
    @js.native
    sealed trait NO_SALE extends TypeEnum
    
    @js.native
    sealed trait OTHER extends TypeEnum
    
    @js.native
    sealed trait SQUARE_GIFT_CARD extends TypeEnum
    
    @js.native
    sealed trait SQUARE_WALLET extends TypeEnum
    
    @js.native
    sealed trait THIRD_PARTY_CARD extends TypeEnum
    
    @js.native
    sealed trait UNKNOWN extends TypeEnum
    
    /* "CASH" */ val CASH: typings.squareDashConnect.squareDashConnectMod.V1TenderNs.TypeEnum.CASH with String = js.native
    /* "CREDIT_CARD" */ val CREDIT_CARD: typings.squareDashConnect.squareDashConnectMod.V1TenderNs.TypeEnum.CREDIT_CARD with String = js.native
    /* "NO_SALE" */ val NO_SALE: typings.squareDashConnect.squareDashConnectMod.V1TenderNs.TypeEnum.NO_SALE with String = js.native
    /* "OTHER" */ val OTHER: typings.squareDashConnect.squareDashConnectMod.V1TenderNs.TypeEnum.OTHER with String = js.native
    /* "SQUARE_GIFT_CARD" */ val SQUARE_GIFT_CARD: typings.squareDashConnect.squareDashConnectMod.V1TenderNs.TypeEnum.SQUARE_GIFT_CARD with String = js.native
    /* "SQUARE_WALLET" */ val SQUARE_WALLET: typings.squareDashConnect.squareDashConnectMod.V1TenderNs.TypeEnum.SQUARE_WALLET with String = js.native
    /* "THIRD_PARTY_CARD" */ val THIRD_PARTY_CARD: typings.squareDashConnect.squareDashConnectMod.V1TenderNs.TypeEnum.THIRD_PARTY_CARD with String = js.native
    /* "UNKNOWN" */ val UNKNOWN: typings.squareDashConnect.squareDashConnectMod.V1TenderNs.TypeEnum.UNKNOWN with String = js.native
    @JSBracketAccess
    def apply(value: String): js.UndefOr[TypeEnum with String] = js.native
  }
  
}

