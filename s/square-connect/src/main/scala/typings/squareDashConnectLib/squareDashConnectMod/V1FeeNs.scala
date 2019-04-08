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
    sealed trait FEESUBTOTALPHASE
      extends squareDashConnectLib.squareDashConnectMod.V1FeeNs.CalculationPhaseEnum
    
    @js.native
    sealed trait FEETOTALPHASE
      extends squareDashConnectLib.squareDashConnectMod.V1FeeNs.CalculationPhaseEnum
    
    @js.native
    sealed trait OTHER
      extends squareDashConnectLib.squareDashConnectMod.V1FeeNs.CalculationPhaseEnum
    
    /* "FEE_SUBTOTAL_PHASE" */ val FEESUBTOTALPHASE: FEESUBTOTALPHASE with java.lang.String = js.native
    /* "FEE_TOTAL_PHASE" */ val FEETOTALPHASE: FEETOTALPHASE with java.lang.String = js.native
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
    sealed trait CAGST
      extends squareDashConnectLib.squareDashConnectMod.V1FeeNs.TypeEnum
    
    @js.native
    sealed trait CAHST
      extends squareDashConnectLib.squareDashConnectMod.V1FeeNs.TypeEnum
    
    @js.native
    sealed trait CAPEIPST
      extends squareDashConnectLib.squareDashConnectMod.V1FeeNs.TypeEnum
    
    @js.native
    sealed trait CAPST
      extends squareDashConnectLib.squareDashConnectMod.V1FeeNs.TypeEnum
    
    @js.native
    sealed trait CAQST
      extends squareDashConnectLib.squareDashConnectMod.V1FeeNs.TypeEnum
    
    @js.native
    sealed trait JPCONSUMPTIONTAX
      extends squareDashConnectLib.squareDashConnectMod.V1FeeNs.TypeEnum
    
    @js.native
    sealed trait OTHER
      extends squareDashConnectLib.squareDashConnectMod.V1FeeNs.TypeEnum
    
    @js.native
    sealed trait USSALESTAX
      extends squareDashConnectLib.squareDashConnectMod.V1FeeNs.TypeEnum
    
    /* "CA_GST" */ val CAGST: CAGST with java.lang.String = js.native
    /* "CA_HST" */ val CAHST: CAHST with java.lang.String = js.native
    /* "CA_PEI_PST" */ val CAPEIPST: CAPEIPST with java.lang.String = js.native
    /* "CA_PST" */ val CAPST: CAPST with java.lang.String = js.native
    /* "CA_QST" */ val CAQST: CAQST with java.lang.String = js.native
    /* "JP_CONSUMPTION_TAX" */ val JPCONSUMPTIONTAX: JPCONSUMPTIONTAX with java.lang.String = js.native
    /* "OTHER" */ val OTHER: OTHER with java.lang.String = js.native
    /* "US_SALES_TAX" */ val USSALESTAX: USSALESTAX with java.lang.String = js.native
    @JSBracketAccess
    def apply(value: java.lang.String): js.UndefOr[squareDashConnectLib.squareDashConnectMod.V1FeeNs.TypeEnum with java.lang.String] = js.native
  }
  
}

