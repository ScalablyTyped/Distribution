package typings.spotifyApi.SpotifyApi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Category Object
  * [category object](https://developer.spotify.com/web-api/object-model/)
  */
@js.native
trait CategoryObject extends js.Object {
  var href: String = js.native
  var icons: js.Array[ImageObject] = js.native
  var id: String = js.native
  var name: String = js.native
}

object CategoryObject {
  @scala.inline
  def apply(href: String, icons: js.Array[ImageObject], id: String, name: String): CategoryObject = {
    val __obj = js.Dynamic.literal(href = href.asInstanceOf[js.Any], icons = icons.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[CategoryObject]
  }
  @scala.inline
  implicit class CategoryObjectOps[Self <: CategoryObject] (val x: Self) extends AnyVal {
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
    def setHref(value: String): Self = this.set("href", value.asInstanceOf[js.Any])
    @scala.inline
    def setIconsVarargs(value: ImageObject*): Self = this.set("icons", js.Array(value :_*))
    @scala.inline
    def setIcons(value: js.Array[ImageObject]): Self = this.set("icons", value.asInstanceOf[js.Any])
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
  }
  
}

