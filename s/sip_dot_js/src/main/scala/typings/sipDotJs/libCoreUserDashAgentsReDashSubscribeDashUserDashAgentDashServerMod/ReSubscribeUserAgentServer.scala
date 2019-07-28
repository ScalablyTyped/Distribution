package typings.sipDotJs.libCoreUserDashAgentsReDashSubscribeDashUserDashAgentDashServerMod

import typings.sipDotJs.libCoreDialogsMod.Dialog
import typings.sipDotJs.libCoreMessagesIncomingDashRequestMod.IncomingRequestDelegate
import typings.sipDotJs.libCoreMessagesMod.IncomingRequestMessage
import typings.sipDotJs.libCoreUserDashAgentsUserDashAgentDashServerMod.UserAgentServer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- typings.sipDotJs.libCoreMessagesMethodsSubscribeMod.IncomingSubscribeRequest because Already inherited */ @JSImport("sip.js/lib/core/user-agents/re-subscribe-user-agent-server", "ReSubscribeUserAgentServer")
@js.native
class ReSubscribeUserAgentServer protected () extends UserAgentServer {
  def this(dialog: Dialog, message: IncomingRequestMessage) = this()
  def this(dialog: Dialog, message: IncomingRequestMessage, delegate: IncomingRequestDelegate) = this()
}

