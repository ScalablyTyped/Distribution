package typings.spotifyApi.SpotifyApi

import typings.spotifyApi.spotifyApiStrings.track
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Recommendation Track Object
  * Uses the same object structure as Full Track Object, but with `album.album_type` in caps.
  */
/* Inlined parent std.Omit<spotify-api.SpotifyApi.TrackObjectFull, 'album'> */
trait RecommendationTrackObject extends StObject {
  
  var album: RecommendationAlbumObject
  
  var artists: js.Array[ArtistObjectSimplified]
  
  var available_markets: js.UndefOr[js.Array[String]] = js.undefined
  
  var disc_number: Double
  
  var duration_ms: Double
  
  var explicit: Boolean
  
  var external_ids: ExternalIdObject
  
  var external_urls: ExternalUrlObject
  
  var href: String
  
  var id: String
  
  var is_local: js.UndefOr[Boolean] = js.undefined
  
  var is_playable: js.UndefOr[Boolean] = js.undefined
  
  var linked_from: js.UndefOr[TrackLinkObject] = js.undefined
  
  var name: String
  
  var popularity: Double
  
  var preview_url: js.UndefOr[String | Null] = js.undefined
  
  var restrictions: js.UndefOr[RestrictionsObject] = js.undefined
  
  var track_number: Double
  
  var `type`: track
  
  var uri: String
}
object RecommendationTrackObject {
  
  inline def apply(
    album: RecommendationAlbumObject,
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
  ): RecommendationTrackObject = {
    val __obj = js.Dynamic.literal(album = album.asInstanceOf[js.Any], artists = artists.asInstanceOf[js.Any], disc_number = disc_number.asInstanceOf[js.Any], duration_ms = duration_ms.asInstanceOf[js.Any], explicit = explicit.asInstanceOf[js.Any], external_ids = external_ids.asInstanceOf[js.Any], external_urls = external_urls.asInstanceOf[js.Any], href = href.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], popularity = popularity.asInstanceOf[js.Any], track_number = track_number.asInstanceOf[js.Any], uri = uri.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("track")
    __obj.asInstanceOf[RecommendationTrackObject]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RecommendationTrackObject] (val x: Self) extends AnyVal {
    
    inline def setAlbum(value: RecommendationAlbumObject): Self = StObject.set(x, "album", value.asInstanceOf[js.Any])
    
    inline def setArtists(value: js.Array[ArtistObjectSimplified]): Self = StObject.set(x, "artists", value.asInstanceOf[js.Any])
    
    inline def setArtistsVarargs(value: ArtistObjectSimplified*): Self = StObject.set(x, "artists", js.Array(value*))
    
    inline def setAvailable_markets(value: js.Array[String]): Self = StObject.set(x, "available_markets", value.asInstanceOf[js.Any])
    
    inline def setAvailable_marketsUndefined: Self = StObject.set(x, "available_markets", js.undefined)
    
    inline def setAvailable_marketsVarargs(value: String*): Self = StObject.set(x, "available_markets", js.Array(value*))
    
    inline def setDisc_number(value: Double): Self = StObject.set(x, "disc_number", value.asInstanceOf[js.Any])
    
    inline def setDuration_ms(value: Double): Self = StObject.set(x, "duration_ms", value.asInstanceOf[js.Any])
    
    inline def setExplicit(value: Boolean): Self = StObject.set(x, "explicit", value.asInstanceOf[js.Any])
    
    inline def setExternal_ids(value: ExternalIdObject): Self = StObject.set(x, "external_ids", value.asInstanceOf[js.Any])
    
    inline def setExternal_urls(value: ExternalUrlObject): Self = StObject.set(x, "external_urls", value.asInstanceOf[js.Any])
    
    inline def setHref(value: String): Self = StObject.set(x, "href", value.asInstanceOf[js.Any])
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIs_local(value: Boolean): Self = StObject.set(x, "is_local", value.asInstanceOf[js.Any])
    
    inline def setIs_localUndefined: Self = StObject.set(x, "is_local", js.undefined)
    
    inline def setIs_playable(value: Boolean): Self = StObject.set(x, "is_playable", value.asInstanceOf[js.Any])
    
    inline def setIs_playableUndefined: Self = StObject.set(x, "is_playable", js.undefined)
    
    inline def setLinked_from(value: TrackLinkObject): Self = StObject.set(x, "linked_from", value.asInstanceOf[js.Any])
    
    inline def setLinked_fromUndefined: Self = StObject.set(x, "linked_from", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setPopularity(value: Double): Self = StObject.set(x, "popularity", value.asInstanceOf[js.Any])
    
    inline def setPreview_url(value: String): Self = StObject.set(x, "preview_url", value.asInstanceOf[js.Any])
    
    inline def setPreview_urlNull: Self = StObject.set(x, "preview_url", null)
    
    inline def setPreview_urlUndefined: Self = StObject.set(x, "preview_url", js.undefined)
    
    inline def setRestrictions(value: RestrictionsObject): Self = StObject.set(x, "restrictions", value.asInstanceOf[js.Any])
    
    inline def setRestrictionsUndefined: Self = StObject.set(x, "restrictions", js.undefined)
    
    inline def setTrack_number(value: Double): Self = StObject.set(x, "track_number", value.asInstanceOf[js.Any])
    
    inline def setType(value: track): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setUri(value: String): Self = StObject.set(x, "uri", value.asInstanceOf[js.Any])
  }
}
