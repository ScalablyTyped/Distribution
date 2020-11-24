package typings.spotifyWebApiJs.SpotifyApi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Search for a track
  *
  * GET /v1/search?type=track
  * https://developer.spotify.com/web-api/search-item/
  */
@js.native
trait TrackSearchResponse extends js.Object {
  
  var tracks: PagingObject[TrackObjectFull] = js.native
}
object TrackSearchResponse {
  
  @scala.inline
  def apply(tracks: PagingObject[TrackObjectFull]): TrackSearchResponse = {
    val __obj = js.Dynamic.literal(tracks = tracks.asInstanceOf[js.Any])
    __obj.asInstanceOf[TrackSearchResponse]
  }
  
  @scala.inline
  implicit class TrackSearchResponseOps[Self <: TrackSearchResponse] (val x: Self) extends AnyVal {
    
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
    def setTracks(value: PagingObject[TrackObjectFull]): Self = this.set("tracks", value.asInstanceOf[js.Any])
  }
}
