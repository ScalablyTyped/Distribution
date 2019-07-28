package typings.spotifyDashWebDashPlaybackDashSdk.SpotifyNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PlaybackDisallows extends js.Object {
  var pausing: Boolean
  var peeking_next: Boolean
  var peeking_prev: Boolean
  var resuming: Boolean
  var seeking: Boolean
  var skipping_next: Boolean
  var skipping_prev: Boolean
}

object PlaybackDisallows {
  @scala.inline
  def apply(
    pausing: Boolean,
    peeking_next: Boolean,
    peeking_prev: Boolean,
    resuming: Boolean,
    seeking: Boolean,
    skipping_next: Boolean,
    skipping_prev: Boolean
  ): PlaybackDisallows = {
    val __obj = js.Dynamic.literal(pausing = pausing, peeking_next = peeking_next, peeking_prev = peeking_prev, resuming = resuming, seeking = seeking, skipping_next = skipping_next, skipping_prev = skipping_prev)
  
    __obj.asInstanceOf[PlaybackDisallows]
  }
}

