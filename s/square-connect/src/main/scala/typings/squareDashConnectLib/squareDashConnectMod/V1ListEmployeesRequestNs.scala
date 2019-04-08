package typings
package squareDashConnectLib.squareDashConnectMod

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
    sealed trait ASC
      extends squareDashConnectLib.squareDashConnectMod.V1ListEmployeesRequestNs.OrderEnum
    
    @js.native
    sealed trait DESC
      extends squareDashConnectLib.squareDashConnectMod.V1ListEmployeesRequestNs.OrderEnum
    
    /* "ASC" */ val ASC: ASC with java.lang.String = js.native
    /* "DESC" */ val DESC: DESC with java.lang.String = js.native
    @JSBracketAccess
    def apply(value: java.lang.String): js.UndefOr[
        squareDashConnectLib.squareDashConnectMod.V1ListEmployeesRequestNs.OrderEnum with java.lang.String
      ] = js.native
  }
  
  @js.native
  object StatusEnum extends js.Object {
    @js.native
    sealed trait ACTIVE
      extends squareDashConnectLib.squareDashConnectMod.V1ListEmployeesRequestNs.StatusEnum
    
    @js.native
    sealed trait INACTIVE
      extends squareDashConnectLib.squareDashConnectMod.V1ListEmployeesRequestNs.StatusEnum
    
    /* "ACTIVE" */ val ACTIVE: ACTIVE with java.lang.String = js.native
    /* "INACTIVE" */ val INACTIVE: INACTIVE with java.lang.String = js.native
    @JSBracketAccess
    def apply(value: java.lang.String): js.UndefOr[
        squareDashConnectLib.squareDashConnectMod.V1ListEmployeesRequestNs.StatusEnum with java.lang.String
      ] = js.native
  }
  
}

