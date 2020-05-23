package typings.qrcode.mod

import typings.qrcode.anon.Dark
import typings.qrcode.qrcodeStrings.svg
import typings.qrcode.qrcodeStrings.terminal
import typings.qrcode.qrcodeStrings.utf8
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait QRCodeToStringOptions extends QRCodeRenderersOptions {
  /**
    * Output format.
    * Default: utf8
    */
  var `type`: js.UndefOr[utf8 | svg | terminal] = js.undefined
}

object QRCodeToStringOptions {
  @scala.inline
  def apply(
    color: Dark = null,
    errorCorrectionLevel: QRCodeErrorCorrectionLevel = null,
    margin: js.UndefOr[Double] = js.undefined,
    scale: js.UndefOr[Double] = js.undefined,
    toSJISFunc: /* codePoint */ String => Double = null,
    `type`: utf8 | svg | terminal = null,
    version: js.UndefOr[Double] = js.undefined,
    width: js.UndefOr[Double] = js.undefined
  ): QRCodeToStringOptions = {
    val __obj = js.Dynamic.literal()
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (errorCorrectionLevel != null) __obj.updateDynamic("errorCorrectionLevel")(errorCorrectionLevel.asInstanceOf[js.Any])
    if (!js.isUndefined(margin)) __obj.updateDynamic("margin")(margin.get.asInstanceOf[js.Any])
    if (!js.isUndefined(scale)) __obj.updateDynamic("scale")(scale.get.asInstanceOf[js.Any])
    if (toSJISFunc != null) __obj.updateDynamic("toSJISFunc")(js.Any.fromFunction1(toSJISFunc))
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (!js.isUndefined(version)) __obj.updateDynamic("version")(version.get.asInstanceOf[js.Any])
    if (!js.isUndefined(width)) __obj.updateDynamic("width")(width.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[QRCodeToStringOptions]
  }
}

