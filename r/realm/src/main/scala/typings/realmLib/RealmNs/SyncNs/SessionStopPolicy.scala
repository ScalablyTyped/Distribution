package typings
package realmLib.RealmNs.SyncNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - realmLib.realmLibStrings.`after-upload`
  - realmLib.realmLibStrings.immediately
  - realmLib.realmLibStrings.never
*/
trait SessionStopPolicy extends js.Object

object SessionStopPolicy {
  @scala.inline
  def AfterUpload: realmLib.realmLibStrings.`after-upload` = this.cast("after-upload")
  @scala.inline
  def Immediately: realmLib.realmLibStrings.immediately = this.cast("immediately")
  @scala.inline
  def Never: realmLib.realmLibStrings.never = this.cast("never")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

