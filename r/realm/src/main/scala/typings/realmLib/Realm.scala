package typings
package realmLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Realm")
@js.native
/**
  * @param  {Realm.Configuration} config?
  */
class Realm () extends js.Object {
  def this(config: realmLib.RealmNs.Configuration) = this()
  def this(path: java.lang.String) = this()
  val empty: scala.Boolean = js.native
  val isClosed: scala.Boolean = js.native
  val isInTransaction: scala.Boolean = js.native
  val path: java.lang.String = js.native
  val readOnly: scala.Boolean = js.native
  val schema: js.Array[realmLib.RealmNs.ObjectSchema] = js.native
  val schemaVersion: scala.Double = js.native
  val syncSession: realmLib.RealmNs.SyncNs.Session | scala.Null = js.native
  /**
    * @param  {string} name
    * @param  {()=>void} callback
    * @returns void
    */
  @JSName("addListener")
  def addListener_change(
    name: java.lang.String,
    callback: js.Function2[/* sender */ this.type, realmLib.realmLibStrings.change, scala.Unit]
  ): scala.Unit = js.native
  @JSName("addListener")
  def addListener_schema(
    name: java.lang.String,
    callback: js.Function3[
      /* sender */ this.type, 
      realmLib.realmLibStrings.schema, 
      /* schema */ js.Array[realmLib.RealmNs.ObjectSchema], 
      scala.Unit
    ]
  ): scala.Unit = js.native
  /**
    * @returns void
    */
  def beginTransaction(): scala.Unit = js.native
  /**
    * @returns void
    */
  def cancelTransaction(): scala.Unit = js.native
  /**
    * @returns void
    */
  def close(): scala.Unit = js.native
  /**
    * @returns void
    */
  def commitTransaction(): scala.Unit = js.native
  /**
    * @returns boolean
    */
  def compact(): scala.Boolean = js.native
  /**
    * @param  {string|Realm.ObjectClass|Function} type
    * @param  {T&Realm.ObjectPropsType} properties
    * @param  {boolean} update?
    * @returns T
    */
  def create[T](`type`: java.lang.String, properties: T): T = js.native
  def create[T](`type`: java.lang.String, properties: T, update: scala.Boolean): T = js.native
  def create[T](`type`: java.lang.String, properties: realmLib.RealmNs.ObjectPropsType): T = js.native
  def create[T](`type`: java.lang.String, properties: realmLib.RealmNs.ObjectPropsType, update: scala.Boolean): T = js.native
  def create[T](`type`: js.Function, properties: T): T = js.native
  def create[T](`type`: js.Function, properties: T, update: scala.Boolean): T = js.native
  def create[T](`type`: js.Function, properties: realmLib.RealmNs.ObjectPropsType): T = js.native
  def create[T](`type`: js.Function, properties: realmLib.RealmNs.ObjectPropsType, update: scala.Boolean): T = js.native
  def create[T](`type`: realmLib.RealmNs.ObjectClass, properties: T): T = js.native
  def create[T](`type`: realmLib.RealmNs.ObjectClass, properties: T, update: scala.Boolean): T = js.native
  def create[T](`type`: realmLib.RealmNs.ObjectClass, properties: realmLib.RealmNs.ObjectPropsType): T = js.native
  def create[T](
    `type`: realmLib.RealmNs.ObjectClass,
    properties: realmLib.RealmNs.ObjectPropsType,
    update: scala.Boolean
  ): T = js.native
  def delete(`object`: js.Any): scala.Unit = js.native
  def delete(`object`: js.Array[realmLib.RealmNs.Object]): scala.Unit = js.native
  def delete(`object`: realmLib.RealmNs.List[_]): scala.Unit = js.native
  /**
    * @param  {Realm.Object|Realm.Object[]|Realm.List<any>|Realm.Results<any>|any} object
    * @returns void
    */
  def delete(`object`: realmLib.RealmNs.Object): scala.Unit = js.native
  def delete(`object`: realmLib.RealmNs.Results[_]): scala.Unit = js.native
  /**
    * @returns void
    */
  def deleteAll(): scala.Unit = js.native
  /**
    * @returns void
    */
  def deleteModel(name: java.lang.String): scala.Unit = js.native
  def objectForPrimaryKey[T](`type`: java.lang.String, key: java.lang.String): T with js.UndefOr[realmLib.RealmNs.Object] = js.native
  /**
    * @param  {string|Realm.ObjectType|Function} type
    * @param  {number|string} key
    * @returns {T | undefined}
    */
  def objectForPrimaryKey[T](`type`: java.lang.String, key: scala.Double): T with js.UndefOr[realmLib.RealmNs.Object] = js.native
  def objectForPrimaryKey[T](`type`: js.Function, key: java.lang.String): T with js.UndefOr[realmLib.RealmNs.Object] = js.native
  def objectForPrimaryKey[T](`type`: js.Function, key: scala.Double): T with js.UndefOr[realmLib.RealmNs.Object] = js.native
  def objectForPrimaryKey[T](`type`: realmLib.RealmNs.ObjectType, key: java.lang.String): T with js.UndefOr[realmLib.RealmNs.Object] = js.native
  def objectForPrimaryKey[T](`type`: realmLib.RealmNs.ObjectType, key: scala.Double): T with js.UndefOr[realmLib.RealmNs.Object] = js.native
  /**
    * @param  {string|Realm.ObjectType|Function} type
    * @returns Realm
    */
  def objects[T](`type`: java.lang.String): realmLib.RealmNs.Results[T with realmLib.RealmNs.Object] = js.native
  def objects[T](`type`: js.Function): realmLib.RealmNs.Results[T with realmLib.RealmNs.Object] = js.native
  def objects[T](`type`: realmLib.RealmNs.ObjectType): realmLib.RealmNs.Results[T with realmLib.RealmNs.Object] = js.native
  def permissions(): realmLib.RealmNs.PermissionsNs.Realm = js.native
  def permissions(objectType: java.lang.String): realmLib.RealmNs.PermissionsNs.Class = js.native
  def permissions(objectType: js.Function): realmLib.RealmNs.PermissionsNs.Class = js.native
  def permissions(objectType: realmLib.RealmNs.ObjectSchema): realmLib.RealmNs.PermissionsNs.Class = js.native
  def privileges(): realmLib.RealmNs.PermissionsNs.RealmPrivileges = js.native
  def privileges(objectType: java.lang.String): realmLib.RealmNs.PermissionsNs.ClassPrivileges = js.native
  def privileges(objectType: js.Function): realmLib.RealmNs.PermissionsNs.ClassPrivileges = js.native
  def privileges(objectType: realmLib.RealmNs.ObjectSchema): realmLib.RealmNs.PermissionsNs.ClassPrivileges = js.native
  def privileges(obj: realmLib.RealmNs.Object): realmLib.RealmNs.PermissionsNs.ObjectPrivileges = js.native
  /**
    * @param  {string} name?
    * @returns void
    */
  def removeAllListeners(): scala.Unit = js.native
  def removeAllListeners(name: java.lang.String): scala.Unit = js.native
  /**
    * @param  {string} name
    * @param  {()=>void} callback
    * @returns void
    */
  @JSName("removeListener")
  def removeListener_change(
    name: java.lang.String,
    callback: js.Function2[/* sender */ this.type, realmLib.realmLibStrings.change, scala.Unit]
  ): scala.Unit = js.native
  @JSName("removeListener")
  def removeListener_schema(
    name: java.lang.String,
    callback: js.Function3[
      /* sender */ this.type, 
      realmLib.realmLibStrings.schema, 
      /* schema */ js.Array[realmLib.RealmNs.ObjectSchema], 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def subscriptions(): js.Array[NamedSubscription] = js.native
  def subscriptions(name: java.lang.String): js.Array[NamedSubscription] = js.native
  def unsubscribe(name: java.lang.String): scala.Unit = js.native
  /**
    * @param  {()=>void} callback
    * @returns void
    */
  def write(callback: js.Function0[scala.Unit]): scala.Unit = js.native
  /**
    * Write a copy to destination path
    * @param path destination path
    * @param encryptionKey encryption key to use
    * @returns void
    */
  def writeCopyTo(path: java.lang.String): scala.Unit = js.native
  def writeCopyTo(path: java.lang.String, encryptionKey: stdLib.ArrayBuffer): scala.Unit = js.native
  def writeCopyTo(path: java.lang.String, encryptionKey: stdLib.ArrayBufferView): scala.Unit = js.native
}

/* static members */
@JSGlobal("Realm")
@js.native
object Realm extends js.Object {
  var defaultPath: java.lang.String = js.native
  /**
    * @deprecated in favor of `Realm.Sync.User.createConfiguration()`.
    * Return a configuration for a default Realm.
    * @param {Realm.Sync.User} optional user.
    */
  def automaticSyncConfiguration(): java.lang.String = js.native
  def automaticSyncConfiguration(user: realmLib.RealmNs.SyncNs.User): java.lang.String = js.native
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
    callback: js.Function2[/* error */ js.Any, /* realm */ this.type, scala.Unit]
  ): scala.Unit = js.native
  def openAsync(
    config: realmLib.RealmNs.Configuration,
    callback: js.Function2[/* error */ js.Any, /* realm */ this.type, scala.Unit],
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

