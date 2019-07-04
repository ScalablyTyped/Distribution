package typings
package realmLib.RealmNs.SyncNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - realmLib.realmLibStrings.openLocalRealm
  - realmLib.realmLibStrings.throwException
*/
trait OpenRealmTimeOutBehavior extends js.Object

object OpenRealmTimeOutBehavior {
  @scala.inline
  def OpenLocalRealm: realmLib.realmLibStrings.openLocalRealm = this.cast("openLocalRealm")
  @scala.inline
  def ThrowException: realmLib.realmLibStrings.throwException = this.cast("throwException")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

