package typings.spotifyDashWebDashPlaybackDashSdk.Spotify

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PlaybackRestrictions extends js.Object {
  var disallow_pausing_reasons: js.Array[String]
  var disallow_peeking_next_reasons: js.Array[String]
  var disallow_peeking_prev_reasons: js.Array[String]
  var disallow_resuming_reasons: js.Array[String]
  var disallow_seeking_reasons: js.Array[String]
  var disallow_skipping_next_reasons: js.Array[String]
  var disallow_skipping_prev_reasons: js.Array[String]
}

object PlaybackRestrictions {
  @scala.inline
  def apply(
    disallow_pausing_reasons: js.Array[String],
    disallow_peeking_next_reasons: js.Array[String],
    disallow_peeking_prev_reasons: js.Array[String],
    disallow_resuming_reasons: js.Array[String],
    disallow_seeking_reasons: js.Array[String],
    disallow_skipping_next_reasons: js.Array[String],
    disallow_skipping_prev_reasons: js.Array[String]
  ): PlaybackRestrictions = {
    val __obj = js.Dynamic.literal(disallow_pausing_reasons = disallow_pausing_reasons, disallow_peeking_next_reasons = disallow_peeking_next_reasons, disallow_peeking_prev_reasons = disallow_peeking_prev_reasons, disallow_resuming_reasons = disallow_resuming_reasons, disallow_seeking_reasons = disallow_seeking_reasons, disallow_skipping_next_reasons = disallow_skipping_next_reasons, disallow_skipping_prev_reasons = disallow_skipping_prev_reasons)
  
    __obj.asInstanceOf[PlaybackRestrictions]
  }
}

