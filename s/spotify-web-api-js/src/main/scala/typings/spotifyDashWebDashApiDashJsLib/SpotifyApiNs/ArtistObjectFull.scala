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

