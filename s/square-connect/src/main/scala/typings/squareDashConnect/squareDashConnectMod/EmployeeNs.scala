package typings.squareDashConnect.squareDashConnectMod

import typings.squareDashConnect.squareDashConnectMod.EmployeeNs.StatusEnum
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("square-connect", "Employee")
@js.native
object EmployeeNs extends js.Object {
  @js.native
  sealed trait StatusEnum extends js.Object
  
  @js.native
  object StatusEnum extends js.Object {
    @js.native
    sealed trait ACTIVE extends StatusEnum
    
    @js.native
    sealed trait INACTIVE extends StatusEnum
    
    /* "ACTIVE" */ val ACTIVE: typings.squareDashConnect.squareDashConnectMod.EmployeeNs.StatusEnum.ACTIVE with String = js.native
    /* "INACTIVE" */ val INACTIVE: typings.squareDashConnect.squareDashConnectMod.EmployeeNs.StatusEnum.INACTIVE with String = js.native
    @JSBracketAccess
    def apply(value: String): js.UndefOr[StatusEnum with String] = js.native
  }
  
}

