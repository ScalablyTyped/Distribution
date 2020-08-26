package typings.pusherChatkitClient.messageMod

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.pusherChatkitClient.messageMod.InlinePayload
  - typings.pusherChatkitClient.messageMod.UrlPayload
  - typings.pusherChatkitClient.messageMod.AttachmentPayload
*/
trait MessagePayload extends js.Object

object MessagePayload {
  @scala.inline
  def InlinePayload(content: String, `type`: String): MessagePayload = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[MessagePayload]
  }
  @scala.inline
  def UrlPayload(`type`: String, url: String): MessagePayload = {
    val __obj = js.Dynamic.literal(url = url.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[MessagePayload]
  }
  @scala.inline
  def AttachmentPayload(
    name: String,
    size: Double,
    `type`: String,
    url: () => js.Promise[String],
    urlExpiry: () => js.Promise[Date]
  ): MessagePayload = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any], url = js.Any.fromFunction0(url), urlExpiry = js.Any.fromFunction0(urlExpiry))
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[MessagePayload]
  }
}

