package typings.sharp.sharpMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OutputInfo extends js.Object {
  var channels: Double
  /** Only defined when using a crop strategy */
  var cropOffsetLeft: js.UndefOr[Double] = js.undefined
  /** Only defined when using a crop strategy */
  var cropOffsetTop: js.UndefOr[Double] = js.undefined
  var format: String
  var height: Double
  /** indicating if premultiplication was used */
  var premultiplied: Boolean
  var size: Double
  var width: Double
}

object OutputInfo {
  @scala.inline
  def apply(
    channels: Double,
    format: String,
    height: Double,
    premultiplied: Boolean,
    size: Double,
    width: Double,
    cropOffsetLeft: Int | Double = null,
    cropOffsetTop: Int | Double = null
  ): OutputInfo = {
    val __obj = js.Dynamic.literal(channels = channels, format = format, height = height, premultiplied = premultiplied, size = size, width = width)
    if (cropOffsetLeft != null) __obj.updateDynamic("cropOffsetLeft")(cropOffsetLeft.asInstanceOf[js.Any])
    if (cropOffsetTop != null) __obj.updateDynamic("cropOffsetTop")(cropOffsetTop.asInstanceOf[js.Any])
    __obj.asInstanceOf[OutputInfo]
  }
}

