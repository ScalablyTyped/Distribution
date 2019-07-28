package typings.squareDashConnect.squareDashConnectMod

import typings.squareDashConnect.squareDashConnectMod.V1CashDrawerShiftNs.EventTypeEnum
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
    sealed trait CLOSED extends EventTypeEnum
    
    @js.native
    sealed trait ENDED extends EventTypeEnum
    
    @js.native
    sealed trait OPEN extends EventTypeEnum
    
    /* "CLOSED" */ val CLOSED: typings.squareDashConnect.squareDashConnectMod.V1CashDrawerShiftNs.EventTypeEnum.CLOSED with String = js.native
    /* "ENDED" */ val ENDED: typings.squareDashConnect.squareDashConnectMod.V1CashDrawerShiftNs.EventTypeEnum.ENDED with String = js.native
    /* "OPEN" */ val OPEN: typings.squareDashConnect.squareDashConnectMod.V1CashDrawerShiftNs.EventTypeEnum.OPEN with String = js.native
    @JSBracketAccess
    def apply(value: String): js.UndefOr[EventTypeEnum with String] = js.native
  }
  
}

