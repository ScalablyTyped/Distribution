package typings.pusherChatkitClient.currentuserMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SendSimpleMessageParams extends js.Object {
  var roomId: String
  var text: String
}

object SendSimpleMessageParams {
  @scala.inline
  def apply(roomId: String, text: String): SendSimpleMessageParams = {
    val __obj = js.Dynamic.literal(roomId = roomId.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
    __obj.asInstanceOf[SendSimpleMessageParams]
  }
}

