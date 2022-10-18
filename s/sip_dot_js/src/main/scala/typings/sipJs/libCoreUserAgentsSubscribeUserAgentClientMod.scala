package typings.sipJs

import typings.sipJs.libCoreMessagesMethodsSubscribeMod.OutgoingSubscribeRequestDelegate
import typings.sipJs.libCoreMessagesMod.OutgoingRequestMessage
import typings.sipJs.libCoreUserAgentCoreMod.UserAgentCore
import typings.sipJs.libCoreUserAgentsNotifyUserAgentServerMod.NotifyUserAgentServer
import typings.sipJs.libCoreUserAgentsUserAgentClientMod.UserAgentClient
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libCoreUserAgentsSubscribeUserAgentClientMod {
  
  /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
  - typings.sipJs.libCoreMessagesOutgoingRequestMod.OutgoingRequest because Already inherited
  - typings.sipJs.libCoreMessagesMethodsSubscribeMod.OutgoingSubscribeRequest because var conflicts: delegate, message. Inlined waitNotifyStop */ @JSImport("sip.js/lib/core/user-agents/subscribe-user-agent-client", "SubscribeUserAgentClient")
  @js.native
  open class SubscribeUserAgentClient protected () extends UserAgentClient {
    def this(core: UserAgentCore, message: OutgoingRequestMessage) = this()
    def this(core: UserAgentCore, message: OutgoingRequestMessage, delegate: OutgoingSubscribeRequestDelegate) = this()
    
    /** Timer N Id. */
    /* private */ var N: Any = js.native
    
    @JSName("delegate")
    var delegate_SubscribeUserAgentClient: js.UndefOr[OutgoingSubscribeRequestDelegate] = js.native
    
    /** Dialog created upon receiving the first NOTIFY. */
    /* private */ var dialog: Any = js.native
    
    /**
      * Handle out of dialog NOTIFY associated with SUBSCRIBE request.
      * This is the first NOTIFY received after the SUBSCRIBE request.
      * @param uas - User agent server handling the subscription creating NOTIFY.
      */
    def onNotify(uas: NotifyUserAgentServer): Unit = js.native
    
    /** Identifier of this user agent client. */
    /* private */ var subscriberId: Any = js.native
    
    /** Subscription event being targeted. */
    /* private */ var subscriptionEvent: Any = js.native
    
    /** When the subscription expires. Starts as requested expires and updated on 200 and NOTIFY. */
    /* private */ var subscriptionExpires: Any = js.native
    
    /** The requested expires for the subscription. */
    /* private */ var subscriptionExpiresRequested: Any = js.native
    
    /** Subscription state. */
    /* private */ var subscriptionState: Any = js.native
    
    /**
      * To ensure that subscribers do not wait indefinitely for a
      * subscription to be established, a subscriber starts a Timer N, set to
      * 64*T1, when it sends a SUBSCRIBE request.  If this Timer N expires
      * prior to the receipt of a NOTIFY request, the subscriber considers
      * the subscription failed, and cleans up any state associated with the
      * subscription attempt.
      * https://tools.ietf.org/html/rfc6665#section-4.1.2.4
      */
    /* private */ var timerN: Any = js.native
    
    def waitNotifyStart(): Unit = js.native
    
    /** Stop waiting for an inital subscription creating NOTIFY. */
    def waitNotifyStop(): Unit = js.native
  }
}
