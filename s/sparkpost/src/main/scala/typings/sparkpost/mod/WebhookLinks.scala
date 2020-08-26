package typings.sparkpost.mod

import typings.sparkpost.anon.Href
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WebhookLinks extends js.Object {
  var links: js.Array[Href] = js.native
}

object WebhookLinks {
  @scala.inline
  def apply(links: js.Array[Href]): WebhookLinks = {
    val __obj = js.Dynamic.literal(links = links.asInstanceOf[js.Any])
    __obj.asInstanceOf[WebhookLinks]
  }
  @scala.inline
  implicit class WebhookLinksOps[Self <: WebhookLinks] (val x: Self) extends AnyVal {
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
    def setLinksVarargs(value: Href*): Self = this.set("links", js.Array(value :_*))
    @scala.inline
    def setLinks(value: js.Array[Href]): Self = this.set("links", value.asInstanceOf[js.Any])
  }
  
}

