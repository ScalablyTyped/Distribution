package typings.spotifyWebPlaybackSdk.Spotify

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
    val __obj = js.Dynamic.literal(pausing = pausing.asInstanceOf[js.Any], peeking_next = peeking_next.asInstanceOf[js.Any], peeking_prev = peeking_prev.asInstanceOf[js.Any], resuming = resuming.asInstanceOf[js.Any], seeking = seeking.asInstanceOf[js.Any], skipping_next = skipping_next.asInstanceOf[js.Any], skipping_prev = skipping_prev.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[PlaybackDisallows]
  }
}

