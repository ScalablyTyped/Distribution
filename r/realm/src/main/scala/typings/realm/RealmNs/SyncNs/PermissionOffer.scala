package typings.realm.RealmNs.SyncNs

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Realm.Sync.PermissionOffer")
@js.native
class PermissionOffer () extends js.Object {
  var createdAt: Date = js.native
  var expiresAt: js.UndefOr[Date] = js.native
  var id: String = js.native
  var mayManage: js.UndefOr[Boolean] = js.native
  var mayRead: js.UndefOr[Boolean] = js.native
  var mayWrite: js.UndefOr[Boolean] = js.native
  var realmUrl: String = js.native
  var statusCode: js.UndefOr[Double] = js.native
  var statusMessage: js.UndefOr[String] = js.native
  var token: js.UndefOr[String] = js.native
  var updatedAt: Date = js.native
}

