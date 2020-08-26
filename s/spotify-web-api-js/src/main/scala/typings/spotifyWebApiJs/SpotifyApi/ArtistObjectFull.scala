package typings.spotifyWebApiJs.SpotifyApi

import typings.spotifyWebApiJs.spotifyWebApiJsStrings.artist
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Full Artist Object
  * [artist object (full)](https://developer.spotify.com/web-api/object-model/)
  */
@js.native
trait ArtistObjectFull extends ArtistObjectSimplified {
  var followers: FollowersObject = js.native
  var genres: js.Array[String] = js.native
  var images: js.Array[ImageObject] = js.native
  var popularity: Double = js.native
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
    `type`: artist,
    uri: String
  ): ArtistObjectFull = {
    val __obj = js.Dynamic.literal(external_urls = external_urls.asInstanceOf[js.Any], followers = followers.asInstanceOf[js.Any], genres = genres.asInstanceOf[js.Any], href = href.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], images = images.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], popularity = popularity.asInstanceOf[js.Any], uri = uri.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ArtistObjectFull]
  }
  @scala.inline
  implicit class ArtistObjectFullOps[Self <: ArtistObjectFull] (val x: Self) extends AnyVal {
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
    def setFollowers(value: FollowersObject): Self = this.set("followers", value.asInstanceOf[js.Any])
    @scala.inline
    def setGenresVarargs(value: String*): Self = this.set("genres", js.Array(value :_*))
    @scala.inline
    def setGenres(value: js.Array[String]): Self = this.set("genres", value.asInstanceOf[js.Any])
    @scala.inline
    def setImagesVarargs(value: ImageObject*): Self = this.set("images", js.Array(value :_*))
    @scala.inline
    def setImages(value: js.Array[ImageObject]): Self = this.set("images", value.asInstanceOf[js.Any])
    @scala.inline
    def setPopularity(value: Double): Self = this.set("popularity", value.asInstanceOf[js.Any])
  }
  
}

