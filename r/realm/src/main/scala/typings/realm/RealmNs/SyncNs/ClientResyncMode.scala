package typings.realm.RealmNs.SyncNs

import typings.realm.realmStrings.discard
import typings.realm.realmStrings.manual
import typings.realm.realmStrings.recover
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.realm.realmStrings.discard
  - typings.realm.realmStrings.manual
  - typings.realm.realmStrings.recover
*/
trait ClientResyncMode extends js.Object

object ClientResyncMode {
  @scala.inline
  def Discard: discard = this.cast("discard")
  @scala.inline
  def Manual: manual = this.cast("manual")
  @scala.inline
  def Recover: recover = this.cast("recover")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

