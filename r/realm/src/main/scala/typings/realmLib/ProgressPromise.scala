package typings
package realmLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ProgressPromise
  extends stdLib.Promise[Realm] {
  def progress(callback: realmLib.RealmNs.SyncNs.ProgressNotificationCallback): js.Promise[Realm] = js.native
}

