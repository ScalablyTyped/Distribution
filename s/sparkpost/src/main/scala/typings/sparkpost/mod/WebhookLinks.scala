package typings.sparkpost.mod

import typings.sparkpost.AnonHref
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WebhookLinks extends js.Object {
  var links: js.Array[AnonHref]
}

object WebhookLinks {
  @scala.inline
  def apply(links: js.Array[AnonHref]): WebhookLinks = {
    val __obj = js.Dynamic.literal(links = links.asInstanceOf[js.Any])
    __obj.asInstanceOf[WebhookLinks]
  }
}

