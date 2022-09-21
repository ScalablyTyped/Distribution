package typings.spotifyApi.SpotifyApi

import typings.spotifyApi.spotifyApiStrings.episode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Simplified Episode Object
  * [episode object (simplified)](https://developer.spotify.com/documentation/web-api/reference/object-model/#episode-object-simplified)
  */
trait EpisodeObjectSimplified
  extends StObject
     with ContextObject {
  
  /**
    * A URL to a 30 second preview (MP3 format) of the episode. null if not available.
    */
  var audio_preview_url: String | Null
  
  /**
    * A description of the episode.
    */
  var description: String
  
  /**
    * The episode length in milliseconds.
    */
  var duration_ms: Double
  
  /**
    * Whether or not the episode has explicit content (true = yes it does; false = no it does not OR unknown).
    */
  var explicit: Boolean
  
  /**
    * A description of the episode. This field may contain HTML tags.
    */
  var html_description: String
  
  /**
    * The [Spotify ID](https://developer.spotify.com/documentation/web-api/#spotify-uris-and-ids) for the episode.
    */
  var id: String
  
  /**
    * The cover art for the episode in various sizes, widest first.
    */
  var images: js.Array[ImageObject]
  
  /**
    * True if the episode is hosted outside of Spotify’s CDN.
    */
  var is_externally_hosted: Boolean
  
  /**
    * True if the episode is playable in the given market. Otherwise false.
    */
  var is_playable: Boolean
  
  /**
    * The language used in the episode, identified by a [ISO 639](https://en.wikipedia.org/wiki/ISO_639) code.
    * @deprecated Note: This field is deprecated and might be removed in the future. Please use the languages field instead.
    */
  var language: String
  
  /**
    * A list of the languages used in the episode, identified by their [ISO 639](https://en.wikipedia.org/wiki/ISO_639) code.
    * Optional because sometimes only the deprecated language field is set and this one isn't set at all.
    */
  var languages: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
    * The name of the episode.
    */
  var name: String
  
  /**
    * The date the episode was first released, for example "1981-12-15". Depending on the precision, it might be shown as "1981" or "1981-12".
    */
  var release_date: String
  
  /**
    * The precision with which release_date value is known: "year", "month", or "day".
    */
  var release_date_precision: String
  
  /**
    * The user’s most recent position in the episode. Set if the supplied access token is a user token and has the scope user-read-playback-position.
    */
  var resume_point: js.UndefOr[ResumePointObject] = js.undefined
  
  @JSName("type")
  var type_EpisodeObjectSimplified: episode
}
object EpisodeObjectSimplified {
  
  inline def apply(
    description: String,
    duration_ms: Double,
    explicit: Boolean,
    external_urls: ExternalUrlObject,
    href: String,
    html_description: String,
    id: String,
    images: js.Array[ImageObject],
    is_externally_hosted: Boolean,
    is_playable: Boolean,
    language: String,
    name: String,
    release_date: String,
    release_date_precision: String,
    uri: String
  ): EpisodeObjectSimplified = {
    val __obj = js.Dynamic.literal(description = description.asInstanceOf[js.Any], duration_ms = duration_ms.asInstanceOf[js.Any], explicit = explicit.asInstanceOf[js.Any], external_urls = external_urls.asInstanceOf[js.Any], href = href.asInstanceOf[js.Any], html_description = html_description.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], images = images.asInstanceOf[js.Any], is_externally_hosted = is_externally_hosted.asInstanceOf[js.Any], is_playable = is_playable.asInstanceOf[js.Any], language = language.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], release_date = release_date.asInstanceOf[js.Any], release_date_precision = release_date_precision.asInstanceOf[js.Any], uri = uri.asInstanceOf[js.Any], audio_preview_url = null)
    __obj.updateDynamic("type")("episode")
    __obj.asInstanceOf[EpisodeObjectSimplified]
  }
  
  extension [Self <: EpisodeObjectSimplified](x: Self) {
    
    inline def setAudio_preview_url(value: String): Self = StObject.set(x, "audio_preview_url", value.asInstanceOf[js.Any])
    
    inline def setAudio_preview_urlNull: Self = StObject.set(x, "audio_preview_url", null)
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDuration_ms(value: Double): Self = StObject.set(x, "duration_ms", value.asInstanceOf[js.Any])
    
    inline def setExplicit(value: Boolean): Self = StObject.set(x, "explicit", value.asInstanceOf[js.Any])
    
    inline def setHtml_description(value: String): Self = StObject.set(x, "html_description", value.asInstanceOf[js.Any])
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setImages(value: js.Array[ImageObject]): Self = StObject.set(x, "images", value.asInstanceOf[js.Any])
    
    inline def setImagesVarargs(value: ImageObject*): Self = StObject.set(x, "images", js.Array(value*))
    
    inline def setIs_externally_hosted(value: Boolean): Self = StObject.set(x, "is_externally_hosted", value.asInstanceOf[js.Any])
    
    inline def setIs_playable(value: Boolean): Self = StObject.set(x, "is_playable", value.asInstanceOf[js.Any])
    
    inline def setLanguage(value: String): Self = StObject.set(x, "language", value.asInstanceOf[js.Any])
    
    inline def setLanguages(value: js.Array[String]): Self = StObject.set(x, "languages", value.asInstanceOf[js.Any])
    
    inline def setLanguagesUndefined: Self = StObject.set(x, "languages", js.undefined)
    
    inline def setLanguagesVarargs(value: String*): Self = StObject.set(x, "languages", js.Array(value*))
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setRelease_date(value: String): Self = StObject.set(x, "release_date", value.asInstanceOf[js.Any])
    
    inline def setRelease_date_precision(value: String): Self = StObject.set(x, "release_date_precision", value.asInstanceOf[js.Any])
    
    inline def setResume_point(value: ResumePointObject): Self = StObject.set(x, "resume_point", value.asInstanceOf[js.Any])
    
    inline def setResume_pointUndefined: Self = StObject.set(x, "resume_point", js.undefined)
    
    inline def setType(value: episode): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
