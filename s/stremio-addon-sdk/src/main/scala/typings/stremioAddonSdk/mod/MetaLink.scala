package typings.stremioAddonSdk.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MetaLink extends js.Object {
  /**
    * Any unique category name, links are grouped based on their category.
    *
    * Some recommended categories are: actor, director, writer,
    * while the following categories are reserved and should not be used: imdb, share, similar.
    */
  var category: String = js.native
  /**
    * Human readable name for the link.
    */
  var name: String = js.native
  /**
    * An external URL or Meta Link.
    */
  var url: String = js.native
}

object MetaLink {
  @scala.inline
  def apply(category: String, name: String, url: String): MetaLink = {
    val __obj = js.Dynamic.literal(category = category.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[MetaLink]
  }
  @scala.inline
  implicit class MetaLinkOps[Self <: MetaLink] (val x: Self) extends AnyVal {
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
    def setCategory(value: String): Self = this.set("category", value.asInstanceOf[js.Any])
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def setUrl(value: String): Self = this.set("url", value.asInstanceOf[js.Any])
  }
  
}

