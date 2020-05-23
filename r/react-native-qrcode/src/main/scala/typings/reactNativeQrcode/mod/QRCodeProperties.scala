package typings.reactNativeQrcode.mod

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
  def apply(
    bgColor: String = null,
    fgColor: String = null,
    size: js.UndefOr[Double] = js.undefined,
    value: String = null
  ): QRCodeProperties = {
    val __obj = js.Dynamic.literal()
    if (bgColor != null) __obj.updateDynamic("bgColor")(bgColor.asInstanceOf[js.Any])
    if (fgColor != null) __obj.updateDynamic("fgColor")(fgColor.asInstanceOf[js.Any])
    if (!js.isUndefined(size)) __obj.updateDynamic("size")(size.get.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[QRCodeProperties]
  }
}

