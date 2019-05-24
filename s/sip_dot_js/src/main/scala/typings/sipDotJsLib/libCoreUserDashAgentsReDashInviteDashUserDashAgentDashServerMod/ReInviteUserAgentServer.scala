package typings
package sipDotJsLib.libCoreUserDashAgentsReDashInviteDashUserDashAgentDashServerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- sipDotJsLib.libCoreMessagesMethodsInviteMod.IncomingInviteRequest because var conflicts: delegate. Inlined  */ @JSImport("sip.js/lib/Core/user-agents/re-invite-user-agent-server", "ReInviteUserAgentServer")
@js.native
class ReInviteUserAgentServer protected ()
  extends sipDotJsLib.libCoreUserDashAgentsUserDashAgentDashServerMod.UserAgentServer {
  def this(dialog: sipDotJsLib.libCoreDialogsMod.SessionDialog, message: sipDotJsLib.libSIPMessageMod.IncomingRequest) = this()
  def this(dialog: sipDotJsLib.libCoreDialogsMod.SessionDialog, message: sipDotJsLib.libSIPMessageMod.IncomingRequest, delegate: sipDotJsLib.libCoreMessagesIncomingDashRequestMod.IncomingRequestDelegate) = this()
  var dialog: js.Any = js.native
}

