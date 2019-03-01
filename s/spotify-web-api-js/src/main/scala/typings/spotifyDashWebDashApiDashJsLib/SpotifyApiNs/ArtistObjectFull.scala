package typings
package spotifyDashWebDashApiDashJsLib.SpotifyApiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Full Artist Object
  * [artist object (full)](https://developer.spotify.com/web-api/object-model/)
  */
trait ArtistObjectFull extends ArtistObjectSimplified {
  var followers: FollowersObject
  var genres: js.Array[java.lang.String]
  var images: js.Array[ImageObject]
  var popularity: scala.Double
}

object ArtistObjectFull {
  @scala.inline
  def apply(
    external_urls: ExternalUrlObject,
    followers: FollowersObject,
    genres: js.Array[java.lang.String],
    href: java.lang.String,
    id: java.lang.String,
    images: js.Array[ImageObject],
    name: java.lang.String,
    popularity: scala.Double,
    `type`: spotifyDashWebDashApiDashJsLib.spotifyDashWebDashApiDashJsLibStrings.artist,
    uri: java.lang.String
  ): ArtistObjectFull = {
    val __obj = js.Dynamic.literal(`type` = `type`)
    __obj.updateDynamic("external_urls")(external_urls)
    __obj.updateDynamic("followers")(followers)
    __obj.updateDynamic("genres")(genres)
    __obj.updateDynamic("href")(href)
    __obj.updateDynamic("id")(id)
    __obj.updateDynamic("images")(images)
    __obj.updateDynamic("name")(name)
    __obj.updateDynamic("popularity")(popularity)
    __obj.updateDynamic("uri")(uri)
    __obj.asInstanceOf[ArtistObjectFull]
  }
}

