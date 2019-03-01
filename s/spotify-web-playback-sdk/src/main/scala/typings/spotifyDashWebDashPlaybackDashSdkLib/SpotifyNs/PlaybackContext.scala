package typings
package spotifyDashWebDashPlaybackDashSdkLib.SpotifyNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PlaybackContext extends js.Object {
  var metadata: js.Any
  var uri: java.lang.String | scala.Null
}

object PlaybackContext {
  @scala.inline
  def apply(metadata: js.Any, uri: java.lang.String = null): PlaybackContext = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("metadata")(metadata)
    if (uri != null) __obj.updateDynamic("uri")(uri)
    __obj.asInstanceOf[PlaybackContext]
  }
}

