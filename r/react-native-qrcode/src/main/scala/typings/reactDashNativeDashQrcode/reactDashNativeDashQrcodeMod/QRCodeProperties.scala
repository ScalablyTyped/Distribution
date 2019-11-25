package typings.reactDashNativeDashQrcode.reactDashNativeDashQrcodeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait QRCodeProperties extends js.Object {
  var bgColor: js.UndefOr[String] = js.undefined
  var fgColor: js.UndefOr[String] = js.undefined
  var size: js.UndefOr[Double] = js.undefined
  var value: js.UndefOr[String] = js.undefined
}

object QRCodeProperties {
  @scala.inline
  def apply(bgColor: String = null, fgColor: String = null, size: Int | Double = null, value: String = null): QRCodeProperties = {
    val __obj = js.Dynamic.literal()
    if (bgColor != null) __obj.updateDynamic("bgColor")(bgColor.asInstanceOf[js.Any])
    if (fgColor != null) __obj.updateDynamic("fgColor")(fgColor.asInstanceOf[js.Any])
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[QRCodeProperties]
  }
}

