package typings.realm.Realm.Sync

import typings.realm.realmStrings.`after-upload`
import typings.realm.realmStrings.immediately
import typings.realm.realmStrings.never
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.realm.realmStrings.`after-upload`
  - typings.realm.realmStrings.immediately
  - typings.realm.realmStrings.never
*/
trait SessionStopPolicy extends js.Object

object SessionStopPolicy {
  @scala.inline
  def AfterUpload: `after-upload` = "after-upload".asInstanceOf[`after-upload`]
  @scala.inline
  def Immediately: immediately = "immediately".asInstanceOf[immediately]
  @scala.inline
  def Never: never = "never".asInstanceOf[never]
}

