package typings.realm.Realm.Sync

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Subscription
  * @see { @link https://realm.io/docs/javascript/latest/api/Realm.Sync.Subscription.html }
  */
@JSGlobal("Realm.Sync.Subscription")
@js.native
class Subscription () extends js.Object {
  val error: String = js.native
  val state: SubscriptionState = js.native
  def addListener(subscriptionCallback: SubscriptionNotificationCallback): Unit = js.native
  def removeAllListeners(): Unit = js.native
  def removeListener(subscriptionCallback: SubscriptionNotificationCallback): Unit = js.native
  def unsubscribe(): Unit = js.native
}

