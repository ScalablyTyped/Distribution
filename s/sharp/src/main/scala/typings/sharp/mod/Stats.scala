package typings.sharp.mod

import typings.sharp.anon.B
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Stats extends js.Object {
  
  /** Array of channel statistics for each channel in the image. */
  var channels: js.Array[ChannelStats] = js.native
  
  /** Object containing most dominant sRGB colour based on a 4096-bin 3D histogram (experimental) */
  var dominant: B = js.native
  
  /** Histogram-based estimation of greyscale entropy, discarding alpha channel if any (experimental) */
  var entropy: Double = js.native
  
  /** Value to identify if the image is opaque or transparent, based on the presence and use of alpha channel */
  var isOpaque: Boolean = js.native
  
  /** Estimation of greyscale sharpness based on the standard deviation of a Laplacian convolution, discarding alpha channel if any (experimental) */
  var sharpness: Double = js.native
}
object Stats {
  
  @scala.inline
  def apply(
    channels: js.Array[ChannelStats],
    dominant: B,
    entropy: Double,
    isOpaque: Boolean,
    sharpness: Double
  ): Stats = {
    val __obj = js.Dynamic.literal(channels = channels.asInstanceOf[js.Any], dominant = dominant.asInstanceOf[js.Any], entropy = entropy.asInstanceOf[js.Any], isOpaque = isOpaque.asInstanceOf[js.Any], sharpness = sharpness.asInstanceOf[js.Any])
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
    def setDominant(value: B): Self = this.set("dominant", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEntropy(value: Double): Self = this.set("entropy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsOpaque(value: Boolean): Self = this.set("isOpaque", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSharpness(value: Double): Self = this.set("sharpness", value.asInstanceOf[js.Any])
  }
}
