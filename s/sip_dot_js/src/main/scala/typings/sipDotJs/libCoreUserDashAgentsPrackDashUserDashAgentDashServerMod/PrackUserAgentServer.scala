package typings.sipDotJs.libCoreUserDashAgentsPrackDashUserDashAgentDashServerMod

import typings.sipDotJs.libCoreDialogsMod.SessionDialog
import typings.sipDotJs.libCoreMessagesIncomingDashRequestMod.IncomingRequestDelegate
import typings.sipDotJs.libCoreMessagesMod.IncomingRequestMessage
import typings.sipDotJs.libCoreUserDashAgentsUserDashAgentDashServerMod.UserAgentServer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- typings.sipDotJs.libCoreMessagesMethodsPrackMod.IncomingPrackRequest because Already inherited */ @JSImport("sip.js/lib/core/user-agents/prack-user-agent-server", "PrackUserAgentServer")
@js.native
class PrackUserAgentServer protected () extends UserAgentServer {
  def this(dialog: SessionDialog, message: IncomingRequestMessage) = this()
  def this(dialog: SessionDialog, message: IncomingRequestMessage, delegate: IncomingRequestDelegate) = this()
  var dialog: js.Any = js.native
}

