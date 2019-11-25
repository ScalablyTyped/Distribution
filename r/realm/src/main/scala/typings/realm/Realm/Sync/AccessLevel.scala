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
  def admin: typings.realm.realmStrings.admin = this.cast("admin")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def none: typings.realm.realmStrings.none = this.cast("none")
  @scala.inline
  def read: typings.realm.realmStrings.read = this.cast("read")
  @scala.inline
  def write: typings.realm.realmStrings.write = this.cast("write")
}

