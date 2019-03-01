package typings
package reactDashNativeLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Format extends js.Object {
  var format: js.UndefOr[
    reactDashNativeLib.reactDashNativeLibStrings.png | reactDashNativeLib.reactDashNativeLibStrings.jpeg
  ] = js.undefined
  var height: js.UndefOr[scala.Double] = js.undefined
  var quality: js.UndefOr[scala.Double] = js.undefined
  var width: js.UndefOr[scala.Double] = js.undefined
}

object Anon_Format {
  @scala.inline
  def apply(
    format: reactDashNativeLib.reactDashNativeLibStrings.png | reactDashNativeLib.reactDashNativeLibStrings.jpeg = null,
    height: scala.Int | scala.Double = null,
    quality: scala.Int | scala.Double = null,
    width: scala.Int | scala.Double = null
  ): Anon_Format = {
    val __obj = js.Dynamic.literal()
    if (format != null) __obj.updateDynamic("format")(format.asInstanceOf[js.Any])
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (quality != null) __obj.updateDynamic("quality")(quality.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Format]
  }
}

