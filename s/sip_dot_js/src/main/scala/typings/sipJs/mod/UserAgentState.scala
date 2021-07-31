package typings.sipJs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("sip.js", "UserAgentState")
@js.native
object UserAgentState extends StObject {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[typings.sipJs.userAgentStateMod.UserAgentState & String] = js.native
  
  /* "Started" */ val Started: typings.sipJs.userAgentStateMod.UserAgentState.Started & String = js.native
  
  /* "Stopped" */ val Stopped: typings.sipJs.userAgentStateMod.UserAgentState.Stopped & String = js.native
}
