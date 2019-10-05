package typings.realm.Realm.Sync

import typings.realm.realmStrings.downloadBeforeOpen
import typings.realm.realmStrings.openImmediately
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.realm.realmStrings.downloadBeforeOpen
  - typings.realm.realmStrings.openImmediately
*/
trait OpenRealmBehaviorType extends js.Object

object OpenRealmBehaviorType {
  @scala.inline
  def DownloadBeforeOpen: downloadBeforeOpen = this.cast("downloadBeforeOpen")
  @scala.inline
  def OpenImmediately: openImmediately = this.cast("openImmediately")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

