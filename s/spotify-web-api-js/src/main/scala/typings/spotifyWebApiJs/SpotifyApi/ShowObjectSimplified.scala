package typings.spotifyWebApiJs.SpotifyApi

import typings.spotifyWebApiJs.spotifyWebApiJsStrings.show
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Simplified Show Object
  * [show object (simplified)](https://developer.spotify.com/documentation/web-api/reference/object-model/#show-object-simplified)
  */
trait ShowObjectSimplified extends js.Object {
  var available_markets: js.UndefOr[js.Array[String]] = js.undefined
  var copyrights: js.Array[CopyrightObject]
  var description: String
  var explicit: Boolean
  var external_urls: ExternalUrlObject
  var href: String
  var id: String
  var images: js.Array[ImageObject]
  var is_externally_hosted: Boolean
  var languages: js.Array[String]
  var media_type: String
  var name: String
  var publisher: String
  var `type`: show
  var uri: String
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
    uri: String,
    available_markets: js.Array[String] = null
  ): ShowObjectSimplified = {
    val __obj = js.Dynamic.literal(copyrights = copyrights.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], explicit = explicit.asInstanceOf[js.Any], external_urls = external_urls.asInstanceOf[js.Any], href = href.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], images = images.asInstanceOf[js.Any], is_externally_hosted = is_externally_hosted.asInstanceOf[js.Any], languages = languages.asInstanceOf[js.Any], media_type = media_type.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], publisher = publisher.asInstanceOf[js.Any], uri = uri.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (available_markets != null) __obj.updateDynamic("available_markets")(available_markets.asInstanceOf[js.Any])
    __obj.asInstanceOf[ShowObjectSimplified]
  }
}

