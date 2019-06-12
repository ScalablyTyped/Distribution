package typings
package squareDashConnectLib.squareDashConnectMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("square-connect", "CatalogItemVariation")
@js.native
object CatalogItemVariationNs extends js.Object {
  @js.native
  sealed trait InventoryAlertTypeEnum extends js.Object
  
  @js.native
  sealed trait PricingTypeEnum extends js.Object
  
  @js.native
  object InventoryAlertTypeEnum extends js.Object {
    @js.native
    sealed trait LOW_QUANTITY
      extends squareDashConnectLib.squareDashConnectMod.CatalogItemVariationNs.InventoryAlertTypeEnum
    
    @js.native
    sealed trait NONE
      extends squareDashConnectLib.squareDashConnectMod.CatalogItemVariationNs.InventoryAlertTypeEnum
    
    /* "LOW_QUANTITY" */ val LOW_QUANTITY: LOW_QUANTITY with java.lang.String = js.native
    /* "NONE" */ val NONE: NONE with java.lang.String = js.native
    @JSBracketAccess
    def apply(value: java.lang.String): js.UndefOr[
        squareDashConnectLib.squareDashConnectMod.CatalogItemVariationNs.InventoryAlertTypeEnum with java.lang.String
      ] = js.native
  }
  
  @js.native
  object PricingTypeEnum extends js.Object {
    @js.native
    sealed trait FIXED_PRICING
      extends squareDashConnectLib.squareDashConnectMod.CatalogItemVariationNs.PricingTypeEnum
    
    @js.native
    sealed trait VARIABLE_PRICING
      extends squareDashConnectLib.squareDashConnectMod.CatalogItemVariationNs.PricingTypeEnum
    
    /* "FIXED_PRICING" */ val FIXED_PRICING: FIXED_PRICING with java.lang.String = js.native
    /* "VARIABLE_PRICING" */ val VARIABLE_PRICING: VARIABLE_PRICING with java.lang.String = js.native
    @JSBracketAccess
    def apply(value: java.lang.String): js.UndefOr[
        squareDashConnectLib.squareDashConnectMod.CatalogItemVariationNs.PricingTypeEnum with java.lang.String
      ] = js.native
  }
  
}

