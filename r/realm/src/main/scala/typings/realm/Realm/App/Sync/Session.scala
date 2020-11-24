package typings.realm.Realm.App.Sync

import typings.realm.Realm.ConnectionNotificationCallback
import typings.realm.Realm.ConnectionState
import typings.realm.Realm.DefaultFunctionsFactory
import typings.realm.Realm.ProgressDirection
import typings.realm.Realm.ProgressMode
import typings.realm.Realm.ProgressNotificationCallback
import typings.realm.Realm.SyncConfiguration
import typings.realm.Realm.User
import typings.realm.realmStrings.active
import typings.realm.realmStrings.inactive
import typings.realm.realmStrings.invalid
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Session extends js.Object {
  
  def addConnectionNotification(callback: ConnectionNotificationCallback): Unit = js.native
  
  def addProgressNotification(direction: ProgressDirection, mode: ProgressMode, progressCallback: ProgressNotificationCallback): Unit = js.native
  
  val config: SyncConfiguration = js.native
  
  val connectionState: ConnectionState = js.native
  
  def downloadAllServerChanges(): js.Promise[Unit] = js.native
  def downloadAllServerChanges(timeoutMs: Double): js.Promise[Unit] = js.native
  
  def isConnected(): Boolean = js.native
  
  def pause(): Unit = js.native
  
  def removeConnectionNotification(callback: ConnectionNotificationCallback): Unit = js.native
  
  def removeProgressNotification(progressCallback: ProgressNotificationCallback): Unit = js.native
  
  def resume(): Unit = js.native
  
  val state: invalid | active | inactive = js.native
  
  def uploadAllLocalChanges(): js.Promise[Unit] = js.native
  def uploadAllLocalChanges(timeoutMs: Double): js.Promise[Unit] = js.native
  
  val url: String = js.native
  
  val user: User[DefaultFunctionsFactory, _] = js.native
}
