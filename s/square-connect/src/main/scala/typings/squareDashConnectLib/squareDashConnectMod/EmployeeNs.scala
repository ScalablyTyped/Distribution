package typings
package squareDashConnectLib.squareDashConnectMod

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
    sealed trait ACTIVE
      extends squareDashConnectLib.squareDashConnectMod.EmployeeNs.StatusEnum
    
    @js.native
    sealed trait INACTIVE
      extends squareDashConnectLib.squareDashConnectMod.EmployeeNs.StatusEnum
    
    /* "ACTIVE" */ val ACTIVE: ACTIVE with java.lang.String = js.native
    /* "INACTIVE" */ val INACTIVE: INACTIVE with java.lang.String = js.native
    @JSBracketAccess
    def apply(value: java.lang.String): js.UndefOr[
        squareDashConnectLib.squareDashConnectMod.EmployeeNs.StatusEnum with java.lang.String
      ] = js.native
  }
  
}

