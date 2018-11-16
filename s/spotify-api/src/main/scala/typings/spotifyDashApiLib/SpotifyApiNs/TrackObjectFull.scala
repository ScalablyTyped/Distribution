package typings
package spotifyDashApiLib.SpotifyApiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
     * Full Track Object
     * [track object (full)](https://developer.spotify.com/web-api/object-model/#track-object-full)
     */

trait TrackObjectFull extends TrackObjectSimplified {
  var album: AlbumObjectSimplified
  var external_ids: ExternalIdObject
  var popularity: scala.Double
}

