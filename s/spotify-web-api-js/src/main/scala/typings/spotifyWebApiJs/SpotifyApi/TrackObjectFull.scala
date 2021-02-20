package typings.spotifyWebApiJs.SpotifyApi

import typings.spotifyWebApiJs.spotifyWebApiJsStrings.track
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Full Track Object
  * [track object (full)](https://developer.spotify.com/web-api/object-model/#track-object-full)
  */
@js.native
trait TrackObjectFull extends TrackObjectSimplified {
  
  var album: AlbumObjectSimplified = js.native
  
  var external_ids: ExternalIdObject = js.native
  
  var popularity: Double = js.native
}
object TrackObjectFull {
  
  @scala.inline
  def apply(
    album: AlbumObjectSimplified,
    artists: js.Array[ArtistObjectSimplified],
    disc_number: Double,
    duration_ms: Double,
    explicit: Boolean,
    external_ids: ExternalIdObject,
    external_urls: ExternalUrlObject,
    href: String,
    id: String,
    name: String,
    popularity: Double,
    preview_url: String,
    track_number: Double,
    `type`: track,
    uri: String
  ): TrackObjectFull = {
    val __obj = js.Dynamic.literal(album = album.asInstanceOf[js.Any], artists = artists.asInstanceOf[js.Any], disc_number = disc_number.asInstanceOf[js.Any], duration_ms = duration_ms.asInstanceOf[js.Any], explicit = explicit.asInstanceOf[js.Any], external_ids = external_ids.asInstanceOf[js.Any], external_urls = external_urls.asInstanceOf[js.Any], href = href.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], popularity = popularity.asInstanceOf[js.Any], preview_url = preview_url.asInstanceOf[js.Any], track_number = track_number.asInstanceOf[js.Any], uri = uri.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[TrackObjectFull]
  }
  
  @scala.inline
  implicit class TrackObjectFullMutableBuilder[Self <: TrackObjectFull] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAlbum(value: AlbumObjectSimplified): Self = StObject.set(x, "album", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExternal_ids(value: ExternalIdObject): Self = StObject.set(x, "external_ids", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPopularity(value: Double): Self = StObject.set(x, "popularity", value.asInstanceOf[js.Any])
  }
}
