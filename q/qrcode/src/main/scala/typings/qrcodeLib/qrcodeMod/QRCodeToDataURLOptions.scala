package typings
package qrcodeLib.qrcodeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait QRCodeToDataURLOptions extends QRCodeRenderersOptions {
  var rendererOpts: js.UndefOr[qrcodeLib.Anon_Quality] = js.undefined
  /**
    * Data URI format.
    * Default: image/png
    */
  var `type`: js.UndefOr[
    qrcodeLib.qrcodeLibStrings.`image/png` | qrcodeLib.qrcodeLibStrings.`image/jpeg` | qrcodeLib.qrcodeLibStrings.`image/webp`
  ] = js.undefined
}

object QRCodeToDataURLOptions {
  @scala.inline
  def apply(
    color: qrcodeLib.Anon_Dark = null,
    errorCorrectionLevel: QRCodeErrorCorrectionLevel = null,
    margin: scala.Int | scala.Double = null,
    rendererOpts: qrcodeLib.Anon_Quality = null,
    scale: scala.Int | scala.Double = null,
    toSJISFunc: /* codePoint */ java.lang.String => scala.Double = null,
    `type`: qrcodeLib.qrcodeLibStrings.`image/png` | qrcodeLib.qrcodeLibStrings.`image/jpeg` | qrcodeLib.qrcodeLibStrings.`image/webp` = null,
    version: scala.Int | scala.Double = null,
    width: scala.Int | scala.Double = null
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

