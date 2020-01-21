package typings.sipJs.userAgentOptionsMod

import org.scalablytyped.runtime.TopLevel
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
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[SIPExtension with String] = js.native
  /* "Required" */ @js.native
  object Required extends TopLevel[Required with String]
  
  /* "Supported" */ @js.native
  object Supported extends TopLevel[Supported with String]
  
  /* "Unsupported" */ @js.native
  object Unsupported extends TopLevel[Unsupported with String]
  
}

