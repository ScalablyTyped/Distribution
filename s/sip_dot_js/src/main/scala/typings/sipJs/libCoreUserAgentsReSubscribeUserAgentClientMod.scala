package typings.sipJs

import typings.sipJs.libCoreDialogsSubscriptionDialogMod.SubscriptionDialog
import typings.sipJs.libCoreMessagesOutgoingRequestMod.OutgoingRequestDelegate
import typings.sipJs.libCoreMessagesOutgoingRequestMod.RequestOptions
import typings.sipJs.libCoreUserAgentsUserAgentClientMod.UserAgentClient
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libCoreUserAgentsReSubscribeUserAgentClientMod {
  
  /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
  - typings.sipJs.libCoreMessagesOutgoingRequestMod.OutgoingRequest because Already inherited
  - typings.sipJs.libCoreMessagesMethodsSubscribeMod.OutgoingSubscribeRequest because var conflicts: delegate, message. Inlined waitNotifyStop */ @JSImport("sip.js/lib/core/user-agents/re-subscribe-user-agent-client", "ReSubscribeUserAgentClient")
  @js.native
  open class ReSubscribeUserAgentClient protected () extends UserAgentClient {
    def this(dialog: SubscriptionDialog) = this()
    def this(dialog: SubscriptionDialog, delegate: OutgoingRequestDelegate) = this()
    def this(dialog: SubscriptionDialog, delegate: Unit, options: RequestOptions) = this()
    def this(dialog: SubscriptionDialog, delegate: OutgoingRequestDelegate, options: RequestOptions) = this()
    
    /* private */ var dialog: Any = js.native
    
    /** Stop waiting for an inital subscription creating NOTIFY. */
    def waitNotifyStop(): Unit = js.native
  }
}
