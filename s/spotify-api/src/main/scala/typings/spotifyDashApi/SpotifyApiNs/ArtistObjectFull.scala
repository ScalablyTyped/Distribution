package typings.spotifyDashApi.SpotifyApiNs

import typings.spotifyDashApi.spotifyDashApiStrings.artist
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Full Artist Object
  * [artist object (full)](https://developer.spotify.com/web-api/object-model/)
  */
trait ArtistObjectFull extends ArtistObjectSimplified {
  var followers: FollowersObject
  var genres: js.Array[String]
  var images: js.Array[ImageObject]
  var popularity: Double
}

object ArtistObjectFull {
  @scala.inline
  def apply(
    external_urls: ExternalUrlObject,
    followers: FollowersObject,
    genres: js.Array[String],
    href: String,
    id: String,
    images: js.Array[ImageObject],
    name: String,
    popularity: Double,
    `type`: artist,
    uri: String
  ): ArtistObjectFull = {
    val __obj = js.Dynamic.literal(external_urls = external_urls, followers = followers, genres = genres, href = href, id = id, images = images, name = name, popularity = popularity, uri = uri)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[ArtistObjectFull]
  }
}

