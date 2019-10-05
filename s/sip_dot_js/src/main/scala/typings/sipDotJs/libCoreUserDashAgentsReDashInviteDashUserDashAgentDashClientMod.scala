package typings.sipDotJs

import typings.sipDotJs.libCoreDialogsMod.SessionDialog
import typings.sipDotJs.libCoreMessagesMethodsInviteMod.OutgoingInviteRequestDelegate
import typings.sipDotJs.libCoreMessagesOutgoingDashRequestMod.RequestOptions
import typings.sipDotJs.libCoreUserDashAgentsUserDashAgentDashClientMod.UserAgentClient
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("sip.js/lib/core/user-agents/re-invite-user-agent-client", JSImport.Namespace)
@js.native
object libCoreUserDashAgentsReDashInviteDashUserDashAgentDashClientMod extends js.Object {
  /* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
  - typings.sipDotJs.libCoreMessagesOutgoingDashRequestMod.OutgoingRequest because Already inherited
  - typings.sipDotJs.libCoreMessagesMethodsInviteMod.OutgoingInviteRequest because var conflicts: delegate, message. Inlined  */ @js.native
  class ReInviteUserAgentClient protected () extends UserAgentClient {
    def this(dialog: SessionDialog) = this()
    def this(dialog: SessionDialog, delegate: OutgoingInviteRequestDelegate) = this()
    def this(dialog: SessionDialog, delegate: OutgoingInviteRequestDelegate, options: RequestOptions) = this()
    @JSName("delegate")
    var delegate_ReInviteUserAgentClient: js.UndefOr[OutgoingInviteRequestDelegate] = js.native
    var dialog: js.Any = js.native
  }
  
}

