package typings.sharp.mod

import typings.sharp.anon.B
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Stats extends StObject {
  
  /** Array of channel statistics for each channel in the image. */
  var channels: js.Array[ChannelStats]
  
  /** Object containing most dominant sRGB colour based on a 4096-bin 3D histogram (experimental) */
  var dominant: B
  
  /** Histogram-based estimation of greyscale entropy, discarding alpha channel if any (experimental) */
  var entropy: Double
  
  /** Value to identify if the image is opaque or transparent, based on the presence and use of alpha channel */
  var isOpaque: Boolean
  
  /** Estimation of greyscale sharpness based on the standard deviation of a Laplacian convolution, discarding alpha channel if any (experimental) */
  var sharpness: Double
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
  implicit class StatsMutableBuilder[Self <: Stats] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setChannels(value: js.Array[ChannelStats]): Self = StObject.set(x, "channels", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChannelsVarargs(value: ChannelStats*): Self = StObject.set(x, "channels", js.Array(value :_*))
    
    @scala.inline
    def setDominant(value: B): Self = StObject.set(x, "dominant", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEntropy(value: Double): Self = StObject.set(x, "entropy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsOpaque(value: Boolean): Self = StObject.set(x, "isOpaque", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSharpness(value: Double): Self = StObject.set(x, "sharpness", value.asInstanceOf[js.Any])
  }
}
