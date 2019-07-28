package typings.squareDashConnect.squareDashConnectMod

import typings.squareDashConnect.squareDashConnectMod.V1EmployeeNs.StatusEnum
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("square-connect", "V1Employee")
@js.native
object V1EmployeeNs extends js.Object {
  @js.native
  sealed trait StatusEnum extends js.Object
  
  @js.native
  object StatusEnum extends js.Object {
    @js.native
    sealed trait ACTIVE extends StatusEnum
    
    @js.native
    sealed trait INACTIVE extends StatusEnum
    
    /* "ACTIVE" */ val ACTIVE: typings.squareDashConnect.squareDashConnectMod.V1EmployeeNs.StatusEnum.ACTIVE with String = js.native
    /* "INACTIVE" */ val INACTIVE: typings.squareDashConnect.squareDashConnectMod.V1EmployeeNs.StatusEnum.INACTIVE with String = js.native
    @JSBracketAccess
    def apply(value: String): js.UndefOr[StatusEnum with String] = js.native
  }
  
}

