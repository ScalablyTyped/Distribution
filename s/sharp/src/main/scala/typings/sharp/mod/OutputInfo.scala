package typings.sharp.mod

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
    cropOffsetLeft: js.UndefOr[Double] = js.undefined,
    cropOffsetTop: js.UndefOr[Double] = js.undefined
  ): OutputInfo = {
    val __obj = js.Dynamic.literal(channels = channels.asInstanceOf[js.Any], format = format.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], premultiplied = premultiplied.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    if (!js.isUndefined(cropOffsetLeft)) __obj.updateDynamic("cropOffsetLeft")(cropOffsetLeft.get.asInstanceOf[js.Any])
    if (!js.isUndefined(cropOffsetTop)) __obj.updateDynamic("cropOffsetTop")(cropOffsetTop.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[OutputInfo]
  }
}

