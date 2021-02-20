package typings.spotifyApi.SpotifyApi

import typings.spotifyApi.spotifyApiStrings.track
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
  
  /**
    * The album on which the track appears.
    */
  var album: AlbumObjectSimplified = js.native
  
  /**
    * Known external IDs for the track.
    */
  var external_ids: ExternalIdObject = js.native
  
  /**
    * Whether or not the track is from a local file.
    */
  var is_local: js.UndefOr[Boolean] = js.native
  
  /**
    * The popularity of the track. The value will be between `0` and `100`, with `100` being the most popular.
    * The popularity of a track is a value between `0` and `100`, with `100` being the most popular.
    * The popularity is calculated by algorithm and is based, in the most part,
    * on the total number of plays the track has had and how recent those plays are.
    */
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
    track_number: Double,
    `type`: track,
    uri: String
  ): TrackObjectFull = {
    val __obj = js.Dynamic.literal(album = album.asInstanceOf[js.Any], artists = artists.asInstanceOf[js.Any], disc_number = disc_number.asInstanceOf[js.Any], duration_ms = duration_ms.asInstanceOf[js.Any], explicit = explicit.asInstanceOf[js.Any], external_ids = external_ids.asInstanceOf[js.Any], external_urls = external_urls.asInstanceOf[js.Any], href = href.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], popularity = popularity.asInstanceOf[js.Any], track_number = track_number.asInstanceOf[js.Any], uri = uri.asInstanceOf[js.Any])
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
    def setIs_local(value: Boolean): Self = StObject.set(x, "is_local", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIs_localUndefined: Self = StObject.set(x, "is_local", js.undefined)
    
    @scala.inline
    def setPopularity(value: Double): Self = StObject.set(x, "popularity", value.asInstanceOf[js.Any])
  }
}
