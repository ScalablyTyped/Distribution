package typings.qrcode.mod

import typings.qrcode.anon.Dark
import typings.qrcode.anon.Quality
import typings.qrcode.qrcodeStrings.imageSlashjpeg
import typings.qrcode.qrcodeStrings.imageSlashpng
import typings.qrcode.qrcodeStrings.imageSlashwebp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait QRCodeToDataURLOptions extends QRCodeRenderersOptions {
  var rendererOpts: js.UndefOr[Quality] = js.undefined
  /**
    * Data URI format.
    * Default: image/png
    */
  var `type`: js.UndefOr[imageSlashpng | imageSlashjpeg | imageSlashwebp] = js.undefined
}

object QRCodeToDataURLOptions {
  @scala.inline
  def apply(
    color: Dark = null,
    errorCorrectionLevel: QRCodeErrorCorrectionLevel = null,
    margin: js.UndefOr[Double] = js.undefined,
    rendererOpts: Quality = null,
    scale: js.UndefOr[Double] = js.undefined,
    toSJISFunc: /* codePoint */ String => Double = null,
    `type`: imageSlashpng | imageSlashjpeg | imageSlashwebp = null,
    version: js.UndefOr[Double] = js.undefined,
    width: js.UndefOr[Double] = js.undefined
  ): QRCodeToDataURLOptions = {
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
    __obj.asInstanceOf[QRCodeToDataURLOptions]
  }
}

