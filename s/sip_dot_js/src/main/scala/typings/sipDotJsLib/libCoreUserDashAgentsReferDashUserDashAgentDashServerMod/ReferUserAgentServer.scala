package typings
package sipDotJsLib.libCoreUserDashAgentsReferDashUserDashAgentDashServerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- sipDotJsLib.libCoreMessagesMethodsReferMod.IncomingReferRequest because Already inherited */ @JSImport("sip.js/lib/Core/user-agents/refer-user-agent-server", "ReferUserAgentServer")
@js.native
class ReferUserAgentServer protected ()
  extends sipDotJsLib.libCoreUserDashAgentsUserDashAgentDashServerMod.UserAgentServer {
  /**
    * REFER UAS constructor.
    * @param dialogOrCore Dialog for in dialog REFER, UserAgentCore for out of dialog REFER.
    * @param message Incoming REFER request message.
    */
  def this(dialogOrCore: sipDotJsLib.libCoreDialogsMod.SessionDialog, message: sipDotJsLib.libSIPMessageMod.IncomingRequest) = this()
  def this(dialogOrCore: sipDotJsLib.libCoreUserDashAgentDashCoreMod.UserAgentCore, message: sipDotJsLib.libSIPMessageMod.IncomingRequest) = this()
  def this(dialogOrCore: sipDotJsLib.libCoreDialogsMod.SessionDialog, message: sipDotJsLib.libSIPMessageMod.IncomingRequest, delegate: sipDotJsLib.libCoreMessagesIncomingDashRequestMod.IncomingRequestDelegate) = this()
  def this(dialogOrCore: sipDotJsLib.libCoreUserDashAgentDashCoreMod.UserAgentCore, message: sipDotJsLib.libSIPMessageMod.IncomingRequest, delegate: sipDotJsLib.libCoreMessagesIncomingDashRequestMod.IncomingRequestDelegate) = this()
}

