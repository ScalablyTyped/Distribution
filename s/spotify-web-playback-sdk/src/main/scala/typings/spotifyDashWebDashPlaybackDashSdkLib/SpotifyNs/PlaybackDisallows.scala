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
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("pausing")(pausing)
    __obj.updateDynamic("peeking_next")(peeking_next)
    __obj.updateDynamic("peeking_prev")(peeking_prev)
    __obj.updateDynamic("resuming")(resuming)
    __obj.updateDynamic("seeking")(seeking)
    __obj.updateDynamic("skipping_next")(skipping_next)
    __obj.updateDynamic("skipping_prev")(skipping_prev)
    __obj.asInstanceOf[PlaybackDisallows]
  }
}

