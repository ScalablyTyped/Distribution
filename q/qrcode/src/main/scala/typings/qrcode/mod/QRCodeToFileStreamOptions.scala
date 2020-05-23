package typings.qrcode.mod

import typings.qrcode.anon.Dark
import typings.qrcode.anon.DeflateLevel
import typings.qrcode.qrcodeStrings.png
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait QRCodeToFileStreamOptions extends QRCodeRenderersOptions {
  var rendererOpts: js.UndefOr[DeflateLevel] = js.undefined
  /**
    * Output format. Only png supported for file stream
    */
  var `type`: js.UndefOr[png] = js.undefined
}

object QRCodeToFileStreamOptions {
  @scala.inline
  def apply(
    color: Dark = null,
    errorCorrectionLevel: QRCodeErrorCorrectionLevel = null,
    margin: js.UndefOr[Double] = js.undefined,
    rendererOpts: DeflateLevel = null,
    scale: js.UndefOr[Double] = js.undefined,
    toSJISFunc: /* codePoint */ String => Double = null,
    `type`: png = null,
    version: js.UndefOr[Double] = js.undefined,
    width: js.UndefOr[Double] = js.undefined
  ): QRCodeToFileStreamOptions = {
    val __obj = js.Dynamic.literal()
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (errorCorrectionLevel != null) __obj.updateDynamic("errorCorrectionLevel")(errorCorrectionLevel.asInstanceOf[js.Any])
    if (!js.isUndefined(margin)) __obj.updateDynamic("margin")(margin.get.asInstanceOf[js.Any])
    if (rendererOpts != null) __obj.updateDynamic("rendererOpts")(rendererOpts.asInstanceOf[js.Any])
    if (!js.isUndefined(scale)) __obj.updateDynamic("scale")(scale.get.asInstanceOf[js.Any])
    if (toSJISFunc != null) __obj.updateDynamic("toSJISFunc")(js.Any.fromFunction1(toSJISFunc))
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (!js.isUndefined(version)) __obj.updateDynamic("version")(version.get.asInstanceOf[js.Any])
    if (!js.isUndefined(width)) __obj.updateDynamic("width")(width.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[QRCodeToFileStreamOptions]
  }
}

