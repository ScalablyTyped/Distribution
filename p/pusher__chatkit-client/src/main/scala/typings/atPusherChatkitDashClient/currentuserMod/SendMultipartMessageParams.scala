package typings.atPusherChatkitDashClient.currentuserMod

import typings.atPusherChatkitDashClient.messageMod.MessagePart
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SendMultipartMessageParams extends js.Object {
  var parts: js.Array[MessagePart]
  var roomId: String
}

object SendMultipartMessageParams {
  @scala.inline
  def apply(parts: js.Array[MessagePart], roomId: String): SendMultipartMessageParams = {
    val __obj = js.Dynamic.literal(parts = parts.asInstanceOf[js.Any], roomId = roomId.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[SendMultipartMessageParams]
  }
}

