package typings
package sipDotJsLib.libCoreUserDashAgentsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("sip.js/lib/Core/user-agents", "NotifyUserAgentServer")
@js.native
class NotifyUserAgentServer protected ()
  extends sipDotJsLib.libCoreUserDashAgentsNotifyDashUserDashAgentDashServerMod.NotifyUserAgentServer {
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

