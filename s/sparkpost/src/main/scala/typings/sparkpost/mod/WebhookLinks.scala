package typings.sparkpost.mod

import typings.sparkpost.anon.Href
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WebhookLinks extends js.Object {
  var links: js.Array[Href]
}

object WebhookLinks {
  @scala.inline
  def apply(links: js.Array[Href]): WebhookLinks = {
    val __obj = js.Dynamic.literal(links = links.asInstanceOf[js.Any])
    __obj.asInstanceOf[WebhookLinks]
  }
}

