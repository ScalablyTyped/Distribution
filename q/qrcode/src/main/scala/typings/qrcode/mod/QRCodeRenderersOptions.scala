package typings.qrcode.mod

import typings.qrcode.anon.Dark
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait QRCodeRenderersOptions extends QRCodeOptions {
  var color: js.UndefOr[Dark] = js.undefined
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
    color: Dark = null,
    errorCorrectionLevel: QRCodeErrorCorrectionLevel = null,
    margin: js.UndefOr[Double] = js.undefined,
    scale: js.UndefOr[Double] = js.undefined,
    toSJISFunc: /* codePoint */ String => Double = null,
    version: js.UndefOr[Double] = js.undefined,
    width: js.UndefOr[Double] = js.undefined
  ): QRCodeRenderersOptions = {
    val __obj = js.Dynamic.literal()
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (errorCorrectionLevel != null) __obj.updateDynamic("errorCorrectionLevel")(errorCorrectionLevel.asInstanceOf[js.Any])
    if (!js.isUndefined(margin)) __obj.updateDynamic("margin")(margin.get.asInstanceOf[js.Any])
    if (!js.isUndefined(scale)) __obj.updateDynamic("scale")(scale.get.asInstanceOf[js.Any])
    if (toSJISFunc != null) __obj.updateDynamic("toSJISFunc")(js.Any.fromFunction1(toSJISFunc))
    if (!js.isUndefined(version)) __obj.updateDynamic("version")(version.get.asInstanceOf[js.Any])
    if (!js.isUndefined(width)) __obj.updateDynamic("width")(width.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[QRCodeRenderersOptions]
  }
}

