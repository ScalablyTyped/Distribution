package typings.sipDotJs.libApiUserDashAgentDashOptionsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait SIPExtension extends js.Object

@JSImport("sip.js/lib/api/user-agent-options", "SIPExtension")
@js.native
object SIPExtension extends js.Object {
  @js.native
  sealed trait Required extends SIPExtension
  
  @js.native
  sealed trait Supported extends SIPExtension
  
  @js.native
  sealed trait Unsupported extends SIPExtension
  
  /* "Required" */ val Required: typings.sipDotJs.libApiUserDashAgentDashOptionsMod.SIPExtension.Required with String = js.native
  /* "Supported" */ val Supported: typings.sipDotJs.libApiUserDashAgentDashOptionsMod.SIPExtension.Supported with String = js.native
  /* "Unsupported" */ val Unsupported: typings.sipDotJs.libApiUserDashAgentDashOptionsMod.SIPExtension.Unsupported with String = js.native
  @JSBracketAccess
  def apply(value: String): js.UndefOr[SIPExtension with String] = js.native
}

