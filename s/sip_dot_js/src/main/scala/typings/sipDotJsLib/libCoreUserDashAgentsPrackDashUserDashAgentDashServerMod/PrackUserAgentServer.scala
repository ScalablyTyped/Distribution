package typings
package sipDotJsLib.libCoreUserDashAgentsPrackDashUserDashAgentDashServerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- sipDotJsLib.libCoreMessagesMethodsPrackMod.IncomingPrackRequest because Already inherited */ @JSImport("sip.js/lib/Core/user-agents/prack-user-agent-server", "PrackUserAgentServer")
@js.native
class PrackUserAgentServer protected ()
  extends sipDotJsLib.libCoreUserDashAgentsUserDashAgentDashServerMod.UserAgentServer {
  def this(dialog: sipDotJsLib.libCoreDialogsMod.SessionDialog, message: sipDotJsLib.libSIPMessageMod.IncomingRequest) = this()
  def this(dialog: sipDotJsLib.libCoreDialogsMod.SessionDialog, message: sipDotJsLib.libSIPMessageMod.IncomingRequest, delegate: sipDotJsLib.libCoreMessagesIncomingDashRequestMod.IncomingRequestDelegate) = this()
  var dialog: js.Any = js.native
}

