package typings.reactDashNative

import typings.reactDashNative.reactDashNativeStrings.jpeg
import typings.reactDashNative.reactDashNativeStrings.png
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Format extends js.Object {
  var format: js.UndefOr[png | jpeg] = js.undefined
  var height: js.UndefOr[Double] = js.undefined
  var quality: js.UndefOr[Double] = js.undefined
  var width: js.UndefOr[Double] = js.undefined
}

object Anon_Format {
  @scala.inline
  def apply(
    format: png | jpeg = null,
    height: Int | Double = null,
    quality: Int | Double = null,
    width: Int | Double = null
  ): Anon_Format = {
    val __obj = js.Dynamic.literal()
    if (format != null) __obj.updateDynamic("format")(format.asInstanceOf[js.Any])
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (quality != null) __obj.updateDynamic("quality")(quality.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Format]
  }
}

