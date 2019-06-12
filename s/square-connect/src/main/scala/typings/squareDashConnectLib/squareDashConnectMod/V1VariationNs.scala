package typings
package squareDashConnectLib.squareDashConnectMod

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
    sealed trait INVESTMENT
      extends squareDashConnectLib.squareDashConnectMod.V1VariationNs.InventoryAlertTypeEnum
    
    @js.native
    sealed trait LOAN
      extends squareDashConnectLib.squareDashConnectMod.V1VariationNs.InventoryAlertTypeEnum
    
    @js.native
    sealed trait LOW_QUANTITY
      extends squareDashConnectLib.squareDashConnectMod.V1VariationNs.InventoryAlertTypeEnum
    
    @js.native
    sealed trait NONE
      extends squareDashConnectLib.squareDashConnectMod.V1VariationNs.InventoryAlertTypeEnum
    
    @js.native
    sealed trait OTHER
      extends squareDashConnectLib.squareDashConnectMod.V1VariationNs.InventoryAlertTypeEnum
    
    @js.native
    sealed trait SAVINGS
      extends squareDashConnectLib.squareDashConnectMod.V1VariationNs.InventoryAlertTypeEnum
    
    /* "INVESTMENT" */ val INVESTMENT: INVESTMENT with java.lang.String = js.native
    /* "LOAN" */ val LOAN: LOAN with java.lang.String = js.native
    /* "LOW_QUANTITY" */ val LOW_QUANTITY: LOW_QUANTITY with java.lang.String = js.native
    /* "NONE" */ val NONE: NONE with java.lang.String = js.native
    /* "OTHER" */ val OTHER: OTHER with java.lang.String = js.native
    /* "SAVINGS" */ val SAVINGS: SAVINGS with java.lang.String = js.native
    @JSBracketAccess
    def apply(value: java.lang.String): js.UndefOr[
        squareDashConnectLib.squareDashConnectMod.V1VariationNs.InventoryAlertTypeEnum with java.lang.String
      ] = js.native
  }
  
  @js.native
  object PricingTypeEnum extends js.Object {
    @js.native
    sealed trait FIXED_PRICING
      extends squareDashConnectLib.squareDashConnectMod.V1VariationNs.PricingTypeEnum
    
    @js.native
    sealed trait VARIABLE_PRICING
      extends squareDashConnectLib.squareDashConnectMod.V1VariationNs.PricingTypeEnum
    
    /* "FIXED_PRICING" */ val FIXED_PRICING: FIXED_PRICING with java.lang.String = js.native
    /* "VARIABLE_PRICING" */ val VARIABLE_PRICING: VARIABLE_PRICING with java.lang.String = js.native
    @JSBracketAccess
    def apply(value: java.lang.String): js.UndefOr[
        squareDashConnectLib.squareDashConnectMod.V1VariationNs.PricingTypeEnum with java.lang.String
      ] = js.native
  }
  
}

