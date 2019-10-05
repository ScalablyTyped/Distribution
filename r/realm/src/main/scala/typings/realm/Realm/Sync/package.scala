package typings.realm.Realm

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object Sync {
  type ConnectionNotificationCallback = js.Function2[/* newState */ ConnectionState, /* oldState */ ConnectionState, Unit]
  type ErrorCallback = js.Function2[/* session */ Session, /* error */ SyncError, Unit]
  type ProgressNotificationCallback = js.Function2[/* transferred */ Double, /* transferable */ Double, Unit]
  type RealmWatchPredicate = js.Function1[/* realmPath */ String, Boolean]
  type SSLVerifyCallback = js.Function1[/* sslVerifyObject */ SSLVerifyObject, Boolean]
  type SubscriptionNotificationCallback = js.Function2[/* subscription */ Subscription, /* state */ Double, Unit]
}
