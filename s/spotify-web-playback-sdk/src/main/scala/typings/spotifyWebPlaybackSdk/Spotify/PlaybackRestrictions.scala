package typings.spotifyWebPlaybackSdk.Spotify

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PlaybackRestrictions extends js.Object {
  var disallow_pausing_reasons: js.Array[String] = js.native
  var disallow_peeking_next_reasons: js.Array[String] = js.native
  var disallow_peeking_prev_reasons: js.Array[String] = js.native
  var disallow_resuming_reasons: js.Array[String] = js.native
  var disallow_seeking_reasons: js.Array[String] = js.native
  var disallow_skipping_next_reasons: js.Array[String] = js.native
  var disallow_skipping_prev_reasons: js.Array[String] = js.native
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
    val __obj = js.Dynamic.literal(disallow_pausing_reasons = disallow_pausing_reasons.asInstanceOf[js.Any], disallow_peeking_next_reasons = disallow_peeking_next_reasons.asInstanceOf[js.Any], disallow_peeking_prev_reasons = disallow_peeking_prev_reasons.asInstanceOf[js.Any], disallow_resuming_reasons = disallow_resuming_reasons.asInstanceOf[js.Any], disallow_seeking_reasons = disallow_seeking_reasons.asInstanceOf[js.Any], disallow_skipping_next_reasons = disallow_skipping_next_reasons.asInstanceOf[js.Any], disallow_skipping_prev_reasons = disallow_skipping_prev_reasons.asInstanceOf[js.Any])
    __obj.asInstanceOf[PlaybackRestrictions]
  }
  @scala.inline
  implicit class PlaybackRestrictionsOps[Self <: PlaybackRestrictions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setDisallow_pausing_reasonsVarargs(value: String*): Self = this.set("disallow_pausing_reasons", js.Array(value :_*))
    @scala.inline
    def setDisallow_pausing_reasons(value: js.Array[String]): Self = this.set("disallow_pausing_reasons", value.asInstanceOf[js.Any])
    @scala.inline
    def setDisallow_peeking_next_reasonsVarargs(value: String*): Self = this.set("disallow_peeking_next_reasons", js.Array(value :_*))
    @scala.inline
    def setDisallow_peeking_next_reasons(value: js.Array[String]): Self = this.set("disallow_peeking_next_reasons", value.asInstanceOf[js.Any])
    @scala.inline
    def setDisallow_peeking_prev_reasonsVarargs(value: String*): Self = this.set("disallow_peeking_prev_reasons", js.Array(value :_*))
    @scala.inline
    def setDisallow_peeking_prev_reasons(value: js.Array[String]): Self = this.set("disallow_peeking_prev_reasons", value.asInstanceOf[js.Any])
    @scala.inline
    def setDisallow_resuming_reasonsVarargs(value: String*): Self = this.set("disallow_resuming_reasons", js.Array(value :_*))
    @scala.inline
    def setDisallow_resuming_reasons(value: js.Array[String]): Self = this.set("disallow_resuming_reasons", value.asInstanceOf[js.Any])
    @scala.inline
    def setDisallow_seeking_reasonsVarargs(value: String*): Self = this.set("disallow_seeking_reasons", js.Array(value :_*))
    @scala.inline
    def setDisallow_seeking_reasons(value: js.Array[String]): Self = this.set("disallow_seeking_reasons", value.asInstanceOf[js.Any])
    @scala.inline
    def setDisallow_skipping_next_reasonsVarargs(value: String*): Self = this.set("disallow_skipping_next_reasons", js.Array(value :_*))
    @scala.inline
    def setDisallow_skipping_next_reasons(value: js.Array[String]): Self = this.set("disallow_skipping_next_reasons", value.asInstanceOf[js.Any])
    @scala.inline
    def setDisallow_skipping_prev_reasonsVarargs(value: String*): Self = this.set("disallow_skipping_prev_reasons", js.Array(value :_*))
    @scala.inline
    def setDisallow_skipping_prev_reasons(value: js.Array[String]): Self = this.set("disallow_skipping_prev_reasons", value.asInstanceOf[js.Any])
  }
  
}

