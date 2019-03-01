package typings
package sharpLib.sharpMod.sharpNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OutputInfo extends js.Object {
  var channels: scala.Double
  /** Only defined when using a crop strategy */
  var cropOffsetLeft: js.UndefOr[scala.Double] = js.undefined
  /** Only defined when using a crop strategy */
  var cropOffsetTop: js.UndefOr[scala.Double] = js.undefined
  var format: java.lang.String
  var height: scala.Double
  /** indicating if premultiplication was used */
  var premultiplied: scala.Boolean
  var size: scala.Double
  var width: scala.Double
}

object OutputInfo {
  @scala.inline
  def apply(
    channels: scala.Double,
    format: java.lang.String,
    height: scala.Double,
    premultiplied: scala.Boolean,
    size: scala.Double,
    width: scala.Double,
    cropOffsetLeft: scala.Int | scala.Double = null,
    cropOffsetTop: scala.Int | scala.Double = null
  ): OutputInfo = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("channels")(channels)
    __obj.updateDynamic("format")(format)
    __obj.updateDynamic("height")(height)
    __obj.updateDynamic("premultiplied")(premultiplied)
    __obj.updateDynamic("size")(size)
    __obj.updateDynamic("width")(width)
    if (cropOffsetLeft != null) __obj.updateDynamic("cropOffsetLeft")(cropOffsetLeft.asInstanceOf[js.Any])
    if (cropOffsetTop != null) __obj.updateDynamic("cropOffsetTop")(cropOffsetTop.asInstanceOf[js.Any])
    __obj.asInstanceOf[OutputInfo]
  }
}

