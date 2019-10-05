package typings.realm

import typings.realm.Realm.Sync.ProgressNotificationCallback
import typings.std.Promise
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ProgressPromise extends Promise[Realm] {
  def cancel(): Unit = js.native
  def progress(callback: ProgressNotificationCallback): js.Promise[Realm] = js.native
}

