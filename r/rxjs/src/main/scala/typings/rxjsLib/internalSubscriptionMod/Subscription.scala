package typings
package rxjsLib.internalSubscriptionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rxjs/internal/Subscription", "Subscription")
@js.native
class Subscription ()
  extends rxjsLib.internalTypesMod.SubscriptionLike {
  /**
       * @param {function(): void} [unsubscribe] A function describing how to
       * perform the disposal of resources when the `unsubscribe` method is called.
       */
  def this(unsubscribe: js.Function0[scala.Unit]) = this()
  /** @internal */
  var _addParent: js.Any = js.native
  /** @internal */
  var _parent: Subscription = js.native
  /** @internal */
  var _parents: js.Array[Subscription] = js.native
  /** @internal */
  var _subscriptions: js.Any = js.native
  /* CompleteClass */
  override val closed: scala.Boolean = js.native
  /**
       * Adds a tear down to be called during the unsubscribe() of this
       * Subscription.
       *
       * If the tear down being added is a subscription that is already
       * unsubscribed, is the same reference `add` is being called on, or is
       * `Subscription.EMPTY`, it will not be added.
       *
       * If this subscription is already in an `closed` state, the passed
       * tear down logic will be executed immediately.
       *
       * @param {TeardownLogic} teardown The additional logic to execute on
       * teardown.
       * @return {Subscription} Returns the Subscription used or created to be
       * added to the inner subscriptions list. This Subscription can be used with
       * `remove()` to remove the passed teardown logic from the inner subscriptions
       * list.
       */
  def add(teardown: rxjsLib.internalTypesMod.TeardownLogic): Subscription = js.native
  /**
       * Removes a Subscription from the internal list of subscriptions that will
       * unsubscribe during the unsubscribe process of this Subscription.
       * @param {Subscription} subscription The subscription to remove.
       * @return {void}
       */
  def remove(subscription: Subscription): scala.Unit = js.native
  /* CompleteClass */
  override def unsubscribe(): scala.Unit = js.native
}

@JSImport("rxjs/internal/Subscription", "Subscription")
@js.native
object Subscription extends js.Object {
  /** @nocollapse */
  var EMPTY: rxjsLib.internalSubscriptionMod.Subscription = js.native
}

