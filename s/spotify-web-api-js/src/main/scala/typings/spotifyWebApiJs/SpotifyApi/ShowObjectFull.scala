package typings.spotifyWebApiJs.SpotifyApi

import typings.spotifyWebApiJs.spotifyWebApiJsStrings.show
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Full Show Object
  * [show object (full)](https://developer.spotify.com/documentation/web-api/reference/object-model/#show-object-full)
  */
@js.native
trait ShowObjectFull extends ShowObjectSimplified {
  
  var episodes: js.Array[EpisodeObjectSimplified] = js.native
}
object ShowObjectFull {
  
  @scala.inline
  def apply(
    copyrights: js.Array[CopyrightObject],
    description: String,
    episodes: js.Array[EpisodeObjectSimplified],
    explicit: Boolean,
    external_urls: ExternalUrlObject,
    href: String,
    id: String,
    images: js.Array[ImageObject],
    is_externally_hosted: Boolean,
    languages: js.Array[String],
    media_type: String,
    name: String,
    publisher: String,
    `type`: show,
    uri: String
  ): ShowObjectFull = {
    val __obj = js.Dynamic.literal(copyrights = copyrights.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], episodes = episodes.asInstanceOf[js.Any], explicit = explicit.asInstanceOf[js.Any], external_urls = external_urls.asInstanceOf[js.Any], href = href.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], images = images.asInstanceOf[js.Any], is_externally_hosted = is_externally_hosted.asInstanceOf[js.Any], languages = languages.asInstanceOf[js.Any], media_type = media_type.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], publisher = publisher.asInstanceOf[js.Any], uri = uri.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ShowObjectFull]
  }
  
  @scala.inline
  implicit class ShowObjectFullMutableBuilder[Self <: ShowObjectFull] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEpisodes(value: js.Array[EpisodeObjectSimplified]): Self = StObject.set(x, "episodes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEpisodesVarargs(value: EpisodeObjectSimplified*): Self = StObject.set(x, "episodes", js.Array(value :_*))
  }
}
