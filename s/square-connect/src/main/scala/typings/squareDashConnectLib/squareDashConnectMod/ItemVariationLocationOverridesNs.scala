package typings
package squareDashConnectLib.squareDashConnectMod

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
    sealed trait LOWQUANTITY
      extends squareDashConnectLib.squareDashConnectMod.ItemVariationLocationOverridesNs.InventoryAlertTypeEnum
    
    @js.native
    sealed trait NONE
      extends squareDashConnectLib.squareDashConnectMod.ItemVariationLocationOverridesNs.InventoryAlertTypeEnum
    
    /* "LOW_QUANTITY" */ val LOWQUANTITY: LOWQUANTITY with java.lang.String = js.native
    /* "NONE" */ val NONE: NONE with java.lang.String = js.native
    @JSBracketAccess
    def apply(value: java.lang.String): js.UndefOr[
        squareDashConnectLib.squareDashConnectMod.ItemVariationLocationOverridesNs.InventoryAlertTypeEnum with java.lang.String
      ] = js.native
  }
  
  @js.native
  object PricingTypeEnum extends js.Object {
    @js.native
    sealed trait FIXEDPRICING
      extends squareDashConnectLib.squareDashConnectMod.ItemVariationLocationOverridesNs.PricingTypeEnum
    
    @js.native
    sealed trait VARIABLEPRICING
      extends squareDashConnectLib.squareDashConnectMod.ItemVariationLocationOverridesNs.PricingTypeEnum
    
    /* "FIXED_PRICING" */ val FIXEDPRICING: FIXEDPRICING with java.lang.String = js.native
    /* "VARIABLE_PRICING" */ val VARIABLEPRICING: VARIABLEPRICING with java.lang.String = js.native
    @JSBracketAccess
    def apply(value: java.lang.String): js.UndefOr[
        squareDashConnectLib.squareDashConnectMod.ItemVariationLocationOverridesNs.PricingTypeEnum with java.lang.String
      ] = js.native
  }
  
}

