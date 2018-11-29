package typings
package realmLib.RealmNs.SyncNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
    * Session
    * @see { @link https://realm.io/docs/javascript/latest/api/Realm.Sync.Session.html }
    */
@JSGlobal("Realm.Sync.Session")
@js.native
class Session () extends js.Object {
  val config: SyncConfiguration = js.native
  val connectionState: ConnectionState = js.native
  val state: realmLib.realmLibStrings.invalid | realmLib.realmLibStrings.active | realmLib.realmLibStrings.inactive = js.native
  val url: java.lang.String = js.native
  val user: User = js.native
  def addConnectionNotification(callback: ConnectionNotificationCallback): scala.Unit = js.native
  def addProgressNotification(direction: ProgressDirection, mode: ProgressMode, progressCallback: ProgressNotificationCallback): scala.Unit = js.native
  def downloadAllServerChanges(): stdLib.Promise[scala.Unit] = js.native
  def downloadAllServerChanges(timeoutMs: scala.Double): stdLib.Promise[scala.Unit] = js.native
  def isConnected(): scala.Boolean = js.native
  def pause(): scala.Unit = js.native
  def removeConnectionNotification(callback: ConnectionNotificationCallback): scala.Unit = js.native
  def removeProgressNotification(progressCallback: ProgressNotificationCallback): scala.Unit = js.native
  def resume(): scala.Unit = js.native
  def uploadAllLocalChanges(): stdLib.Promise[scala.Unit] = js.native
  def uploadAllLocalChanges(timeoutMs: scala.Double): stdLib.Promise[scala.Unit] = js.native
}

