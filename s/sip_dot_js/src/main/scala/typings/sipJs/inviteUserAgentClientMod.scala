package typings.sipJs

import typings.sipJs.inviteMod.OutgoingInviteRequestDelegate
import typings.sipJs.messagesMod.OutgoingRequestMessage
import typings.sipJs.userAgentClientMod.UserAgentClient
import typings.sipJs.userAgentCoreMod.UserAgentCore
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("sip.js/lib/core/user-agents/invite-user-agent-client", JSImport.Namespace)
@js.native
object inviteUserAgentClientMod extends js.Object {
  /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
  - typings.sipJs.outgoingRequestMod.OutgoingRequest because Already inherited
  - typings.sipJs.inviteMod.OutgoingInviteRequest because var conflicts: delegate, message. Inlined  */ @js.native
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

