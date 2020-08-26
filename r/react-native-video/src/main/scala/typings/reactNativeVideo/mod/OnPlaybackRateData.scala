package typings.reactNativeVideo.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OnPlaybackRateData extends js.Object {
  var playbackRate: Double = js.native
}

object OnPlaybackRateData {
  @scala.inline
  def apply(playbackRate: Double): OnPlaybackRateData = {
    val __obj = js.Dynamic.literal(playbackRate = playbackRate.asInstanceOf[js.Any])
    __obj.asInstanceOf[OnPlaybackRateData]
  }
  @scala.inline
  implicit class OnPlaybackRateDataOps[Self <: OnPlaybackRateData] (val x: Self) extends AnyVal {
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
    def setPlaybackRate(value: Double): Self = this.set("playbackRate", value.asInstanceOf[js.Any])
  }
  
}

