package typings.sipJs.mod

import typings.sipJs.inviteMod.IncomingInviteRequest
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("sip.js", "Invitation")
@js.native
class Invitation protected ()
  extends typings.sipJs.apiMod.Invitation {
  /** @internal */
  def this(userAgent: typings.sipJs.userAgentMod.UserAgent, incomingInviteRequest: IncomingInviteRequest) = this()
}
