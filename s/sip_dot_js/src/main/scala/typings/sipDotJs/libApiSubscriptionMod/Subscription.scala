package typings.sipDotJs.libApiSubscriptionMod

import typings.events.eventsMod.EventEmitter
import typings.sipDotJs.libApiEmitterMod.Emitter
import typings.sipDotJs.libApiSubscriptionDashDelegateMod.SubscriptionDelegate
import typings.sipDotJs.libApiSubscriptionDashOptionsMod.SubscriptionOptions
import typings.sipDotJs.libApiSubscriptionDashStateMod.SubscriptionState
import typings.sipDotJs.libApiSubscriptionDashSubscribeDashOptionsMod.SubscriptionSubscribeOptions
import typings.sipDotJs.libApiSubscriptionDashUnsubscribeDashOptionsMod.SubscriptionUnsubscribeOptions
import typings.sipDotJs.libApiUserDashAgentMod.UserAgent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("sip.js/lib/api/subscription", "Subscription")
@js.native
abstract class Subscription protected () extends EventEmitter {
  /**
    * Constructor.
    * @param userAgent - User agent. See {@link UserAgent} for details.
    * @internal
    */
  protected def this(userAgent: UserAgent) = this()
  protected def this(userAgent: UserAgent, options: SubscriptionOptions) = this()
  var _disposed: js.Any = js.native
  var _logger: js.Any = js.native
  var _state: js.Any = js.native
  var _stateEventEmitter: js.Any = js.native
  /**
    * Property reserved for use by instance owner.
    * @defaultValue `undefined`
    */
  var data: js.UndefOr[js.Any] = js.native
  /**
    * Subscription delegate. See {@link SubscriptionDelegate} for details.
    * @defaultValue `undefined`
    */
  var delegate: js.UndefOr[SubscriptionDelegate] = js.native
  /**
    * If the subscription state is SubscriptionState.Subscribed, the associated subscription dialog. Otherwise undefined.
    * @internal
    */
  var dialog: js.UndefOr[typings.sipDotJs.libCoreSubscriptionSubscriptionMod.Subscription] = js.native
  /**
    * True if disposed.
    * @internal
    */
  val disposed: Boolean = js.native
  /**
    * Subscription state. See {@link SubscriptionState} for details.
    */
  val state: SubscriptionState = js.native
  /**
    * Emits when the subscription `state` property changes.
    */
  val stateChange: Emitter[SubscriptionState] = js.native
  /** @internal */
  var userAgent: UserAgent = js.native
  /**
    * Destructor.
    * @internal
    */
  def dispose(): Unit = js.native
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

