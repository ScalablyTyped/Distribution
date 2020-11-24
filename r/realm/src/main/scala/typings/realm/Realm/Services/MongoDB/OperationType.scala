package typings.realm.Realm.Services.MongoDB

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * An operation performed on a document.
  */
/* Rewritten from type alias, can be one of: 
  - typings.realm.realmStrings.insert
  - typings.realm.realmStrings.delete
  - typings.realm.realmStrings.replace
  - typings.realm.realmStrings.update
  - typings.realm.realmStrings.drop
  - typings.realm.realmStrings.rename
  - typings.realm.realmStrings.dropDatabase
  - typings.realm.realmStrings.invalidate
*/
trait OperationType extends js.Object
object OperationType {
  
  @scala.inline
  def delete: typings.realm.realmStrings.delete = "delete".asInstanceOf[typings.realm.realmStrings.delete]
  
  @scala.inline
  def drop: typings.realm.realmStrings.drop = "drop".asInstanceOf[typings.realm.realmStrings.drop]
  
  @scala.inline
  def dropDatabase: typings.realm.realmStrings.dropDatabase = "dropDatabase".asInstanceOf[typings.realm.realmStrings.dropDatabase]
  
  @scala.inline
  def insert: typings.realm.realmStrings.insert = "insert".asInstanceOf[typings.realm.realmStrings.insert]
  
  @scala.inline
  def invalidate: typings.realm.realmStrings.invalidate = "invalidate".asInstanceOf[typings.realm.realmStrings.invalidate]
  
  @scala.inline
  def rename: typings.realm.realmStrings.rename = "rename".asInstanceOf[typings.realm.realmStrings.rename]
  
  @scala.inline
  def replace: typings.realm.realmStrings.replace = "replace".asInstanceOf[typings.realm.realmStrings.replace]
  
  @scala.inline
  def update: typings.realm.realmStrings.update = "update".asInstanceOf[typings.realm.realmStrings.update]
}
