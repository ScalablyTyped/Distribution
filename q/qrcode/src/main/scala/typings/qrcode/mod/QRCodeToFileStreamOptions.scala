package typings.qrcode.mod

import typings.qrcode.AnonDark
import typings.qrcode.AnonDeflateLevel
import typings.qrcode.qrcodeStrings.png
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait QRCodeToFileStreamOptions extends QRCodeRenderersOptions {
  var rendererOpts: js.UndefOr[AnonDeflateLevel] = js.undefined
  /**
    * Output format. Only png supported for file stream
    */
  var `type`: js.UndefOr[png] = js.undefined
}

object QRCodeToFileStreamOptions {
  @scala.inline
  def apply(
    color: AnonDark = null,
    errorCorrectionLevel: QRCodeErrorCorrectionLevel = null,
    margin: Int | Double = null,
    rendererOpts: AnonDeflateLevel = null,
    scale: Int | Double = null,
    toSJISFunc: /* codePoint */ String => Double = null,
    `type`: png = null,
    version: Int | Double = null,
    width: Int | Double = null
  ): QRCodeToFileStreamOptions = {
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
    __obj.asInstanceOf[QRCodeToFileStreamOptions]
  }
}

