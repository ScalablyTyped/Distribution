package typings
package slimerjsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Format extends js.Object {
  var format: js.UndefOr[java.lang.String] = js.undefined
  var onlyViewport: js.UndefOr[scala.Boolean] = js.undefined
  var quality: js.UndefOr[java.lang.String] = js.undefined
  var ratio: js.UndefOr[scala.Double] = js.undefined
}

object Anon_Format {
  @scala.inline
  def apply(
    format: java.lang.String = null,
    onlyViewport: js.UndefOr[scala.Boolean] = js.undefined,
    quality: java.lang.String = null,
    ratio: scala.Int | scala.Double = null
  ): Anon_Format = {
    val __obj = js.Dynamic.literal()
    if (format != null) __obj.updateDynamic("format")(format)
    if (!js.isUndefined(onlyViewport)) __obj.updateDynamic("onlyViewport")(onlyViewport)
    if (quality != null) __obj.updateDynamic("quality")(quality)
    if (ratio != null) __obj.updateDynamic("ratio")(ratio.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Format]
  }
}

