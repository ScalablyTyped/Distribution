package typings.qrcode.qrcodeMod

import typings.qrcode.Anon_Dark
import typings.qrcode.Anon_DeflateLevel
import typings.qrcode.qrcodeStrings.png
import typings.qrcode.qrcodeStrings.svg
import typings.qrcode.qrcodeStrings.utf8
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait QRCodeToFileOptions extends QRCodeRenderersOptions {
  var rendererOpts: js.UndefOr[Anon_DeflateLevel] = js.undefined
  /**
    * Output format.
    * Default: png
    */
  var `type`: js.UndefOr[png | svg | utf8] = js.undefined
}

object QRCodeToFileOptions {
  @scala.inline
  def apply(
    color: Anon_Dark = null,
    errorCorrectionLevel: QRCodeErrorCorrectionLevel = null,
    margin: Int | Double = null,
    rendererOpts: Anon_DeflateLevel = null,
    scale: Int | Double = null,
    toSJISFunc: /* codePoint */ String => Double = null,
    `type`: png | svg | utf8 = null,
    version: Int | Double = null,
    width: Int | Double = null
  ): QRCodeToFileOptions = {
    val __obj = js.Dynamic.literal()
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (errorCorrectionLevel != null) __obj.updateDynamic("errorCorrectionLevel")(errorCorrectionLevel.asInstanceOf[js.Any])
    if (margin != null) __obj.updateDynamic("margin")(margin.asInstanceOf[js.Any])
    if (rendererOpts != null) __obj.updateDynamic("rendererOpts")(rendererOpts.asInstanceOf[js.Any])
    if (scale != null) __obj.updateDynamic("scale")(scale.asInstanceOf[js.Any])
    if (toSJISFunc != null) __obj.updateDynamic("toSJISFunc")(js.Any.fromFunction1(toSJISFunc))
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (version != null) __obj.updateDynamic("version")(version.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[QRCodeToFileOptions]
  }
}

