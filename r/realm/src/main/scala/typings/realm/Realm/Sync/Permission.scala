package typings.realm.Realm.Sync

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Permission extends js.Object {
  val id: String
  val mayManage: js.UndefOr[Boolean] = js.undefined
  val mayRead: js.UndefOr[Boolean] = js.undefined
  val mayWrite: js.UndefOr[Boolean] = js.undefined
  val path: String
  val updatedAt: Date
  val userId: String
}

object Permission {
  @scala.inline
  def apply(
    id: String,
    path: String,
    updatedAt: Date,
    userId: String,
    mayManage: js.UndefOr[Boolean] = js.undefined,
    mayRead: js.UndefOr[Boolean] = js.undefined,
    mayWrite: js.UndefOr[Boolean] = js.undefined
  ): Permission = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], updatedAt = updatedAt.asInstanceOf[js.Any], userId = userId.asInstanceOf[js.Any])
    if (!js.isUndefined(mayManage)) __obj.updateDynamic("mayManage")(mayManage.get.asInstanceOf[js.Any])
    if (!js.isUndefined(mayRead)) __obj.updateDynamic("mayRead")(mayRead.get.asInstanceOf[js.Any])
    if (!js.isUndefined(mayWrite)) __obj.updateDynamic("mayWrite")(mayWrite.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Permission]
  }
}

