package typings.spotifyApi.SpotifyApi

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Episode Object
  * [episode object](https://developer.spotify.com/documentation/web-api/reference/#object-episodeobject)
  */
trait EpisodeObject
  extends StObject
     with EpisodeObjectSimplified {
  
  /**
    * The show on which the episode belongs.
    */
  var show: ShowObjectSimplified
}
object EpisodeObject {
  
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
    show: ShowObjectSimplified,
    uri: String
  ): EpisodeObject = {
    val __obj = js.Dynamic.literal(description = description.asInstanceOf[js.Any], duration_ms = duration_ms.asInstanceOf[js.Any], explicit = explicit.asInstanceOf[js.Any], external_urls = external_urls.asInstanceOf[js.Any], href = href.asInstanceOf[js.Any], html_description = html_description.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], images = images.asInstanceOf[js.Any], is_externally_hosted = is_externally_hosted.asInstanceOf[js.Any], is_playable = is_playable.asInstanceOf[js.Any], language = language.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], release_date = release_date.asInstanceOf[js.Any], release_date_precision = release_date_precision.asInstanceOf[js.Any], show = show.asInstanceOf[js.Any], uri = uri.asInstanceOf[js.Any], audio_preview_url = null)
    __obj.updateDynamic("type")("episode")
    __obj.asInstanceOf[EpisodeObject]
  }
  
  extension [Self <: EpisodeObject](x: Self) {
    
    inline def setShow(value: ShowObjectSimplified): Self = StObject.set(x, "show", value.asInstanceOf[js.Any])
  }
}
