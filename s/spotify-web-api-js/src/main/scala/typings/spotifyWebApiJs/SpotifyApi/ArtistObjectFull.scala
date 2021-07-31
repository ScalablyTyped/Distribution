package typings.spotifyWebApiJs.SpotifyApi

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Full Artist Object
  * [artist object (full)](https://developer.spotify.com/web-api/object-model/)
  */
trait ArtistObjectFull
  extends StObject
     with ArtistObjectSimplified {
  
  var followers: FollowersObject
  
  var genres: js.Array[String]
  
  var images: js.Array[ImageObject]
  
  var popularity: Double
}
object ArtistObjectFull {
  
  @scala.inline
  def apply(
    external_urls: ExternalUrlObject,
    followers: FollowersObject,
    genres: js.Array[String],
    href: String,
    id: String,
    images: js.Array[ImageObject],
    name: String,
    popularity: Double,
    uri: String
  ): ArtistObjectFull = {
    val __obj = js.Dynamic.literal(external_urls = external_urls.asInstanceOf[js.Any], followers = followers.asInstanceOf[js.Any], genres = genres.asInstanceOf[js.Any], href = href.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], images = images.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], popularity = popularity.asInstanceOf[js.Any], uri = uri.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("artist")
    __obj.asInstanceOf[ArtistObjectFull]
  }
  
  @scala.inline
  implicit class ArtistObjectFullMutableBuilder[Self <: ArtistObjectFull] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFollowers(value: FollowersObject): Self = StObject.set(x, "followers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGenres(value: js.Array[String]): Self = StObject.set(x, "genres", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGenresVarargs(value: String*): Self = StObject.set(x, "genres", js.Array(value :_*))
    
    @scala.inline
    def setImages(value: js.Array[ImageObject]): Self = StObject.set(x, "images", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setImagesVarargs(value: ImageObject*): Self = StObject.set(x, "images", js.Array(value :_*))
    
    @scala.inline
    def setPopularity(value: Double): Self = StObject.set(x, "popularity", value.asInstanceOf[js.Any])
  }
}
