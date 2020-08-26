package typings.sipJs

import typings.sipJs.dialogsMod.SubscriptionDialog
import typings.sipJs.outgoingRequestMod.OutgoingRequestDelegate
import typings.sipJs.outgoingRequestMod.RequestOptions
import typings.sipJs.userAgentClientMod.UserAgentClient
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("sip.js/lib/core/user-agents/re-subscribe-user-agent-client", JSImport.Namespace)
@js.native
object reSubscribeUserAgentClientMod extends js.Object {
  /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
  - typings.sipJs.outgoingRequestMod.OutgoingRequest because Already inherited
  - typings.sipJs.subscribeMod.OutgoingSubscribeRequest because var conflicts: delegate, message. Inlined waitNotifyStop */ @js.native
  class ReSubscribeUserAgentClient protected () extends UserAgentClient {
    def this(dialog: SubscriptionDialog) = this()
    def this(dialog: SubscriptionDialog, delegate: OutgoingRequestDelegate) = this()
    def this(dialog: SubscriptionDialog, delegate: js.UndefOr[scala.Nothing], options: RequestOptions) = this()
    def this(dialog: SubscriptionDialog, delegate: OutgoingRequestDelegate, options: RequestOptions) = this()
    var dialog: js.Any = js.native
    /** Stop waiting for an inital subscription creating NOTIFY. */
    def waitNotifyStop(): Unit = js.native
  }
  
}

