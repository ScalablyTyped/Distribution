package typings.spotifyApi.SpotifyApi

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Show Object
  * [show object](https://developer.spotify.com/documentation/web-api/reference/#object-showobject)
  */
trait ShowObject
  extends StObject
     with ShowObjectSimplified {
  
  var episodes: PagingObject[EpisodeObjectSimplified]
}
object ShowObject {
  
  inline def apply(
    available_markets: js.Array[String],
    copyrights: js.Array[CopyrightObject],
    description: String,
    episodes: PagingObject[EpisodeObjectSimplified],
    explicit: Boolean,
    external_urls: ExternalUrlObject,
    href: String,
    html_description: String,
    id: String,
    images: js.Array[ImageObject],
    languages: js.Array[String],
    media_type: String,
    name: String,
    publisher: String,
    uri: String
  ): ShowObject = {
    val __obj = js.Dynamic.literal(available_markets = available_markets.asInstanceOf[js.Any], copyrights = copyrights.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], episodes = episodes.asInstanceOf[js.Any], explicit = explicit.asInstanceOf[js.Any], external_urls = external_urls.asInstanceOf[js.Any], href = href.asInstanceOf[js.Any], html_description = html_description.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], images = images.asInstanceOf[js.Any], languages = languages.asInstanceOf[js.Any], media_type = media_type.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], publisher = publisher.asInstanceOf[js.Any], uri = uri.asInstanceOf[js.Any], is_externally_hosted = null)
    __obj.updateDynamic("type")("show")
    __obj.asInstanceOf[ShowObject]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ShowObject] (val x: Self) extends AnyVal {
    
    inline def setEpisodes(value: PagingObject[EpisodeObjectSimplified]): Self = StObject.set(x, "episodes", value.asInstanceOf[js.Any])
  }
}
