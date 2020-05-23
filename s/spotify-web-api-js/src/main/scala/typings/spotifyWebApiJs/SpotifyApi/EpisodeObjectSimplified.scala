package typings.spotifyWebApiJs.SpotifyApi

import typings.spotifyWebApiJs.spotifyWebApiJsStrings.episode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Simplified Episode Object
  * [episode object (simplified)](https://developer.spotify.com/documentation/web-api/reference/object-model/#episode-object-simplified)
  */
trait EpisodeObjectSimplified extends js.Object {
  var audio_preview_url: String | Null
  var description: String
  var duration_ms: Double
  var explicit: Boolean
  var external_urls: ExternalUrlObject
  var href: String
  var id: String
  var images: js.Array[ImageObject]
  var is_externally_hosted: Boolean
  var is_playable: Boolean
  var languages: js.Array[String]
  var name: String
  var release_date: String
  var release_date_precision: String
  var resume_point: ResumePointObject
  var `type`: episode
  var uri: String
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
    uri: String,
    audio_preview_url: String = null
  ): EpisodeObjectSimplified = {
    val __obj = js.Dynamic.literal(description = description.asInstanceOf[js.Any], duration_ms = duration_ms.asInstanceOf[js.Any], explicit = explicit.asInstanceOf[js.Any], external_urls = external_urls.asInstanceOf[js.Any], href = href.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], images = images.asInstanceOf[js.Any], is_externally_hosted = is_externally_hosted.asInstanceOf[js.Any], is_playable = is_playable.asInstanceOf[js.Any], languages = languages.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], release_date = release_date.asInstanceOf[js.Any], release_date_precision = release_date_precision.asInstanceOf[js.Any], resume_point = resume_point.asInstanceOf[js.Any], uri = uri.asInstanceOf[js.Any], audio_preview_url = audio_preview_url.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[EpisodeObjectSimplified]
  }
}

