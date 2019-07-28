package typings.squareDashConnect.squareDashConnectMod

import typings.squareDashConnect.squareDashConnectMod.V1PaymentTaxNs.InclusionTypeEnum
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("square-connect", "V1PaymentTax")
@js.native
object V1PaymentTaxNs extends js.Object {
  @js.native
  sealed trait InclusionTypeEnum extends js.Object
  
  @js.native
  object InclusionTypeEnum extends js.Object {
    @js.native
    sealed trait ADDITIVE extends InclusionTypeEnum
    
    @js.native
    sealed trait INCLUSIVE extends InclusionTypeEnum
    
    /* "ADDITIVE" */ val ADDITIVE: typings.squareDashConnect.squareDashConnectMod.V1PaymentTaxNs.InclusionTypeEnum.ADDITIVE with String = js.native
    /* "INCLUSIVE" */ val INCLUSIVE: typings.squareDashConnect.squareDashConnectMod.V1PaymentTaxNs.InclusionTypeEnum.INCLUSIVE with String = js.native
    @JSBracketAccess
    def apply(value: String): js.UndefOr[InclusionTypeEnum with String] = js.native
  }
  
}

