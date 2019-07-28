package typings.squareDashConnect.squareDashConnectMod

import typings.squareDashConnect.squareDashConnectMod.V1VariationNs.InventoryAlertTypeEnum
import typings.squareDashConnect.squareDashConnectMod.V1VariationNs.PricingTypeEnum
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("square-connect", "V1Variation")
@js.native
object V1VariationNs extends js.Object {
  @js.native
  sealed trait InventoryAlertTypeEnum extends js.Object
  
  @js.native
  sealed trait PricingTypeEnum extends js.Object
  
  @js.native
  object InventoryAlertTypeEnum extends js.Object {
    @js.native
    sealed trait INVESTMENT extends InventoryAlertTypeEnum
    
    @js.native
    sealed trait LOAN extends InventoryAlertTypeEnum
    
    @js.native
    sealed trait LOW_QUANTITY extends InventoryAlertTypeEnum
    
    @js.native
    sealed trait NONE extends InventoryAlertTypeEnum
    
    @js.native
    sealed trait OTHER extends InventoryAlertTypeEnum
    
    @js.native
    sealed trait SAVINGS extends InventoryAlertTypeEnum
    
    /* "INVESTMENT" */ val INVESTMENT: typings.squareDashConnect.squareDashConnectMod.V1VariationNs.InventoryAlertTypeEnum.INVESTMENT with String = js.native
    /* "LOAN" */ val LOAN: typings.squareDashConnect.squareDashConnectMod.V1VariationNs.InventoryAlertTypeEnum.LOAN with String = js.native
    /* "LOW_QUANTITY" */ val LOW_QUANTITY: typings.squareDashConnect.squareDashConnectMod.V1VariationNs.InventoryAlertTypeEnum.LOW_QUANTITY with String = js.native
    /* "NONE" */ val NONE: typings.squareDashConnect.squareDashConnectMod.V1VariationNs.InventoryAlertTypeEnum.NONE with String = js.native
    /* "OTHER" */ val OTHER: typings.squareDashConnect.squareDashConnectMod.V1VariationNs.InventoryAlertTypeEnum.OTHER with String = js.native
    /* "SAVINGS" */ val SAVINGS: typings.squareDashConnect.squareDashConnectMod.V1VariationNs.InventoryAlertTypeEnum.SAVINGS with String = js.native
    @JSBracketAccess
    def apply(value: String): js.UndefOr[InventoryAlertTypeEnum with String] = js.native
  }
  
  @js.native
  object PricingTypeEnum extends js.Object {
    @js.native
    sealed trait FIXED_PRICING extends PricingTypeEnum
    
    @js.native
    sealed trait VARIABLE_PRICING extends PricingTypeEnum
    
    /* "FIXED_PRICING" */ val FIXED_PRICING: typings.squareDashConnect.squareDashConnectMod.V1VariationNs.PricingTypeEnum.FIXED_PRICING with String = js.native
    /* "VARIABLE_PRICING" */ val VARIABLE_PRICING: typings.squareDashConnect.squareDashConnectMod.V1VariationNs.PricingTypeEnum.VARIABLE_PRICING with String = js.native
    @JSBracketAccess
    def apply(value: String): js.UndefOr[PricingTypeEnum with String] = js.native
  }
  
}

