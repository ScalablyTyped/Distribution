package typings.sipJs

import typings.sipJs.libCoreDialogsDialogMod.Dialog
import typings.sipJs.libCoreDialogsDialogStateMod.DialogState
import typings.sipJs.libCoreMessagesIncomingRequestMessageMod.IncomingRequestMessage
import typings.sipJs.libCoreMessagesMethodsSubscribeMod.OutgoingSubscribeRequest
import typings.sipJs.libCoreMessagesMethodsSubscribeMod.OutgoingSubscribeRequestDelegate
import typings.sipJs.libCoreMessagesOutgoingRequestMessageMod.OutgoingRequestMessage
import typings.sipJs.libCoreMessagesOutgoingRequestMod.RequestOptions
import typings.sipJs.libCoreSubscriptionSubscriptionDelegateMod.SubscriptionDelegate
import typings.sipJs.libCoreSubscriptionSubscriptionMod.SubscriptionState
import typings.sipJs.libCoreUserAgentCoreUserAgentCoreMod.UserAgentCore
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libCoreDialogsSubscriptionDialogMod {
  
  /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
  - typings.sipJs.libCoreSubscriptionSubscriptionMod.Subscription because var conflicts: id. Inlined delegate, subscriptionExpires, subscriptionState, autoRefresh, subscribe, subscribe, subscribe, subscribe, refresh, unsubscribe */ @JSImport("sip.js/lib/core/dialogs/subscription-dialog", "SubscriptionDialog")
  @js.native
  open class SubscriptionDialog protected () extends Dialog {
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
    
    /* private */ var N: Any = js.native
    
    /* private */ var _autoRefresh: Any = js.native
    
    /* private */ var _subscriptionEvent: Any = js.native
    
    /* private */ var _subscriptionExpires: Any = js.native
    
    /* private */ var _subscriptionExpiresInitial: Any = js.native
    
    /* private */ var _subscriptionExpiresLastSet: Any = js.native
    
    /* private */ var _subscriptionRefresh: Any = js.native
    
    /* private */ var _subscriptionRefreshLastSet: Any = js.native
    
    /* private */ var _subscriptionState: Any = js.native
    
    def autoRefresh: Boolean = js.native
    def autoRefresh_=(autoRefresh: Boolean): Unit = js.native
    /** If true, refresh subscription prior to expiration. Default is false. */
    @JSName("autoRefresh")
    var autoRefresh_FSubscriptionDialog: Boolean = js.native
    
    var delegate: js.UndefOr[SubscriptionDelegate] = js.native
    
    /* private */ var logger: Any = js.native
    
    /**
      * Handle in dialog NOTIFY requests.
      * This does not include the first NOTIFY which created the dialog.
      * @param message - The incoming NOTIFY request message.
      */
    /* private */ var onNotify: Any = js.native
    
    /* private */ var onRefresh: Any = js.native
    
    /* private */ var onTerminated: Any = js.native
    
    /**
      * 4.1.2.2.  Refreshing of Subscriptions
      * https://tools.ietf.org/html/rfc6665#section-4.1.2.2
      */
    def refresh(): OutgoingSubscribeRequest = js.native
    
    /* private */ var refreshTimer: Any = js.native
    
    /* private */ var refreshTimerClear: Any = js.native
    
    /* private */ var refreshTimerSet: Any = js.native
    
    /* private */ var stateTransition: Any = js.native
    
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
    def subscribe(delegate: Unit, options: RequestOptions): OutgoingSubscribeRequest = js.native
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
    /* private */ var timerN: Any = js.native
    
    /**
      * 4.1.2.3.  Unsubscribing
      * https://tools.ietf.org/html/rfc6665#section-4.1.2.3
      */
    def unsubscribe(): OutgoingSubscribeRequest = js.native
  }
  /* static members */
  object SubscriptionDialog {
    
    @JSImport("sip.js/lib/core/dialogs/subscription-dialog", "SubscriptionDialog")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * When a UAC receives a response that establishes a dialog, it
      * constructs the state of the dialog.  This state MUST be maintained
      * for the duration of the dialog.
      * https://tools.ietf.org/html/rfc3261#section-12.1.2
      * @param outgoingRequestMessage - Outgoing request message for dialog.
      * @param incomingResponseMessage - Incoming response message creating dialog.
      */
    inline def initialDialogStateForSubscription(
      outgoingSubscribeRequestMessage: OutgoingRequestMessage,
      incomingNotifyRequestMessage: IncomingRequestMessage
    ): DialogState = (^.asInstanceOf[js.Dynamic].applyDynamic("initialDialogStateForSubscription")(outgoingSubscribeRequestMessage.asInstanceOf[js.Any], incomingNotifyRequestMessage.asInstanceOf[js.Any])).asInstanceOf[DialogState]
  }
}
