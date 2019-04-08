package typings
package squareDashConnectLib.squareDashConnectMod

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
    sealed trait ACTIVE
      extends squareDashConnectLib.squareDashConnectMod.V1EmployeeNs.StatusEnum
    
    @js.native
    sealed trait INACTIVE
      extends squareDashConnectLib.squareDashConnectMod.V1EmployeeNs.StatusEnum
    
    /* "ACTIVE" */ val ACTIVE: ACTIVE with java.lang.String = js.native
    /* "INACTIVE" */ val INACTIVE: INACTIVE with java.lang.String = js.native
    @JSBracketAccess
    def apply(value: java.lang.String): js.UndefOr[
        squareDashConnectLib.squareDashConnectMod.V1EmployeeNs.StatusEnum with java.lang.String
      ] = js.native
  }
  
}

