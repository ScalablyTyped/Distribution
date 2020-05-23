package typings.slimerjs.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Format extends js.Object {
  var format: js.UndefOr[String] = js.undefined
  var onlyViewport: js.UndefOr[Boolean] = js.undefined
  var quality: js.UndefOr[String] = js.undefined
  var ratio: js.UndefOr[Double] = js.undefined
}

object Format {
  @scala.inline
  def apply(
    format: String = null,
    onlyViewport: js.UndefOr[Boolean] = js.undefined,
    quality: String = null,
    ratio: js.UndefOr[Double] = js.undefined
  ): Format = {
    val __obj = js.Dynamic.literal()
    if (format != null) __obj.updateDynamic("format")(format.asInstanceOf[js.Any])
    if (!js.isUndefined(onlyViewport)) __obj.updateDynamic("onlyViewport")(onlyViewport.get.asInstanceOf[js.Any])
    if (quality != null) __obj.updateDynamic("quality")(quality.asInstanceOf[js.Any])
    if (!js.isUndefined(ratio)) __obj.updateDynamic("ratio")(ratio.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Format]
  }
}

