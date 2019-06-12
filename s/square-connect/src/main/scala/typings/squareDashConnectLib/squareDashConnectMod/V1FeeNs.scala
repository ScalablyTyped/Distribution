package typings
package squareDashConnectLib.squareDashConnectMod

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
    sealed trait TAX
      extends squareDashConnectLib.squareDashConnectMod.V1FeeNs.AdjustmentTypeEnum
    
    /* "TAX" */ val TAX: TAX with java.lang.String = js.native
    @JSBracketAccess
    def apply(value: java.lang.String): js.UndefOr[
        squareDashConnectLib.squareDashConnectMod.V1FeeNs.AdjustmentTypeEnum with java.lang.String
      ] = js.native
  }
  
  @js.native
  object CalculationPhaseEnum extends js.Object {
    @js.native
    sealed trait FEE_SUBTOTAL_PHASE
      extends squareDashConnectLib.squareDashConnectMod.V1FeeNs.CalculationPhaseEnum
    
    @js.native
    sealed trait FEE_TOTAL_PHASE
      extends squareDashConnectLib.squareDashConnectMod.V1FeeNs.CalculationPhaseEnum
    
    @js.native
    sealed trait OTHER
      extends squareDashConnectLib.squareDashConnectMod.V1FeeNs.CalculationPhaseEnum
    
    /* "FEE_SUBTOTAL_PHASE" */ val FEE_SUBTOTAL_PHASE: FEE_SUBTOTAL_PHASE with java.lang.String = js.native
    /* "FEE_TOTAL_PHASE" */ val FEE_TOTAL_PHASE: FEE_TOTAL_PHASE with java.lang.String = js.native
    /* "OTHER" */ val OTHER: OTHER with java.lang.String = js.native
    @JSBracketAccess
    def apply(value: java.lang.String): js.UndefOr[
        squareDashConnectLib.squareDashConnectMod.V1FeeNs.CalculationPhaseEnum with java.lang.String
      ] = js.native
  }
  
  @js.native
  object InclusionTypeEnum extends js.Object {
    @js.native
    sealed trait ADDITIVE
      extends squareDashConnectLib.squareDashConnectMod.V1FeeNs.InclusionTypeEnum
    
    @js.native
    sealed trait INCLUSIVE
      extends squareDashConnectLib.squareDashConnectMod.V1FeeNs.InclusionTypeEnum
    
    /* "ADDITIVE" */ val ADDITIVE: ADDITIVE with java.lang.String = js.native
    /* "INCLUSIVE" */ val INCLUSIVE: INCLUSIVE with java.lang.String = js.native
    @JSBracketAccess
    def apply(value: java.lang.String): js.UndefOr[
        squareDashConnectLib.squareDashConnectMod.V1FeeNs.InclusionTypeEnum with java.lang.String
      ] = js.native
  }
  
  @js.native
  object TypeEnum extends js.Object {
    @js.native
    sealed trait CA_GST
      extends squareDashConnectLib.squareDashConnectMod.V1FeeNs.TypeEnum
    
    @js.native
    sealed trait CA_HST
      extends squareDashConnectLib.squareDashConnectMod.V1FeeNs.TypeEnum
    
    @js.native
    sealed trait CA_PEI_PST
      extends squareDashConnectLib.squareDashConnectMod.V1FeeNs.TypeEnum
    
    @js.native
    sealed trait CA_PST
      extends squareDashConnectLib.squareDashConnectMod.V1FeeNs.TypeEnum
    
    @js.native
    sealed trait CA_QST
      extends squareDashConnectLib.squareDashConnectMod.V1FeeNs.TypeEnum
    
    @js.native
    sealed trait JP_CONSUMPTION_TAX
      extends squareDashConnectLib.squareDashConnectMod.V1FeeNs.TypeEnum
    
    @js.native
    sealed trait OTHER
      extends squareDashConnectLib.squareDashConnectMod.V1FeeNs.TypeEnum
    
    @js.native
    sealed trait US_SALES_TAX
      extends squareDashConnectLib.squareDashConnectMod.V1FeeNs.TypeEnum
    
    /* "CA_GST" */ val CA_GST: CA_GST with java.lang.String = js.native
    /* "CA_HST" */ val CA_HST: CA_HST with java.lang.String = js.native
    /* "CA_PEI_PST" */ val CA_PEI_PST: CA_PEI_PST with java.lang.String = js.native
    /* "CA_PST" */ val CA_PST: CA_PST with java.lang.String = js.native
    /* "CA_QST" */ val CA_QST: CA_QST with java.lang.String = js.native
    /* "JP_CONSUMPTION_TAX" */ val JP_CONSUMPTION_TAX: JP_CONSUMPTION_TAX with java.lang.String = js.native
    /* "OTHER" */ val OTHER: OTHER with java.lang.String = js.native
    /* "US_SALES_TAX" */ val US_SALES_TAX: US_SALES_TAX with java.lang.String = js.native
    @JSBracketAccess
    def apply(value: java.lang.String): js.UndefOr[squareDashConnectLib.squareDashConnectMod.V1FeeNs.TypeEnum with java.lang.String] = js.native
  }
  
}

