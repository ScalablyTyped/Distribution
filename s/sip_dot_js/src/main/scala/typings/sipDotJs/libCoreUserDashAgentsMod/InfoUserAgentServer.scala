package typings.sipDotJs.libCoreUserDashAgentsMod

import typings.sipDotJs.libCoreDialogsMod.SessionDialog
import typings.sipDotJs.libCoreMessagesIncomingDashRequestMod.IncomingRequestDelegate
import typings.sipDotJs.libCoreMessagesMod.IncomingRequestMessage
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("sip.js/lib/core/user-agents", "InfoUserAgentServer")
@js.native
class InfoUserAgentServer protected ()
  extends typings.sipDotJs.libCoreUserDashAgentsInfoDashUserDashAgentDashServerMod.InfoUserAgentServer {
  def this(dialog: SessionDialog, message: IncomingRequestMessage) = this()
  def this(dialog: SessionDialog, message: IncomingRequestMessage, delegate: IncomingRequestDelegate) = this()
}

