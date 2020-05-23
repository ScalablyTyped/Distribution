package typings.pusherChatkitClient.currentuserMod

import typings.pusherChatkitClient.pusherChatkitClientStrings.newer
import typings.pusherChatkitClient.pusherChatkitClientStrings.older
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FetchMultipartMessagesParams extends js.Object {
  var direction: js.UndefOr[older | newer] = js.undefined
  var initialId: js.UndefOr[Double] = js.undefined
  var limit: js.UndefOr[Double] = js.undefined
  var roomId: String
}

object FetchMultipartMessagesParams {
  @scala.inline
  def apply(
    roomId: String,
    direction: older | newer = null,
    initialId: js.UndefOr[Double] = js.undefined,
    limit: js.UndefOr[Double] = js.undefined
  ): FetchMultipartMessagesParams = {
    val __obj = js.Dynamic.literal(roomId = roomId.asInstanceOf[js.Any])
    if (direction != null) __obj.updateDynamic("direction")(direction.asInstanceOf[js.Any])
    if (!js.isUndefined(initialId)) __obj.updateDynamic("initialId")(initialId.get.asInstanceOf[js.Any])
    if (!js.isUndefined(limit)) __obj.updateDynamic("limit")(limit.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[FetchMultipartMessagesParams]
  }
}

