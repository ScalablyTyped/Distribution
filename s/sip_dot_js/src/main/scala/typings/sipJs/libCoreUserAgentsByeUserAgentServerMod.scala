package typings.sipJs

import typings.sipJs.libCoreDialogsMod.SessionDialog
import typings.sipJs.libCoreMessagesIncomingRequestMod.IncomingRequestDelegate
import typings.sipJs.libCoreMessagesMod.IncomingRequestMessage
import typings.sipJs.libCoreUserAgentsUserAgentServerMod.UserAgentServer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libCoreUserAgentsByeUserAgentServerMod {
  
  @JSImport("sip.js/lib/core/user-agents/bye-user-agent-server", "ByeUserAgentServer")
  @js.native
  open class ByeUserAgentServer protected () extends UserAgentServer {
    def this(dialog: SessionDialog, message: IncomingRequestMessage) = this()
    def this(dialog: SessionDialog, message: IncomingRequestMessage, delegate: IncomingRequestDelegate) = this()
  }
}
