package typings.realm.RealmNs.SyncNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Realm.Sync")
@js.native
object ^ extends js.Object {
  var downloadBeforeOpenBehavior: OpenRealmBehaviorConfiguration = js.native
  var openLocalRealmBehavior: OpenRealmBehaviorConfiguration = js.native
  def _hasExistingSessions(): Boolean = js.native
  def addListener(
    config: RealmListenerConfiguration,
    eventName: RealmListenerEventName,
    changeCallback: js.Function1[/* changeEvent */ ChangeEvent, js.Promise[Unit] | Unit]
  ): Unit = js.native
  /**
    * @deprecated, to be removed in future versions
    */
  def addListener(
    serverURL: String,
    adminUser: User,
    regex: String,
    name: RealmListenerEventName,
    changeCallback: js.Function1[/* changeEvent */ ChangeEvent, js.Promise[Unit] | Unit]
  ): Unit = js.native
  def initiateClientReset(path: String): Unit = js.native
  def localListenerRealms(regex: String): js.Array[LocalRealm] = js.native
  def reconnect(): Unit = js.native
  def removeAllListeners(): js.Promise[Unit] = js.native
  def removeListener(regex: String, name: String, changeCallback: js.Function1[/* changeEvent */ ChangeEvent, Unit]): js.Promise[Unit] = js.native
  /**
    * @deprecated, to be removed in future versions
    */
  def setFeatureToken(token: String): Unit = js.native
  def setLogLevel(logLevel: LogLevel): Unit = js.native
  def setLogger(callback: js.Function2[/* level */ NumericLogLevel, /* message */ String, Unit]): Unit = js.native
  def setUserAgent(userAgent: String): Unit = js.native
}

