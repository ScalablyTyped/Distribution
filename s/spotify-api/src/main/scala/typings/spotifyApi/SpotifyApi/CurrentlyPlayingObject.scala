package typings.spotifyApi.SpotifyApi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CurrentlyPlayingObject extends js.Object {
  var context: ContextObject | Null
  var device: UserDevice
  var is_playing: Boolean
  var item: TrackObjectFull | Null
  var progress_ms: Double | Null
  var timestamp: Double
}

object CurrentlyPlayingObject {
  @scala.inline
  def apply(
    device: UserDevice,
    is_playing: Boolean,
    timestamp: Double,
    context: ContextObject = null,
    item: TrackObjectFull = null,
    progress_ms: Double = null.asInstanceOf[Double]
  ): CurrentlyPlayingObject = {
    val __obj = js.Dynamic.literal(device = device.asInstanceOf[js.Any], is_playing = is_playing.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any], context = context.asInstanceOf[js.Any], item = item.asInstanceOf[js.Any], progress_ms = progress_ms.asInstanceOf[js.Any])
    __obj.asInstanceOf[CurrentlyPlayingObject]
  }
}

