package typings.spotifyApi.SpotifyApi

import typings.spotifyApi.spotifyApiStrings.show
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Simplified Show Object
  * [show object (simplified)](https://developer.spotify.com/documentation/web-api/reference/object-model/#show-object-simplified)
  */
trait ShowObjectSimplified
  extends StObject
     with ContextObject {
  
  /**
    * A list of the countries in which the show can be played, identified by their [ISO 3166-1 alpha-2 code](http://en.wikipedia.org/wiki/ISO_3166-1_alpha-2).
    */
  var available_markets: js.Array[String]
  
  /**
    * The copyright statements of the show.
    */
  var copyrights: js.Array[CopyrightObject]
  
  /**
    * A description of the show.
    */
  var description: String
  
  /**
    * Whether or not the show has explicit content (true = yes it does; false = no it does not OR unknown).
    */
  var explicit: Boolean
  
  /**
    * A description of the show. This field may contain HTML tags.
    */
  var html_description: String
  
  /**
    * The [Spotify ID](https://developer.spotify.com/documentation/web-api/#spotify-uris-and-ids) for the show.
    */
  var id: String
  
  /**
    * The cover art for the show in various sizes, widest first.
    */
  var images: js.Array[ImageObject]
  
  /**
    * True if all of the show’s episodes are hosted outside of Spotify’s CDN. This field might be null in some cases.
    */
  var is_externally_hosted: Boolean | Null
  
  /**
    * A list of the languages used in the show, identified by their [ISO 639](https://en.wikipedia.org/wiki/ISO_639) code.
    */
  var languages: js.Array[String]
  
  /**
    * The media type of the show.
    */
  var media_type: String
  
  /**
    * The name of the show.
    */
  var name: String
  
  /**
    * The publisher of the show.
    */
  var publisher: String
  
  // This is found in https://developer.spotify.com/documentation/web-api/reference/shows/get-a-show/ but not in
  // https://developer.spotify.com/documentation/web-api/reference/object-model/#show-object-full.
  // Also it is not always sent, so it is marked optional here.
  /**
    * Total number of episodes in the show.
    */
  var total_episodes: js.UndefOr[Double] = js.undefined
  
  /**
    * The object type: “show”.
    */
  @JSName("type")
  var type_ShowObjectSimplified: show
}
object ShowObjectSimplified {
  
  inline def apply(
    available_markets: js.Array[String],
    copyrights: js.Array[CopyrightObject],
    description: String,
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
  ): ShowObjectSimplified = {
    val __obj = js.Dynamic.literal(available_markets = available_markets.asInstanceOf[js.Any], copyrights = copyrights.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], explicit = explicit.asInstanceOf[js.Any], external_urls = external_urls.asInstanceOf[js.Any], href = href.asInstanceOf[js.Any], html_description = html_description.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], images = images.asInstanceOf[js.Any], languages = languages.asInstanceOf[js.Any], media_type = media_type.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], publisher = publisher.asInstanceOf[js.Any], uri = uri.asInstanceOf[js.Any], is_externally_hosted = null)
    __obj.updateDynamic("type")("show")
    __obj.asInstanceOf[ShowObjectSimplified]
  }
  
  extension [Self <: ShowObjectSimplified](x: Self) {
    
    inline def setAvailable_markets(value: js.Array[String]): Self = StObject.set(x, "available_markets", value.asInstanceOf[js.Any])
    
    inline def setAvailable_marketsVarargs(value: String*): Self = StObject.set(x, "available_markets", js.Array(value*))
    
    inline def setCopyrights(value: js.Array[CopyrightObject]): Self = StObject.set(x, "copyrights", value.asInstanceOf[js.Any])
    
    inline def setCopyrightsVarargs(value: CopyrightObject*): Self = StObject.set(x, "copyrights", js.Array(value*))
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setExplicit(value: Boolean): Self = StObject.set(x, "explicit", value.asInstanceOf[js.Any])
    
    inline def setHtml_description(value: String): Self = StObject.set(x, "html_description", value.asInstanceOf[js.Any])
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setImages(value: js.Array[ImageObject]): Self = StObject.set(x, "images", value.asInstanceOf[js.Any])
    
    inline def setImagesVarargs(value: ImageObject*): Self = StObject.set(x, "images", js.Array(value*))
    
    inline def setIs_externally_hosted(value: Boolean): Self = StObject.set(x, "is_externally_hosted", value.asInstanceOf[js.Any])
    
    inline def setIs_externally_hostedNull: Self = StObject.set(x, "is_externally_hosted", null)
    
    inline def setLanguages(value: js.Array[String]): Self = StObject.set(x, "languages", value.asInstanceOf[js.Any])
    
    inline def setLanguagesVarargs(value: String*): Self = StObject.set(x, "languages", js.Array(value*))
    
    inline def setMedia_type(value: String): Self = StObject.set(x, "media_type", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setPublisher(value: String): Self = StObject.set(x, "publisher", value.asInstanceOf[js.Any])
    
    inline def setTotal_episodes(value: Double): Self = StObject.set(x, "total_episodes", value.asInstanceOf[js.Any])
    
    inline def setTotal_episodesUndefined: Self = StObject.set(x, "total_episodes", js.undefined)
    
    inline def setType(value: show): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
