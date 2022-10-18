package typings.sipJs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libApiUserAgentStateMod {
  
  @js.native
  sealed trait UserAgentState extends StObject
  @JSImport("sip.js/lib/api/user-agent-state", "UserAgentState")
  @js.native
  object UserAgentState extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[UserAgentState & String] = js.native
    
    @js.native
    sealed trait Started
      extends StObject
         with UserAgentState
    /* "Started" */ val Started: typings.sipJs.libApiUserAgentStateMod.UserAgentState.Started & String = js.native
    
    @js.native
    sealed trait Stopped
      extends StObject
         with UserAgentState
    /* "Stopped" */ val Stopped: typings.sipJs.libApiUserAgentStateMod.UserAgentState.Stopped & String = js.native
  }
}
