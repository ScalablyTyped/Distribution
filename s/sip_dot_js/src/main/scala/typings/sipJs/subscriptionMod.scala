package typings.sipJs

import typings.sipJs.emitterMod.Emitter
import typings.sipJs.subscriptionDelegateMod.SubscriptionDelegate
import typings.sipJs.subscriptionOptionsMod.SubscriptionOptions
import typings.sipJs.subscriptionStateMod.SubscriptionState
import typings.sipJs.subscriptionSubscribeOptionsMod.SubscriptionSubscribeOptions
import typings.sipJs.subscriptionUnsubscribeOptionsMod.SubscriptionUnsubscribeOptions
import typings.sipJs.userAgentMod.UserAgent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object subscriptionMod {
  
  @JSImport("sip.js/lib/api/subscription", "Subscription")
  @js.native
  abstract class Subscription protected () extends StObject {
    /**
      * Constructor.
      * @param userAgent - User agent. See {@link UserAgent} for details.
      * @internal
      */
    protected def this(userAgent: UserAgent) = this()
    protected def this(userAgent: UserAgent, options: SubscriptionOptions) = this()
    
    /**
      * If the subscription state is SubscriptionState.Subscribed, the associated subscription dialog. Otherwise undefined.
      * @internal
      */
    var _dialog: js.UndefOr[typings.sipJs.subscriptionSubscriptionMod.Subscription] = js.native
    
    var _disposed: js.Any = js.native
    
    var _logger: js.Any = js.native
    
    var _state: js.Any = js.native
    
    var _stateEventEmitter: js.Any = js.native
    
    /**
      * Our user agent.
      * @internal
      */
    var _userAgent: UserAgent = js.native
    
    /**
      * Property reserved for use by instance owner.
      * @defaultValue `undefined`
      */
    var data: js.Any = js.native
    
    /**
      * Subscription delegate. See {@link SubscriptionDelegate} for details.
      * @defaultValue `undefined`
      */
    var delegate: js.UndefOr[SubscriptionDelegate] = js.native
    
    /**
      * The subscribed subscription dialog.
      */
    def dialog: js.UndefOr[typings.sipJs.subscriptionSubscriptionMod.Subscription] = js.native
    
    /**
      * Destructor.
      */
    def dispose(): js.Promise[Unit] = js.native
    
    /**
      * True if disposed.
      * @internal
      */
    def disposed: Boolean = js.native
    
    /**
      * Subscription state. See {@link SubscriptionState} for details.
      */
    def state: SubscriptionState = js.native
    
    /**
      * Emits when the subscription `state` property changes.
      */
    def stateChange: Emitter[SubscriptionState] = js.native
    
    /** @internal */
    /* protected */ def stateTransition(newState: SubscriptionState): Unit = js.native
    
    /**
      * Sends a re-SUBSCRIBE request if the subscription is "active".
      */
    def subscribe(): js.Promise[Unit] = js.native
    def subscribe(options: SubscriptionSubscribeOptions): js.Promise[Unit] = js.native
    
    /**
      * Unsubscribe from event notifications.
      *
      * @remarks
      * If the subscription state is SubscriptionState.Subscribed, sends an in dialog SUBSCRIBE request
      * with expires time of zero (an un-subscribe) and terminates the subscription.
      * Otherwise a noop.
      */
    def unsubscribe(): js.Promise[Unit] = js.native
    def unsubscribe(options: SubscriptionUnsubscribeOptions): js.Promise[Unit] = js.native
  }
}
