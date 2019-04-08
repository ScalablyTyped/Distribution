package typings
package squareDashConnectLib.squareDashConnectMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("square-connect", "V1PaymentItemization")
@js.native
object V1PaymentItemizationNs extends js.Object {
  @js.native
  sealed trait ItemizationTypeEnum extends js.Object
  
  @js.native
  object ItemizationTypeEnum extends js.Object {
    @js.native
    sealed trait CUSTOMAMOUNT
      extends squareDashConnectLib.squareDashConnectMod.V1PaymentItemizationNs.ItemizationTypeEnum
    
    @js.native
    sealed trait GIFTCARDACTIVATION
      extends squareDashConnectLib.squareDashConnectMod.V1PaymentItemizationNs.ItemizationTypeEnum
    
    @js.native
    sealed trait GIFTCARDRELOAD
      extends squareDashConnectLib.squareDashConnectMod.V1PaymentItemizationNs.ItemizationTypeEnum
    
    @js.native
    sealed trait GIFTCARDUNKNOWN
      extends squareDashConnectLib.squareDashConnectMod.V1PaymentItemizationNs.ItemizationTypeEnum
    
    @js.native
    sealed trait ITEM
      extends squareDashConnectLib.squareDashConnectMod.V1PaymentItemizationNs.ItemizationTypeEnum
    
    @js.native
    sealed trait OTHER
      extends squareDashConnectLib.squareDashConnectMod.V1PaymentItemizationNs.ItemizationTypeEnum
    
    /* "CUSTOM_AMOUNT" */ val CUSTOMAMOUNT: CUSTOMAMOUNT with java.lang.String = js.native
    /* "GIFT_CARD_ACTIVATION" */ val GIFTCARDACTIVATION: GIFTCARDACTIVATION with java.lang.String = js.native
    /* "GIFT_CARD_RELOAD" */ val GIFTCARDRELOAD: GIFTCARDRELOAD with java.lang.String = js.native
    /* "GIFT_CARD_UNKNOWN" */ val GIFTCARDUNKNOWN: GIFTCARDUNKNOWN with java.lang.String = js.native
    /* "ITEM" */ val ITEM: ITEM with java.lang.String = js.native
    /* "OTHER" */ val OTHER: OTHER with java.lang.String = js.native
    @JSBracketAccess
    def apply(value: java.lang.String): js.UndefOr[
        squareDashConnectLib.squareDashConnectMod.V1PaymentItemizationNs.ItemizationTypeEnum with java.lang.String
      ] = js.native
  }
  
}

