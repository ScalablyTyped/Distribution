package typings.realm.Realm.Sync

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PermissionChange extends js.Object {
  var createdAt: Date
  var id: String
  var mayManage: js.UndefOr[Boolean] = js.undefined
  var mayRead: js.UndefOr[Boolean] = js.undefined
  var mayWrite: js.UndefOr[Boolean] = js.undefined
  var metadataKey: js.UndefOr[String] = js.undefined
  var metadataValue: js.UndefOr[String] = js.undefined
  var realmUrl: String
  var statusCode: js.UndefOr[Double] = js.undefined
  var statusMessage: js.UndefOr[String] = js.undefined
  var updatedAt: Date
  var userId: String
}

object PermissionChange {
  @scala.inline
  def apply(
    createdAt: Date,
    id: String,
    realmUrl: String,
    updatedAt: Date,
    userId: String,
    mayManage: js.UndefOr[Boolean] = js.undefined,
    mayRead: js.UndefOr[Boolean] = js.undefined,
    mayWrite: js.UndefOr[Boolean] = js.undefined,
    metadataKey: String = null,
    metadataValue: String = null,
    statusCode: js.UndefOr[Double] = js.undefined,
    statusMessage: String = null
  ): PermissionChange = {
    val __obj = js.Dynamic.literal(createdAt = createdAt.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], realmUrl = realmUrl.asInstanceOf[js.Any], updatedAt = updatedAt.asInstanceOf[js.Any], userId = userId.asInstanceOf[js.Any])
    if (!js.isUndefined(mayManage)) __obj.updateDynamic("mayManage")(mayManage.get.asInstanceOf[js.Any])
    if (!js.isUndefined(mayRead)) __obj.updateDynamic("mayRead")(mayRead.get.asInstanceOf[js.Any])
    if (!js.isUndefined(mayWrite)) __obj.updateDynamic("mayWrite")(mayWrite.get.asInstanceOf[js.Any])
    if (metadataKey != null) __obj.updateDynamic("metadataKey")(metadataKey.asInstanceOf[js.Any])
    if (metadataValue != null) __obj.updateDynamic("metadataValue")(metadataValue.asInstanceOf[js.Any])
    if (!js.isUndefined(statusCode)) __obj.updateDynamic("statusCode")(statusCode.get.asInstanceOf[js.Any])
    if (statusMessage != null) __obj.updateDynamic("statusMessage")(statusMessage.asInstanceOf[js.Any])
    __obj.asInstanceOf[PermissionChange]
  }
}

