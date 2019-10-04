package typings.realm

import typings.realm.RealmNs.Configuration
import typings.realm.RealmNs.List
import typings.realm.RealmNs.Object
import typings.realm.RealmNs.ObjectClass
import typings.realm.RealmNs.ObjectPropsType
import typings.realm.RealmNs.ObjectSchema
import typings.realm.RealmNs.ObjectType
import typings.realm.RealmNs.PermissionsNs.Class
import typings.realm.RealmNs.PermissionsNs.ClassPrivileges
import typings.realm.RealmNs.PermissionsNs.ObjectPrivileges
import typings.realm.RealmNs.PermissionsNs.RealmPrivileges
import typings.realm.RealmNs.Results
import typings.realm.RealmNs.SyncNs.ProgressNotificationCallback
import typings.realm.RealmNs.SyncNs.Session
import typings.realm.RealmNs.SyncNs.User
import typings.realm.RealmNs.UpdateMode
import typings.realm.realmStrings.change
import typings.std.ArrayBuffer
import typings.std.ArrayBufferView
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Realm")
@js.native
/**
  * @param  {Realm.Configuration} config?
  */
class Realm () extends js.Object {
  def this(config: Configuration) = this()
  def this(path: String) = this()
  val empty: Boolean = js.native
  val isClosed: Boolean = js.native
  val isInTransaction: Boolean = js.native
  val path: String = js.native
  val readOnly: Boolean = js.native
  val schema: js.Array[ObjectSchema] = js.native
  val schemaVersion: Double = js.native
  val syncSession: Session | Null = js.native
  /**
    * Update the schema of the Realm.
    *
    * @param schema The schema which the Realm should be updated to use.
    * @private Not a part of the public API: Consider passing a `schema` when constructing the `Realm` instead.
    */
  def _updateSchema(schema: js.Array[ObjectSchema]): Unit = js.native
  /**
    * @param  {string} name
    * @param  {()=>void} callback
    * @returns void
    */
  @JSName("addListener")
  def addListener_change(name: String, callback: js.Function2[/* sender */ this.type, change, Unit]): Unit = js.native
  @JSName("addListener")
  def addListener_schema(
    name: String,
    callback: js.Function3[
      /* sender */ this.type, 
      typings.realm.realmStrings.schema, 
      /* schema */ js.Array[ObjectSchema], 
      Unit
    ]
  ): Unit = js.native
  /**
    * @returns void
    */
  def beginTransaction(): Unit = js.native
  /**
    * @returns void
    */
  def cancelTransaction(): Unit = js.native
  /**
    * @returns void
    */
  def close(): Unit = js.native
  /**
    * @returns void
    */
  def commitTransaction(): Unit = js.native
  /**
    * @returns boolean
    */
  def compact(): Boolean = js.native
  /**
    * @param  {string|Realm.ObjectClass|Function} type
    * @param  {T&Realm.ObjectPropsType} properties
    * @param  {boolean} update?
    * @returns T
    *
    * @deprecated, to be removed in future versions. Use `create(type, properties, UpdateMode)` instead.
    */
  def create[T](`type`: String, properties: T): T = js.native
  def create[T](`type`: String, properties: T, mode: UpdateMode): T = js.native
  def create[T](`type`: String, properties: T, update: Boolean): T = js.native
  def create[T](`type`: String, properties: ObjectPropsType): T = js.native
  def create[T](`type`: String, properties: ObjectPropsType, mode: UpdateMode): T = js.native
  def create[T](`type`: String, properties: ObjectPropsType, update: Boolean): T = js.native
  def create[T](`type`: js.Function, properties: T): T = js.native
  def create[T](`type`: js.Function, properties: T, mode: UpdateMode): T = js.native
  def create[T](`type`: js.Function, properties: T, update: Boolean): T = js.native
  def create[T](`type`: js.Function, properties: ObjectPropsType): T = js.native
  def create[T](`type`: js.Function, properties: ObjectPropsType, mode: UpdateMode): T = js.native
  def create[T](`type`: js.Function, properties: ObjectPropsType, update: Boolean): T = js.native
  def create[T](`type`: ObjectClass, properties: T): T = js.native
  def create[T](`type`: ObjectClass, properties: T, mode: UpdateMode): T = js.native
  def create[T](`type`: ObjectClass, properties: T, update: Boolean): T = js.native
  def create[T](`type`: ObjectClass, properties: ObjectPropsType): T = js.native
  def create[T](`type`: ObjectClass, properties: ObjectPropsType, mode: UpdateMode): T = js.native
  def create[T](`type`: ObjectClass, properties: ObjectPropsType, update: Boolean): T = js.native
  def delete(`object`: js.Any): Unit = js.native
  def delete(`object`: js.Array[Object]): Unit = js.native
  def delete(`object`: List[_]): Unit = js.native
  /**
    * @param  {Realm.Object|Realm.Object[]|Realm.List<any>|Realm.Results<any>|any} object
    * @returns void
    */
  def delete(`object`: Object): Unit = js.native
  def delete(`object`: Results[_]): Unit = js.native
  /**
    * @returns void
    */
  def deleteAll(): Unit = js.native
  /**
    * @returns void
    */
  def deleteModel(name: String): Unit = js.native
  def objectForPrimaryKey[T](`type`: String, key: String): js.UndefOr[T with Object] = js.native
  /**
    * @param  {string|Realm.ObjectType|Function} type
    * @param  {number|string} key
    * @returns {T | undefined}
    */
  def objectForPrimaryKey[T](`type`: String, key: Double): js.UndefOr[T with Object] = js.native
  def objectForPrimaryKey[T](`type`: js.Function, key: String): js.UndefOr[T with Object] = js.native
  def objectForPrimaryKey[T](`type`: js.Function, key: Double): js.UndefOr[T with Object] = js.native
  def objectForPrimaryKey[T](`type`: ObjectType, key: String): js.UndefOr[T with Object] = js.native
  def objectForPrimaryKey[T](`type`: ObjectType, key: Double): js.UndefOr[T with Object] = js.native
  /**
    * @param  {string|Realm.ObjectType|Function} type
    * @returns Realm
    */
  def objects[T](`type`: String): Results[T with Object] = js.native
  def objects[T](`type`: js.Function): Results[T with Object] = js.native
  def objects[T](`type`: ObjectType): Results[T with Object] = js.native
  def permissions(): typings.realm.RealmNs.PermissionsNs.Realm = js.native
  def permissions(objectType: String): Class = js.native
  def permissions(objectType: js.Function): Class = js.native
  def permissions(objectType: ObjectSchema): Class = js.native
  def privileges(): RealmPrivileges = js.native
  def privileges(objectType: String): ClassPrivileges = js.native
  def privileges(objectType: js.Function): ClassPrivileges = js.native
  def privileges(objectType: ObjectSchema): ClassPrivileges = js.native
  def privileges(obj: Object): ObjectPrivileges = js.native
  /**
    * @param  {string} name?
    * @returns void
    */
  def removeAllListeners(): Unit = js.native
  def removeAllListeners(name: String): Unit = js.native
  /**
    * @param  {string} name
    * @param  {()=>void} callback
    * @returns void
    */
  @JSName("removeListener")
  def removeListener_change(name: String, callback: js.Function2[/* sender */ this.type, change, Unit]): Unit = js.native
  @JSName("removeListener")
  def removeListener_schema(
    name: String,
    callback: js.Function3[
      /* sender */ this.type, 
      typings.realm.realmStrings.schema, 
      /* schema */ js.Array[ObjectSchema], 
      Unit
    ]
  ): Unit = js.native
  def subscriptions(): Results[NamedSubscription] = js.native
  def subscriptions(name: String): Results[NamedSubscription] = js.native
  def unsubscribe(name: String): Unit = js.native
  /**
    * @param  {()=>void} callback
    * @returns void
    */
  def write(callback: js.Function0[Unit]): Unit = js.native
  /**
    * Write a copy to destination path
    * @param path destination path
    * @param encryptionKey encryption key to use
    * @returns void
    */
  def writeCopyTo(path: String): Unit = js.native
  def writeCopyTo(path: String, encryptionKey: ArrayBuffer): Unit = js.native
  def writeCopyTo(path: String, encryptionKey: ArrayBufferView): Unit = js.native
}

/* static members */
@JSGlobal("Realm")
@js.native
object Realm extends js.Object {
  var defaultPath: String = js.native
  /**
    * @deprecated in favor of `Realm.Sync.User.createConfiguration()`.
    * Return a configuration for a default Realm.
    * @param {Realm.Sync.User} optional user.
    */
  def automaticSyncConfiguration(): String = js.native
  def automaticSyncConfiguration(user: User): String = js.native
  /**
    * Clears the state by closing and deleting any Realm in the default directory and logout all users.
    * @private Not a part of the public API: It's primarily used from the library's tests.
    */
  def clearTestState(): Unit = js.native
  /**
    * Copy all bundled Realm files to app's default file folder.
    */
  def copyBundledRealmFiles(): Unit = js.native
  /**
    * @param {Realm.ObjectSchema} object schema describing the object that should be created.
    * @returns {T}
    */
  def createTemplateObject[T](objectSchema: ObjectSchema): T with Object = js.native
  /**
    * Delete the Realm file for the given configuration.
    * @param {Configuration} config
    */
  def deleteFile(config: Configuration): Unit = js.native
  /**
    * Checks if the Realm already exists on disk.
    */
  def exists(config: Configuration): Boolean = js.native
  /**
    * Open a realm asynchronously with a promise. If the realm is synced, it will be fully synchronized before it is available.
    * @param {Configuration} config
    */
  def open(config: Configuration): ProgressPromise = js.native
  /**
    * @deprecated in favor of `Realm.open`
    * Open a realm asynchronously with a callback. If the realm is synced, it will be fully synchronized before it is available.
    * @param {Configuration} config
    * @param {Function} callback will be called when the realm is ready.
    * @param {ProgressNotificationCallback} progressCallback? a progress notification callback for 'download' direction and 'forCurrentlyOutstandingWork' mode
    */
  def openAsync(config: Configuration, callback: js.Function2[/* error */ js.Any, /* realm */ this.type, Unit]): Unit = js.native
  def openAsync(
    config: Configuration,
    callback: js.Function2[/* error */ js.Any, /* realm */ this.type, Unit],
    progressCallback: ProgressNotificationCallback
  ): Unit = js.native
  /**
    * Get the current schema version of the Realm at the given path.
    * @param  {string} path
    * @param  {any} encryptionKey?
    * @returns number
    */
  def schemaVersion(path: String): Double = js.native
  def schemaVersion(path: String, encryptionKey: ArrayBuffer): Double = js.native
  def schemaVersion(path: String, encryptionKey: ArrayBufferView): Double = js.native
}

