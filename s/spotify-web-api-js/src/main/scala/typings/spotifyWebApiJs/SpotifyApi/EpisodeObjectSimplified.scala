package typings.spotifyWebApiJs.SpotifyApi

import typings.spotifyWebApiJs.spotifyWebApiJsStrings.episode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Simplified Episode Object
  * [episode object (simplified)](https://developer.spotify.com/documentation/web-api/reference/object-model/#episode-object-simplified)
  */
@js.native
trait EpisodeObjectSimplified extends js.Object {
  
  var audio_preview_url: String | Null = js.native
  
  var description: String = js.native
  
  var duration_ms: Double = js.native
  
  var explicit: Boolean = js.native
  
  var external_urls: ExternalUrlObject = js.native
  
  var href: String = js.native
  
  var id: String = js.native
  
  var images: js.Array[ImageObject] = js.native
  
  var is_externally_hosted: Boolean = js.native
  
  var is_playable: Boolean = js.native
  
  var languages: js.Array[String] = js.native
  
  var name: String = js.native
  
  var release_date: String = js.native
  
  var release_date_precision: String = js.native
  
  var resume_point: ResumePointObject = js.native
  
  var `type`: episode = js.native
  
  var uri: String = js.native
}
object EpisodeObjectSimplified {
  
  @scala.inline
  def apply(
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
    `type`: episode,
    uri: String
  ): EpisodeObjectSimplified = {
    val __obj = js.Dynamic.literal(description = description.asInstanceOf[js.Any], duration_ms = duration_ms.asInstanceOf[js.Any], explicit = explicit.asInstanceOf[js.Any], external_urls = external_urls.asInstanceOf[js.Any], href = href.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], images = images.asInstanceOf[js.Any], is_externally_hosted = is_externally_hosted.asInstanceOf[js.Any], is_playable = is_playable.asInstanceOf[js.Any], languages = languages.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], release_date = release_date.asInstanceOf[js.Any], release_date_precision = release_date_precision.asInstanceOf[js.Any], resume_point = resume_point.asInstanceOf[js.Any], uri = uri.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[EpisodeObjectSimplified]
  }
  
  @scala.inline
  implicit class EpisodeObjectSimplifiedOps[Self <: EpisodeObjectSimplified] (val x: Self) extends AnyVal {
    
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
    def setDescription(value: String): Self = this.set("description", value.asInstanceOf[js.Any])
    
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
    def setImagesVarargs(value: ImageObject*): Self = this.set("images", js.Array(value :_*))
    
    @scala.inline
    def setImages(value: js.Array[ImageObject]): Self = this.set("images", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIs_externally_hosted(value: Boolean): Self = this.set("is_externally_hosted", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIs_playable(value: Boolean): Self = this.set("is_playable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLanguagesVarargs(value: String*): Self = this.set("languages", js.Array(value :_*))
    
    @scala.inline
    def setLanguages(value: js.Array[String]): Self = this.set("languages", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRelease_date(value: String): Self = this.set("release_date", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRelease_date_precision(value: String): Self = this.set("release_date_precision", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResume_point(value: ResumePointObject): Self = this.set("resume_point", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: episode): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUri(value: String): Self = this.set("uri", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAudio_preview_url(value: String): Self = this.set("audio_preview_url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAudio_preview_urlNull: Self = this.set("audio_preview_url", null)
  }
}
