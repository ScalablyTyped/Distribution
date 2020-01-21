package typings.qrcode.mod

import typings.qrcode.AnonDark
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait QRCodeRenderersOptions extends QRCodeOptions {
  var color: js.UndefOr[AnonDark] = js.undefined
  /**
    * Define how much wide the quiet zone should be.
    * Default: 4
    */
  var margin: js.UndefOr[Double] = js.undefined
  /**
    * Scale factor. A value of 1 means 1px per modules (black dots).
    * Default: 4
    */
  var scale: js.UndefOr[Double] = js.undefined
  /**
    * Forces a specific width for the output image.
    * If width is too small to contain the qr symbol, this option will be ignored.
    * Takes precedence over scale.
    */
  var width: js.UndefOr[Double] = js.undefined
}

object QRCodeRenderersOptions {
  @scala.inline
  def apply(
    color: AnonDark = null,
    errorCorrectionLevel: QRCodeErrorCorrectionLevel = null,
    margin: Int | Double = null,
    scale: Int | Double = null,
    toSJISFunc: /* codePoint */ String => Double = null,
    version: Int | Double = null,
    width: Int | Double = null
  ): QRCodeRenderersOptions = {
    val __obj = js.Dynamic.literal()
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (errorCorrectionLevel != null) __obj.updateDynamic("errorCorrectionLevel")(errorCorrectionLevel.asInstanceOf[js.Any])
    if (margin != null) __obj.updateDynamic("margin")(margin.asInstanceOf[js.Any])
    if (scale != null) __obj.updateDynamic("scale")(scale.asInstanceOf[js.Any])
    if (toSJISFunc != null) __obj.updateDynamic("toSJISFunc")(js.Any.fromFunction1(toSJISFunc))
    if (version != null) __obj.updateDynamic("version")(version.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[QRCodeRenderersOptions]
  }
}

