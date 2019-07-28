package typings.sipDotJs.libCoreUserDashAgentsMod

import typings.sipDotJs.libCoreDialogsMod.SubscriptionDialog
import typings.sipDotJs.libCoreMessagesOutgoingDashRequestMod.OutgoingRequestDelegate
import typings.sipDotJs.libCoreMessagesOutgoingDashRequestMod.RequestOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("sip.js/lib/core/user-agents", "ReSubscribeUserAgentClient")
@js.native
class ReSubscribeUserAgentClient protected ()
  extends typings.sipDotJs.libCoreUserDashAgentsReDashSubscribeDashUserDashAgentDashClientMod.ReSubscribeUserAgentClient {
  def this(dialog: SubscriptionDialog) = this()
  def this(dialog: SubscriptionDialog, delegate: OutgoingRequestDelegate) = this()
  def this(dialog: SubscriptionDialog, delegate: OutgoingRequestDelegate, options: RequestOptions) = this()
}

