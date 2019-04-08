package typings
package squareDashConnectLib.squareDashConnectMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("square-connect", "Shift")
@js.native
object ShiftNs extends js.Object {
  @js.native
  sealed trait StatusEnum extends js.Object
  
  @js.native
  object StatusEnum extends js.Object {
    @js.native
    sealed trait CLOSED
      extends squareDashConnectLib.squareDashConnectMod.ShiftNs.StatusEnum
    
    @js.native
    sealed trait OPEN
      extends squareDashConnectLib.squareDashConnectMod.ShiftNs.StatusEnum
    
    /* "CLOSED" */ val CLOSED: CLOSED with java.lang.String = js.native
    /* "OPEN" */ val OPEN: OPEN with java.lang.String = js.native
    @JSBracketAccess
    def apply(value: java.lang.String): js.UndefOr[
        squareDashConnectLib.squareDashConnectMod.ShiftNs.StatusEnum with java.lang.String
      ] = js.native
  }
  
}

