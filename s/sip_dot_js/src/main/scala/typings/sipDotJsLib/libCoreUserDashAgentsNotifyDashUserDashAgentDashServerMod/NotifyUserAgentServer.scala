package typings
package sipDotJsLib.libCoreUserDashAgentsNotifyDashUserDashAgentDashServerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- sipDotJsLib.libCoreMessagesMethodsNotifyMod.IncomingNotifyRequest because Already inherited */ @JSImport("sip.js/lib/Core/user-agents/notify-user-agent-server", "NotifyUserAgentServer")
@js.native
class NotifyUserAgentServer protected ()
  extends sipDotJsLib.libCoreUserDashAgentsUserDashAgentDashServerMod.UserAgentServer {
  /**
    * NOTIFY UAS constructor.
    * @param dialogOrCore Dialog for in dialog NOTIFY, UserAgentCore for out of dialog NOTIFY (deprecated).
    * @param message Incoming NOTIFY request message.
    */
  def this(dialogOrCore: sipDotJsLib.libCoreDialogsMod.Dialog, message: sipDotJsLib.libSIPMessageMod.IncomingRequest) = this()
  def this(dialogOrCore: sipDotJsLib.libCoreUserDashAgentDashCoreMod.UserAgentCore, message: sipDotJsLib.libSIPMessageMod.IncomingRequest) = this()
  def this(dialogOrCore: sipDotJsLib.libCoreDialogsMod.Dialog, message: sipDotJsLib.libSIPMessageMod.IncomingRequest, delegate: sipDotJsLib.libCoreMessagesIncomingDashRequestMod.IncomingRequestDelegate) = this()
  def this(dialogOrCore: sipDotJsLib.libCoreUserDashAgentDashCoreMod.UserAgentCore, message: sipDotJsLib.libSIPMessageMod.IncomingRequest, delegate: sipDotJsLib.libCoreMessagesIncomingDashRequestMod.IncomingRequestDelegate) = this()
}

