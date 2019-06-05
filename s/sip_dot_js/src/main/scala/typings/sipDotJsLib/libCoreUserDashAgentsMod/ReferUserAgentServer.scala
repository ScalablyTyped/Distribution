package typings
package sipDotJsLib.libCoreUserDashAgentsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("sip.js/lib/core/user-agents", "ReferUserAgentServer")
@js.native
class ReferUserAgentServer protected ()
  extends sipDotJsLib.libCoreUserDashAgentsReferDashUserDashAgentDashServerMod.ReferUserAgentServer {
  /**
    * REFER UAS constructor.
    * @param dialogOrCore Dialog for in dialog REFER, UserAgentCore for out of dialog REFER.
    * @param message Incoming REFER request message.
    */
  def this(dialogOrCore: sipDotJsLib.libCoreDialogsMod.SessionDialog, message: sipDotJsLib.libCoreMessagesMod.IncomingRequestMessage) = this()
  def this(dialogOrCore: sipDotJsLib.libCoreUserDashAgentDashCoreMod.UserAgentCore, message: sipDotJsLib.libCoreMessagesMod.IncomingRequestMessage) = this()
  def this(dialogOrCore: sipDotJsLib.libCoreDialogsMod.SessionDialog, message: sipDotJsLib.libCoreMessagesMod.IncomingRequestMessage, delegate: sipDotJsLib.libCoreMessagesIncomingDashRequestMod.IncomingRequestDelegate) = this()
  def this(dialogOrCore: sipDotJsLib.libCoreUserDashAgentDashCoreMod.UserAgentCore, message: sipDotJsLib.libCoreMessagesMod.IncomingRequestMessage, delegate: sipDotJsLib.libCoreMessagesIncomingDashRequestMod.IncomingRequestDelegate) = this()
}

