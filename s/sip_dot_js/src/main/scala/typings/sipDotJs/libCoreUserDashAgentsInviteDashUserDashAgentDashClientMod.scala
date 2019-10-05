package typings.sipDotJs

import typings.sipDotJs.libCoreMessagesMethodsInviteMod.OutgoingInviteRequestDelegate
import typings.sipDotJs.libCoreMessagesMod.OutgoingRequestMessage
import typings.sipDotJs.libCoreUserDashAgentDashCoreMod.UserAgentCore
import typings.sipDotJs.libCoreUserDashAgentsUserDashAgentDashClientMod.UserAgentClient
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("sip.js/lib/core/user-agents/invite-user-agent-client", JSImport.Namespace)
@js.native
object libCoreUserDashAgentsInviteDashUserDashAgentDashClientMod extends js.Object {
  /* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
  - typings.sipDotJs.libCoreMessagesOutgoingDashRequestMod.OutgoingRequest because Already inherited
  - typings.sipDotJs.libCoreMessagesMethodsInviteMod.OutgoingInviteRequest because var conflicts: delegate, message. Inlined  */ @js.native
  class InviteUserAgentClient protected () extends UserAgentClient {
    def this(core: UserAgentCore, message: OutgoingRequestMessage) = this()
    def this(core: UserAgentCore, message: OutgoingRequestMessage, delegate: OutgoingInviteRequestDelegate) = this()
    var confirmedDialogAcks: js.Any = js.native
    var confirmedDialogs: js.Any = js.native
    @JSName("delegate")
    var delegate_InviteUserAgentClient: js.UndefOr[OutgoingInviteRequestDelegate] = js.native
    var earlyDialogs: js.Any = js.native
  }
  
}

