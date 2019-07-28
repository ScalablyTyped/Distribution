package typings.squareDashConnect.squareDashConnectMod

import typings.squareDashConnect.squareDashConnectMod.V1ListEmployeesRequestNs.OrderEnum
import typings.squareDashConnect.squareDashConnectMod.V1ListEmployeesRequestNs.StatusEnum
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("square-connect", "V1ListEmployeesRequest")
@js.native
object V1ListEmployeesRequestNs extends js.Object {
  @js.native
  sealed trait OrderEnum extends js.Object
  
  @js.native
  sealed trait StatusEnum extends js.Object
  
  @js.native
  object OrderEnum extends js.Object {
    @js.native
    sealed trait ASC extends OrderEnum
    
    @js.native
    sealed trait DESC extends OrderEnum
    
    /* "ASC" */ val ASC: typings.squareDashConnect.squareDashConnectMod.V1ListEmployeesRequestNs.OrderEnum.ASC with String = js.native
    /* "DESC" */ val DESC: typings.squareDashConnect.squareDashConnectMod.V1ListEmployeesRequestNs.OrderEnum.DESC with String = js.native
    @JSBracketAccess
    def apply(value: String): js.UndefOr[OrderEnum with String] = js.native
  }
  
  @js.native
  object StatusEnum extends js.Object {
    @js.native
    sealed trait ACTIVE extends StatusEnum
    
    @js.native
    sealed trait INACTIVE extends StatusEnum
    
    /* "ACTIVE" */ val ACTIVE: typings.squareDashConnect.squareDashConnectMod.V1ListEmployeesRequestNs.StatusEnum.ACTIVE with String = js.native
    /* "INACTIVE" */ val INACTIVE: typings.squareDashConnect.squareDashConnectMod.V1ListEmployeesRequestNs.StatusEnum.INACTIVE with String = js.native
    @JSBracketAccess
    def apply(value: String): js.UndefOr[StatusEnum with String] = js.native
  }
  
}

