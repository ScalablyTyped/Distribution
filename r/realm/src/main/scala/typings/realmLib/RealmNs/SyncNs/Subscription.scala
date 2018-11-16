package typings
package realmLib.RealmNs.SyncNs

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
  val error: java.lang.String = js.native
  val state: SubscriptionState = js.native
  def addListener(subscruptionCallback: SubscriptionNotificationCallback): scala.Unit = js.native
  def removeAllListeners(): scala.Unit = js.native
  def removeListener(subscruptionCallback: SubscriptionNotificationCallback): scala.Unit = js.native
  def unsubscribe(): scala.Unit = js.native
}

