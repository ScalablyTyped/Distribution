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
    sealed trait CUSTOM_AMOUNT
      extends squareDashConnectLib.squareDashConnectMod.V1PaymentItemizationNs.ItemizationTypeEnum
    
    @js.native
    sealed trait GIFT_CARD_ACTIVATION
      extends squareDashConnectLib.squareDashConnectMod.V1PaymentItemizationNs.ItemizationTypeEnum
    
    @js.native
    sealed trait GIFT_CARD_RELOAD
      extends squareDashConnectLib.squareDashConnectMod.V1PaymentItemizationNs.ItemizationTypeEnum
    
    @js.native
    sealed trait GIFT_CARD_UNKNOWN
      extends squareDashConnectLib.squareDashConnectMod.V1PaymentItemizationNs.ItemizationTypeEnum
    
    @js.native
    sealed trait ITEM
      extends squareDashConnectLib.squareDashConnectMod.V1PaymentItemizationNs.ItemizationTypeEnum
    
    @js.native
    sealed trait OTHER
      extends squareDashConnectLib.squareDashConnectMod.V1PaymentItemizationNs.ItemizationTypeEnum
    
    /* "CUSTOM_AMOUNT" */ val CUSTOM_AMOUNT: CUSTOM_AMOUNT with java.lang.String = js.native
    /* "GIFT_CARD_ACTIVATION" */ val GIFT_CARD_ACTIVATION: GIFT_CARD_ACTIVATION with java.lang.String = js.native
    /* "GIFT_CARD_RELOAD" */ val GIFT_CARD_RELOAD: GIFT_CARD_RELOAD with java.lang.String = js.native
    /* "GIFT_CARD_UNKNOWN" */ val GIFT_CARD_UNKNOWN: GIFT_CARD_UNKNOWN with java.lang.String = js.native
    /* "ITEM" */ val ITEM: ITEM with java.lang.String = js.native
    /* "OTHER" */ val OTHER: OTHER with java.lang.String = js.native
    @JSBracketAccess
    def apply(value: java.lang.String): js.UndefOr[
        squareDashConnectLib.squareDashConnectMod.V1PaymentItemizationNs.ItemizationTypeEnum with java.lang.String
      ] = js.native
  }
  
}

