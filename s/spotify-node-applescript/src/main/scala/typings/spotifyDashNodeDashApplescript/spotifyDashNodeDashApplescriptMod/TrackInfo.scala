package typings.spotifyDashNodeDashApplescript.spotifyDashNodeDashApplescriptMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TrackInfo extends js.Object {
  var album: String
  var album_artist: String
  var artist: String
  var artwork_url: String
  var disc_number: Double
  var duration: Double
  var id: String
  var name: String
  var played_count: Double
  var popularity: Double
  var spotify_url: String
  var starred: Boolean
  var track_number: Double
}

object TrackInfo {
  @scala.inline
  def apply(
    album: String,
    album_artist: String,
    artist: String,
    artwork_url: String,
    disc_number: Double,
    duration: Double,
    id: String,
    name: String,
    played_count: Double,
    popularity: Double,
    spotify_url: String,
    starred: Boolean,
    track_number: Double
  ): TrackInfo = {
    val __obj = js.Dynamic.literal(album = album.asInstanceOf[js.Any], album_artist = album_artist.asInstanceOf[js.Any], artist = artist.asInstanceOf[js.Any], artwork_url = artwork_url.asInstanceOf[js.Any], disc_number = disc_number.asInstanceOf[js.Any], duration = duration.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], played_count = played_count.asInstanceOf[js.Any], popularity = popularity.asInstanceOf[js.Any], spotify_url = spotify_url.asInstanceOf[js.Any], starred = starred.asInstanceOf[js.Any], track_number = track_number.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[TrackInfo]
  }
}

