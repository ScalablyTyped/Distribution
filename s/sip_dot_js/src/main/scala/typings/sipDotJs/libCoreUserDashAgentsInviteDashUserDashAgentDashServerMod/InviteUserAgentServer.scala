package typings.sipDotJs.libCoreUserDashAgentsInviteDashUserDashAgentDashServerMod

import typings.sipDotJs.libCoreMessagesIncomingDashRequestMod.IncomingRequestDelegate
import typings.sipDotJs.libCoreMessagesMod.IncomingRequestMessage
import typings.sipDotJs.libCoreUserDashAgentDashCoreMod.UserAgentCore
import typings.sipDotJs.libCoreUserDashAgentsUserDashAgentDashServerMod.UserAgentServer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- typings.sipDotJs.libCoreMessagesMethodsInviteMod.IncomingInviteRequest because var conflicts: delegate, message. Inlined  */ @JSImport("sip.js/lib/core/user-agents/invite-user-agent-server", "InviteUserAgentServer")
@js.native
class InviteUserAgentServer protected () extends UserAgentServer {
  def this(core: UserAgentCore, message: IncomingRequestMessage) = this()
  def this(core: UserAgentCore, message: IncomingRequestMessage, delegate: IncomingRequestDelegate) = this()
  /** The confirmed dialog, if any. */
  var confirmedDialog: js.Any = js.native
  /** The early dialog, if any. */
  var earlyDialog: js.Any = js.native
}

