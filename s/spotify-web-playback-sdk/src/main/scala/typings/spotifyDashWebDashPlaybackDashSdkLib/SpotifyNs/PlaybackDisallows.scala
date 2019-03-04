package typings
package spotifyDashWebDashPlaybackDashSdkLib.SpotifyNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PlaybackDisallows extends js.Object {
  var pausing: scala.Boolean
  var peeking_next: scala.Boolean
  var peeking_prev: scala.Boolean
  var resuming: scala.Boolean
  var seeking: scala.Boolean
  var skipping_next: scala.Boolean
  var skipping_prev: scala.Boolean
}

object PlaybackDisallows {
  @scala.inline
  def apply(
    pausing: scala.Boolean,
    peeking_next: scala.Boolean,
    peeking_prev: scala.Boolean,
    resuming: scala.Boolean,
    seeking: scala.Boolean,
    skipping_next: scala.Boolean,
    skipping_prev: scala.Boolean
  ): PlaybackDisallows = {
    val __obj = js.Dynamic.literal(pausing = pausing, peeking_next = peeking_next, peeking_prev = peeking_prev, resuming = resuming, seeking = seeking, skipping_next = skipping_next, skipping_prev = skipping_prev)
  
    __obj.asInstanceOf[PlaybackDisallows]
  }
}

