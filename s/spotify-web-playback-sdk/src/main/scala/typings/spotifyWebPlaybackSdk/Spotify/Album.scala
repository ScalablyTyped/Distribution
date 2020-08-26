package typings.spotifyWebPlaybackSdk.Spotify

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Album extends js.Object {
  var images: js.Array[Image] = js.native
  var name: String = js.native
  var uri: String = js.native
}

object Album {
  @scala.inline
  def apply(images: js.Array[Image], name: String, uri: String): Album = {
    val __obj = js.Dynamic.literal(images = images.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], uri = uri.asInstanceOf[js.Any])
    __obj.asInstanceOf[Album]
  }
  @scala.inline
  implicit class AlbumOps[Self <: Album] (val x: Self) extends AnyVal {
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
    def setImagesVarargs(value: Image*): Self = this.set("images", js.Array(value :_*))
    @scala.inline
    def setImages(value: js.Array[Image]): Self = this.set("images", value.asInstanceOf[js.Any])
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def setUri(value: String): Self = this.set("uri", value.asInstanceOf[js.Any])
  }
  
}

