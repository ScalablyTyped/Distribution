package typings.sipDotJs

import typings.sipDotJs.libApiUserDashAgentDashStateMod.UserAgentState
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("sip.js/lib/api/user-agent-state", JSImport.Namespace)
@js.native
object libApiUserDashAgentDashStateMod extends js.Object {
  @js.native
  sealed trait UserAgentState extends js.Object
  
  @js.native
  object UserAgentState extends js.Object {
    @js.native
    sealed trait Started extends UserAgentState
    
    @js.native
    sealed trait Stopped extends UserAgentState
    
    /* "Started" */ val Started: typings.sipDotJs.libApiUserDashAgentDashStateMod.UserAgentState.Started with String = js.native
    /* "Stopped" */ val Stopped: typings.sipDotJs.libApiUserDashAgentDashStateMod.UserAgentState.Stopped with String = js.native
    @JSBracketAccess
    def apply(value: String): js.UndefOr[UserAgentState with String] = js.native
  }
  
}

