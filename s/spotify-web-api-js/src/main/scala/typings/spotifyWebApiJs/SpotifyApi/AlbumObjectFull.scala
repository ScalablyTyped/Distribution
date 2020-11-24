package typings.spotifyWebApiJs.SpotifyApi

import typings.spotifyWebApiJs.spotifyWebApiJsStrings.album
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

//
// Objects from the Object Models of the Spotify Web Api, ordered alphabetically.
// [Object Model](https://developer.spotify.com/web-api/object-model)
//
/**
  * Full Album Object
  * [album object (full)](https://developer.spotify.com/web-api/object-model/#album-object-simplified)
  */
@js.native
trait AlbumObjectFull extends AlbumObjectSimplified {
  
  var artists: js.Array[ArtistObjectSimplified] = js.native
  
  var copyrights: js.Array[CopyrightObject] = js.native
  
  var external_ids: ExternalIdObject = js.native
  
  var genres: js.Array[String] = js.native
  
  var popularity: Double = js.native
  
  var release_date: String = js.native
  
  var release_date_precision: String = js.native
  
  var tracks: PagingObject[TrackObjectSimplified] = js.native
}
object AlbumObjectFull {
  
  @scala.inline
  def apply(
    album_type: String,
    artists: js.Array[ArtistObjectSimplified],
    copyrights: js.Array[CopyrightObject],
    external_ids: ExternalIdObject,
    external_urls: ExternalUrlObject,
    genres: js.Array[String],
    href: String,
    id: String,
    images: js.Array[ImageObject],
    name: String,
    popularity: Double,
    release_date: String,
    release_date_precision: String,
    tracks: PagingObject[TrackObjectSimplified],
    `type`: album,
    uri: String
  ): AlbumObjectFull = {
    val __obj = js.Dynamic.literal(album_type = album_type.asInstanceOf[js.Any], artists = artists.asInstanceOf[js.Any], copyrights = copyrights.asInstanceOf[js.Any], external_ids = external_ids.asInstanceOf[js.Any], external_urls = external_urls.asInstanceOf[js.Any], genres = genres.asInstanceOf[js.Any], href = href.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], images = images.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], popularity = popularity.asInstanceOf[js.Any], release_date = release_date.asInstanceOf[js.Any], release_date_precision = release_date_precision.asInstanceOf[js.Any], tracks = tracks.asInstanceOf[js.Any], uri = uri.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AlbumObjectFull]
  }
  
  @scala.inline
  implicit class AlbumObjectFullOps[Self <: AlbumObjectFull] (val x: Self) extends AnyVal {
    
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
    def setArtistsVarargs(value: ArtistObjectSimplified*): Self = this.set("artists", js.Array(value :_*))
    
    @scala.inline
    def setArtists(value: js.Array[ArtistObjectSimplified]): Self = this.set("artists", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCopyrightsVarargs(value: CopyrightObject*): Self = this.set("copyrights", js.Array(value :_*))
    
    @scala.inline
    def setCopyrights(value: js.Array[CopyrightObject]): Self = this.set("copyrights", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExternal_ids(value: ExternalIdObject): Self = this.set("external_ids", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGenresVarargs(value: String*): Self = this.set("genres", js.Array(value :_*))
    
    @scala.inline
    def setGenres(value: js.Array[String]): Self = this.set("genres", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPopularity(value: Double): Self = this.set("popularity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRelease_date(value: String): Self = this.set("release_date", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRelease_date_precision(value: String): Self = this.set("release_date_precision", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTracks(value: PagingObject[TrackObjectSimplified]): Self = this.set("tracks", value.asInstanceOf[js.Any])
  }
}
