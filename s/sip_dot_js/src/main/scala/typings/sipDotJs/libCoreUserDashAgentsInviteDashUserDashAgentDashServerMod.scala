package typings.sipDotJs

import typings.sipDotJs.libCoreMessagesIncomingDashRequestMod.IncomingRequestDelegate
import typings.sipDotJs.libCoreMessagesMod.IncomingRequestMessage
import typings.sipDotJs.libCoreUserDashAgentDashCoreMod.UserAgentCore
import typings.sipDotJs.libCoreUserDashAgentsUserDashAgentDashServerMod.UserAgentServer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("sip.js/lib/core/user-agents/invite-user-agent-server", JSImport.Namespace)
@js.native
object libCoreUserDashAgentsInviteDashUserDashAgentDashServerMod extends js.Object {
  /* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
  - typings.sipDotJs.libCoreMessagesIncomingDashRequestMod.IncomingRequest because Already inherited
  - typings.sipDotJs.libCoreMessagesMethodsInviteMod.IncomingInviteRequest because var conflicts: delegate, message. Inlined  */ @js.native
  class InviteUserAgentServer protected () extends UserAgentServer {
    def this(core: UserAgentCore, message: IncomingRequestMessage) = this()
    def this(core: UserAgentCore, message: IncomingRequestMessage, delegate: IncomingRequestDelegate) = this()
    /** The confirmed dialog, if any. */
    var confirmedDialog: js.Any = js.native
    /** The early dialog, if any. */
    var earlyDialog: js.Any = js.native
  }
  
}

