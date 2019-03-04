package typings
package spotifyDashWebDashApiDashJsLib.SpotifyApiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CurrentlyPlayingObject extends js.Object {
  var context: ContextObject | scala.Null
  var device: UserDevice
  var is_playing: scala.Boolean
  var item: TrackObjectFull | scala.Null
  var progress_ms: scala.Double | scala.Null
  var timestamp: scala.Double
}

object CurrentlyPlayingObject {
  @scala.inline
  def apply(
    device: UserDevice,
    is_playing: scala.Boolean,
    timestamp: scala.Double,
    context: ContextObject = null,
    item: TrackObjectFull = null,
    progress_ms: scala.Int | scala.Double = null
  ): CurrentlyPlayingObject = {
    val __obj = js.Dynamic.literal(device = device, is_playing = is_playing, timestamp = timestamp)
    if (context != null) __obj.updateDynamic("context")(context)
    if (item != null) __obj.updateDynamic("item")(item)
    if (progress_ms != null) __obj.updateDynamic("progress_ms")(progress_ms.asInstanceOf[js.Any])
    __obj.asInstanceOf[CurrentlyPlayingObject]
  }
}

