package typings.atPusherChatkitDashClient.currentuserMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SetReadCursorParams extends js.Object {
  var position: Double
  var roomId: String
}

object SetReadCursorParams {
  @scala.inline
  def apply(position: Double, roomId: String): SetReadCursorParams = {
    val __obj = js.Dynamic.literal(position = position.asInstanceOf[js.Any], roomId = roomId.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[SetReadCursorParams]
  }
}

