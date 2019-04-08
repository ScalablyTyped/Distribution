package typings
package squareDashConnectLib.squareDashConnectMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("square-connect", "V1Order")
@js.native
object V1OrderNs extends js.Object {
  @js.native
  sealed trait StateEnum extends js.Object
  
  @js.native
  object StateEnum extends js.Object {
    @js.native
    sealed trait CANCELED
      extends squareDashConnectLib.squareDashConnectMod.V1OrderNs.StateEnum
    
    @js.native
    sealed trait COMPLETED
      extends squareDashConnectLib.squareDashConnectMod.V1OrderNs.StateEnum
    
    @js.native
    sealed trait OPEN
      extends squareDashConnectLib.squareDashConnectMod.V1OrderNs.StateEnum
    
    @js.native
    sealed trait PENDING
      extends squareDashConnectLib.squareDashConnectMod.V1OrderNs.StateEnum
    
    @js.native
    sealed trait REFUNDED
      extends squareDashConnectLib.squareDashConnectMod.V1OrderNs.StateEnum
    
    @js.native
    sealed trait REJECTED
      extends squareDashConnectLib.squareDashConnectMod.V1OrderNs.StateEnum
    
    /* "CANCELED" */ val CANCELED: CANCELED with java.lang.String = js.native
    /* "COMPLETED" */ val COMPLETED: COMPLETED with java.lang.String = js.native
    /* "OPEN" */ val OPEN: OPEN with java.lang.String = js.native
    /* "PENDING" */ val PENDING: PENDING with java.lang.String = js.native
    /* "REFUNDED" */ val REFUNDED: REFUNDED with java.lang.String = js.native
    /* "REJECTED" */ val REJECTED: REJECTED with java.lang.String = js.native
    @JSBracketAccess
    def apply(value: java.lang.String): js.UndefOr[
        squareDashConnectLib.squareDashConnectMod.V1OrderNs.StateEnum with java.lang.String
      ] = js.native
  }
  
}

