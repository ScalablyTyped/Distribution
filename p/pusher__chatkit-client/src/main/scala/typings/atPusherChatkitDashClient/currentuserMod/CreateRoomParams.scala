package typings.atPusherChatkitDashClient.currentuserMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateRoomParams extends js.Object {
  var addUserIds: js.UndefOr[js.Array[String]] = js.undefined
  var customData: js.UndefOr[js.Any] = js.undefined
  var id: js.UndefOr[String] = js.undefined
  var name: String
  var `private`: js.UndefOr[Boolean] = js.undefined
}

object CreateRoomParams {
  @scala.inline
  def apply(
    name: String,
    addUserIds: js.Array[String] = null,
    customData: js.Any = null,
    id: String = null,
    `private`: js.UndefOr[Boolean] = js.undefined
  ): CreateRoomParams = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    if (addUserIds != null) __obj.updateDynamic("addUserIds")(addUserIds.asInstanceOf[js.Any])
    if (customData != null) __obj.updateDynamic("customData")(customData.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (!js.isUndefined(`private`)) __obj.updateDynamic("private")(`private`.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateRoomParams]
  }
}

