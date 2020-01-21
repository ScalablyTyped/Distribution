package typings.pusherChatkitClient.currentuserMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RoomSubcriptionParams extends js.Object {
  var disableCursors: js.UndefOr[Boolean] = js.undefined
  var hooks: js.UndefOr[RoomSubscriptionHooks] = js.undefined
  var messageLimit: js.UndefOr[Double] = js.undefined
  var roomId: String
}

object RoomSubcriptionParams {
  @scala.inline
  def apply(
    roomId: String,
    disableCursors: js.UndefOr[Boolean] = js.undefined,
    hooks: RoomSubscriptionHooks = null,
    messageLimit: Int | Double = null
  ): RoomSubcriptionParams = {
    val __obj = js.Dynamic.literal(roomId = roomId.asInstanceOf[js.Any])
    if (!js.isUndefined(disableCursors)) __obj.updateDynamic("disableCursors")(disableCursors.asInstanceOf[js.Any])
    if (hooks != null) __obj.updateDynamic("hooks")(hooks.asInstanceOf[js.Any])
    if (messageLimit != null) __obj.updateDynamic("messageLimit")(messageLimit.asInstanceOf[js.Any])
    __obj.asInstanceOf[RoomSubcriptionParams]
  }
}

