package typings.spotifyWebApiJs.SpotifyApi

import typings.spotifyWebApiJs.spotifyWebApiJsStrings.track
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Simplified Track Object
  * [track object (simplified)](https://developer.spotify.com/web-api/object-model/#track-object-simplified)
  */
@js.native
trait TrackObjectSimplified extends js.Object {
  
  var artists: js.Array[ArtistObjectSimplified] = js.native
  
  var available_markets: js.UndefOr[js.Array[String]] = js.native
  
  var disc_number: Double = js.native
  
  var duration_ms: Double = js.native
  
  var explicit: Boolean = js.native
  
  var external_urls: ExternalUrlObject = js.native
  
  var href: String = js.native
  
  var id: String = js.native
  
  var is_playable: js.UndefOr[Boolean] = js.native
  
  var linked_from: js.UndefOr[TrackLinkObject] = js.native
  
  var name: String = js.native
  
  var preview_url: String = js.native
  
  var track_number: Double = js.native
  
  var `type`: track = js.native
  
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
    preview_url: String,
    track_number: Double,
    `type`: track,
    uri: String
  ): TrackObjectSimplified = {
    val __obj = js.Dynamic.literal(artists = artists.asInstanceOf[js.Any], disc_number = disc_number.asInstanceOf[js.Any], duration_ms = duration_ms.asInstanceOf[js.Any], explicit = explicit.asInstanceOf[js.Any], external_urls = external_urls.asInstanceOf[js.Any], href = href.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], preview_url = preview_url.asInstanceOf[js.Any], track_number = track_number.asInstanceOf[js.Any], uri = uri.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[TrackObjectSimplified]
  }
  
  @scala.inline
  implicit class TrackObjectSimplifiedOps[Self <: TrackObjectSimplified] (val x: Self) extends AnyVal {
    
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
    def setArtistsVarargs(value: ArtistObjectSimplified*): Self = this.set("artists", js.Array(value :_*))
    
    @scala.inline
    def setArtists(value: js.Array[ArtistObjectSimplified]): Self = this.set("artists", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisc_number(value: Double): Self = this.set("disc_number", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDuration_ms(value: Double): Self = this.set("duration_ms", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExplicit(value: Boolean): Self = this.set("explicit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExternal_urls(value: ExternalUrlObject): Self = this.set("external_urls", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHref(value: String): Self = this.set("href", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPreview_url(value: String): Self = this.set("preview_url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTrack_number(value: Double): Self = this.set("track_number", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: track): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUri(value: String): Self = this.set("uri", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAvailable_marketsVarargs(value: String*): Self = this.set("available_markets", js.Array(value :_*))
    
    @scala.inline
    def setAvailable_markets(value: js.Array[String]): Self = this.set("available_markets", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAvailable_markets: Self = this.set("available_markets", js.undefined)
    
    @scala.inline
    def setIs_playable(value: Boolean): Self = this.set("is_playable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIs_playable: Self = this.set("is_playable", js.undefined)
    
    @scala.inline
    def setLinked_from(value: TrackLinkObject): Self = this.set("linked_from", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLinked_from: Self = this.set("linked_from", js.undefined)
  }
}
