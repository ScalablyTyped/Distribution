package typings.sipJs

import typings.sipJs.dialogMod.Dialog
import typings.sipJs.dialogStateMod.DialogState
import typings.sipJs.messagesMod.IncomingRequestMessage
import typings.sipJs.messagesMod.OutgoingRequestMessage
import typings.sipJs.outgoingRequestMod.RequestOptions
import typings.sipJs.subscribeMod.OutgoingSubscribeRequest
import typings.sipJs.subscribeMod.OutgoingSubscribeRequestDelegate
import typings.sipJs.subscriptionSubscriptionDelegateMod.SubscriptionDelegate
import typings.sipJs.subscriptionSubscriptionMod.SubscriptionState
import typings.sipJs.userAgentCoreUserAgentCoreMod.UserAgentCore
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("sip.js/lib/core/dialogs/subscription-dialog", JSImport.Namespace)
@js.native
object subscriptionDialogMod extends js.Object {
  
  /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
  - typings.sipJs.subscriptionSubscriptionMod.Subscription because var conflicts: id. Inlined delegate, subscriptionExpires, subscriptionState, autoRefresh, subscribe, subscribe, subscribe, subscribe, refresh, unsubscribe */ @js.native
  class SubscriptionDialog protected () extends Dialog {
    def this(
      subscriptionEvent: String,
      subscriptionExpires: Double,
      subscriptionState: SubscriptionState,
      core: UserAgentCore,
      state: DialogState
    ) = this()
    def this(
      subscriptionEvent: String,
      subscriptionExpires: Double,
      subscriptionState: SubscriptionState,
      core: UserAgentCore,
      state: DialogState,
      delegate: SubscriptionDelegate
    ) = this()
    
    var N: js.Any = js.native
    
    var _autoRefresh: js.Any = js.native
    
    var _subscriptionEvent: js.Any = js.native
    
    var _subscriptionExpires: js.Any = js.native
    
    var _subscriptionExpiresInitial: js.Any = js.native
    
    var _subscriptionExpiresLastSet: js.Any = js.native
    
    var _subscriptionRefresh: js.Any = js.native
    
    var _subscriptionRefreshLastSet: js.Any = js.native
    
    var _subscriptionState: js.Any = js.native
    
    def autoRefresh: Boolean = js.native
    def autoRefresh_=(autoRefresh: Boolean): Unit = js.native
    /** If true, refresh subscription prior to expiration. Default is false. */
    @JSName("autoRefresh")
    var autoRefresh_FSubscriptionDialog: Boolean = js.native
    
    var delegate: js.UndefOr[SubscriptionDelegate] = js.native
    
    var logger: js.Any = js.native
    
    /**
      * Handle in dialog NOTIFY requests.
      * This does not include the first NOTIFY which created the dialog.
      * @param message - The incoming NOTIFY request message.
      */
    var onNotify: js.Any = js.native
    
    var onRefresh: js.Any = js.native
    
    var onTerminated: js.Any = js.native
    
    /**
      * 4.1.2.2.  Refreshing of Subscriptions
      * https://tools.ietf.org/html/rfc6665#section-4.1.2.2
      */
    def refresh(): OutgoingSubscribeRequest = js.native
    
    var refreshTimer: js.Any = js.native
    
    var refreshTimerClear: js.Any = js.native
    
    var refreshTimerSet: js.Any = js.native
    
    var stateTransition: js.Any = js.native
    
    /**
      * 4.1.2.2.  Refreshing of Subscriptions
      * https://tools.ietf.org/html/rfc6665#section-4.1.2.2
      * @param delegate - Delegate to handle responses.
      * @param options - Options bucket.
      */
    /**
      * Send re-SUBSCRIBE request.
      * Refreshing a subscription and unsubscribing.
      * https://tools.ietf.org/html/rfc6665#section-4.1.2.2
      * @param delegate - Request delegate.
      * @param options - Options bucket
      */
    def subscribe(): OutgoingSubscribeRequest = js.native
    def subscribe(delegate: js.UndefOr[scala.Nothing], options: RequestOptions): OutgoingSubscribeRequest = js.native
    def subscribe(delegate: OutgoingSubscribeRequestDelegate): OutgoingSubscribeRequest = js.native
    def subscribe(delegate: OutgoingSubscribeRequestDelegate, options: RequestOptions): OutgoingSubscribeRequest = js.native
    
    def subscriptionEvent: String = js.native
    
    /** Number of seconds until subscription expires. */
    def subscriptionExpires: Double = js.native
    
    def subscriptionExpiresInitial: Double = js.native
    
    def subscriptionExpires_=(expires: Double): Unit = js.native
    /** Subscription expires. Number of seconds until the subscription expires. */
    @JSName("subscriptionExpires")
    val subscriptionExpires_FSubscriptionDialog: Double = js.native
    
    /** Number of seconds until subscription auto refresh. */
    def subscriptionRefresh: js.UndefOr[Double] = js.native
    
    def subscriptionState: SubscriptionState = js.native
    /** Subscription state. */
    @JSName("subscriptionState")
    val subscriptionState_FSubscriptionDialog: SubscriptionState = js.native
    
    /**
      * 4.4.1.  Dialog Creation and Termination
      * A subscription is destroyed after a notifier sends a NOTIFY request
      * with a "Subscription-State" of "terminated", or in certain error
      * situations described elsewhere in this document.
      * https://tools.ietf.org/html/rfc6665#section-4.4.1
      */
    def terminate(): Unit = js.native
    
    /**
      * When refreshing a subscription, a subscriber starts Timer N, set to
      * 64*T1, when it sends the SUBSCRIBE request.  If this Timer N expires
      * prior to the receipt of a NOTIFY request, the subscriber considers
      * the subscription terminated.  If the subscriber receives a success
      * response to the SUBSCRIBE request that indicates that no NOTIFY
      * request will be generated -- such as the 204 response defined for use
      * with the optional extension described in [RFC5839] -- then it MUST
      * cancel Timer N.
      * https://tools.ietf.org/html/rfc6665#section-4.1.2.2
      */
    var timerN: js.Any = js.native
    
    /**
      * 4.1.2.3.  Unsubscribing
      * https://tools.ietf.org/html/rfc6665#section-4.1.2.3
      */
    def unsubscribe(): OutgoingSubscribeRequest = js.native
  }
  /* static members */
  @js.native
  object SubscriptionDialog extends js.Object {
    
    /**
      * When a UAC receives a response that establishes a dialog, it
      * constructs the state of the dialog.  This state MUST be maintained
      * for the duration of the dialog.
      * https://tools.ietf.org/html/rfc3261#section-12.1.2
      * @param outgoingRequestMessage - Outgoing request message for dialog.
      * @param incomingResponseMessage - Incoming response message creating dialog.
      */
    def initialDialogStateForSubscription(
      outgoingSubscribeRequestMessage: OutgoingRequestMessage,
      incomingNotifyRequestMessage: IncomingRequestMessage
    ): DialogState = js.native
  }
}
