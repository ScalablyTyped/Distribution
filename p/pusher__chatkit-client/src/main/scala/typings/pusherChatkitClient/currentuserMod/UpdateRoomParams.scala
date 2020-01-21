package typings.pusherChatkitClient.currentuserMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UpdateRoomParams extends js.Object {
  var customData: js.UndefOr[js.Any] = js.undefined
  var name: js.UndefOr[String] = js.undefined
  var `private`: js.UndefOr[Boolean] = js.undefined
  var roomId: String
}

object UpdateRoomParams {
  @scala.inline
  def apply(
    roomId: String,
    customData: js.Any = null,
    name: String = null,
    `private`: js.UndefOr[Boolean] = js.undefined
  ): UpdateRoomParams = {
    val __obj = js.Dynamic.literal(roomId = roomId.asInstanceOf[js.Any])
    if (customData != null) __obj.updateDynamic("customData")(customData.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (!js.isUndefined(`private`)) __obj.updateDynamic("private")(`private`.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateRoomParams]
  }
}

