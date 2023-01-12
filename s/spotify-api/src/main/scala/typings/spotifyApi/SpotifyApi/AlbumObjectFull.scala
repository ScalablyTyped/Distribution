package typings.spotifyApi.SpotifyApi

import typings.spotifyApi.spotifyApiStrings.album_
import typings.spotifyApi.spotifyApiStrings.compilation_
import typings.spotifyApi.spotifyApiStrings.day
import typings.spotifyApi.spotifyApiStrings.month
import typings.spotifyApi.spotifyApiStrings.single_
import typings.spotifyApi.spotifyApiStrings.year
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

//
// Objects from the Object Models of the Spotify Web Api, ordered alphabetically.
// [Object Model](https://developer.spotify.com/web-api/object-model)
//
/**
  * Full Album Object
  * [album object (full)](https://developer.spotify.com/web-api/object-model/#album-object-simplified)
  */
trait AlbumObjectFull
  extends StObject
     with AlbumObjectSimplified {
  
  /**
    * The copyright statements of the album.
    */
  var copyrights: js.Array[CopyrightObject]
  
  /**
    * Known external IDs for the album.
    */
  var external_ids: ExternalIdObject
  
  /**
    * A list of the genres used to classify the album.
    * For example: `"Prog Rock"` , `"Post-Grunge"`. (If not yet classified, the array is empty.)
    */
  var genres: js.Array[String]
  
  /**
    * The label for the album.
    */
  var label: String
  
  /**
    * The popularity of the album. The value will be between `0` and `100`, with `100` being the most popular.
    * The popularity is calculated from the popularity of the album’s individual tracks;
    */
  var popularity: Double
  
  /**
    * The tracks of the album.
    */
  var tracks: PagingObject[TrackObjectSimplified]
}
object AlbumObjectFull {
  
  inline def apply(
    album_type: album_ | single_ | compilation_,
    artists: js.Array[ArtistObjectSimplified],
    copyrights: js.Array[CopyrightObject],
    external_ids: ExternalIdObject,
    external_urls: ExternalUrlObject,
    genres: js.Array[String],
    href: String,
    id: String,
    images: js.Array[ImageObject],
    label: String,
    name: String,
    popularity: Double,
    release_date: String,
    release_date_precision: year | month | day,
    total_tracks: Double,
    tracks: PagingObject[TrackObjectSimplified],
    uri: String
  ): AlbumObjectFull = {
    val __obj = js.Dynamic.literal(album_type = album_type.asInstanceOf[js.Any], artists = artists.asInstanceOf[js.Any], copyrights = copyrights.asInstanceOf[js.Any], external_ids = external_ids.asInstanceOf[js.Any], external_urls = external_urls.asInstanceOf[js.Any], genres = genres.asInstanceOf[js.Any], href = href.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], images = images.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], popularity = popularity.asInstanceOf[js.Any], release_date = release_date.asInstanceOf[js.Any], release_date_precision = release_date_precision.asInstanceOf[js.Any], total_tracks = total_tracks.asInstanceOf[js.Any], tracks = tracks.asInstanceOf[js.Any], uri = uri.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("album")
    __obj.asInstanceOf[AlbumObjectFull]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AlbumObjectFull] (val x: Self) extends AnyVal {
    
    inline def setCopyrights(value: js.Array[CopyrightObject]): Self = StObject.set(x, "copyrights", value.asInstanceOf[js.Any])
    
    inline def setCopyrightsVarargs(value: CopyrightObject*): Self = StObject.set(x, "copyrights", js.Array(value*))
    
    inline def setExternal_ids(value: ExternalIdObject): Self = StObject.set(x, "external_ids", value.asInstanceOf[js.Any])
    
    inline def setGenres(value: js.Array[String]): Self = StObject.set(x, "genres", value.asInstanceOf[js.Any])
    
    inline def setGenresVarargs(value: String*): Self = StObject.set(x, "genres", js.Array(value*))
    
    inline def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
    
    inline def setPopularity(value: Double): Self = StObject.set(x, "popularity", value.asInstanceOf[js.Any])
    
    inline def setTracks(value: PagingObject[TrackObjectSimplified]): Self = StObject.set(x, "tracks", value.asInstanceOf[js.Any])
  }
}
