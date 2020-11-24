package typings.realm

import typings.realm.Realm.App.Sync.Session
import typings.realm.Realm.List
import typings.realm.Realm.Object
import typings.realm.Realm.ObjectSchema
import typings.realm.Realm.Results
import typings.realm.Realm.UpdateMode.All
import typings.realm.Realm.UpdateMode.Modified
import typings.realm.Realm.UpdateMode.Never
import typings.realm.anon.Instantiable
import typings.realm.realmStrings.change
import typings.std.ArrayBuffer
import typings.std.ArrayBufferView
import typings.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Realm_ extends js.Object {
  
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
    * @param  {string} type
    * @param  {T} properties
    * @param  {Realm.UpdateMode} mode? If not provided, `Realm.UpdateMode.Never` is used.
    * @returns T & Realm.Object
    */
  def create[T](`type`: String, properties: RealmInsertionModel[T]): T with Object = js.native
  def create[T](`type`: String, properties: RealmInsertionModel[T], mode: Never): T with Object = js.native
  def create[T](`type`: String, properties: Partial[RealmInsertionModel[T] | T], mode: All): T with Object = js.native
  def create[T](`type`: String, properties: Partial[RealmInsertionModel[T] | T], mode: Modified): T with Object = js.native
  /**
    * @param  {Class} type
    * @param  {T} properties
    * @param  {Realm.UpdateMode} mode? If not provided, `Realm.UpdateMode.Never` is used.
    * @returns T
    */
  def create[T /* <: Object */](`type`: Instantiable[T], properties: RealmInsertionModel[T]): T = js.native
  def create[T /* <: Object */](`type`: Instantiable[T], properties: RealmInsertionModel[T], mode: Never): T = js.native
  def create[T /* <: Object */](`type`: Instantiable[T], properties: Partial[RealmInsertionModel[T] | T], mode: All): T = js.native
  def create[T /* <: Object */](`type`: Instantiable[T], properties: Partial[RealmInsertionModel[T] | T], mode: Modified): T = js.native
  
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
  
  val empty: Boolean = js.native
  
  val isClosed: Boolean = js.native
  
  val isInTransaction: Boolean = js.native
  
  def objectForPrimaryKey[T](`type`: String, key: String): js.UndefOr[T with Object] = js.native
  def objectForPrimaryKey[T](
    `type`: String,
    key: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Realm.ObjectId */ js.Any
  ): js.UndefOr[T with Object] = js.native
  /**
    * @param  {string} type
    * @param  {number|string|ObjectId} key
    * @returns {T | undefined}
    */
  def objectForPrimaryKey[T](`type`: String, key: Double): js.UndefOr[T with Object] = js.native
  def objectForPrimaryKey[T /* <: Object */](`type`: Instantiable[T], key: String): js.UndefOr[T] = js.native
  def objectForPrimaryKey[T /* <: Object */](
    `type`: Instantiable[T],
    key: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Realm.ObjectId */ js.Any
  ): js.UndefOr[T] = js.native
  /**
    * @param  {Class} type
    * @param  {number|string|ObjectId} key
    * @returns {T | undefined}
    */
  def objectForPrimaryKey[T /* <: Object */](`type`: Instantiable[T], key: Double): js.UndefOr[T] = js.native
  
  /**
    * @param  {string} type
    * @returns Realm.Results<T & Realm.Object>
    */
  def objects[T](`type`: String): Results[T with Object] = js.native
  /**
    * @param  {Class} type
    * @returns Realm.Results<T>
    */
  def objects[T /* <: Object */](`type`: Instantiable[T]): Results[T] = js.native
  
  val path: String = js.native
  
  val readOnly: Boolean = js.native
  
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
  
  val schema: js.Array[ObjectSchema] = js.native
  
  val schemaVersion: Double = js.native
  
  val syncSession: Session | Null = js.native
  
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
