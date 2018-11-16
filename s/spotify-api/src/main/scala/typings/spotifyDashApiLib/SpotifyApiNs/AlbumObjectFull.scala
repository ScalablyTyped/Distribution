package typings
package spotifyDashApiLib.SpotifyApiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

//
// Objects from the Object Models of the Spotify Web Api, ordered alphabetically.
// [Object Model](https://developer.spotify.com/web-api/object-model)
//
/**
     * Full Album Object
     * [album object (full)](https://developer.spotify.com/web-api/object-model/#album-object-simplified)
     */

trait AlbumObjectFull extends AlbumObjectSimplified {
  var artists: js.Array[ArtistObjectSimplified]
  var copyrights: js.Array[CopyrightObject]
  var external_ids: ExternalIdObject
  var genres: js.Array[java.lang.String]
  var popularity: scala.Double
  var release_date: java.lang.String
  var release_date_precision: java.lang.String
  var tracks: PagingObject[TrackObjectSimplified]
}

