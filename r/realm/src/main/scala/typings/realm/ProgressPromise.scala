package typings.realm

import typings.realm.Realm.Sync.ProgressNotificationCallback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ProgressPromise
  extends js.Promise[Realm] {
  def cancel(): Unit = js.native
  def progress(callback: ProgressNotificationCallback): js.Promise[Realm] = js.native
}

