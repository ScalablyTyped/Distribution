package typings.squareDashConnect.squareDashConnectMod

import typings.squareDashConnect.squareDashConnectMod.V1RefundNs.TypeEnum
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("square-connect", "V1Refund")
@js.native
object V1RefundNs extends js.Object {
  @js.native
  sealed trait TypeEnum extends js.Object
  
  @js.native
  object TypeEnum extends js.Object {
    @js.native
    sealed trait FULL extends TypeEnum
    
    @js.native
    sealed trait PARTIAL extends TypeEnum
    
    /* "FULL" */ val FULL: typings.squareDashConnect.squareDashConnectMod.V1RefundNs.TypeEnum.FULL with String = js.native
    /* "PARTIAL" */ val PARTIAL: typings.squareDashConnect.squareDashConnectMod.V1RefundNs.TypeEnum.PARTIAL with String = js.native
    @JSBracketAccess
    def apply(value: String): js.UndefOr[TypeEnum with String] = js.native
  }
  
}

