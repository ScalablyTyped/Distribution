package typings.atPusherChatkitDashClient.currentuserMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReadCursorParams extends js.Object {
  var roomId: String
  var userId: String
}

object ReadCursorParams {
  @scala.inline
  def apply(roomId: String, userId: String): ReadCursorParams = {
    val __obj = js.Dynamic.literal(roomId = roomId.asInstanceOf[js.Any], userId = userId.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ReadCursorParams]
  }
}

