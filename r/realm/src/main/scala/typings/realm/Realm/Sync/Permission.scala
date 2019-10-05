package typings.realm.Realm.Sync

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Realm.Sync.Permission")
@js.native
class Permission () extends js.Object {
  val id: String = js.native
  val mayManage: js.UndefOr[Boolean] = js.native
  val mayRead: js.UndefOr[Boolean] = js.native
  val mayWrite: js.UndefOr[Boolean] = js.native
  val path: String = js.native
  val updatedAt: Date = js.native
  val userId: String = js.native
}

