package typings.squareDashConnect.squareDashConnectMod

import typings.squareDashConnect.squareDashConnectMod.ItemVariationLocationOverridesNs.InventoryAlertTypeEnum
import typings.squareDashConnect.squareDashConnectMod.ItemVariationLocationOverridesNs.PricingTypeEnum
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("square-connect", "ItemVariationLocationOverrides")
@js.native
object ItemVariationLocationOverridesNs extends js.Object {
  @js.native
  sealed trait InventoryAlertTypeEnum extends js.Object
  
  @js.native
  sealed trait PricingTypeEnum extends js.Object
  
  @js.native
  object InventoryAlertTypeEnum extends js.Object {
    @js.native
    sealed trait LOW_QUANTITY extends InventoryAlertTypeEnum
    
    @js.native
    sealed trait NONE extends InventoryAlertTypeEnum
    
    /* "LOW_QUANTITY" */ val LOW_QUANTITY: typings.squareDashConnect.squareDashConnectMod.ItemVariationLocationOverridesNs.InventoryAlertTypeEnum.LOW_QUANTITY with String = js.native
    /* "NONE" */ val NONE: typings.squareDashConnect.squareDashConnectMod.ItemVariationLocationOverridesNs.InventoryAlertTypeEnum.NONE with String = js.native
    @JSBracketAccess
    def apply(value: String): js.UndefOr[InventoryAlertTypeEnum with String] = js.native
  }
  
  @js.native
  object PricingTypeEnum extends js.Object {
    @js.native
    sealed trait FIXED_PRICING extends PricingTypeEnum
    
    @js.native
    sealed trait VARIABLE_PRICING extends PricingTypeEnum
    
    /* "FIXED_PRICING" */ val FIXED_PRICING: typings.squareDashConnect.squareDashConnectMod.ItemVariationLocationOverridesNs.PricingTypeEnum.FIXED_PRICING with String = js.native
    /* "VARIABLE_PRICING" */ val VARIABLE_PRICING: typings.squareDashConnect.squareDashConnectMod.ItemVariationLocationOverridesNs.PricingTypeEnum.VARIABLE_PRICING with String = js.native
    @JSBracketAccess
    def apply(value: String): js.UndefOr[PricingTypeEnum with String] = js.native
  }
  
}

