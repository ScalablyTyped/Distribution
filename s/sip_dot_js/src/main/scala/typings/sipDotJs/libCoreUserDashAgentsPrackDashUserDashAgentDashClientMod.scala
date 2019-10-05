package typings.sipDotJs

import typings.sipDotJs.libCoreDialogsMod.SessionDialog
import typings.sipDotJs.libCoreMessagesOutgoingDashRequestMod.OutgoingRequestDelegate
import typings.sipDotJs.libCoreMessagesOutgoingDashRequestMod.RequestOptions
import typings.sipDotJs.libCoreUserDashAgentsUserDashAgentDashClientMod.UserAgentClient
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("sip.js/lib/core/user-agents/prack-user-agent-client", JSImport.Namespace)
@js.native
object libCoreUserDashAgentsPrackDashUserDashAgentDashClientMod extends js.Object {
  /* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
  - typings.sipDotJs.libCoreMessagesMethodsPrackMod.OutgoingPrackRequest because Already inherited */ @js.native
  class PrackUserAgentClient protected () extends UserAgentClient {
    def this(dialog: SessionDialog) = this()
    def this(dialog: SessionDialog, delegate: OutgoingRequestDelegate) = this()
    def this(dialog: SessionDialog, delegate: OutgoingRequestDelegate, options: RequestOptions) = this()
  }
  
}

