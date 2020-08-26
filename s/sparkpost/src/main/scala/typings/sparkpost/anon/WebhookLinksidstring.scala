package typings.sparkpost.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined sparkpost.sparkpost.WebhookLinks & {  id :string} */
@js.native
trait WebhookLinksidstring extends js.Object {
  var id: String = js.native
  var links: js.Array[Href] = js.native
}

object WebhookLinksidstring {
  @scala.inline
  def apply(id: String, links: js.Array[Href]): WebhookLinksidstring = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], links = links.asInstanceOf[js.Any])
    __obj.asInstanceOf[WebhookLinksidstring]
  }
  @scala.inline
  implicit class WebhookLinksidstringOps[Self <: WebhookLinksidstring] (val x: Self) extends AnyVal {
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
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def setLinksVarargs(value: Href*): Self = this.set("links", js.Array(value :_*))
    @scala.inline
    def setLinks(value: js.Array[Href]): Self = this.set("links", value.asInstanceOf[js.Any])
  }
  
}

