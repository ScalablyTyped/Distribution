package typings.squareDashConnect.squareDashConnectMod

import typings.squareDashConnect.squareDashConnectMod.V1FeeNs.AdjustmentTypeEnum
import typings.squareDashConnect.squareDashConnectMod.V1FeeNs.CalculationPhaseEnum
import typings.squareDashConnect.squareDashConnectMod.V1FeeNs.InclusionTypeEnum
import typings.squareDashConnect.squareDashConnectMod.V1FeeNs.TypeEnum
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("square-connect", "V1Fee")
@js.native
object V1FeeNs extends js.Object {
  @js.native
  sealed trait AdjustmentTypeEnum extends js.Object
  
  @js.native
  sealed trait CalculationPhaseEnum extends js.Object
  
  @js.native
  sealed trait InclusionTypeEnum extends js.Object
  
  @js.native
  sealed trait TypeEnum extends js.Object
  
  @js.native
  object AdjustmentTypeEnum extends js.Object {
    @js.native
    sealed trait TAX extends AdjustmentTypeEnum
    
    /* "TAX" */ val TAX: typings.squareDashConnect.squareDashConnectMod.V1FeeNs.AdjustmentTypeEnum.TAX with String = js.native
    @JSBracketAccess
    def apply(value: String): js.UndefOr[AdjustmentTypeEnum with String] = js.native
  }
  
  @js.native
  object CalculationPhaseEnum extends js.Object {
    @js.native
    sealed trait FEE_SUBTOTAL_PHASE extends CalculationPhaseEnum
    
    @js.native
    sealed trait FEE_TOTAL_PHASE extends CalculationPhaseEnum
    
    @js.native
    sealed trait OTHER extends CalculationPhaseEnum
    
    /* "FEE_SUBTOTAL_PHASE" */ val FEE_SUBTOTAL_PHASE: typings.squareDashConnect.squareDashConnectMod.V1FeeNs.CalculationPhaseEnum.FEE_SUBTOTAL_PHASE with String = js.native
    /* "FEE_TOTAL_PHASE" */ val FEE_TOTAL_PHASE: typings.squareDashConnect.squareDashConnectMod.V1FeeNs.CalculationPhaseEnum.FEE_TOTAL_PHASE with String = js.native
    /* "OTHER" */ val OTHER: typings.squareDashConnect.squareDashConnectMod.V1FeeNs.CalculationPhaseEnum.OTHER with String = js.native
    @JSBracketAccess
    def apply(value: String): js.UndefOr[CalculationPhaseEnum with String] = js.native
  }
  
  @js.native
  object InclusionTypeEnum extends js.Object {
    @js.native
    sealed trait ADDITIVE extends InclusionTypeEnum
    
    @js.native
    sealed trait INCLUSIVE extends InclusionTypeEnum
    
    /* "ADDITIVE" */ val ADDITIVE: typings.squareDashConnect.squareDashConnectMod.V1FeeNs.InclusionTypeEnum.ADDITIVE with String = js.native
    /* "INCLUSIVE" */ val INCLUSIVE: typings.squareDashConnect.squareDashConnectMod.V1FeeNs.InclusionTypeEnum.INCLUSIVE with String = js.native
    @JSBracketAccess
    def apply(value: String): js.UndefOr[InclusionTypeEnum with String] = js.native
  }
  
  @js.native
  object TypeEnum extends js.Object {
    @js.native
    sealed trait CA_GST extends TypeEnum
    
    @js.native
    sealed trait CA_HST extends TypeEnum
    
    @js.native
    sealed trait CA_PEI_PST extends TypeEnum
    
    @js.native
    sealed trait CA_PST extends TypeEnum
    
    @js.native
    sealed trait CA_QST extends TypeEnum
    
    @js.native
    sealed trait JP_CONSUMPTION_TAX extends TypeEnum
    
    @js.native
    sealed trait OTHER extends TypeEnum
    
    @js.native
    sealed trait US_SALES_TAX extends TypeEnum
    
    /* "CA_GST" */ val CA_GST: typings.squareDashConnect.squareDashConnectMod.V1FeeNs.TypeEnum.CA_GST with String = js.native
    /* "CA_HST" */ val CA_HST: typings.squareDashConnect.squareDashConnectMod.V1FeeNs.TypeEnum.CA_HST with String = js.native
    /* "CA_PEI_PST" */ val CA_PEI_PST: typings.squareDashConnect.squareDashConnectMod.V1FeeNs.TypeEnum.CA_PEI_PST with String = js.native
    /* "CA_PST" */ val CA_PST: typings.squareDashConnect.squareDashConnectMod.V1FeeNs.TypeEnum.CA_PST with String = js.native
    /* "CA_QST" */ val CA_QST: typings.squareDashConnect.squareDashConnectMod.V1FeeNs.TypeEnum.CA_QST with String = js.native
    /* "JP_CONSUMPTION_TAX" */ val JP_CONSUMPTION_TAX: typings.squareDashConnect.squareDashConnectMod.V1FeeNs.TypeEnum.JP_CONSUMPTION_TAX with String = js.native
    /* "OTHER" */ val OTHER: typings.squareDashConnect.squareDashConnectMod.V1FeeNs.TypeEnum.OTHER with String = js.native
    /* "US_SALES_TAX" */ val US_SALES_TAX: typings.squareDashConnect.squareDashConnectMod.V1FeeNs.TypeEnum.US_SALES_TAX with String = js.native
    @JSBracketAccess
    def apply(value: String): js.UndefOr[TypeEnum with String] = js.native
  }
  
}

