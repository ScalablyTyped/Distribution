package typings.spotifyWebPlaybackSdk.Spotify

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Artist extends js.Object {
  var name: String
  var uri: String
}

object Artist {
  @scala.inline
  def apply(name: String, uri: String): Artist = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], uri = uri.asInstanceOf[js.Any])
    __obj.asInstanceOf[Artist]
  }
}

