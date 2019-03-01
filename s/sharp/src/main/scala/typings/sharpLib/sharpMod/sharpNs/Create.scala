package typings
package sharpLib.sharpMod.sharpNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Create extends js.Object {
  /** Parsed by the [color](https://www.npmjs.org/package/color) module to extract values for red, green, blue and alpha. */
  var background: Color
  /** Number of bands e.g. 3 for RGB, 4 for RGBA */
  var channels: Channels
  /** Number of pixels high. */
  var height: scala.Double
  /** Number of pixels wide. */
  var width: scala.Double
}

object Create {
  @scala.inline
  def apply(background: Color, channels: Channels, height: scala.Double, width: scala.Double): Create = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("background")(background.asInstanceOf[js.Any])
    __obj.updateDynamic("channels")(channels)
    __obj.updateDynamic("height")(height)
    __obj.updateDynamic("width")(width)
    __obj.asInstanceOf[Create]
  }
}

