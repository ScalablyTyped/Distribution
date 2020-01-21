package typings.spotifyApi.SpotifyApi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Context Object
  * [](https://developer.spotify.com/web-api/object-model/#context-object)
  */
trait ContextObject extends js.Object {
  var external_urls: ExternalUrlObject | Null
  var href: String | Null
  var `type`: ContextObjectType
  var uri: String
}

object ContextObject {
  @scala.inline
  def apply(
    `type`: ContextObjectType,
    uri: String,
    external_urls: ExternalUrlObject = null,
    href: String = null
  ): ContextObject = {
    val __obj = js.Dynamic.literal(uri = uri.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (external_urls != null) __obj.updateDynamic("external_urls")(external_urls.asInstanceOf[js.Any])
    if (href != null) __obj.updateDynamic("href")(href.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContextObject]
  }
}

