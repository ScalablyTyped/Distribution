package typings.sharp.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Stats extends js.Object {
  /** Array of channel statistics for each channel in the image. */
  var channels: js.Array[ChannelStats]
  /** Histogram-based estimation of greyscale entropy, discarding alpha channel if any (experimental) */
  var entropy: Double
  /** Value to identify if the image is opaque or transparent, based on the presence and use of alpha channel */
  var isOpaque: Boolean
}

object Stats {
  @scala.inline
  def apply(channels: js.Array[ChannelStats], entropy: Double, isOpaque: Boolean): Stats = {
    val __obj = js.Dynamic.literal(channels = channels.asInstanceOf[js.Any], entropy = entropy.asInstanceOf[js.Any], isOpaque = isOpaque.asInstanceOf[js.Any])
    __obj.asInstanceOf[Stats]
  }
}

