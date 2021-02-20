package typings.spotifyApi.SpotifyApi

import typings.spotifyApi.spotifyApiStrings.track
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Simplified Track Object
  * [track object (simplified)](https://developer.spotify.com/web-api/object-model/#track-object-simplified)
  */
@js.native
trait TrackObjectSimplified extends StObject {
  
  /**
    * The artists who performed the track.
    */
  var artists: js.Array[ArtistObjectSimplified] = js.native
  
  /**
    * A list of the countries in which the track can be played,
    * identified by their [ISO 3166-1 alpha-2 code](http://en.wikipedia.org/wiki/ISO_3166-1_alpha-2).
    */
  var available_markets: js.UndefOr[js.Array[String]] = js.native
  
  /**
    * The disc number (usually `1` unless the album consists of more than one disc).
    */
  var disc_number: Double = js.native
  
  /**
    * The track length in milliseconds.
    */
  var duration_ms: Double = js.native
  
  /**
    * Whether or not the track has explicit lyrics (`true` = yes it does; `false` = no it does not OR unknown).
    */
  var explicit: Boolean = js.native
  
  /**
    * Known external URLs for this track.
    */
  var external_urls: ExternalUrlObject = js.native
  
  /**
    * A link to the Web API endpoint providing full details of the track.
    */
  var href: String = js.native
  
  /**
    * The [Spotify ID](https://developer.spotify.com/documentation/web-api/#spotify-uris-and-ids) for the track.
    */
  var id: String = js.native
  
  /**
    * Part of the response when [Track Relinking](https://developer.spotify.com/documentation/general/guides/track-relinking-guide/) is applied.
    * If `true`, the track is playable in the given market. Otherwise, `false`.
    */
  var is_playable: js.UndefOr[Boolean] = js.native
  
  /**
    * Part of the response when [Track Relinking](https://developer.spotify.com/documentation/general/guides/track-relinking-guide/) is applied,
    * and the requested track has been replaced with different track.
    * The track in the `linked_from` object contains information about the originally requested track.
    */
  var linked_from: js.UndefOr[TrackLinkObject] = js.native
  
  /**
    * The name of the track.
    */
  var name: String = js.native
  
  /**
    * A link to a 30 second preview (MP3 format) of the track. Can be null
    */
  var preview_url: String | Null = js.native
  
  /**
    * Part of the response when [Track Relinking](https://developer.spotify.com/documentation/general/guides/track-relinking-guide/) is applied,
    * the original track is not available in the given market, and Spotify did not have any tracks to relink it with.
    * The track response will still contain metadata for the original track, and a restrictions object containing the reason
    * why the track is not available: `"restrictions" : {"reason" : "market"}`.
    */
  var restrictions: js.UndefOr[RestrictionsObject] = js.native
  
  /**
    * The number of the track. If an album has several discs, the track number is the number on the specified disc.
    */
  var track_number: Double = js.native
  
  /**
    * The object type: “track”.
    */
  var `type`: track = js.native
  
  /**
    * The [Spotify URI](https://developer.spotify.com/documentation/web-api/#spotify-uris-and-ids) for the track.
    */
  var uri: String = js.native
}
object TrackObjectSimplified {
  
  @scala.inline
  def apply(
    artists: js.Array[ArtistObjectSimplified],
    disc_number: Double,
    duration_ms: Double,
    explicit: Boolean,
    external_urls: ExternalUrlObject,
    href: String,
    id: String,
    name: String,
    track_number: Double,
    `type`: track,
    uri: String
  ): TrackObjectSimplified = {
    val __obj = js.Dynamic.literal(artists = artists.asInstanceOf[js.Any], disc_number = disc_number.asInstanceOf[js.Any], duration_ms = duration_ms.asInstanceOf[js.Any], explicit = explicit.asInstanceOf[js.Any], external_urls = external_urls.asInstanceOf[js.Any], href = href.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], track_number = track_number.asInstanceOf[js.Any], uri = uri.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[TrackObjectSimplified]
  }
  
  @scala.inline
  implicit class TrackObjectSimplifiedMutableBuilder[Self <: TrackObjectSimplified] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setArtists(value: js.Array[ArtistObjectSimplified]): Self = StObject.set(x, "artists", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setArtistsVarargs(value: ArtistObjectSimplified*): Self = StObject.set(x, "artists", js.Array(value :_*))
    
    @scala.inline
    def setAvailable_markets(value: js.Array[String]): Self = StObject.set(x, "available_markets", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAvailable_marketsUndefined: Self = StObject.set(x, "available_markets", js.undefined)
    
    @scala.inline
    def setAvailable_marketsVarargs(value: String*): Self = StObject.set(x, "available_markets", js.Array(value :_*))
    
    @scala.inline
    def setDisc_number(value: Double): Self = StObject.set(x, "disc_number", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDuration_ms(value: Double): Self = StObject.set(x, "duration_ms", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExplicit(value: Boolean): Self = StObject.set(x, "explicit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExternal_urls(value: ExternalUrlObject): Self = StObject.set(x, "external_urls", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHref(value: String): Self = StObject.set(x, "href", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIs_playable(value: Boolean): Self = StObject.set(x, "is_playable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIs_playableUndefined: Self = StObject.set(x, "is_playable", js.undefined)
    
    @scala.inline
    def setLinked_from(value: TrackLinkObject): Self = StObject.set(x, "linked_from", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLinked_fromUndefined: Self = StObject.set(x, "linked_from", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPreview_url(value: String): Self = StObject.set(x, "preview_url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPreview_urlNull: Self = StObject.set(x, "preview_url", null)
    
    @scala.inline
    def setRestrictions(value: RestrictionsObject): Self = StObject.set(x, "restrictions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRestrictionsUndefined: Self = StObject.set(x, "restrictions", js.undefined)
    
    @scala.inline
    def setTrack_number(value: Double): Self = StObject.set(x, "track_number", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: track): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUri(value: String): Self = StObject.set(x, "uri", value.asInstanceOf[js.Any])
  }
}
