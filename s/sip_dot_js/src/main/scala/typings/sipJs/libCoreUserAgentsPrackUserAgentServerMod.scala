package typings.sipJs

import typings.sipJs.libCoreDialogsSessionDialogMod.SessionDialog
import typings.sipJs.libCoreMessagesIncomingRequestMessageMod.IncomingRequestMessage
import typings.sipJs.libCoreMessagesIncomingRequestMod.IncomingRequestDelegate
import typings.sipJs.libCoreUserAgentsUserAgentServerMod.UserAgentServer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libCoreUserAgentsPrackUserAgentServerMod {
  
  @JSImport("sip.js/lib/core/user-agents/prack-user-agent-server", "PrackUserAgentServer")
  @js.native
  open class PrackUserAgentServer protected () extends UserAgentServer {
    def this(dialog: SessionDialog, message: IncomingRequestMessage) = this()
    def this(dialog: SessionDialog, message: IncomingRequestMessage, delegate: IncomingRequestDelegate) = this()
    
    /* private */ var dialog: Any = js.native
  }
}
