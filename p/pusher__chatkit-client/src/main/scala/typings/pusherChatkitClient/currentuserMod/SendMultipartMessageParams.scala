package typings.pusherChatkitClient.currentuserMod

import typings.pusherChatkitClient.messageMod.SendMessagePayload
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SendMultipartMessageParams extends js.Object {
  var parts: js.Array[SendMessagePayload] = js.native
  var roomId: String = js.native
}

object SendMultipartMessageParams {
  @scala.inline
  def apply(parts: js.Array[SendMessagePayload], roomId: String): SendMultipartMessageParams = {
    val __obj = js.Dynamic.literal(parts = parts.asInstanceOf[js.Any], roomId = roomId.asInstanceOf[js.Any])
    __obj.asInstanceOf[SendMultipartMessageParams]
  }
  @scala.inline
  implicit class SendMultipartMessageParamsOps[Self <: SendMultipartMessageParams] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setPartsVarargs(value: SendMessagePayload*): Self = this.set("parts", js.Array(value :_*))
    @scala.inline
    def setParts(value: js.Array[SendMessagePayload]): Self = this.set("parts", value.asInstanceOf[js.Any])
    @scala.inline
    def setRoomId(value: String): Self = this.set("roomId", value.asInstanceOf[js.Any])
  }
  
}

