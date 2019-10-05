package typings.rxjs

import typings.rxjs.internalSubscriptionMod.Subscription
import typings.rxjs.internalTypesMod.SubscriptionLike
import typings.rxjs.internalTypesMod.TeardownLogic
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rxjs/internal/Subscription", JSImport.Namespace)
@js.native
object internalSubscriptionMod extends js.Object {
  @js.native
  /**
    * @param {function(): void} [unsubscribe] A function describing how to
    * perform the disposal of resources when the `unsubscribe` method is called.
    */
  class Subscription () extends SubscriptionLike {
    def this(unsubscribe: js.Function0[Unit]) = this()
    /** @internal */
    var _parentOrParents: Subscription | js.Array[Subscription] = js.native
    /** @internal */
    var _subscriptions: js.Any = js.native
    /* CompleteClass */
    override val closed: Boolean = js.native
    /**
      * Adds a tear down to be called during the unsubscribe() of this
      * Subscription. Can also be used to add a child subscription.
      *
      * If the tear down being added is a subscription that is already
      * unsubscribed, is the same reference `add` is being called on, or is
      * `Subscription.EMPTY`, it will not be added.
      *
      * If this subscription is already in an `closed` state, the passed
      * tear down logic will be executed immediately.
      *
      * When a parent subscription is unsubscribed, any child subscriptions that were added to it are also unsubscribed.
      *
      * @param {TeardownLogic} teardown The additional logic to execute on
      * teardown.
      * @return {Subscription} Returns the Subscription used or created to be
      * added to the inner subscriptions list. This Subscription can be used with
      * `remove()` to remove the passed teardown logic from the inner subscriptions
      * list.
      */
    def add(teardown: TeardownLogic): Subscription = js.native
    /**
      * Removes a Subscription from the internal list of subscriptions that will
      * unsubscribe during the unsubscribe process of this Subscription.
      * @param {Subscription} subscription The subscription to remove.
      * @return {void}
      */
    def remove(subscription: Subscription): Unit = js.native
    /* CompleteClass */
    override def unsubscribe(): Unit = js.native
  }
  
  /* static members */
  @js.native
  object Subscription extends js.Object {
    /** @nocollapse */
    var EMPTY: Subscription = js.native
  }
  
}

