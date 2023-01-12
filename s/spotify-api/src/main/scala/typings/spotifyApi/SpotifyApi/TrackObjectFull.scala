package typings.spotifyApi.SpotifyApi

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Full Track Object
  * [track object (full)](https://developer.spotify.com/web-api/object-model/#track-object-full)
  */
trait TrackObjectFull
  extends StObject
     with TrackObjectSimplified {
  
  /**
    * The album on which the track appears.
    */
  var album: AlbumObjectSimplified
  
  /**
    * Known external IDs for the track.
    */
  var external_ids: ExternalIdObject
  
  /**
    * Whether or not the track is from a local file.
    */
  var is_local: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The popularity of the track. The value will be between `0` and `100`, with `100` being the most popular.
    * The popularity of a track is a value between `0` and `100`, with `100` being the most popular.
    * The popularity is calculated by algorithm and is based, in the most part,
    * on the total number of plays the track has had and how recent those plays are.
    */
  var popularity: Double
}
object TrackObjectFull {
  
  inline def apply(
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
    uri: String
  ): TrackObjectFull = {
    val __obj = js.Dynamic.literal(album = album.asInstanceOf[js.Any], artists = artists.asInstanceOf[js.Any], disc_number = disc_number.asInstanceOf[js.Any], duration_ms = duration_ms.asInstanceOf[js.Any], explicit = explicit.asInstanceOf[js.Any], external_ids = external_ids.asInstanceOf[js.Any], external_urls = external_urls.asInstanceOf[js.Any], href = href.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], popularity = popularity.asInstanceOf[js.Any], track_number = track_number.asInstanceOf[js.Any], uri = uri.asInstanceOf[js.Any], preview_url = null)
    __obj.updateDynamic("type")("track")
    __obj.asInstanceOf[TrackObjectFull]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TrackObjectFull] (val x: Self) extends AnyVal {
    
    inline def setAlbum(value: AlbumObjectSimplified): Self = StObject.set(x, "album", value.asInstanceOf[js.Any])
    
    inline def setExternal_ids(value: ExternalIdObject): Self = StObject.set(x, "external_ids", value.asInstanceOf[js.Any])
    
    inline def setIs_local(value: Boolean): Self = StObject.set(x, "is_local", value.asInstanceOf[js.Any])
    
    inline def setIs_localUndefined: Self = StObject.set(x, "is_local", js.undefined)
    
    inline def setPopularity(value: Double): Self = StObject.set(x, "popularity", value.asInstanceOf[js.Any])
  }
}
