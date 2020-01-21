package typings.spotifyWebPlaybackSdk.Spotify

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WebPlaybackInstance extends js.Object {
  var device_id: String
}

object WebPlaybackInstance {
  @scala.inline
  def apply(device_id: String): WebPlaybackInstance = {
    val __obj = js.Dynamic.literal(device_id = device_id.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[WebPlaybackInstance]
  }
}

