package typings.atPusherChatkitDashClient.hooksMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RoomParams extends js.Object {
  var roomId: String
}

object RoomParams {
  @scala.inline
  def apply(roomId: String): RoomParams = {
    val __obj = js.Dynamic.literal(roomId = roomId.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[RoomParams]
  }
}

