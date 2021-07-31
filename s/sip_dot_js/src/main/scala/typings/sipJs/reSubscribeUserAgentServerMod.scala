package typings.sipJs

import typings.sipJs.dialogsMod.Dialog
import typings.sipJs.incomingRequestMod.IncomingRequestDelegate
import typings.sipJs.messagesMod.IncomingRequestMessage
import typings.sipJs.userAgentServerMod.UserAgentServer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object reSubscribeUserAgentServerMod {
  
  @JSImport("sip.js/lib/core/user-agents/re-subscribe-user-agent-server", "ReSubscribeUserAgentServer")
  @js.native
  class ReSubscribeUserAgentServer protected () extends UserAgentServer {
    def this(dialog: Dialog, message: IncomingRequestMessage) = this()
    def this(dialog: Dialog, message: IncomingRequestMessage, delegate: IncomingRequestDelegate) = this()
  }
}
