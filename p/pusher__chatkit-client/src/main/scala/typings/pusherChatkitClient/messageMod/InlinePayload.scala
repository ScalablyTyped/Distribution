package typings.pusherChatkitClient.messageMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InlinePayload
  extends MessagePayload
     with SendMessagePayload {
  var content: String
  var `type`: String
}

object InlinePayload {
  @scala.inline
  def apply(content: String, `type`: String): InlinePayload = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[InlinePayload]
  }
}

