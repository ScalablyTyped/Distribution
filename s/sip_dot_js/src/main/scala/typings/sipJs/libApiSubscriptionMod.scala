package typings.sipJs

import typings.sipJs.libApiEmitterMod.Emitter
import typings.sipJs.libApiSubscriptionDelegateMod.SubscriptionDelegate
import typings.sipJs.libApiSubscriptionOptionsMod.SubscriptionOptions
import typings.sipJs.libApiSubscriptionStateMod.SubscriptionState
import typings.sipJs.libApiSubscriptionSubscribeOptionsMod.SubscriptionSubscribeOptions
import typings.sipJs.libApiSubscriptionUnsubscribeOptionsMod.SubscriptionUnsubscribeOptions
import typings.sipJs.libApiUserAgentMod.UserAgent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libApiSubscriptionMod {
  
  /* note: abstract class */ @JSImport("sip.js/lib/api/subscription", "Subscription")
  @js.native
  open class Subscription protected () extends StObject {
    /**
      * Constructor.
      * @param userAgent - User agent. See {@link UserAgent} for details.
      * @internal
      */
    /* protected */ def this(userAgent: UserAgent) = this()
    /* protected */ def this(userAgent: UserAgent, options: SubscriptionOptions) = this()
    
    /**
      * If the subscription state is SubscriptionState.Subscribed, the associated subscription dialog. Otherwise undefined.
      * @internal
      */
    /* protected */ var _dialog: js.UndefOr[typings.sipJs.libCoreSubscriptionSubscriptionMod.Subscription] = js.native
    
    /* private */ var _disposed: Any = js.native
    
    /* private */ var _logger: Any = js.native
    
    /* private */ var _state: Any = js.native
    
    /* private */ var _stateEventEmitter: Any = js.native
    
    /**
      * Our user agent.
      * @internal
      */
    /* protected */ var _userAgent: UserAgent = js.native
    
    /**
      * Property reserved for use by instance owner.
      * @defaultValue `undefined`
      */
    var data: Any = js.native
    
    /**
      * Subscription delegate. See {@link SubscriptionDelegate} for details.
      * @defaultValue `undefined`
      */
    var delegate: js.UndefOr[SubscriptionDelegate] = js.native
    
    /**
      * The subscribed subscription dialog.
      */
    def dialog: js.UndefOr[typings.sipJs.libCoreSubscriptionSubscriptionMod.Subscription] = js.native
    
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
