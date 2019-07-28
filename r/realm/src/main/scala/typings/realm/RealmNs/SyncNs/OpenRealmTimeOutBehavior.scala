package typings.realm.RealmNs.SyncNs

import typings.realm.realmStrings.openLocalRealm
import typings.realm.realmStrings.throwException
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.realm.realmStrings.openLocalRealm
  - typings.realm.realmStrings.throwException
*/
trait OpenRealmTimeOutBehavior extends js.Object

object OpenRealmTimeOutBehavior {
  @scala.inline
  def OpenLocalRealm: openLocalRealm = this.cast("openLocalRealm")
  @scala.inline
  def ThrowException: throwException = this.cast("throwException")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

