package typings.sparkpost.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined sparkpost.sparkpost.WebhookLinks & {  id  :string} */
trait WebhookLinksidstring extends js.Object {
  var id: String
  var links: js.Array[Href]
}

object WebhookLinksidstring {
  @scala.inline
  def apply(id: String, links: js.Array[Href]): WebhookLinksidstring = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], links = links.asInstanceOf[js.Any])
    __obj.asInstanceOf[WebhookLinksidstring]
  }
}

