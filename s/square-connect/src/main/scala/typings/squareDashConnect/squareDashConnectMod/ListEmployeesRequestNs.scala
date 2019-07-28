package typings.squareDashConnect.squareDashConnectMod

import typings.squareDashConnect.squareDashConnectMod.ListEmployeesRequestNs.StatusEnum
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("square-connect", "ListEmployeesRequest")
@js.native
object ListEmployeesRequestNs extends js.Object {
  @js.native
  sealed trait StatusEnum extends js.Object
  
  @js.native
  object StatusEnum extends js.Object {
    @js.native
    sealed trait ACTIVE extends StatusEnum
    
    @js.native
    sealed trait INACTIVE extends StatusEnum
    
    /* "ACTIVE" */ val ACTIVE: typings.squareDashConnect.squareDashConnectMod.ListEmployeesRequestNs.StatusEnum.ACTIVE with String = js.native
    /* "INACTIVE" */ val INACTIVE: typings.squareDashConnect.squareDashConnectMod.ListEmployeesRequestNs.StatusEnum.INACTIVE with String = js.native
    @JSBracketAccess
    def apply(value: String): js.UndefOr[StatusEnum with String] = js.native
  }
  
}

