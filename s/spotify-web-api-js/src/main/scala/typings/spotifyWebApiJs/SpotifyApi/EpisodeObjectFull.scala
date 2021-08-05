package typings.spotifyWebApiJs.SpotifyApi

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Full Episode Object
  * [episode object (full)](https://developer.spotify.com/documentation/web-api/reference/object-model/#episode-object-full)
  */
trait EpisodeObjectFull
  extends StObject
     with EpisodeObjectSimplified {
  
  var show: ShowObjectSimplified
}
object EpisodeObjectFull {
  
  inline def apply(
    description: String,
    duration_ms: Double,
    explicit: Boolean,
    external_urls: ExternalUrlObject,
    href: String,
    id: String,
    images: js.Array[ImageObject],
    is_externally_hosted: Boolean,
    is_playable: Boolean,
    languages: js.Array[String],
    name: String,
    release_date: String,
    release_date_precision: String,
    resume_point: ResumePointObject,
    show: ShowObjectSimplified,
    uri: String
  ): EpisodeObjectFull = {
    val __obj = js.Dynamic.literal(description = description.asInstanceOf[js.Any], duration_ms = duration_ms.asInstanceOf[js.Any], explicit = explicit.asInstanceOf[js.Any], external_urls = external_urls.asInstanceOf[js.Any], href = href.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], images = images.asInstanceOf[js.Any], is_externally_hosted = is_externally_hosted.asInstanceOf[js.Any], is_playable = is_playable.asInstanceOf[js.Any], languages = languages.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], release_date = release_date.asInstanceOf[js.Any], release_date_precision = release_date_precision.asInstanceOf[js.Any], resume_point = resume_point.asInstanceOf[js.Any], show = show.asInstanceOf[js.Any], uri = uri.asInstanceOf[js.Any], audio_preview_url = null)
    __obj.updateDynamic("type")("episode")
    __obj.asInstanceOf[EpisodeObjectFull]
  }
  
  extension [Self <: EpisodeObjectFull](x: Self) {
    
    inline def setShow(value: ShowObjectSimplified): Self = StObject.set(x, "show", value.asInstanceOf[js.Any])
  }
}
