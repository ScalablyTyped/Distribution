package typings.sparkpost.sparkpostMod

import typings.sparkpost.Anon_Href
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WebhookLinks extends js.Object {
  var links: js.Array[Anon_Href]
}

object WebhookLinks {
  @scala.inline
  def apply(links: js.Array[Anon_Href]): WebhookLinks = {
    val __obj = js.Dynamic.literal(links = links)
  
    __obj.asInstanceOf[WebhookLinks]
  }
}

