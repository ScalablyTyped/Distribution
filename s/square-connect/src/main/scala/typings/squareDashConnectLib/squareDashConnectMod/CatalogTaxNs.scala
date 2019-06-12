package typings
package squareDashConnectLib.squareDashConnectMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("square-connect", "CatalogTax")
@js.native
object CatalogTaxNs extends js.Object {
  @js.native
  sealed trait CalculationPhaseEnum extends js.Object
  
  @js.native
  sealed trait InclusionTypeEnum extends js.Object
  
  @js.native
  object CalculationPhaseEnum extends js.Object {
    @js.native
    sealed trait TAX_SUBTOTAL_PHASE
      extends squareDashConnectLib.squareDashConnectMod.CatalogTaxNs.CalculationPhaseEnum
    
    @js.native
    sealed trait TAX_TOTAL_PHASE
      extends squareDashConnectLib.squareDashConnectMod.CatalogTaxNs.CalculationPhaseEnum
    
    /* "TAX_SUBTOTAL_PHASE" */ val TAX_SUBTOTAL_PHASE: TAX_SUBTOTAL_PHASE with java.lang.String = js.native
    /* "TAX_TOTAL_PHASE" */ val TAX_TOTAL_PHASE: TAX_TOTAL_PHASE with java.lang.String = js.native
    @JSBracketAccess
    def apply(value: java.lang.String): js.UndefOr[
        squareDashConnectLib.squareDashConnectMod.CatalogTaxNs.CalculationPhaseEnum with java.lang.String
      ] = js.native
  }
  
  @js.native
  object InclusionTypeEnum extends js.Object {
    @js.native
    sealed trait ADDITIVE
      extends squareDashConnectLib.squareDashConnectMod.CatalogTaxNs.InclusionTypeEnum
    
    @js.native
    sealed trait INCLUSIVE
      extends squareDashConnectLib.squareDashConnectMod.CatalogTaxNs.InclusionTypeEnum
    
    /* "ADDITIVE" */ val ADDITIVE: ADDITIVE with java.lang.String = js.native
    /* "INCLUSIVE" */ val INCLUSIVE: INCLUSIVE with java.lang.String = js.native
    @JSBracketAccess
    def apply(value: java.lang.String): js.UndefOr[
        squareDashConnectLib.squareDashConnectMod.CatalogTaxNs.InclusionTypeEnum with java.lang.String
      ] = js.native
  }
  
}

