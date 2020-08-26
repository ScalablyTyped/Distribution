package typings.spotifyApi.SpotifyApi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Saved Track Object in Playlists
  * [](https://developer.spotify.com/web-api/object-model/)
  */
@js.native
trait SavedAlbumObject extends js.Object {
  var added_at: String = js.native
  var album: AlbumObjectFull = js.native
}

object SavedAlbumObject {
  @scala.inline
  def apply(added_at: String, album: AlbumObjectFull): SavedAlbumObject = {
    val __obj = js.Dynamic.literal(added_at = added_at.asInstanceOf[js.Any], album = album.asInstanceOf[js.Any])
    __obj.asInstanceOf[SavedAlbumObject]
  }
  @scala.inline
  implicit class SavedAlbumObjectOps[Self <: SavedAlbumObject] (val x: Self) extends AnyVal {
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
    def setAdded_at(value: String): Self = this.set("added_at", value.asInstanceOf[js.Any])
    @scala.inline
    def setAlbum(value: AlbumObjectFull): Self = this.set("album", value.asInstanceOf[js.Any])
  }
  
}

