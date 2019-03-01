package typings
package reactDashNativeDashQrcodeLib.reactDashNativeDashQrcodeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait QRCodeProperties extends js.Object {
  var bgColor: js.UndefOr[java.lang.String] = js.undefined
  var fgColor: js.UndefOr[java.lang.String] = js.undefined
  var size: js.UndefOr[scala.Double] = js.undefined
  var value: js.UndefOr[java.lang.String] = js.undefined
}

object QRCodeProperties {
  @scala.inline
  def apply(
    bgColor: java.lang.String = null,
    fgColor: java.lang.String = null,
    size: scala.Int | scala.Double = null,
    value: java.lang.String = null
  ): QRCodeProperties = {
    val __obj = js.Dynamic.literal()
    if (bgColor != null) __obj.updateDynamic("bgColor")(bgColor)
    if (fgColor != null) __obj.updateDynamic("fgColor")(fgColor)
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value)
    __obj.asInstanceOf[QRCodeProperties]
  }
}

