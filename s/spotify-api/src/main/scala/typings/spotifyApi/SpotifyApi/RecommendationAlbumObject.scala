package typings.spotifyApi.SpotifyApi

import typings.spotifyApi.spotifyApiStrings.ALBUM
import typings.spotifyApi.spotifyApiStrings.COMPILATION
import typings.spotifyApi.spotifyApiStrings.SINGLE
import typings.spotifyApi.spotifyApiStrings.album_
import typings.spotifyApi.spotifyApiStrings.appears_on
import typings.spotifyApi.spotifyApiStrings.compilation_
import typings.spotifyApi.spotifyApiStrings.day
import typings.spotifyApi.spotifyApiStrings.month
import typings.spotifyApi.spotifyApiStrings.single_
import typings.spotifyApi.spotifyApiStrings.year
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Recommendation Album Object
  * Uses the same object structure as Simple Album Object, but with `album_type` in caps.
  */
/* Inlined parent std.Omit<spotify-api.SpotifyApi.AlbumObjectSimplified, 'album_type'> */
trait RecommendationAlbumObject extends StObject {
  
  var album_group: js.UndefOr[album_ | single_ | compilation_ | appears_on] = js.undefined
  
  /**
    * The type of the album: one of “ALBUM”, “SINGLE”, or “COMPILATION”.
    * Note that this differs from the types returned by all other spotify APIs by being in all caps.
    */
  var album_type: ALBUM | SINGLE | COMPILATION
  
  var artists: js.Array[ArtistObjectSimplified]
  
  var available_markets: js.UndefOr[js.Array[String]] = js.undefined
  
  var external_urls: ExternalUrlObject
  
  var href: String
  
  var id: String
  
  var images: js.Array[ImageObject]
  
  var name: String
  
  var release_date: String
  
  var release_date_precision: year | month | day
  
  var restrictions: js.UndefOr[RestrictionsObject] = js.undefined
  
  var total_tracks: Double
  
  var `type`: album_
  
  var uri: String
}
object RecommendationAlbumObject {
  
  inline def apply(
    album_type: ALBUM | SINGLE | COMPILATION,
    artists: js.Array[ArtistObjectSimplified],
    external_urls: ExternalUrlObject,
    href: String,
    id: String,
    images: js.Array[ImageObject],
    name: String,
    release_date: String,
    release_date_precision: year | month | day,
    total_tracks: Double,
    uri: String
  ): RecommendationAlbumObject = {
    val __obj = js.Dynamic.literal(album_type = album_type.asInstanceOf[js.Any], artists = artists.asInstanceOf[js.Any], external_urls = external_urls.asInstanceOf[js.Any], href = href.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], images = images.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], release_date = release_date.asInstanceOf[js.Any], release_date_precision = release_date_precision.asInstanceOf[js.Any], total_tracks = total_tracks.asInstanceOf[js.Any], uri = uri.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("album")
    __obj.asInstanceOf[RecommendationAlbumObject]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RecommendationAlbumObject] (val x: Self) extends AnyVal {
    
    inline def setAlbum_group(value: album_ | single_ | compilation_ | appears_on): Self = StObject.set(x, "album_group", value.asInstanceOf[js.Any])
    
    inline def setAlbum_groupUndefined: Self = StObject.set(x, "album_group", js.undefined)
    
    inline def setAlbum_type(value: ALBUM | SINGLE | COMPILATION): Self = StObject.set(x, "album_type", value.asInstanceOf[js.Any])
    
    inline def setArtists(value: js.Array[ArtistObjectSimplified]): Self = StObject.set(x, "artists", value.asInstanceOf[js.Any])
    
    inline def setArtistsVarargs(value: ArtistObjectSimplified*): Self = StObject.set(x, "artists", js.Array(value*))
    
    inline def setAvailable_markets(value: js.Array[String]): Self = StObject.set(x, "available_markets", value.asInstanceOf[js.Any])
    
    inline def setAvailable_marketsUndefined: Self = StObject.set(x, "available_markets", js.undefined)
    
    inline def setAvailable_marketsVarargs(value: String*): Self = StObject.set(x, "available_markets", js.Array(value*))
    
    inline def setExternal_urls(value: ExternalUrlObject): Self = StObject.set(x, "external_urls", value.asInstanceOf[js.Any])
    
    inline def setHref(value: String): Self = StObject.set(x, "href", value.asInstanceOf[js.Any])
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setImages(value: js.Array[ImageObject]): Self = StObject.set(x, "images", value.asInstanceOf[js.Any])
    
    inline def setImagesVarargs(value: ImageObject*): Self = StObject.set(x, "images", js.Array(value*))
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setRelease_date(value: String): Self = StObject.set(x, "release_date", value.asInstanceOf[js.Any])
    
    inline def setRelease_date_precision(value: year | month | day): Self = StObject.set(x, "release_date_precision", value.asInstanceOf[js.Any])
    
    inline def setRestrictions(value: RestrictionsObject): Self = StObject.set(x, "restrictions", value.asInstanceOf[js.Any])
    
    inline def setRestrictionsUndefined: Self = StObject.set(x, "restrictions", js.undefined)
    
    inline def setTotal_tracks(value: Double): Self = StObject.set(x, "total_tracks", value.asInstanceOf[js.Any])
    
    inline def setType(value: album_): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setUri(value: String): Self = StObject.set(x, "uri", value.asInstanceOf[js.Any])
  }
}
