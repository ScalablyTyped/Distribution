package typings.sipDotJs

import typings.sipDotJs.libCoreDialogsMod.Dialog
import typings.sipDotJs.libCoreMessagesIncomingDashRequestMod.IncomingRequestDelegate
import typings.sipDotJs.libCoreMessagesMod.IncomingRequestMessage
import typings.sipDotJs.libCoreUserDashAgentDashCoreMod.UserAgentCore
import typings.sipDotJs.libCoreUserDashAgentsUserDashAgentDashServerMod.UserAgentServer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("sip.js/lib/core/user-agents/notify-user-agent-server", JSImport.Namespace)
@js.native
object libCoreUserDashAgentsNotifyDashUserDashAgentDashServerMod extends js.Object {
  @js.native
  class NotifyUserAgentServer protected () extends UserAgentServer {
    /**
      * NOTIFY UAS constructor.
      * @param dialogOrCore - Dialog for in dialog NOTIFY, UserAgentCore for out of dialog NOTIFY (deprecated).
      * @param message - Incoming NOTIFY request message.
      */
    def this(dialogOrCore: Dialog, message: IncomingRequestMessage) = this()
    def this(dialogOrCore: UserAgentCore, message: IncomingRequestMessage) = this()
    def this(dialogOrCore: Dialog, message: IncomingRequestMessage, delegate: IncomingRequestDelegate) = this()
    def this(dialogOrCore: UserAgentCore, message: IncomingRequestMessage, delegate: IncomingRequestDelegate) = this()
  }
  
}

