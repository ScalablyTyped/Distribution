package typings
package sharpLib.sharpMod.sharpNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait Stats extends js.Object {
  /** Array of channel statistics for each channel in the image. */
  var channels: js.Array[ChannelStats]
  /** Histogram-based estimation of greyscale entropy, discarding alpha channel if any (experimental) */
  var entropy: scala.Double
  /** Value to identify if the image is opaque or transparent, based on the presence and use of alpha channel */
  var isOpaque: scala.Boolean
}

