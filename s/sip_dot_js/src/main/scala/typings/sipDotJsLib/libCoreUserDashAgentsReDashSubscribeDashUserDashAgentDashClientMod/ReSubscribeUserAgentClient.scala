package typings
package sipDotJsLib.libCoreUserDashAgentsReDashSubscribeDashUserDashAgentDashClientMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- sipDotJsLib.libCoreMessagesMethodsSubscribeMod.OutgoingSubscribeRequest because var conflicts: delegate. Inlined waitNotifyStop */ @JSImport("sip.js/lib/core/user-agents/re-subscribe-user-agent-client", "ReSubscribeUserAgentClient")
@js.native
class ReSubscribeUserAgentClient protected ()
  extends sipDotJsLib.libCoreUserDashAgentsUserDashAgentDashClientMod.UserAgentClient {
  def this(dialog: sipDotJsLib.libCoreDialogsMod.SubscriptionDialog) = this()
  def this(dialog: sipDotJsLib.libCoreDialogsMod.SubscriptionDialog, delegate: sipDotJsLib.libCoreMessagesOutgoingDashRequestMod.OutgoingRequestDelegate) = this()
  def this(dialog: sipDotJsLib.libCoreDialogsMod.SubscriptionDialog, delegate: sipDotJsLib.libCoreMessagesOutgoingDashRequestMod.OutgoingRequestDelegate, options: sipDotJsLib.libCoreMessagesOutgoingDashRequestMod.RequestOptions) = this()
  var dialog: js.Any = js.native
  /** Stop waiting for an inital subscription creating NOTIFY. */
  def waitNotifyStop(): scala.Unit = js.native
}

