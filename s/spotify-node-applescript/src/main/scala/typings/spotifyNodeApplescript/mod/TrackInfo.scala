package typings.spotifyNodeApplescript.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TrackInfo extends js.Object {
  
  var album: String = js.native
  
  var album_artist: String = js.native
  
  var artist: String = js.native
  
  var artwork_url: String = js.native
  
  var disc_number: Double = js.native
  
  var duration: Double = js.native
  
  var id: String = js.native
  
  var name: String = js.native
  
  var played_count: Double = js.native
  
  var popularity: Double = js.native
  
  var spotify_url: String = js.native
  
  var starred: Boolean = js.native
  
  var track_number: Double = js.native
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
  
  @scala.inline
  implicit class TrackInfoOps[Self <: TrackInfo] (val x: Self) extends AnyVal {
    
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
    def setAlbum(value: String): Self = this.set("album", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAlbum_artist(value: String): Self = this.set("album_artist", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setArtist(value: String): Self = this.set("artist", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setArtwork_url(value: String): Self = this.set("artwork_url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisc_number(value: Double): Self = this.set("disc_number", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDuration(value: Double): Self = this.set("duration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPlayed_count(value: Double): Self = this.set("played_count", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPopularity(value: Double): Self = this.set("popularity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSpotify_url(value: String): Self = this.set("spotify_url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStarred(value: Boolean): Self = this.set("starred", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTrack_number(value: Double): Self = this.set("track_number", value.asInstanceOf[js.Any])
  }
}
