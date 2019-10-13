package typings.sipDotJs

import typings.sipDotJs.libCoreDialogsMod.SessionDialog
import typings.sipDotJs.libCoreMessagesIncomingDashRequestMod.IncomingRequestDelegate
import typings.sipDotJs.libCoreMessagesMod.IncomingRequestMessage
import typings.sipDotJs.libCoreUserDashAgentDashCoreMod.UserAgentCore
import typings.sipDotJs.libCoreUserDashAgentsUserDashAgentDashServerMod.UserAgentServer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("sip.js/lib/core/user-agents/refer-user-agent-server", JSImport.Namespace)
@js.native
object libCoreUserDashAgentsReferDashUserDashAgentDashServerMod extends js.Object {
  @js.native
  class ReferUserAgentServer protected () extends UserAgentServer {
    /**
      * REFER UAS constructor.
      * @param dialogOrCore - Dialog for in dialog REFER, UserAgentCore for out of dialog REFER.
      * @param message - Incoming REFER request message.
      */
    def this(dialogOrCore: SessionDialog, message: IncomingRequestMessage) = this()
    def this(dialogOrCore: UserAgentCore, message: IncomingRequestMessage) = this()
    def this(dialogOrCore: SessionDialog, message: IncomingRequestMessage, delegate: IncomingRequestDelegate) = this()
    def this(dialogOrCore: UserAgentCore, message: IncomingRequestMessage, delegate: IncomingRequestDelegate) = this()
  }
  
}

