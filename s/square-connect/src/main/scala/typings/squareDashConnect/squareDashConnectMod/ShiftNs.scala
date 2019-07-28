package typings.squareDashConnect.squareDashConnectMod

import typings.squareDashConnect.squareDashConnectMod.ShiftNs.StatusEnum
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
    sealed trait CLOSED extends StatusEnum
    
    @js.native
    sealed trait OPEN extends StatusEnum
    
    /* "CLOSED" */ val CLOSED: typings.squareDashConnect.squareDashConnectMod.ShiftNs.StatusEnum.CLOSED with String = js.native
    /* "OPEN" */ val OPEN: typings.squareDashConnect.squareDashConnectMod.ShiftNs.StatusEnum.OPEN with String = js.native
    @JSBracketAccess
    def apply(value: String): js.UndefOr[StatusEnum with String] = js.native
  }
  
}

