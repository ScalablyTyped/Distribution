package typings
package realmLib.RealmNs.SyncNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - realmLib.realmLibStrings.downloadBeforeOpen
  - realmLib.realmLibStrings.openImmediately
*/
trait OpenRealmBehaviorType extends js.Object

object OpenRealmBehaviorType {
  @scala.inline
  def DownloadBeforeOpen: realmLib.realmLibStrings.downloadBeforeOpen = this.cast("downloadBeforeOpen")
  @scala.inline
  def OpenImmediately: realmLib.realmLibStrings.openImmediately = this.cast("openImmediately")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

