package typings
package squareDashConnectLib.squareDashConnectMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("square-connect", "V1CashDrawerShift")
@js.native
object V1CashDrawerShiftNs extends js.Object {
  @js.native
  sealed trait EventTypeEnum extends js.Object
  
  @js.native
  object EventTypeEnum extends js.Object {
    @js.native
    sealed trait CLOSED
      extends squareDashConnectLib.squareDashConnectMod.V1CashDrawerShiftNs.EventTypeEnum
    
    @js.native
    sealed trait ENDED
      extends squareDashConnectLib.squareDashConnectMod.V1CashDrawerShiftNs.EventTypeEnum
    
    @js.native
    sealed trait OPEN
      extends squareDashConnectLib.squareDashConnectMod.V1CashDrawerShiftNs.EventTypeEnum
    
    /* "CLOSED" */ val CLOSED: CLOSED with java.lang.String = js.native
    /* "ENDED" */ val ENDED: ENDED with java.lang.String = js.native
    /* "OPEN" */ val OPEN: OPEN with java.lang.String = js.native
    @JSBracketAccess
    def apply(value: java.lang.String): js.UndefOr[
        squareDashConnectLib.squareDashConnectMod.V1CashDrawerShiftNs.EventTypeEnum with java.lang.String
      ] = js.native
  }
  
}

