package typings.sipJs

import typings.sipJs.libCoreDialogsMod.SessionDialog
import typings.sipJs.libCoreMessagesOutgoingRequestMod.OutgoingRequestDelegate
import typings.sipJs.libCoreMessagesOutgoingRequestMod.RequestOptions
import typings.sipJs.libCoreUserAgentsUserAgentClientMod.UserAgentClient
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libCoreUserAgentsNotifyUserAgentClientMod {
  
  @JSImport("sip.js/lib/core/user-agents/notify-user-agent-client", "NotifyUserAgentClient")
  @js.native
  open class NotifyUserAgentClient protected () extends UserAgentClient {
    def this(dialog: SessionDialog) = this()
    def this(dialog: SessionDialog, delegate: OutgoingRequestDelegate) = this()
    def this(dialog: SessionDialog, delegate: Unit, options: RequestOptions) = this()
    def this(dialog: SessionDialog, delegate: OutgoingRequestDelegate, options: RequestOptions) = this()
  }
}
