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
    initialId: Int | Double = null,
    limit: Int | Double = null
  ): FetchMultipartMessagesParams = {
    val __obj = js.Dynamic.literal(roomId = roomId.asInstanceOf[js.Any])
    if (direction != null) __obj.updateDynamic("direction")(direction.asInstanceOf[js.Any])
    if (initialId != null) __obj.updateDynamic("initialId")(initialId.asInstanceOf[js.Any])
    if (limit != null) __obj.updateDynamic("limit")(limit.asInstanceOf[js.Any])
    __obj.asInstanceOf[FetchMultipartMessagesParams]
  }
}

