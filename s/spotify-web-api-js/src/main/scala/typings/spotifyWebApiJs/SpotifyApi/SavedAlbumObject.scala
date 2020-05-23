package typings.spotifyWebApiJs.SpotifyApi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Saved Album Object in Playlists
  * [](https://developer.spotify.com/documentation/web-api/reference/object-model/#saved-album-object)
  */
trait SavedAlbumObject extends js.Object {
  var added_at: String
  var album: AlbumObjectFull
}

object SavedAlbumObject {
  @scala.inline
  def apply(added_at: String, album: AlbumObjectFull): SavedAlbumObject = {
    val __obj = js.Dynamic.literal(added_at = added_at.asInstanceOf[js.Any], album = album.asInstanceOf[js.Any])
    __obj.asInstanceOf[SavedAlbumObject]
  }
}

