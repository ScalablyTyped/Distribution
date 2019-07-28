package typings.sipDotJs.libCoreUserDashAgentsReDashSubscribeDashUserDashAgentDashClientMod

import typings.sipDotJs.libCoreDialogsMod.SubscriptionDialog
import typings.sipDotJs.libCoreMessagesOutgoingDashRequestMod.OutgoingRequestDelegate
import typings.sipDotJs.libCoreMessagesOutgoingDashRequestMod.RequestOptions
import typings.sipDotJs.libCoreUserDashAgentsUserDashAgentDashClientMod.UserAgentClient
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- typings.sipDotJs.libCoreMessagesMethodsSubscribeMod.OutgoingSubscribeRequest because var conflicts: delegate, message. Inlined waitNotifyStop */ @JSImport("sip.js/lib/core/user-agents/re-subscribe-user-agent-client", "ReSubscribeUserAgentClient")
@js.native
class ReSubscribeUserAgentClient protected () extends UserAgentClient {
  def this(dialog: SubscriptionDialog) = this()
  def this(dialog: SubscriptionDialog, delegate: OutgoingRequestDelegate) = this()
  def this(dialog: SubscriptionDialog, delegate: OutgoingRequestDelegate, options: RequestOptions) = this()
  var dialog: js.Any = js.native
  /** Stop waiting for an inital subscription creating NOTIFY. */
  def waitNotifyStop(): Unit = js.native
}

