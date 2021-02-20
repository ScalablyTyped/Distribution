package typings.sipJs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object userAgentStateMod {
  
  @js.native
  sealed trait UserAgentState extends StObject
  @JSImport("sip.js/lib/api/user-agent-state", "UserAgentState")
  @js.native
  object UserAgentState extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[UserAgentState with String] = js.native
    
    @js.native
    sealed trait Started extends UserAgentState
    /* "Started" */ val Started: typings.sipJs.userAgentStateMod.UserAgentState.Started with String = js.native
    
    @js.native
    sealed trait Stopped extends UserAgentState
    /* "Stopped" */ val Stopped: typings.sipJs.userAgentStateMod.UserAgentState.Stopped with String = js.native
  }
}
