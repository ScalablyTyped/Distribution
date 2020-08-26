package typings.sharp.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Stats extends js.Object {
  /** Array of channel statistics for each channel in the image. */
  var channels: js.Array[ChannelStats] = js.native
  /** Histogram-based estimation of greyscale entropy, discarding alpha channel if any (experimental) */
  var entropy: Double = js.native
  /** Value to identify if the image is opaque or transparent, based on the presence and use of alpha channel */
  var isOpaque: Boolean = js.native
}

object Stats {
  @scala.inline
  def apply(channels: js.Array[ChannelStats], entropy: Double, isOpaque: Boolean): Stats = {
    val __obj = js.Dynamic.literal(channels = channels.asInstanceOf[js.Any], entropy = entropy.asInstanceOf[js.Any], isOpaque = isOpaque.asInstanceOf[js.Any])
    __obj.asInstanceOf[Stats]
  }
  @scala.inline
  implicit class StatsOps[Self <: Stats] (val x: Self) extends AnyVal {
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
    def setChannelsVarargs(value: ChannelStats*): Self = this.set("channels", js.Array(value :_*))
    @scala.inline
    def setChannels(value: js.Array[ChannelStats]): Self = this.set("channels", value.asInstanceOf[js.Any])
    @scala.inline
    def setEntropy(value: Double): Self = this.set("entropy", value.asInstanceOf[js.Any])
    @scala.inline
    def setIsOpaque(value: Boolean): Self = this.set("isOpaque", value.asInstanceOf[js.Any])
  }
  
}

