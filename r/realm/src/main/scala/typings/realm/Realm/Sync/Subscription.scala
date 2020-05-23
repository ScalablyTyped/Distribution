package typings.realm.Realm.Sync

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Subscription
  * @see { @link https://realm.io/docs/javascript/latest/api/Realm.Sync.Subscription.html }
  */
trait Subscription extends js.Object {
  val error: String
  val state: SubscriptionState
  def addListener(subscriptionCallback: SubscriptionNotificationCallback): Unit
  def removeAllListeners(): Unit
  def removeListener(subscriptionCallback: SubscriptionNotificationCallback): Unit
  def unsubscribe(): Unit
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
}

