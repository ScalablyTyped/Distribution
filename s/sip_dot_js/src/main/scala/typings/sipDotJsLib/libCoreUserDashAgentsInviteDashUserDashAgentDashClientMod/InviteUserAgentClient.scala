package typings
package sipDotJsLib.libCoreUserDashAgentsInviteDashUserDashAgentDashClientMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- sipDotJsLib.libCoreMessagesMethodsInviteMod.OutgoingInviteRequest because var conflicts: delegate, message. Inlined  */ @JSImport("sip.js/lib/core/user-agents/invite-user-agent-client", "InviteUserAgentClient")
@js.native
class InviteUserAgentClient protected ()
  extends sipDotJsLib.libCoreUserDashAgentsUserDashAgentDashClientMod.UserAgentClient {
  def this(core: sipDotJsLib.libCoreUserDashAgentDashCoreMod.UserAgentCore, message: sipDotJsLib.libCoreMessagesMod.OutgoingRequestMessage) = this()
  def this(core: sipDotJsLib.libCoreUserDashAgentDashCoreMod.UserAgentCore, message: sipDotJsLib.libCoreMessagesMod.OutgoingRequestMessage, delegate: sipDotJsLib.libCoreMessagesMethodsInviteMod.OutgoingInviteRequestDelegate) = this()
  var confirmedDialogAcks: js.Any = js.native
  var confirmedDialogs: js.Any = js.native
  @JSName("delegate")
  var delegate_InviteUserAgentClient: js.UndefOr[sipDotJsLib.libCoreMessagesMethodsInviteMod.OutgoingInviteRequestDelegate] = js.native
  var earlyDialogs: js.Any = js.native
}

