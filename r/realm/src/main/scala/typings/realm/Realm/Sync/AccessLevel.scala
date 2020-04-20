package typings.realm.Realm.Sync

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.realm.realmStrings.none
  - typings.realm.realmStrings.read
  - typings.realm.realmStrings.write
  - typings.realm.realmStrings.admin
*/
trait AccessLevel extends js.Object

object AccessLevel {
  @scala.inline
  def admin: typings.realm.realmStrings.admin = "admin".asInstanceOf[typings.realm.realmStrings.admin]
  @scala.inline
  def none: typings.realm.realmStrings.none = "none".asInstanceOf[typings.realm.realmStrings.none]
  @scala.inline
  def read: typings.realm.realmStrings.read = "read".asInstanceOf[typings.realm.realmStrings.read]
  @scala.inline
  def write: typings.realm.realmStrings.write = "write".asInstanceOf[typings.realm.realmStrings.write]
}

