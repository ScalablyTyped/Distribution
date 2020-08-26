package typings.spotifyWebApiJs.SpotifyApi

import typings.spotifyWebApiJs.spotifyWebApiJsStrings.show
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Simplified Show Object
  * [show object (simplified)](https://developer.spotify.com/documentation/web-api/reference/object-model/#show-object-simplified)
  */
@js.native
trait ShowObjectSimplified extends js.Object {
  var available_markets: js.UndefOr[js.Array[String]] = js.native
  var copyrights: js.Array[CopyrightObject] = js.native
  var description: String = js.native
  var explicit: Boolean = js.native
  var external_urls: ExternalUrlObject = js.native
  var href: String = js.native
  var id: String = js.native
  var images: js.Array[ImageObject] = js.native
  var is_externally_hosted: Boolean = js.native
  var languages: js.Array[String] = js.native
  var media_type: String = js.native
  var name: String = js.native
  var publisher: String = js.native
  var `type`: show = js.native
  var uri: String = js.native
}

object ShowObjectSimplified {
  @scala.inline
  def apply(
    copyrights: js.Array[CopyrightObject],
    description: String,
    explicit: Boolean,
    external_urls: ExternalUrlObject,
    href: String,
    id: String,
    images: js.Array[ImageObject],
    is_externally_hosted: Boolean,
    languages: js.Array[String],
    media_type: String,
    name: String,
    publisher: String,
    `type`: show,
    uri: String
  ): ShowObjectSimplified = {
    val __obj = js.Dynamic.literal(copyrights = copyrights.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], explicit = explicit.asInstanceOf[js.Any], external_urls = external_urls.asInstanceOf[js.Any], href = href.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], images = images.asInstanceOf[js.Any], is_externally_hosted = is_externally_hosted.asInstanceOf[js.Any], languages = languages.asInstanceOf[js.Any], media_type = media_type.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], publisher = publisher.asInstanceOf[js.Any], uri = uri.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ShowObjectSimplified]
  }
  @scala.inline
  implicit class ShowObjectSimplifiedOps[Self <: ShowObjectSimplified] (val x: Self) extends AnyVal {
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
    def setCopyrightsVarargs(value: CopyrightObject*): Self = this.set("copyrights", js.Array(value :_*))
    @scala.inline
    def setCopyrights(value: js.Array[CopyrightObject]): Self = this.set("copyrights", value.asInstanceOf[js.Any])
    @scala.inline
    def setDescription(value: String): Self = this.set("description", value.asInstanceOf[js.Any])
    @scala.inline
    def setExplicit(value: Boolean): Self = this.set("explicit", value.asInstanceOf[js.Any])
    @scala.inline
    def setExternal_urls(value: ExternalUrlObject): Self = this.set("external_urls", value.asInstanceOf[js.Any])
    @scala.inline
    def setHref(value: String): Self = this.set("href", value.asInstanceOf[js.Any])
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def setImagesVarargs(value: ImageObject*): Self = this.set("images", js.Array(value :_*))
    @scala.inline
    def setImages(value: js.Array[ImageObject]): Self = this.set("images", value.asInstanceOf[js.Any])
    @scala.inline
    def setIs_externally_hosted(value: Boolean): Self = this.set("is_externally_hosted", value.asInstanceOf[js.Any])
    @scala.inline
    def setLanguagesVarargs(value: String*): Self = this.set("languages", js.Array(value :_*))
    @scala.inline
    def setLanguages(value: js.Array[String]): Self = this.set("languages", value.asInstanceOf[js.Any])
    @scala.inline
    def setMedia_type(value: String): Self = this.set("media_type", value.asInstanceOf[js.Any])
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def setPublisher(value: String): Self = this.set("publisher", value.asInstanceOf[js.Any])
    @scala.inline
    def setType(value: show): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def setUri(value: String): Self = this.set("uri", value.asInstanceOf[js.Any])
    @scala.inline
    def setAvailable_marketsVarargs(value: String*): Self = this.set("available_markets", js.Array(value :_*))
    @scala.inline
    def setAvailable_markets(value: js.Array[String]): Self = this.set("available_markets", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAvailable_markets: Self = this.set("available_markets", js.undefined)
  }
  
}

