package typings.pusherChatkitClient.messageMod

import typings.std.Blob
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.pusherChatkitClient.messageMod.InlinePayload
  - typings.pusherChatkitClient.messageMod.UrlPayload
  - typings.pusherChatkitClient.messageMod.FilePayload
*/
trait SendMessagePayload extends js.Object

object SendMessagePayload {
  @scala.inline
  def InlinePayload(content: String, `type`: String): SendMessagePayload = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[SendMessagePayload]
  }
  @scala.inline
  def UrlPayload(`type`: String, url: String): SendMessagePayload = {
    val __obj = js.Dynamic.literal(url = url.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[SendMessagePayload]
  }
  @scala.inline
  def FilePayload(file: Blob): SendMessagePayload = {
    val __obj = js.Dynamic.literal(file = file.asInstanceOf[js.Any])
    __obj.asInstanceOf[SendMessagePayload]
  }
}

