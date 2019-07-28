package typings.squareDashConnect.squareDashConnectMod

import typings.squareDashConnect.squareDashConnectMod.V1PaymentItemizationNs.ItemizationTypeEnum
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
    sealed trait CUSTOM_AMOUNT extends ItemizationTypeEnum
    
    @js.native
    sealed trait GIFT_CARD_ACTIVATION extends ItemizationTypeEnum
    
    @js.native
    sealed trait GIFT_CARD_RELOAD extends ItemizationTypeEnum
    
    @js.native
    sealed trait GIFT_CARD_UNKNOWN extends ItemizationTypeEnum
    
    @js.native
    sealed trait ITEM extends ItemizationTypeEnum
    
    @js.native
    sealed trait OTHER extends ItemizationTypeEnum
    
    /* "CUSTOM_AMOUNT" */ val CUSTOM_AMOUNT: typings.squareDashConnect.squareDashConnectMod.V1PaymentItemizationNs.ItemizationTypeEnum.CUSTOM_AMOUNT with String = js.native
    /* "GIFT_CARD_ACTIVATION" */ val GIFT_CARD_ACTIVATION: typings.squareDashConnect.squareDashConnectMod.V1PaymentItemizationNs.ItemizationTypeEnum.GIFT_CARD_ACTIVATION with String = js.native
    /* "GIFT_CARD_RELOAD" */ val GIFT_CARD_RELOAD: typings.squareDashConnect.squareDashConnectMod.V1PaymentItemizationNs.ItemizationTypeEnum.GIFT_CARD_RELOAD with String = js.native
    /* "GIFT_CARD_UNKNOWN" */ val GIFT_CARD_UNKNOWN: typings.squareDashConnect.squareDashConnectMod.V1PaymentItemizationNs.ItemizationTypeEnum.GIFT_CARD_UNKNOWN with String = js.native
    /* "ITEM" */ val ITEM: typings.squareDashConnect.squareDashConnectMod.V1PaymentItemizationNs.ItemizationTypeEnum.ITEM with String = js.native
    /* "OTHER" */ val OTHER: typings.squareDashConnect.squareDashConnectMod.V1PaymentItemizationNs.ItemizationTypeEnum.OTHER with String = js.native
    @JSBracketAccess
    def apply(value: String): js.UndefOr[ItemizationTypeEnum with String] = js.native
  }
  
}

