package typings.spotifyWebPlaybackSdk.Spotify

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PlaybackContext extends js.Object {
  var metadata: js.Any
  var uri: String | Null
}

object PlaybackContext {
  @scala.inline
  def apply(metadata: js.Any, uri: String = null): PlaybackContext = {
    val __obj = js.Dynamic.literal(metadata = metadata.asInstanceOf[js.Any], uri = uri.asInstanceOf[js.Any])
    __obj.asInstanceOf[PlaybackContext]
  }
}

