package typings.sipJs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("sip.js", "UserAgentState")
@js.native
object UserAgentState extends js.Object {
  /* "Started" */ val Started: typings.sipJs.userAgentStateMod.UserAgentState.Started with String = js.native
  /* "Stopped" */ val Stopped: typings.sipJs.userAgentStateMod.UserAgentState.Stopped with String = js.native
  @JSBracketAccess
  def apply(value: String): js.UndefOr[typings.sipJs.userAgentStateMod.UserAgentState with String] = js.native
}

