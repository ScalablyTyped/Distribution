package typings.qrcode.qrcodeMod

import typings.qrcode.Anon_Dark
import typings.qrcode.Anon_Quality
import typings.qrcode.qrcodeStrings.`image/jpeg`
import typings.qrcode.qrcodeStrings.`image/png`
import typings.qrcode.qrcodeStrings.`image/webp`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait QRCodeToDataURLOptions extends QRCodeRenderersOptions {
  var rendererOpts: js.UndefOr[Anon_Quality] = js.undefined
  /**
    * Data URI format.
    * Default: image/png
    */
  var `type`: js.UndefOr[`image/png` | `image/jpeg` | `image/webp`] = js.undefined
}

object QRCodeToDataURLOptions {
  @scala.inline
  def apply(
    color: Anon_Dark = null,
    errorCorrectionLevel: QRCodeErrorCorrectionLevel = null,
    margin: Int | Double = null,
    rendererOpts: Anon_Quality = null,
    scale: Int | Double = null,
    toSJISFunc: /* codePoint */ String => Double = null,
    `type`: `image/png` | `image/jpeg` | `image/webp` = null,
    version: Int | Double = null,
    width: Int | Double = null
  ): QRCodeToDataURLOptions = {
    val __obj = js.Dynamic.literal()
    if (color != null) __obj.updateDynamic("color")(color)
    if (errorCorrectionLevel != null) __obj.updateDynamic("errorCorrectionLevel")(errorCorrectionLevel)
    if (margin != null) __obj.updateDynamic("margin")(margin.asInstanceOf[js.Any])
    if (rendererOpts != null) __obj.updateDynamic("rendererOpts")(rendererOpts)
    if (scale != null) __obj.updateDynamic("scale")(scale.asInstanceOf[js.Any])
    if (toSJISFunc != null) __obj.updateDynamic("toSJISFunc")(js.Any.fromFunction1(toSJISFunc))
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (version != null) __obj.updateDynamic("version")(version.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[QRCodeToDataURLOptions]
  }
}

