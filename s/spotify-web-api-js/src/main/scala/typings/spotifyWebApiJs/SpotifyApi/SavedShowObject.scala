package typings.spotifyWebApiJs.SpotifyApi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Saved Show Object
  * [](https://developer.spotify.com/documentation/web-api/reference/object-model/#saved-show-object)
  */
trait SavedShowObject extends js.Object {
  var added_at: String
  var album: ShowObjectFull
}

object SavedShowObject {
  @scala.inline
  def apply(added_at: String, album: ShowObjectFull): SavedShowObject = {
    val __obj = js.Dynamic.literal(added_at = added_at.asInstanceOf[js.Any], album = album.asInstanceOf[js.Any])
    __obj.asInstanceOf[SavedShowObject]
  }
}

