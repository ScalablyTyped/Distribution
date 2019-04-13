package typings
package realmLib.realmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("realm", JSImport.Namespace)
@js.native
/**
  * @param  {Realm.Configuration} config?
  */
class ^ ()
  extends realmLib.Realm {
  def this(config: realmLib.RealmNs.Configuration) = this()
  def this(path: java.lang.String) = this()
}

@JSImport("realm", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  var defaultPath: java.lang.String = js.native
  /**
    * @deprecated in favor of `Realm.Sync.User.createConfiguration()`.
    * Return a configuration for a default Realm.
    * @param {Realm.Sync.User} optional user.
    */
  def automaticSyncConfiguration(): java.lang.String = js.native
  def automaticSyncConfiguration(user: realmLib.RealmNs.SyncNs.User): java.lang.String = js.native
  /**
    * Clears the state by closing and deleting any Realm in the default directory and logout all users.
    * @private Not a part of the public API: It's primarily used from the library's tests.
    */
  def clearTestState(): scala.Unit = js.native
  /**
    * Copy all bundled Realm files to app's default file folder.
    */
  def copyBundledRealmFiles(): scala.Unit = js.native
  /**
    * @param {Realm.ObjectSchema} object schema describing the object that should be created.
    * @returns {T}
    */
  def createTemplateObject[T](objectSchema: realmLib.RealmNs.ObjectSchema): T with realmLib.RealmNs.Object = js.native
  /**
    * Delete the Realm file for the given configuration.
    * @param {Configuration} config
    */
  def deleteFile(config: realmLib.RealmNs.Configuration): scala.Unit = js.native
  /**
    * Open a realm asynchronously with a promise. If the realm is synced, it will be fully synchronized before it is available.
    * @param {Configuration} config
    */
  def open(config: realmLib.RealmNs.Configuration): realmLib.ProgressPromise = js.native
  /**
    * @deprecated in favor of `Realm.open`
    * Open a realm asynchronously with a callback. If the realm is synced, it will be fully synchronized before it is available.
    * @param {Configuration} config
    * @param {Function} callback will be called when the realm is ready.
    * @param {ProgressNotificationCallback} progressCallback? a progress notification callback for 'download' direction and 'forCurrentlyOutstandingWork' mode
    */
  def openAsync(
    config: realmLib.RealmNs.Configuration,
    callback: js.Function2[/* error */ js.Any, /* realm */ realmLib.Realm, scala.Unit]
  ): scala.Unit = js.native
  def openAsync(
    config: realmLib.RealmNs.Configuration,
    callback: js.Function2[/* error */ js.Any, /* realm */ realmLib.Realm, scala.Unit],
    progressCallback: realmLib.RealmNs.SyncNs.ProgressNotificationCallback
  ): scala.Unit = js.native
  /**
    * Get the current schema version of the Realm at the given path.
    * @param  {string} path
    * @param  {any} encryptionKey?
    * @returns number
    */
  def schemaVersion(path: java.lang.String): scala.Double = js.native
  def schemaVersion(path: java.lang.String, encryptionKey: stdLib.ArrayBuffer): scala.Double = js.native
  def schemaVersion(path: java.lang.String, encryptionKey: stdLib.ArrayBufferView): scala.Double = js.native
}

