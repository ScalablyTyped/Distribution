package typings.squareDashConnect.squareDashConnectMod

import typings.squareDashConnect.squareDashConnectMod.V1ListEmployeeRolesRequestNs.OrderEnum
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("square-connect", "V1ListEmployeeRolesRequest")
@js.native
object V1ListEmployeeRolesRequestNs extends js.Object {
  @js.native
  sealed trait OrderEnum extends js.Object
  
  @js.native
  object OrderEnum extends js.Object {
    @js.native
    sealed trait ASC extends OrderEnum
    
    @js.native
    sealed trait DESC extends OrderEnum
    
    /* "ASC" */ val ASC: typings.squareDashConnect.squareDashConnectMod.V1ListEmployeeRolesRequestNs.OrderEnum.ASC with String = js.native
    /* "DESC" */ val DESC: typings.squareDashConnect.squareDashConnectMod.V1ListEmployeeRolesRequestNs.OrderEnum.DESC with String = js.native
    @JSBracketAccess
    def apply(value: String): js.UndefOr[OrderEnum with String] = js.native
  }
  
}

