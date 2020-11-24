package typings.sipJs.apiMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("sip.js/lib/api", "SIPExtension")
@js.native
object SIPExtension extends js.Object {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[typings.sipJs.userAgentOptionsMod.SIPExtension with String] = js.native
  
  /* "Required" */ val Required: typings.sipJs.userAgentOptionsMod.SIPExtension.Required with String = js.native
  
  /* "Supported" */ val Supported: typings.sipJs.userAgentOptionsMod.SIPExtension.Supported with String = js.native
  
  /* "Unsupported" */ val Unsupported: typings.sipJs.userAgentOptionsMod.SIPExtension.Unsupported with String = js.native
}
