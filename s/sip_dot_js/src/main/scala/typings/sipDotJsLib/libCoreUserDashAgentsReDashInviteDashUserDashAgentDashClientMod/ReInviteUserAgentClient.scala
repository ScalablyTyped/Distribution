package typings
package sipDotJsLib.libCoreUserDashAgentsReDashInviteDashUserDashAgentDashClientMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- sipDotJsLib.libCoreMessagesMethodsInviteMod.OutgoingInviteRequest because var conflicts: delegate. Inlined  */ @JSImport("sip.js/lib/core/user-agents/re-invite-user-agent-client", "ReInviteUserAgentClient")
@js.native
class ReInviteUserAgentClient protected ()
  extends sipDotJsLib.libCoreUserDashAgentsUserDashAgentDashClientMod.UserAgentClient {
  def this(dialog: sipDotJsLib.libCoreDialogsMod.SessionDialog) = this()
  def this(dialog: sipDotJsLib.libCoreDialogsMod.SessionDialog, delegate: sipDotJsLib.libCoreMessagesMethodsInviteMod.OutgoingInviteRequestDelegate) = this()
  def this(dialog: sipDotJsLib.libCoreDialogsMod.SessionDialog, delegate: sipDotJsLib.libCoreMessagesMethodsInviteMod.OutgoingInviteRequestDelegate, options: sipDotJsLib.libCoreMessagesOutgoingDashRequestMod.RequestOptions) = this()
  @JSName("delegate")
  var delegate_ReInviteUserAgentClient: js.UndefOr[sipDotJsLib.libCoreMessagesMethodsInviteMod.OutgoingInviteRequestDelegate] = js.native
  var dialog: js.Any = js.native
}

