package typings.realm.Realm

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object Sync {
  type ConnectionNotificationCallback = js.Function2[
    /* newState */ typings.realm.Realm.Sync.ConnectionState, 
    /* oldState */ typings.realm.Realm.Sync.ConnectionState, 
    scala.Unit
  ]
  type ErrorCallback = js.Function2[
    /* session */ typings.realm.Realm.Sync.Session, 
    /* error */ typings.realm.Realm.Sync.SyncError, 
    scala.Unit
  ]
  type ProgressNotificationCallback = js.Function2[/* transferred */ scala.Double, /* transferable */ scala.Double, scala.Unit]
  type RealmWatchPredicate = js.Function1[/* realmPath */ java.lang.String, scala.Boolean]
  type SSLVerifyCallback = js.Function1[/* sslVerifyObject */ typings.realm.Realm.Sync.SSLVerifyObject, scala.Boolean]
  type SubscriptionNotificationCallback = js.Function2[
    /* subscription */ typings.realm.Realm.Sync.Subscription, 
    /* state */ typings.realm.Realm.Sync.SubscriptionState, 
    scala.Unit
  ]
}
