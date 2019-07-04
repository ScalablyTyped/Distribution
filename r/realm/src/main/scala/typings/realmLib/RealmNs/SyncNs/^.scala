package typings
package realmLib.RealmNs.SyncNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Realm.Sync")
@js.native
object ^ extends js.Object {
  var downloadBeforeOpenBehavior: OpenRealmBehaviorConfiguration = js.native
  var openLocalRealmBehavior: OpenRealmBehaviorConfiguration = js.native
  def _hasExistingSessions(): scala.Boolean = js.native
  def addListener(
    config: RealmListenerConfiguration,
    eventName: RealmListenerEventName,
    changeCallback: js.Function1[/* changeEvent */ ChangeEvent, js.Promise[scala.Unit] | scala.Unit]
  ): scala.Unit = js.native
  /**
    * @deprecated, to be removed in future versions
    */
  def addListener(
    serverURL: java.lang.String,
    adminUser: User,
    regex: java.lang.String,
    name: RealmListenerEventName,
    changeCallback: js.Function1[/* changeEvent */ ChangeEvent, js.Promise[scala.Unit] | scala.Unit]
  ): scala.Unit = js.native
  def initiateClientReset(path: java.lang.String): scala.Unit = js.native
  def localListenerRealms(regex: java.lang.String): js.Array[LocalRealm] = js.native
  def reconnect(): scala.Unit = js.native
  def removeAllListeners(): js.Promise[scala.Unit] = js.native
  def removeListener(
    regex: java.lang.String,
    name: java.lang.String,
    changeCallback: js.Function1[/* changeEvent */ ChangeEvent, scala.Unit]
  ): js.Promise[scala.Unit] = js.native
  /**
    * @deprecated, to be removed in future versions
    */
  def setFeatureToken(token: java.lang.String): scala.Unit = js.native
  def setLogLevel(logLevel: LogLevel): scala.Unit = js.native
  def setLogger(callback: js.Function2[/* level */ NumericLogLevel, /* message */ java.lang.String, scala.Unit]): scala.Unit = js.native
  def setUserAgent(userAgent: java.lang.String): scala.Unit = js.native
}

