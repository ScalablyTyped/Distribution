package typings.squareDashConnect.squareDashConnectMod

import typings.squareDashConnect.squareDashConnectMod.CatalogTaxNs.CalculationPhaseEnum
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("square-connect", "CatalogTax")
@js.native
object CatalogTaxNs extends js.Object {
  @js.native
  sealed trait CalculationPhaseEnum extends js.Object
  
  @js.native
  object CalculationPhaseEnum extends js.Object {
    @js.native
    sealed trait TAX_SUBTOTAL_PHASE extends CalculationPhaseEnum
    
    @js.native
    sealed trait TAX_TOTAL_PHASE extends CalculationPhaseEnum
    
    /* "TAX_SUBTOTAL_PHASE" */ val TAX_SUBTOTAL_PHASE: typings.squareDashConnect.squareDashConnectMod.CatalogTaxNs.CalculationPhaseEnum.TAX_SUBTOTAL_PHASE with String = js.native
    /* "TAX_TOTAL_PHASE" */ val TAX_TOTAL_PHASE: typings.squareDashConnect.squareDashConnectMod.CatalogTaxNs.CalculationPhaseEnum.TAX_TOTAL_PHASE with String = js.native
    @JSBracketAccess
    def apply(value: String): js.UndefOr[CalculationPhaseEnum with String] = js.native
  }
  
}

