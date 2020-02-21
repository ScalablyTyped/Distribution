package typings.pusherChatkitClient.currentuserMod

import typings.pusherChatkitClient.messageMod.SendMessagePayload
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SendMultipartMessageParams extends js.Object {
  var parts: js.Array[SendMessagePayload]
  var roomId: String
}

object SendMultipartMessageParams {
  @scala.inline
  def apply(parts: js.Array[SendMessagePayload], roomId: String): SendMultipartMessageParams = {
    val __obj = js.Dynamic.literal(parts = parts.asInstanceOf[js.Any], roomId = roomId.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[SendMultipartMessageParams]
  }
}

