package typings.sipJs

import typings.sipJs.libCoreDialogsSessionDialogMod.SessionDialog
import typings.sipJs.libCoreMessagesOutgoingRequestMod.OutgoingRequestDelegate
import typings.sipJs.libCoreMessagesOutgoingRequestMod.RequestOptions
import typings.sipJs.libCoreUserAgentsUserAgentClientMod.UserAgentClient
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libCoreUserAgentsByeUserAgentClientMod {
  
  @JSImport("sip.js/lib/core/user-agents/bye-user-agent-client", "ByeUserAgentClient")
  @js.native
  open class ByeUserAgentClient protected () extends UserAgentClient {
    def this(dialog: SessionDialog) = this()
    def this(dialog: SessionDialog, delegate: OutgoingRequestDelegate) = this()
    def this(dialog: SessionDialog, delegate: Unit, options: RequestOptions) = this()
    def this(dialog: SessionDialog, delegate: OutgoingRequestDelegate, options: RequestOptions) = this()
  }
}
