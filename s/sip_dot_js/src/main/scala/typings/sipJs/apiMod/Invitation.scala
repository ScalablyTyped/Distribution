package typings.sipJs.apiMod

import typings.sipJs.inviteMod.IncomingInviteRequest
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("sip.js/lib/api", "Invitation")
@js.native
class Invitation protected ()
  extends typings.sipJs.invitationMod.Invitation {
  /** @internal */
  def this(userAgent: typings.sipJs.userAgentMod.UserAgent, incomingInviteRequest: IncomingInviteRequest) = this()
}
