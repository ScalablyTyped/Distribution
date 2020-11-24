package typings.realm.global.Realm

import typings.realm.ProgressPromise
import typings.realm.Realm.Configuration
import typings.realm.Realm.ObjectSchema
import typings.std.ArrayBuffer
import typings.std.ArrayBufferView
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("Realm")
@js.native
object ^ extends js.Object {
  
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
  def createTemplateObject[T](objectSchema: ObjectSchema): T with typings.realm.Realm.Object = js.native
  
  var defaultPath: String = js.native
  
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
    * Get the current schema version of the Realm at the given path.
    * @param  {string} path
    * @param  {any} encryptionKey?
    * @returns number
    */
  def schemaVersion(path: String): Double = js.native
  def schemaVersion(path: String, encryptionKey: ArrayBuffer): Double = js.native
  def schemaVersion(path: String, encryptionKey: ArrayBufferView): Double = js.native
}
