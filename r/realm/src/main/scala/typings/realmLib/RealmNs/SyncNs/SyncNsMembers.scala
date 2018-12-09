package typings
package realmLib.RealmNs.SyncNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Realm.Sync")
@js.native
object SyncNsMembers extends js.Object {
  def addListener(
    serverURL: java.lang.String,
    adminUser: User,
    regex: java.lang.String,
    name: java.lang.String,
    changeCallback: js.Function1[/* changeEvent */ ChangeEvent, scala.Unit | js.Promise[scala.Unit]]
  ): scala.Unit = js.native
  def initiateClientReset(path: java.lang.String): scala.Unit = js.native
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
  @JSName("setLogLevel")
  def setLogLevel_all(logLevel: realmLib.realmLibStrings.all): scala.Unit = js.native
  @JSName("setLogLevel")
  def setLogLevel_debug(logLevel: realmLib.realmLibStrings.debug): scala.Unit = js.native
  @JSName("setLogLevel")
  def setLogLevel_detail(logLevel: realmLib.realmLibStrings.detail): scala.Unit = js.native
  @JSName("setLogLevel")
  def setLogLevel_error(logLevel: realmLib.realmLibStrings.error): scala.Unit = js.native
  @JSName("setLogLevel")
  def setLogLevel_fatal(logLevel: realmLib.realmLibStrings.fatal): scala.Unit = js.native
  @JSName("setLogLevel")
  def setLogLevel_info(logLevel: realmLib.realmLibStrings.info): scala.Unit = js.native
  @JSName("setLogLevel")
  def setLogLevel_off(logLevel: realmLib.realmLibStrings.off): scala.Unit = js.native
  @JSName("setLogLevel")
  def setLogLevel_trace(logLevel: realmLib.realmLibStrings.trace): scala.Unit = js.native
  @JSName("setLogLevel")
  def setLogLevel_warn(logLevel: realmLib.realmLibStrings.warn): scala.Unit = js.native
  def setUserAgent(userAgent: java.lang.String): scala.Unit = js.native
}

