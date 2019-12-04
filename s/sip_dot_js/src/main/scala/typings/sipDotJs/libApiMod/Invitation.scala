package typings.sipDotJs.libApiMod

import typings.sipDotJs.libCoreMessagesMethodsInviteMod.IncomingInviteRequest
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("sip.js/lib/api", "Invitation")
@js.native
class Invitation protected ()
  extends typings.sipDotJs.libApiInvitationMod.Invitation {
  /** @internal */
  def this(
    userAgent: typings.sipDotJs.libApiUserDashAgentMod.UserAgent,
    incomingInviteRequest: IncomingInviteRequest
  ) = this()
}

