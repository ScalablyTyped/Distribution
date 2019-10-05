package typings.realm.Realm.Sync

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Realm.Sync.removeListener")
@js.native
object removeListener extends js.Object {
  def apply(regex: String, name: String, changeCallback: js.Function1[/* changeEvent */ ChangeEvent, Unit]): js.Promise[Unit] = js.native
}

