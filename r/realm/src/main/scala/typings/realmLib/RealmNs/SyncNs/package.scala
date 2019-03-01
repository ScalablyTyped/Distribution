package typings
package realmLib.RealmNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object SyncNs {
  type ConnectionNotificationCallback = js.Function2[/* newState */ ConnectionState, /* oldState */ ConnectionState, scala.Unit]
  type ErrorCallback = js.Function2[/* session */ Session, /* error */ SyncError, scala.Unit]
  type ProgressNotificationCallback = js.Function2[/* transferred */ scala.Double, /* transferable */ scala.Double, scala.Unit]
  type SSLVerifyCallback = js.Function1[/* sslVerifyObject */ SSLVerifyObject, scala.Boolean]
  type SubscriptionNotificationCallback = js.Function2[/* subscription */ Subscription, /* state */ scala.Double, scala.Unit]
}
