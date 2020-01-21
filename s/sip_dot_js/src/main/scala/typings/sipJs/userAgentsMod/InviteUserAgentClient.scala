package typings.sipJs.userAgentsMod

import typings.sipJs.inviteMod.OutgoingInviteRequestDelegate
import typings.sipJs.messagesMod.OutgoingRequestMessage
import typings.sipJs.userAgentCoreMod.UserAgentCore
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("sip.js/lib/core/user-agents", "InviteUserAgentClient")
@js.native
class InviteUserAgentClient protected ()
  extends typings.sipJs.inviteUserAgentClientMod.InviteUserAgentClient {
  def this(core: UserAgentCore, message: OutgoingRequestMessage) = this()
  def this(core: UserAgentCore, message: OutgoingRequestMessage, delegate: OutgoingInviteRequestDelegate) = this()
}

