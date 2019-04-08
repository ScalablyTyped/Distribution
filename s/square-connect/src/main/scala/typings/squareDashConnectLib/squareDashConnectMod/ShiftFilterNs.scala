package typings
package squareDashConnectLib.squareDashConnectMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("square-connect", "ShiftFilter")
@js.native
object ShiftFilterNs extends js.Object {
  @js.native
  sealed trait StatusEnum extends js.Object
  
  @js.native
  object StatusEnum extends js.Object {
    @js.native
    sealed trait CLOSED
      extends squareDashConnectLib.squareDashConnectMod.ShiftFilterNs.StatusEnum
    
    @js.native
    sealed trait OPEN
      extends squareDashConnectLib.squareDashConnectMod.ShiftFilterNs.StatusEnum
    
    /* "CLOSED" */ val CLOSED: CLOSED with java.lang.String = js.native
    /* "OPEN" */ val OPEN: OPEN with java.lang.String = js.native
    @JSBracketAccess
    def apply(value: java.lang.String): js.UndefOr[
        squareDashConnectLib.squareDashConnectMod.ShiftFilterNs.StatusEnum with java.lang.String
      ] = js.native
  }
  
}

