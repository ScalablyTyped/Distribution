package typings.realm.Realm.Sync

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Subscription
  * @see { @link https://realm.io/docs/javascript/latest/api/Realm.Sync.Subscription.html }
  */
@js.native
trait Subscription extends js.Object {
  val error: String = js.native
  val state: SubscriptionState = js.native
  def addListener(subscriptionCallback: SubscriptionNotificationCallback): Unit = js.native
  def removeAllListeners(): Unit = js.native
  def removeListener(subscriptionCallback: SubscriptionNotificationCallback): Unit = js.native
  def unsubscribe(): Unit = js.native
}

object Subscription {
  @scala.inline
  def apply(
    addListener: SubscriptionNotificationCallback => Unit,
    error: String,
    removeAllListeners: () => Unit,
    removeListener: SubscriptionNotificationCallback => Unit,
    state: SubscriptionState,
    unsubscribe: () => Unit
  ): Subscription = {
    val __obj = js.Dynamic.literal(addListener = js.Any.fromFunction1(addListener), error = error.asInstanceOf[js.Any], removeAllListeners = js.Any.fromFunction0(removeAllListeners), removeListener = js.Any.fromFunction1(removeListener), state = state.asInstanceOf[js.Any], unsubscribe = js.Any.fromFunction0(unsubscribe))
    __obj.asInstanceOf[Subscription]
  }
  @scala.inline
  implicit class SubscriptionOps[Self <: Subscription] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAddListener(value: SubscriptionNotificationCallback => Unit): Self = this.set("addListener", js.Any.fromFunction1(value))
    @scala.inline
    def setError(value: String): Self = this.set("error", value.asInstanceOf[js.Any])
    @scala.inline
    def setRemoveAllListeners(value: () => Unit): Self = this.set("removeAllListeners", js.Any.fromFunction0(value))
    @scala.inline
    def setRemoveListener(value: SubscriptionNotificationCallback => Unit): Self = this.set("removeListener", js.Any.fromFunction1(value))
    @scala.inline
    def setState(value: SubscriptionState): Self = this.set("state", value.asInstanceOf[js.Any])
    @scala.inline
    def setUnsubscribe(value: () => Unit): Self = this.set("unsubscribe", js.Any.fromFunction0(value))
  }
  
}

