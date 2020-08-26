package typings.sipJs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("sip.js", "SIPExtension")
@js.native
object SIPExtension extends js.Object {
  /* "Required" */ val Required: typings.sipJs.userAgentOptionsMod.SIPExtension.Required with String = js.native
  /* "Supported" */ val Supported: typings.sipJs.userAgentOptionsMod.SIPExtension.Supported with String = js.native
  /* "Unsupported" */ val Unsupported: typings.sipJs.userAgentOptionsMod.SIPExtension.Unsupported with String = js.native
  @JSBracketAccess
  def apply(value: String): js.UndefOr[typings.sipJs.userAgentOptionsMod.SIPExtension with String] = js.native
}

