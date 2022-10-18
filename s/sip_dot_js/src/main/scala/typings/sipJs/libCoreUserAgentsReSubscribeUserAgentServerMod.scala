package typings.sipJs

import typings.sipJs.libCoreDialogsMod.Dialog
import typings.sipJs.libCoreMessagesIncomingRequestMod.IncomingRequestDelegate
import typings.sipJs.libCoreMessagesMod.IncomingRequestMessage
import typings.sipJs.libCoreUserAgentsUserAgentServerMod.UserAgentServer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libCoreUserAgentsReSubscribeUserAgentServerMod {
  
  @JSImport("sip.js/lib/core/user-agents/re-subscribe-user-agent-server", "ReSubscribeUserAgentServer")
  @js.native
  open class ReSubscribeUserAgentServer protected () extends UserAgentServer {
    def this(dialog: Dialog, message: IncomingRequestMessage) = this()
    def this(dialog: Dialog, message: IncomingRequestMessage, delegate: IncomingRequestDelegate) = this()
  }
}
