package typings.sipJs

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("sip.js/lib/api/user-agent-state", JSImport.Namespace)
@js.native
object userAgentStateMod extends js.Object {
  @js.native
  sealed trait UserAgentState extends js.Object
  
  @js.native
  object UserAgentState extends js.Object {
    @js.native
    sealed trait Started extends UserAgentState
    
    @js.native
    sealed trait Stopped extends UserAgentState
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[UserAgentState with String] = js.native
    /* "Started" */ @js.native
    object Started extends TopLevel[Started with String]
    
    /* "Stopped" */ @js.native
    object Stopped extends TopLevel[Stopped with String]
    
  }
  
}

